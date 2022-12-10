package com.cos.photogramstart.web.api;


import com.cos.photogramstart.config.auth.PrincipalDetails;
import com.cos.photogramstart.domain.image.Image;
import com.cos.photogramstart.sevice.ImageService;
import com.cos.photogramstart.sevice.LikesService;
import com.cos.photogramstart.web.dto.CMRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class ImageApiController {

    private final ImageService imageService;
    private final LikesService likesService;
    @GetMapping("/api/image")
    public ResponseEntity<?> imageStory(@AuthenticationPrincipal PrincipalDetails principalDetails,
                                        @PageableDefault(size=3) Pageable pageable){
        Page<Image> images = imageService.imageStory(principalDetails.getUser().getId(),pageable);
        return new ResponseEntity<>(new CMRespDto<>(1,"성공",images), HttpStatus.OK);
    }

    @PostMapping("/api/image/{imageId}/likes")
    public ResponseEntity<?> likes(@PathVariable Long imageId,
                                    @AuthenticationPrincipal PrincipalDetails principalDetails){
        likesService.like(imageId,principalDetails.getUser().getId());
        return new ResponseEntity<>(new CMRespDto<>(1,"좋아요 성공",null),HttpStatus.CREATED);
    }

    @DeleteMapping("/api/image/{imageId}/likes")
    public ResponseEntity<?> unLikes(@PathVariable Long imageId,
                                     @AuthenticationPrincipal PrincipalDetails principalDetails){
        likesService.unLike(imageId,principalDetails.getUser().getId());
        return new ResponseEntity<>(new CMRespDto<>(1,"좋아요 취소 성공",null),HttpStatus.OK);
    }
}

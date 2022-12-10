package com.cos.photogramstart.sevice;

import com.cos.photogramstart.domain.likes.LikesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LikesService {
    private final LikesRepository likesRepository;

    @Transactional
    public void like(Long imageId, Long principalId){
        likesRepository.mLikes(imageId,principalId);
    }

    @Transactional
    public void unLike(Long imageId, Long principalId){
        likesRepository.mUnLikes(imageId,principalId);
    }
}

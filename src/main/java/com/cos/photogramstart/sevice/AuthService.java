package com.cos.photogramstart.sevice;

import com.cos.photogramstart.domain.user.User;
import com.cos.photogramstart.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public User signup(User user){
        User userEntity = userRepository.save(user);
        return userEntity;
    }
}

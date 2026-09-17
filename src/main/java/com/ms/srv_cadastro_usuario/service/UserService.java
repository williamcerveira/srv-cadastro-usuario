package com.ms.srv_cadastro_usuario.service;

import com.ms.srv_cadastro_usuario.model.UserModel;
import com.ms.srv_cadastro_usuario.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel save(UserModel userModel){
        return userRepository.save(userModel);
    }
}

package com.ms.srv_cadastro_usuario.repositories;

import com.ms.srv_cadastro_usuario.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}

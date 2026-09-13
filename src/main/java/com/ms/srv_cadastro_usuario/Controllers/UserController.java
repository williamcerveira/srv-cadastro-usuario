package com.ms.srv_cadastro_usuario.Controllers;


import com.ms.srv_cadastro_usuario.dtos.UserRecordDto;
import com.ms.srv_cadastro_usuario.model.UserModel;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDto userRecordDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body();
    }
}

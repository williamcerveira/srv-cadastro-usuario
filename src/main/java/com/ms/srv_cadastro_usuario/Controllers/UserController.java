package com.ms.srv_cadastro_usuario.Controllers;


import com.ms.srv_cadastro_usuario.dtos.UserRecordDto;
import com.ms.srv_cadastro_usuario.model.UserModel;
import com.ms.srv_cadastro_usuario.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.util.BeanUtil;

@RestController
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDto userRecordDto) {
        var UserModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto, UserModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(UserModel));
    }
}

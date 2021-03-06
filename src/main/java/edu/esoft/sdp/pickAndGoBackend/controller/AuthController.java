package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.dto.ResponseDto;
import edu.esoft.sdp.pickAndGoBackend.model.User;
import edu.esoft.sdp.pickAndGoBackend.security.JwtUtil;
import edu.esoft.sdp.pickAndGoBackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseDto userLogin(@RequestBody User user){
        log.info("User is logging in");
        return jwtUtil.authenticate(user);
    }

    @PostMapping("/register")
    public ResponseDto registerUser(@RequestBody User user){

        log.info("User is being registered");

        try {
            User registerUser = userService.registerUser(user);

            if(registerUser != null) {
                log.info("User is created");
                return jwtUtil.authenticate(user);

            }else{
                log.error("user registration is failed");
                throw new Exception("User registration is failed");
            }

        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return null;
    }
}

package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.repository.RoleRepository;
import edu.esoft.sdp.pickAndGoBackend.repository.UserRepository;
import edu.esoft.sdp.pickAndGoBackend.dto.AuthUserDto;
import edu.esoft.sdp.pickAndGoBackend.model.User;
import edu.esoft.sdp.pickAndGoBackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User registerUser(User user) throws Exception {

        if(!this.isUsernameAlreadyExists(user.getUsername())){

            User clonedUser = (User) user.clone();
            clonedUser.setPassword(passwordEncoder.encode(user.getPassword()));
            User savedUser = userRepository.saveAndFlush(clonedUser);
            if(savedUser != null) savedUser.setRole(roleRepository.getById(savedUser.getRole().getId()));
            return savedUser;

        }else{
            throw new Exception("Username is already taken");
        }
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public boolean isUsernameAlreadyExists(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public User getUserById(Long id) throws Exception{
        return this.userRepository.findById(id).
                orElseThrow(() -> new Exception("User not found for id = " + id));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userByUsername = this.getUserByUsername(username);

        if(userByUsername == null) {
            log.error("User not found.");
            throw new UsernameNotFoundException("User not found");
        }

        log.info("User found by username");
        return new AuthUserDto(userByUsername);

    }


}

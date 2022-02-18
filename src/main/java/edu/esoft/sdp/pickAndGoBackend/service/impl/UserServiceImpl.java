package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.dao.UserDao;
import edu.esoft.sdp.pickAndGoBackend.dto.AuthUserDto;
import edu.esoft.sdp.pickAndGoBackend.model.User;
import edu.esoft.sdp.pickAndGoBackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public Collection<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User registerUser(User user) throws Exception {

        if(!this.isUsernameAlreadyExists(user.getUsername())){
            return userDao.save(user);

        }else{
            throw new Exception("Username is already taken");
        }
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public boolean isUsernameAlreadyExists(String username) {
        return userDao.existsByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userByUsername = this.getUserByUsername(username);
        if(userByUsername != null) {
            log.info("User found by username");
            return new AuthUserDto(userByUsername);

        }else{
            log.error("User not found.");
            throw new UsernameNotFoundException("User not found");
        }
    }


}

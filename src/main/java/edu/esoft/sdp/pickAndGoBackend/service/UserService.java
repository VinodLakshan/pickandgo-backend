package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.User;

import java.util.Collection;

public interface UserService {

    Collection<User> getAllUsers();
    User registerUser(User user) throws Exception;
    User getUserByUsername(String username);
    boolean isUsernameAlreadyExists(String username);
    User getUserById(Long id) throws Exception;
}

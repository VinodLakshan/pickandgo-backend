package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.User;

import java.util.Collection;

public interface UserService {

    Collection<User> getAllUsers();
    User getUserByUsername(String username);
}

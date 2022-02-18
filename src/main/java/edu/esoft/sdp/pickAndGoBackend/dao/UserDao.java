package edu.esoft.sdp.pickAndGoBackend.dao;

import edu.esoft.sdp.pickAndGoBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
    boolean existsByUsername(String username);
}

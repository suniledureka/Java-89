package co.edureka.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edureka.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}

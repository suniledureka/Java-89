package co.edureka.jwt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edureka.jwt.api.entity.User;
import co.edureka.jwt.api.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
    	System.out.println("-- initUsers ---");
        List<User> users = Stream.of(
                new User(101, "sunil", "password", "sunil@gmail.com"),
                new User(102, "praveen", "123", "praveen@gmail.com"),
                new User(103, "pankaj", "123", "pankaj@gmail.com")
        ).collect(Collectors.toList());
        
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}

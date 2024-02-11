package com.example.backend.Service;

import com.example.backend.Entity.User;
import com.example.backend.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(User user){
        String email = user.getEmail();
        User existingUser = userRepository.findByEmail(email);
        if (existingUser != null){
            // L'utilisateur avec cette adresse e-mail existe déjà,
            throw new IllegalArgumentException("cette email est deja saisi");

    }
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    public User findByEmail(String email) {
        return userRepository.findByEmail((email));
    }
}

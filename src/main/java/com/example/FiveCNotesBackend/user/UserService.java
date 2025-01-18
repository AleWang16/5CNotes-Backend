package com.example.FiveCNotesBackend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userOptional = userRepository.findStudentById(user.getEmail());

        if (userOptional.isPresent()) {
            throw new IllegalStateException("Email taken.");
        } else {
            userRepository.save(user);
        }

    }

    public void deleteUser(UUID userId) {
        try {
            userRepository.deleteById(userId);
        }
        catch(Exception e) {
            throw new IllegalStateException("Student with given user ID does not exist");
        }
    }
}

package com.example.FiveCNotesBackend.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void addNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteStudent(@PathVariable("userId") UUID userId) {
        userService.deleteUser(userId);
    }

}

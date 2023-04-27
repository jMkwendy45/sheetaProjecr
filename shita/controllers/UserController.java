package shita.controllers;

import org.springframework.web.bind.annotation.*;
import shita.data.model.User;
import shita.dto.request.RegisterUserRequest;
import shita.dto.response.RegisterUserResponse;
import shita.services.UserService;
import shita.services.UserServiceImpl;

@RestController
public class UserController {

    private UserService userService =  new UserServiceImpl();
@PostMapping("/user")
    public RegisterUserResponse registerNewUser(@RequestBody RegisterUserRequest user){
        return userService.registerNewUser(user);
    }
    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        return userService.findUser(id);
    }



}

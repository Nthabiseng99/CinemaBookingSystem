/*
 * UserController.java
 * Controller for user entity
 * Author: Sinethemba Sithela (219112940)
 * Date: 26/08/2023
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.User;
import za.ac.cput.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/create")
    User create(@RequestBody User user){
        return service.create(user);
    }

    @GetMapping({"/", "/all"})
    List<User> getAll(){
        return service.getAll();
    }
}

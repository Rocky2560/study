package org.example.DTO;


import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return this.userService.creatUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") long id)
    {
        return this.userService.getUSer(id);

    }
}

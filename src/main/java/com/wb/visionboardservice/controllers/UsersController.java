package com.wb.visionboardservice.controllers;

import com.wb.visionboardservice.app.users.UsersService;
import com.wb.visionboardservice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;


// autowire components for DI https://www.baeldung.com/spring-autowire
// eg use autowoire in the class prop and @component in the injects object. eg., usersService
@RestController
@RequestMapping("api/v1/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<User> get() throws SQLException {
        return usersService.get();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable("id") UUID id) throws SQLException  {
        return usersService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public User add(User item) throws SQLException  {
        return usersService.add(item);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public User update(@RequestBody User user) throws SQLException  {
        return usersService.update(user);
    }


}

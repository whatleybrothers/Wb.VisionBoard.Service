package com.wb.visionboardservice.controllers;

import com.wb.visionboardservice.app.boards.BoardsService;
import com.wb.visionboardservice.models.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;


// autowire components for DI https://www.baeldung.com/spring-autowire
// eg use autowoire in the class prop and @component in the injects object. eg., boardsService
@RestController
@RequestMapping("api/v1/boards")
public class BoardsController {

    @Autowired
    private BoardsService boardsService;

    @GetMapping
    public List<Board> get() throws SQLException {
        return boardsService.get();
    }

    @GetMapping("/{id}")
    public Board get(@PathVariable("id") UUID id) throws SQLException  {
        return boardsService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Board add(Board item) throws SQLException  {
        return boardsService.add(item);
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public Board update(@RequestBody Board user) throws SQLException  {
        return boardsService.update(user);
    }

}

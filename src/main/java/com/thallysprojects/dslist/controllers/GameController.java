package com.thallysprojects.dslist.controllers;

import com.thallysprojects.dslist.dtos.GameMinDTO;
import com.thallysprojects.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> listAll() {
        return service.findAll();
    }

}

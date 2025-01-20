package com.thallysprojects.dslist.services;

import com.thallysprojects.dslist.dtos.GameMinDTO;
import com.thallysprojects.dslist.entities.Game;
import com.thallysprojects.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> games = repository.findAll();
        return games.stream().map(x -> new GameMinDTO(x)).toList();
    }

}

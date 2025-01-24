package com.fernandoschimidt.dslist.services;

import com.fernandoschimidt.dslist.DTO.GameDTO;
import com.fernandoschimidt.dslist.DTO.GameMinDTO;
import com.fernandoschimidt.dslist.entities.Game;
import com.fernandoschimidt.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).get();
        return  new GameDTO(game);
    }

//    @Transactional(readOnly = true)
//    public List<GameMinDTO> findByGameList(Long listId){
//        List<Game>
//    }
}

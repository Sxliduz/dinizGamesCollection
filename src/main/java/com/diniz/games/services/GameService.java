package com.diniz.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diniz.games.dto.GameMinDTO;
import com.diniz.games.entities.Game;
import com.diniz.games.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repo;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = repo.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
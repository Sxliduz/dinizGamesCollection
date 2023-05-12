package com.diniz.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diniz.games.dto.GameListDTO;
import com.diniz.games.entities.GameList;
import com.diniz.games.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository repo;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = repo.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
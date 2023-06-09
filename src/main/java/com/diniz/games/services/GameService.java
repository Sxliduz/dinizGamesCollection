package com.diniz.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diniz.games.dto.GameDTO;
import com.diniz.games.dto.GameMinDTO;
import com.diniz.games.entities.Game;
import com.diniz.games.projections.GameMinProjection;
import com.diniz.games.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repo;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = repo.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = repo.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long id) {
		List<GameMinProjection> result = repo.searchByList(id);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
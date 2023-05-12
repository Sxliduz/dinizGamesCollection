package com.diniz.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diniz.games.dto.GameListDTO;
import com.diniz.games.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService service;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = service.findAll();
		return result;
	}
}

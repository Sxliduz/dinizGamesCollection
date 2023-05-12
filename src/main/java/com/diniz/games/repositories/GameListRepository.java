package com.diniz.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diniz.games.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
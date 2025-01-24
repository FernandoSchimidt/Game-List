package com.fernandoschimidt.dslist.repositories;

import com.fernandoschimidt.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

package com.festu.pomodoro.repository;

import com.festu.pomodoro.model.Pomodoro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface PomodoroRepository extends JpaRepository<Pomodoro, UUID> {
}

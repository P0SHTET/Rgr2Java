package com.festu.pomodoro.repository;

import com.festu.pomodoro.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface TagRepository extends JpaRepository<Tag, UUID> {
}

package com.festu.pomodoro.repository;

import com.festu.pomodoro.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
public interface TagRepository extends JpaRepository<Tag, UUID> {
}

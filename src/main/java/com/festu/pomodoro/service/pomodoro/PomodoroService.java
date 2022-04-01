package com.festu.pomodoro.service.pomodoro;

import com.festu.pomodoro.api.pomodoro.dto.CreatePomodoroDto;
import com.festu.pomodoro.api.pomodoro.dto.UpdatePomodoroDto;
import com.festu.pomodoro.model.Pomodoro;
import com.festu.pomodoro.service.pomodoro.args.CreatePomodoroArgs;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
public interface PomodoroService {

    void delete(UUID id);

    LocalDateTime start(UUID id);

    void stop(UUID id);

    Pomodoro create(CreatePomodoroArgs dto);

    Pomodoro update(UUID id, UpdatePomodoroDto dto);

    Pomodoro getExisting(UUID id);

    List<Pomodoro> list();

}

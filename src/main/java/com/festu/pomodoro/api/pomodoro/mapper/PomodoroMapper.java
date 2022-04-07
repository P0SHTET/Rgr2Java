package com.festu.pomodoro.api.pomodoro.mapper;

import com.festu.pomodoro.api.pomodoro.dto.PomodoroDto;
import com.festu.pomodoro.api.pomodoro.dto.PomodoroListDto;
import com.festu.pomodoro.model.Pomodoro;
import org.mapstruct.Mapper;


@Mapper
public interface PomodoroMapper {

    PomodoroDto toDto(Pomodoro pomodoro);

    PomodoroListDto toListDto(Pomodoro pomodoro);

}

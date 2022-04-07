package com.festu.pomodoro.api.pomodoro.dto;

import com.festu.pomodoro.model.Duration;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;


@Getter
@Builder
public class PomodoroListDto {

    UUID id;

    String title;

    Duration workDuration;

    Duration restDuration;

}

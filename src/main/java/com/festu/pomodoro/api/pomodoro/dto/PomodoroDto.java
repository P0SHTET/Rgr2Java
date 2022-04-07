package com.festu.pomodoro.api.pomodoro.dto;

import com.festu.pomodoro.model.Duration;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Builder
public class PomodoroDto {

    UUID id;

    String title;

    Duration workDuration;

    Duration restDuration;

    LocalDateTime startTime;

}

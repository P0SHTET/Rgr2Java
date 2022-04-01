package com.festu.pomodoro.api.pomodoro.dto;

import com.festu.pomodoro.model.Duration;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Builder
public class PomodoroListDto {

    UUID id;

    String title;

    Duration workDuration;

    Duration restDuration;

}

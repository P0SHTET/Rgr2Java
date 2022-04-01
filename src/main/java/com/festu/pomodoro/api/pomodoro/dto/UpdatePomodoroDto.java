package com.festu.pomodoro.api.pomodoro.dto;

import com.festu.pomodoro.model.Duration;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Setter
@NoArgsConstructor
public class UpdatePomodoroDto {

    @NotBlank(message = "Pomodoro title can't be blank")
    String title;

    @NotNull(message = "Work duration can't be null")
    Duration workDuration;

    @NotNull(message = "Rest duration can't be null")
    Duration restDuration;
}

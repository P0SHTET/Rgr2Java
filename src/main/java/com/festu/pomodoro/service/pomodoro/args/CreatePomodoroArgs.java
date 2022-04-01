package com.festu.pomodoro.service.pomodoro.args;

import com.festu.pomodoro.model.Duration;
import com.festu.pomodoro.model.Tag;
import lombok.Builder;
import lombok.Getter;

/**
 * Created on 4/2/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Builder
public class CreatePomodoroArgs {

    Tag tag;

    String title;

    Duration workDuration;

    Duration restDuration;

}

package com.festu.pomodoro.action;

import com.festu.pomodoro.api.pomodoro.dto.CreatePomodoroDto;
import com.festu.pomodoro.model.Tag;
import com.festu.pomodoro.service.pomodoro.args.CreatePomodoroArgs;
import com.festu.pomodoro.service.tag.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created on 4/2/2022
 *
 * @author Fedor Ishchenko
 */
@Component
@RequiredArgsConstructor
public class CreatePomodoroAction {

    private final TagService service;

    public CreatePomodoroArgs execute(CreatePomodoroDto dto) {
        Tag tag = service.getExisting(dto.getTagId());
        return CreatePomodoroArgs.builder()
                                 .tag(tag)
                                 .restDuration(dto.getRestDuration())
                                 .workDuration(dto.getWorkDuration())
                                 .title(dto.getTitle())
                                 .build();
    }

}

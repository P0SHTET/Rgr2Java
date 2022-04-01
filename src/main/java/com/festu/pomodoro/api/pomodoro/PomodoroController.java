package com.festu.pomodoro.api.pomodoro;

import com.festu.lib.dto.SimpleObjectValue;
import com.festu.pomodoro.action.CreatePomodoroAction;
import com.festu.pomodoro.api.pomodoro.dto.CreatePomodoroDto;
import com.festu.pomodoro.api.pomodoro.dto.PomodoroDto;
import com.festu.pomodoro.api.pomodoro.dto.PomodoroListDto;
import com.festu.pomodoro.api.pomodoro.dto.UpdatePomodoroDto;
import com.festu.pomodoro.api.pomodoro.mapper.PomodoroMapper;
import com.festu.pomodoro.service.pomodoro.PomodoroService;
import com.festu.pomodoro.service.pomodoro.args.CreatePomodoroArgs;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@RestController
@RequestMapping("pomodoro")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PomodoroController {

    PomodoroService service;

    PomodoroMapper mapper;

    CreatePomodoroAction createAction;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public PomodoroDto create(@RequestBody @Valid CreatePomodoroDto dto) {
        CreatePomodoroArgs args = createAction.execute(dto);
        return mapper.toDto(service.create(args));
    }

    @GetMapping("list")
    public List<PomodoroListDto> list() {
        return service.list().stream()
                      .map(mapper::toListDto)
                      .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public PomodoroDto get(@PathVariable UUID id) {
        return mapper.toDto(service.getExisting(id));
    }

    @PostMapping("{id}/start")
    public SimpleObjectValue<LocalDateTime> start(@PathVariable UUID id) {
        return new SimpleObjectValue<>(service.start(id));
    }

    @PostMapping("{id}/stop")
    public void stop(@PathVariable UUID id) {
        service.stop(id);
    }

    @PostMapping("{id}/update")
    @ResponseStatus(HttpStatus.CREATED)
    public PomodoroDto update(@PathVariable UUID id, @RequestBody @Valid UpdatePomodoroDto dto) {
        return mapper.toDto(service.update(id, dto));
    }

}

package com.festu.pomodoro.service.pomodoro;

import com.festu.meeting.exceptions.NotFoundException;
import com.festu.pomodoro.api.pomodoro.dto.CreatePomodoroDto;
import com.festu.pomodoro.api.pomodoro.dto.UpdatePomodoroDto;
import com.festu.pomodoro.model.Pomodoro;
import com.festu.pomodoro.repository.PomodoroRepository;
import com.festu.pomodoro.service.pomodoro.args.CreatePomodoroArgs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class PomodoroServiceImpl implements PomodoroService {

    private final PomodoroRepository repository;

    @Override
    public void delete(UUID id) {
        Pomodoro existing = getExisting(id);
        repository.delete(existing);
    }

    @Override
    public LocalDateTime start(UUID id) {
        Pomodoro pomodoro = getExisting(id);
        return pomodoro.start();
    }

    @Override
    public void stop(UUID id) {
        Pomodoro pomodoro = getExisting(id);
        pomodoro.reset();
    }

    @Override
    public Pomodoro create(CreatePomodoroArgs dto) {
        return repository.save(Pomodoro.builder()
                                       .tag(dto.getTag())
                                       .title(dto.getTitle())
                                       .restDuration(dto.getRestDuration())
                                       .workDuration(dto.getWorkDuration())
                                       .build());
    }

    @Override
    public Pomodoro update(UUID id, UpdatePomodoroDto dto) {
        Pomodoro pomodoro = getExisting(id);

        pomodoro.setTitle(dto.getTitle());
        pomodoro.setRestDuration(dto.getRestDuration());
        pomodoro.setWorkDuration(dto.getWorkDuration());

        return repository.save(pomodoro);
    }

    @Override
    public Pomodoro getExisting(UUID id) {
        return repository.findById(id)
                         .orElseThrow(() -> new NotFoundException("Pomodoro"));
    }

    @Override
    public List<Pomodoro> list() {
        return repository.findAll();
    }

}

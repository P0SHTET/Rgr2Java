package com.festu.pomodoro.api.tag;

import com.festu.pomodoro.api.tag.dto.CreateTagDto;
import com.festu.pomodoro.api.tag.dto.TagDto;
import com.festu.pomodoro.api.tag.mapper.TagMapper;
import com.festu.pomodoro.service.tag.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@RestController
@RequestMapping("tag")
@RequiredArgsConstructor
public class TagController {

    TagService service;

    TagMapper mapper;

    @PostMapping("create")
    public TagDto create(CreateTagDto dto) {
        return mapper.toDto(service.create(dto));
    }

    @GetMapping("list")
    public List<TagDto> list() {
        return service.list()
                      .stream()
                      .map(mapper::toDto)
                      .collect(Collectors.toList());
    }

    @PostMapping("{id}/delete")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }

}
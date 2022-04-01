package com.festu.pomodoro.service.tag;

import com.festu.meeting.exceptions.NotFoundException;
import com.festu.pomodoro.api.tag.dto.CreateTagDto;
import com.festu.pomodoro.model.Tag;
import com.festu.pomodoro.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    TagRepository repository;

    @Override
    public Tag create(CreateTagDto dto) {
        return repository.save(Tag.builder()
                                  .title(dto.getTitle())
                                  .build());
    }

    @Override
    public List<Tag> list() {
        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {
        Tag tag = getExisting(id);
        repository.delete(tag);
    }

    @Override
    public Tag getExisting(UUID id) {
        return repository.findById(id)
                         .orElseThrow(() -> new NotFoundException("Tag"));
    }

}

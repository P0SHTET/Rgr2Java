package com.festu.pomodoro.service.tag;

import com.festu.pomodoro.api.tag.dto.CreateTagDto;
import com.festu.pomodoro.model.Tag;

import java.util.List;
import java.util.UUID;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
public interface TagService {

    Tag create(CreateTagDto dto);

    List<Tag> list();

    void delete(UUID id);

    Tag getExisting(UUID id);

}

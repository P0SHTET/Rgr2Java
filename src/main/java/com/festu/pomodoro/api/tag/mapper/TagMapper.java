package com.festu.pomodoro.api.tag.mapper;

import com.festu.pomodoro.api.tag.dto.TagDto;
import com.festu.pomodoro.model.Tag;
import org.mapstruct.Mapper;


@Mapper
public interface TagMapper {
    TagDto toDto(Tag tag);
}

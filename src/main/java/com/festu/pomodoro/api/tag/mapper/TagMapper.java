package com.festu.pomodoro.api.tag.mapper;

import com.festu.pomodoro.api.tag.dto.TagDto;
import com.festu.pomodoro.model.Tag;
import org.mapstruct.Mapper;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Mapper
public interface TagMapper {
    TagDto toDto(Tag tag);
}

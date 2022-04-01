package com.festu.pomodoro.api.tag.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Builder
public class CreateTagDto {

    @NotBlank(message = "Tag title can't be empty")
    String title;

}

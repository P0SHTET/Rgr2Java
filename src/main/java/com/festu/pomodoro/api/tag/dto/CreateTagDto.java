package com.festu.pomodoro.api.tag.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@NoArgsConstructor
public class CreateTagDto {

    @NotBlank(message = "Tag title can't be empty")
    String title;

}

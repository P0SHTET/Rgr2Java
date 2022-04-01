package com.festu.pomodoro.api.tag.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Setter
@NoArgsConstructor
public class CreateTagDto {

    @NotBlank(message = "Tag title can't be empty")
    String title;

}

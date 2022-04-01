package com.festu.pomodoro.api.tag.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Builder
public class TagDto {
    UUID id;
    String title;
}

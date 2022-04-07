package com.festu.pomodoro.api.tag.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;


@Getter
@Builder
public class TagDto {
    UUID id;
    String title;
}

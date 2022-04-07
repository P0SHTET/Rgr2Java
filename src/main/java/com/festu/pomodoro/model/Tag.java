package com.festu.pomodoro.model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tag extends BaseEntity {

    String title;

}

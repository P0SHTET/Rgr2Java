package com.festu.pomodoro.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tag extends BaseEntity {

    String title;

}

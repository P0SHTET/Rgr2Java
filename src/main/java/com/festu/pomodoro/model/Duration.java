package com.festu.pomodoro.model;

import lombok.*;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Duration {

    Integer hours;

    Integer minutes;

}

package com.festu.pomodoro.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Setter
@Builder
public class Tag extends BaseEntity {

    @OneToOne
    @JoinColumn(nullable = false)
    Pomodoro pomodoro;

    String title;

}

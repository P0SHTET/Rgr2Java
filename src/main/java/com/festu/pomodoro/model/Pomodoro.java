package com.festu.pomodoro.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

/**
 * Created on 4/1/2022
 *
 * @author Fedor Ishchenko
 */
@Getter
@Setter
@Builder
public class Pomodoro extends BaseEntity {

    String title;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pomodoro", cascade = CascadeType.REMOVE)
    Tag tag;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pomodoro", cascade = CascadeType.REMOVE)
    Duration workDuration;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pomodoro", cascade = CascadeType.REMOVE)
    Duration restDuration;

    LocalDateTime startTime;

    public void start() {
        startTime = LocalDateTime.now();
    }

    public void reset() {
        startTime = null;
    }

}

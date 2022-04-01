package com.festu.pomodoro.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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
public class Pomodoro extends BaseEntity {

    String title;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    Tag tag;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "hours", column = @Column(name = "work_hours")),
            @AttributeOverride(name = "minutes", column = @Column(name = "work_minutes"))
    })
    Duration workDuration;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "hours", column = @Column(name = "rest_hours")),
            @AttributeOverride(name = "minutes", column = @Column(name = "rest_minutes"))
    })
    Duration restDuration;

    LocalDateTime startTime;

    public LocalDateTime start() {
        startTime = LocalDateTime.now();
        return startTime;
    }

    public void reset() {
        startTime = null;
    }

}

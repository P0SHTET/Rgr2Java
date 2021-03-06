package com.festu.auth.model;

import com.festu.meeting.model.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class AuthToken extends BaseEntity {

    LocalDateTime lastAccessTime;

    @ManyToOne
    User user;

    @PrePersist
    public void setLastTime() {
        lastAccessTime = LocalDateTime.now();
    }

}

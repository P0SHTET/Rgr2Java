package com.festu.meeting.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntry {
    UUID id;
    String name;
}

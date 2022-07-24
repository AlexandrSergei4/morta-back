package com.alki.mortaback.data.model;

import com.alki.mortaback.domain.model.MobileApp;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SuperBuilder
@Table
public class SuspiciousApp extends BaseApp {

    @Column
    boolean processed;


}

package com.alki.mortaback.data.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String activityName;

    @Column
    String description;

    @Column
    Integer threatTypeMask;

    @Column
    @Builder.Default
    String email="";

    @Column(length = 2000)
    @Email
    String link;

    @Column
    @Builder.Default

//    @Pattern(regexp = "\\+?\\d-\\d{3}-\\d{3}-\\d{4}")
    String phone="";

    @Column(length = 5000)
    @Builder.Default
    String howBlockInfo="Contact by phone";

    @Column
    @Builder.Default
    String howRestoreInfo="";
}

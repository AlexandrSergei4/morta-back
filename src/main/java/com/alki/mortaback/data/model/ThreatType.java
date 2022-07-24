package com.alki.mortaback.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SuperBuilder
@Table
public class ThreatType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private int mask;
    private String name;
    private String localizedName;
    private int severityLevel;

}

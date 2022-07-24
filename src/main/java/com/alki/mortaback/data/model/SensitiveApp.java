package com.alki.mortaback.data.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
@Entity
@Table
public class SensitiveApp extends BaseApp {

}

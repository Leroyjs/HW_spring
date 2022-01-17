package com.koltashov.spring.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "area")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Area extends AbstractPersistable<Integer> {

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Address> addresses = new ArrayList<>();
}

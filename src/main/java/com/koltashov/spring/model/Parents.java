package com.koltashov.spring.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "parents")
@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Parents extends AbstractPersistable<Integer> {
    @Basic
    @Column(name = "first_name", nullable = false, length = 120)
    private String firstName;

    @Basic
    @Column(name = "second_name", nullable = false, length = 120)
    private String secondName;

    @OneToMany(mappedBy = "parents", cascade = CascadeType.ALL)
    public List<Child> children = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;
}

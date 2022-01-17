package com.koltashov.spring.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Table(name = "child")
@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Child extends AbstractPersistable<Integer> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parents_id")
    @ToString.Exclude
    private Parents parents;

    @Basic
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Basic
    @Column(name = "age", nullable = false)
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "education_id")
    @ToString.Exclude
    private Education education;
}

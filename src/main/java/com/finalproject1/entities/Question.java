package com.finalproject1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
@Data
@NoArgsConstructor
public class Question {

    @Id
    @SequenceGenerator(
            name = "question_seq",
            sequenceName = "question_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_seq")
    private Long id;
    private String questionName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "test_id")
    private Test test;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private List<Variant>variantList;

}

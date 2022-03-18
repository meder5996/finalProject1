package com.finalproject1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "variants")
@NoArgsConstructor
public class Variant {

    @Id
    @SequenceGenerator(
            name = "variant_seq",
            sequenceName = "variant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "variant_seq"
    )
    private Long id;
    @Column(name = "variant_name")
    private String variantName;
    private boolean answer = false;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "question_id")
    private Question question;
}

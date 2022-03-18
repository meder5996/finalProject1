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

    public Variant(String variantName, boolean answer) {
        this.variantName = variantName;
        this.answer = answer;
    }

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private Question question;
}

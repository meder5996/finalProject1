package com.finalproject1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "test")
@NoArgsConstructor
public class Test {

    @Id
    @SequenceGenerator(
            name = "test_seq",
            sequenceName = "test_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "test_seq"
    )
    private Long id;
    private String title;
    private String duration;

    public Test(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER, mappedBy = "test")
    private List<User> userLis;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER, mappedBy = "test")
    private List<Question>questionList;

}

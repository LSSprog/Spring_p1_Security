package entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "score_tbl")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "score_id")
    private Integer id;

    @OneToOne(mappedBy = "score")
    private User user;

    @Column(name = "score_fld")
    private Integer score;
}

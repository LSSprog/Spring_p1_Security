package spring.security.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users_tbl")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username_fld")
    private String username;

    @Column(name = "password_fld")
    private String password;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "score_id")
    private Score score;
}

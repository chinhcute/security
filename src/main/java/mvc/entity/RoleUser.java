package mvc.entity;

import javax.persistence.*;

@Entity
@Table
public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}

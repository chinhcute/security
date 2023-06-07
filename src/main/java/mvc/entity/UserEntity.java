package mvc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RoleUser> roleUserList;
}

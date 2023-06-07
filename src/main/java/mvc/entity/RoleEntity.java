package mvc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String role;
    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    private List<RoleUser> roleUserList;
}

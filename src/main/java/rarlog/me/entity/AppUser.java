package rarlog.me.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import rarlog.me.dto.AccountCreateDto;

@Data
@Entity
@NoArgsConstructor
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @OneToMany(mappedBy = "appUser")
    private List<Playlist> playlists;

    public AppUser(AccountCreateDto accountCreateDto) {
        this.username = accountCreateDto.getUsername();
        this.firstName = accountCreateDto.getFirstName();
        this.lastName = accountCreateDto.getLastName();
        this.email = accountCreateDto.getEmail();
    }

}

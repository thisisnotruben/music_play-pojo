package rarlog.me.dto;

import lombok.Data;
import rarlog.me.entity.AppUser;

@Data
public class AppUserDto {
    
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

    public AppUserDto(AppUser appUser) {
        this.username = appUser.getUsername();
        this.password = appUser.getPassword();
        this.email = appUser.getEmail();
        this.firstName = appUser.getFirstName();
        this.lastName = appUser.getLastName();
    }

}

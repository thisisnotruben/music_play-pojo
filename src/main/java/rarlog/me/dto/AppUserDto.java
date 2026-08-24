package rarlog.me.dto;

import lombok.Data;
import rarlog.me.entity.AppUser;

@Data
public class AppUserDto {
    
    private String userId;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

    public AppUserDto(AppUser appUser) {
        this.userId = appUser.getUserId();
        this.email = appUser.getEmail();
        this.firstName = appUser.getFirstName();
        this.lastName = appUser.getLastName();
    }

}

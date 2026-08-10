package rarlog.me.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class LoginResponseDto {
    
    private String accessToken;
    private Date accessTokenExpiration;

    private String refreshToken;
    private Date refreshTokenExpiration;

}

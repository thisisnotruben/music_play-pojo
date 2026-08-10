package rarlog.me.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class LoginResponseDto {
    
    private String accessToken;
    private LocalDateTime accessTokenExpiration;

    private String refreshToken;
    private LocalDateTime refreshTokenExpiration;

}

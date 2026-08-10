package rarlog.me.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class RefreshTokenDto {

    private String refreshToken;
    private LocalDateTime expiration;

}

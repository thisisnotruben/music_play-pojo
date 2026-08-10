package rarlog.me.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class RefreshTokenDto {

    private String refreshToken;
    private Date expiration;

}

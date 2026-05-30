package rarlog.me.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AllMusicDto {

    private String artistName;
    private List<AlbumDto> albums;

}

package rarlog.me.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ArtistDto extends SearchResultDto {

    private String name;
    private List<AlbumDto> albums;

    public ArtistDto(String name, List<AlbumDto> albums) {
        this.type = SearchDto.TYPE_ARTIST;
        this.name = name;
        this.albums = albums;
    }    

}

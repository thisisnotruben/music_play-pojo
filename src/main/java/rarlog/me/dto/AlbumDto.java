package rarlog.me.dto;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import rarlog.me.entity.Album;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class AlbumDto extends SearchResultDto {

    private long id;
    private String name;
    private String artistName;
    private long artistId;
    private List<SongDto> songs;

    public AlbumDto(Album album) {
        this.type = SearchDto.TYPE_ALBUM;
        this.id = album.getId();
        this.name = album.getName();
        this.coverPath = album.getCoverPath();
        this.artistName = album.getArtist().getName();
        this.artistId = album.getArtist().getId();
        this.songs = album.getSongs().stream().map(s -> new SongDto(s)).collect(Collectors.toList());
    }

}

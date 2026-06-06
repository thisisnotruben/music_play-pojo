package rarlog.me.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import rarlog.me.entity.Song;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class SongDto extends SearchResultDto {

    private long id;
    private String name;
    private String genre;
    private float length;
    private String audioPath;
    private String albumName;
    private long albumId;
    private String artistName;

    public SongDto(Song song) {
        this.type = SearchDto.TYPE_SONG;
        this.id = song.getId();
        this.name = song.getName();
        this.genre = song.getGenre();
        this.length = song.getLength();
        this.audioPath = song.getAudioPath();
        this.albumName = song.getAlbum().getName();
        this.coverPath = song.getAlbum().getCoverPath();
        this.albumId = song.getAlbum().getId();
        this.artistName = song.getAlbum().getArtist().getName();
    }

}

package rarlog.me.dto;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import rarlog.me.entity.Playlist;

@Data
public class PlaylistDto {

    private long id;
    private String name;
    private String coverPath;
    private List<SongDto> songs;

    public PlaylistDto(Playlist playlist) {
        this.id = playlist.getId();
        this.name = playlist.getName();
        this.coverPath = playlist.getCoverPath();
        this.songs = playlist.getPlaylistSongs().stream().map(p -> new SongDto(p.getSong()))
                .collect(Collectors.toList());
    }

}

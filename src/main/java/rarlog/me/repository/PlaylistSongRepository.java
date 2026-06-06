package rarlog.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rarlog.me.entity.PlaylistSong;
import rarlog.me.entity.PlaylistSongKey;

@Repository
public interface PlaylistSongRepository extends JpaRepository<PlaylistSong, PlaylistSongKey> {

}

package rarlog.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rarlog.me.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}

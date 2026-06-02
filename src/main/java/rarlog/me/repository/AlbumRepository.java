package rarlog.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rarlog.me.entity.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

}

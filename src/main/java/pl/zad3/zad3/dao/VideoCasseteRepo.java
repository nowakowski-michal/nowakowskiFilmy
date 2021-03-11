package pl.zad3.zad3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.zad3.zad3.dao.entity.VideoCassete;

@Repository
public interface VideoCasseteRepo extends CrudRepository<VideoCassete,Long> {
}

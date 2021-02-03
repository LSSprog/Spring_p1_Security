package spring.security.repositories;

import spring.security.entities.Score;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Profile("dao")
public interface ScoreRepository extends CrudRepository<Score, Integer> {


}

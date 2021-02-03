package spring.security.services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.security.entities.Score;
import spring.security.entities.User;
import spring.security.repositories.ScoreRepository;

import java.util.Optional;

@Service
//@Profile("dao")
@RequiredArgsConstructor
public class ScoreService {
    private final ScoreRepository scoreRepository;

    public void incScore(User user) {
        Score score = user.getScore();
        Integer scoreField = score.getScore();
        score.setScore(scoreField + 10);
        user.setScore(score);
    }

    public void decScore(User user) {
        Score score = user.getScore();
        Integer scoreField = score.getScore();
        score.setScore(scoreField - 10);
        user.setScore(score);
    }

    public Integer currentScore(User user) {
        return user.getScore().getScore();
    }

    public Optional<Score> findScoreById (Integer id) {
        return scoreRepository.findById(id); //здесь по другому надо, через юзера связь
    }
}

package spring.security.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.security.entities.Score;
import spring.security.entities.User;
import spring.security.services.ScoreService;

@RestController
@RequestMapping("/score")
@RequiredArgsConstructor
public class ScoreController {
//    private final ScoreService scoreService;
//
//    @GetMapping ("/inc")
//    public Score incScore(@RequestBody User user) {
//        scoreService.incScore(user);
//        return user.getScore();
//    }
//
//    @GetMapping("/dec")
//    public Score decScore(@RequestBody User user) {
//        scoreService.decScore(user);
//        return user.getScore();
//    }
//
//    @GetMapping("/get/current")
//    public Score currentUserScore () {
//        return null; // надо подумать как на текущего юзера выйти
//    }
//
//    @GetMapping("/get/{id}")
//    public Score findScoreById (@PathVariable Integer id) {
//        return scoreService.findScoreById(id).get();
//    }


}

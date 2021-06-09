package com.example.bcnfemtechp4grupo4.controllers;

import com.example.bcnfemtechp4grupo4.models.Game;
import com.example.bcnfemtechp4grupo4.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.*;

@Controller
   public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) { this.gameService=gameService;}

    @GetMapping("/games")
       String listGames(Model model) {
        List<Game> games = gameService.allGames();
        model.addAttribute("title" , "Games List");
        model.addAttribute("game",games);
        return "games/all";
    }
    @GetMapping("/games/new")
        String getForm(Model model){
        Game game = new Game();
        model.addAttribute("title","Create new game");
        model.addAttribute("game",game);
        return "games/edit";
    }
    @PostMapping("/games")
    public void addGames(Game game) {
    }
    @PostMapping("/games/new")
        public String addGame(@ModelAttribute Game game) {
        gameService.save(game);
        return "redirect:/games";
    }
    @GetMapping("/games/edit/{id}")
        public String editGame(Model model, @PathVariable Long id) {
        Game game = gameService.findById(id);
        model.addAttribute("game",game);
        model.addAttribute("title","Edit game");
        return "games/edit";
    }
    @GetMapping("/games/delete/{id}")
        public String deleteGame(@PathVariable Long id) {
        gameService.delete(id);
        return "redirect:/games";
    }


}
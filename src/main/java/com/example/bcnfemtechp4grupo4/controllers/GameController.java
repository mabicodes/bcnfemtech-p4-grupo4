package com.example.bcnfemtechp4grupo4.controllers;

import com.example.bcnfemtechp4grupo4.models.Game;
import com.example.bcnfemtechp4grupo4.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        model.addAttribute("title" , title);
        model.addAttribute("platform",platform);
        model.addAttribute("year",year);
        model.addAttribute("price",price);
        model.addAttribute("etiqueta",etiqueta);
        model.addAttribute("discount",discount);
        model.addAttribute("pricediscount",pricediscount);
        model.addAttribute("category",category);
        model.addAttribute("publisher",publisher);
        model.addAttribute("pegi",pegi);
        model.addAttribute("pegicontentdescriptors",pegicontentdescriptors);
        return "games/new";
    }
    @GetMapping("/games/new")
        String getForm(Model model){
        Game game = new Game();
        model.addAttribute("game",game);
        return "games/new";
    }
    @PostMapping("/new")
        public String addGame(@ModelAttribute Game game) {
        gameService.save(game);
        return "redirect:/games";
    }
}

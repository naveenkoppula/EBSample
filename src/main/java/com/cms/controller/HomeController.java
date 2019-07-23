package com.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.model.Player;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
	
	List<Player> listPlayers = new ArrayList<Player>();
	  
	  @PostConstruct
	    public void init() throws Exception {
		  System.out.println("Init");
		  listPlayers.add(new Player(new Long(1), new Long(1), "Test1", "Test", "Test"));
		  listPlayers.add(new Player(new Long(2), new Long(2), "Test2", "Test", "Test"));
	    }
	  
	
	@GetMapping("/player")
    public String index(Model model) {
		System.out.println("In player");
		model.addAttribute("players",listPlayers);
		System.out.println(listPlayers);
		return "players";
    }
}

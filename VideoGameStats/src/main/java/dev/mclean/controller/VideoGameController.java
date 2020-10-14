package dev.mclean.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.mclean.beans.VideoGame;
import dev.mclean.service.VideoGameService;

@RestController
public class VideoGameController {
	
	@Autowired
	VideoGameService vgs;
	
	@GetMapping(value = "/game", produces = "application/json")
	public List<VideoGame> allGames() throws IOException{
		return vgs.getAllGames();
		
	}
	
	@GetMapping(value = "/game/{id}", produces = "application/json")
	public VideoGame getGame(@PathVariable("id") int id) throws IOException {
		return vgs.getVideoGame(id-1);
		
	}
	

}

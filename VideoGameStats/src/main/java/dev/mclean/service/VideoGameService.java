package dev.mclean.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.mclean.beans.VideoGame;
import dev.mclean.repository.FakeDB;

@Service
public class VideoGameService {
	
	@Autowired
	FakeDB fdb;
	
	public VideoGame getVideoGame(int id) throws IOException {
		return fdb.createDB().get(id);
	}
	
	public List<VideoGame> getAllGames() throws IOException{
		return fdb.createDB();
	}

}

package dev.mclean.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import dev.mclean.beans.VideoGame;

@Component
public class FakeDB {

	public List<VideoGame> createDB() throws IOException {

		Gson gson = new Gson();
		String file = "src/main/resources/video_games.json";
		String json = new String(Files.readAllBytes(Paths.get(file)));

		VideoGame[] videogames = gson.fromJson(json, VideoGame[].class);
		List<VideoGame> vgList = Arrays.asList(videogames);

		for (int i = 0; i < vgList.size(); i++) {
			VideoGame v = vgList.get(i);
			v.setId(i + 1);
		}
		return vgList;
	}
}

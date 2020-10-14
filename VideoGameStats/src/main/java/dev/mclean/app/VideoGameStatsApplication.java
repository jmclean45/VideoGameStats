package dev.mclean.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dev.mclean")
public class VideoGameStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameStatsApplication.class, args);
	}

}

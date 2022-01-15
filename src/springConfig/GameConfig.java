package springConfig;


import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import level.Box;
import level.Level;
import level.LevelGenerator;
import level.boxContents.characters.Pacman;
import level.boxContents.foods.FoodAddPoints;
import level.boxContents.foods.FoodEatGhosts;
import logic.Game;
import lombok.*;
import level.boxContents.*;

@Configuration
@ComponentScan("/pacman_spring/src/springconfig/Configuration.java")
@PropertySource("classpath:pacman_spring.properties")
public class GameConfig {
	@Autowired
	Environment ev;
	
	@Bean
	public Game game() {
		return new Game();
	}
	
	@Bean
	public Pacman pacman() {
		return new Pacman();
	}
	
	
	@Bean
	public Obstacle obstacle() {
		return new Obstacle();
	}
	
	@Bean
	public Empty empty() {
		return new Empty();
	}
	
	@Bean
	public FoodAddPoints foodAddPoints() {
		return new FoodAddPoints();
	}
	
	@Bean
	public FoodEatGhosts foodEatGhosts() {
		return new FoodEatGhosts();
	}
	
	@Bean
	public Level level() {
		return new Level();
	}
	
	@Bean
	public LevelGenerator levelGenerator() {
		return new LevelGenerator();
	}
	
}

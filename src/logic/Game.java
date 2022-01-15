package logic;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import level.Level;
import level.LevelGenerator;
import lombok.*;
import springConfig.GameConfig;

@Component
public class Game extends JFrame {
	@Autowired
	@Getter @Setter
	private Level level;
	
	public static void main (String args[]) throws IOException {
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
		Level level = context.getBean("level", Level.class);
		level.initialize();
		level.setName("level1.txt");
		LevelGenerator levelGenerator = context.getBean("levelGenerator", LevelGenerator.class);
		levelGenerator.importLevel(level);
		context.close();*/
		System.out.println(Integer.class.descriptorString());
	}
	public Game () {
		this.setTitle("Pacman");
		this.setSize(310,310);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(18,18));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}

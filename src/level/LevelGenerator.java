package level;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import level.boxContents.BoxContent;
import level.boxContents.Obstacle;
import level.boxContents.Empty;
import level.boxContents.characters.Pacman;
import level.boxContents.foods.FoodAddPoints;
import level.boxContents.foods.FoodEatGhosts;
import logic.Position;
import springConfig.GameConfig;

@Component
@Scope("singleton")
public class LevelGenerator {

	/* Format of the file: 
	 * 
	 * posX | posY | object name that is inside in the box
	 * 
	 * */
	
	public void importLevel(Level level) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
		Box[][] boxes = level.getBoxes();
		FileInputStream fstream = new FileInputStream(level.getName());
		try (BufferedReader br = new BufferedReader(new InputStreamReader(fstream))) {
			String strLine = br.readLine();
			String x="", y="", object="";
			while (strLine!=null) {
				int cant = 0;
				for (int i=0; i<strLine.length(); i++) {
					if (strLine.charAt(i) == '|') {
						cant++;
					}
					else {
						switch (cant) {
						case 0:
							x+=strLine.charAt(i);
							break;
						case 1:
							y+=strLine.charAt(i);
							break;
						case 2:
							object+=strLine.charAt(i);
							break;
						}
					}
				}
				int X = Integer.parseInt(x);
				int Y = Integer.parseInt(y);
				BoxContent boxContent = null;
				switch (object) {
				case ("pacman"):
					boxContent = context.getBean("pacman", Pacman.class);
					break; 
				case ("obstacle"):
					boxContent = context.getBean("obstacle", Obstacle.class);
					break; 
				case ("empty"):
					boxContent = context.getBean("empty", Empty.class);
					break; 
				case ("foodAddPoints"):
					boxContent = context.getBean("foodAddPoints", FoodAddPoints.class);
					break; 
				case ("foodEatGhosts"):
					boxContent = context.getBean("foodEatGhosts", FoodEatGhosts.class);
				}
				boxContent.setId(object);
				boxes[X][Y].setBoxContent(boxContent);
				boxes[X][Y].lockBoxAttempt();
				strLine = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fstream.close();
		context.close();
	}

}

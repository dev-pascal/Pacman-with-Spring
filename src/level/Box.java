package level;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import level.boxContents.BoxContent;
import logic.Game;
import logic.Position;
import lombok.*;
import springConfig.GameConfig;

@AllArgsConstructor
@Component
public class Box {
	@Getter @Setter 
	private Position pos;
	@Getter @Setter 
	private BoxContent boxContent;
	@Getter @Setter
	private JLabel label;
	
	public void lockBoxAttempt() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
		
		String url = this.boxContent.getUrlImg();
		this.label.setIcon(new ImageIcon(url));
		
		Game game = context.getBean("game", Game.class);
		game.add(this.label);
		
		context.close();
	}

}

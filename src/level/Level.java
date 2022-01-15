package level;

import javax.swing.JLabel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import level.boxContents.BoxContent;
import level.boxContents.Empty;
import logic.Position;
import lombok.*;

@Component
@Scope("prototype")
public class Level {
	@Autowired
	@Getter @Setter
	private Box[][] boxes;
	
	@Getter @Setter
	private String name;
	
	public void initialize() {
		for (int i=0; i<18; i++) {
			for (int j=0; j<18; j++) {
				Position pos = new Position(i,j);
				BoxContent boxContent = new Empty();
				JLabel jlabel = new JLabel();
				Box box = new Box(pos, boxContent, jlabel);
				box.lockBoxAttempt();
				boxes[i][j] = box;
				
			}
		}
	}
	
	public Box getBoxByIndex (int i, int j) {
		return boxes[i][j];
	}
}

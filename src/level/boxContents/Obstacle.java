package level.boxContents;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import logic.Position;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
@Scope("prototype")
public class Obstacle extends BoxContent {
	
	public Obstacle (String id, String urlImg) {
		super(id, urlImg);
	}
	
}	


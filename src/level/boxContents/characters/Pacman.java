package level.boxContents.characters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import logic.Position;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
@Scope("singleton")
public class Pacman extends Character {

	public Pacman (String id, String urlImg) {
		super(id, urlImg);
	}

}

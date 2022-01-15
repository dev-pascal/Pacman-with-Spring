package level.boxContents.characters;

import level.boxContents.BoxContent;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Character extends BoxContent {
	@Getter @Setter
	private int life = 1;
	
	public Character (String id, String urlImg) {
		super(id, urlImg);
	}

}

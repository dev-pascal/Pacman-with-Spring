package level.boxContents.foods;

import org.springframework.context.annotation.Scope;

import level.boxContents.BoxContent;
import logic.Position;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Scope("prototype")
public abstract class Food extends BoxContent {
	public Food (String id, String urlImg) {
		super(id, urlImg);
	}
}

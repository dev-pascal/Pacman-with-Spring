package level.boxContents.foods;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import logic.Position;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
@Scope("prototype")
public class FoodEatGhosts extends Food {
	public FoodEatGhosts (String id, String urlImg) {
		super(id, urlImg);
	}
}

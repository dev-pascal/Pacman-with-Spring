package level.boxContents.foods;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import logic.Position;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
@Scope("prototype")
public class FoodAddPoints extends Food {
	public FoodAddPoints (String id, String urlImg) {
		super(id, urlImg);
	}
}

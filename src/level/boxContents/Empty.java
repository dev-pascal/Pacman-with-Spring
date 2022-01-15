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
public class Empty extends BoxContent {

	public Empty (String id, String urlImg) {
		super(id, urlImg);
	}
}

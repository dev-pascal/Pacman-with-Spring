package level.boxContents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import springConfig.GameConfig;

@NoArgsConstructor
@RequiredArgsConstructor
public abstract class BoxContent {
	private Environment ev;
	
	@NonNull @Getter @Setter
	private String id;

	@NonNull @Getter @Setter
	private String urlImg;
	
	@Autowired
	public BoxContent (String urlImg) {
		this.urlImg = ev.getProperty("${"+this.id+"}");
	}
	
}

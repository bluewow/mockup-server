
import de.bertilmuth.javadataclass.util.JsonBuilder;

//package

@RestController
public class TestController {

	@GetMapping("/chat/getMember")
	public String getMember () {
		return new JsonBuilder().add("key", "value").toJson();
	}
	@GetMapping("/chat/getMember")
	public String getMember () {
		return new JsonBuilder().add("key", "value").toJson();
	}

}
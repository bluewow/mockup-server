//package
import org.springframework.web.bind.annotation.*;

@RestController
public class ${spec.name}Controller {
	
<#list spec.funcSpecifications as func>
	@${func.httpMethod}Mapping("${func.path}")
	public ${func.returnType} ${func.funcName} () {
		return "Hello World";
	}
</#list>

}
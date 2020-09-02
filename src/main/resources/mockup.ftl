public class ${classSpecification.name}Controller {
<#--  
<#list classSpecification.fieldSpecifications as field>
	private ${field.type} ${field.name};
</#list>

<#list classSpecification.fieldSpecifications as field>
	public ${field.type} get${field.name?cap_first}(){
		return ${field.name};
	}
	public void set${field.name?cap_first}(${field.type} ${field.name}){
		this.${field.name} = ${field.name};
	}
</#list>	 
-->
<#--  
	{@GetMapping("/test/get")}
	public {XXX} {get}({XXX...}) {
		return {XXX}
	}	 
-->
	public String ${classSpecification.funcName} () {
		return "Hello World";
	}
}
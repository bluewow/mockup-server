public class ${spec.name}Controller {
<#--  
<#list spec.fieldSpecifications as field>
	private ${field.type} ${field.name};
</#list>

<#list spec.fieldSpecifications as field>
	public ${field.type} get${field.name?cap_first}(){
		return ${field.name};
	}
	public void set${field.name?cap_first}(${field.type} ${field.name}){
		this.${field.name} = ${field.name};
	}
</#list>	 
-->

	@${spec.funcSpecifications.httpMethod}Mapping("${spec.funcSpecifications.path}")
	public String ${spec.funcSpecifications.funcName} () {
		return "Hello World";
	}
}
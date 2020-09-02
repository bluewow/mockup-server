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

<#list spec.funcSpecifications as func>
	@${func.httpMethod}Mapping("${func.path}")
	public ${func.returnType} ${func.funcName} () {
		return "Hello World";
	}
</#list>

}
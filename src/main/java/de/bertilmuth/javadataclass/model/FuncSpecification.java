package de.bertilmuth.javadataclass.model;

public class FuncSpecification {
	private String funcName;
	private String httpMethod;
	private String path;
	private String responseData;
	private String params;	//TODO Refact
	private String returnType; 

	//for Test
	public FuncSpecification() {
		this.funcName = "getMember";
		this.httpMethod = "Get";
		this.path = "/chat/getMember";
		this.responseData = "";
		this.params = "";
		this.returnType = "String";
	}
	
	public FuncSpecification(String funcName, String httpMethod, String path, String responseData, String params, String returnType) {
		this.funcName = funcName;
		this.httpMethod = httpMethod;
		this.path = path;
		this.responseData = responseData;
		this.params = params;
		this.returnType = returnType;
	}

	public String getFuncName() {
		return funcName;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public String getPath() {
		return path;
	}

	public String getResponseData() {
		return responseData;
	}

	public String getParams() {
		return params;
	}
	
	public String getReturnType() {
		return returnType;
	}
}

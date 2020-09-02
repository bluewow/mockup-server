package de.bertilmuth.javadataclass.model;

import com.google.gson.JsonObject;

import de.bertilmuth.javadataclass.util.JsonBuilder;

public class FuncSpecification {
	private String funcName;
	private String httpMethod;
	private String path;
	private String response;
	private String params;	//TODO Refact
	private String returnType; 

	//for Test
	public FuncSpecification() {
		this.funcName = "getMember";
		this.httpMethod = "Get";
		this.path = "/chat/getMember";
		this.response = "new JsonBuilder().add(\"key\", \"value\").toJson()";
		this.params = "";
		this.returnType = "String";
	}
	
	public FuncSpecification(String funcName, String httpMethod, String path, String response, String params, String returnType) {
		this.funcName = funcName;
		this.httpMethod = httpMethod;
		this.path = path;
		this.response = response;
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

	public String getResponse() {
		return response;
	}

	public String getParams() {
		return params;
	}
	
	public String getReturnType() {
		return returnType;
	}
}

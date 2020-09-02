package de.bertilmuth.javadataclass.model;

import java.util.Collections;
import java.util.List;

public class ClassSpecification {
	private String name;
	private List<FieldSpecification> fieldSpecifications;
	private String funcName;
	
	public ClassSpecification(String className, List<FieldSpecification> fieldSpecifications) {
		this.name = className;
		this.fieldSpecifications = fieldSpecifications;
	}

	public ClassSpecification(String className, List<FieldSpecification> fieldSpecifications, String funcName) {
		this.name = className;
		this.fieldSpecifications = fieldSpecifications;
		this.funcName = funcName;
	}
	
	public String getName() {
		return name;
	}

	public String getFuncName() {
		return funcName;
	}
	
	public List<FieldSpecification> getFieldSpecifications() {
		return Collections.unmodifiableList(fieldSpecifications);
	}
}

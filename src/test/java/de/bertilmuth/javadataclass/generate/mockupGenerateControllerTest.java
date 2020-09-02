package de.bertilmuth.javadataclass.generate;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

import de.bertilmuth.javadataclass.model.ClassSpecification;
import de.bertilmuth.javadataclass.model.FieldSpecification;

public class mockupGenerateControllerTest {

	//JavaDataClassGenerator 사용법익히기
//	@Test
	public void studyGenerateJavaSourceFiles() throws Exception { 
		//given
		FieldSpecification field = new FieldSpecification("test", "String");
		ClassSpecification classSpec = new ClassSpecification("Test", Arrays.asList(field));
		
		File file = new File(".");
		JavaDataClassGenerator generator = new JavaDataClassGenerator();

		//when
		generator.generateJavaSourceFiles(Arrays.asList(classSpec), file);
		
		//then
	}
	
	//customDataClassGenerator
	@Test
	public void testCustomGenerateJavaSourceFiles() throws Exception { 
		//given
		FieldSpecification field = new FieldSpecification("test", "String");
		ClassSpecification classSpec = new ClassSpecification("Test", Arrays.asList(field), "HelloWorld");
		
		File file = new File(".");
		JavaDataClassGenerator generator = new JavaDataClassGenerator();

		//when
		generator.generateJavaSourceFiles(Arrays.asList(classSpec), file);
		
		//then
	}
}

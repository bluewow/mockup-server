package de.bertilmuth.javadataclass.generate;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

import de.bertilmuth.javadataclass.model.ClassSpecification;
import de.bertilmuth.javadataclass.model.FieldSpecification;
import de.bertilmuth.javadataclass.model.FuncSpecification;

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
	}
	
	//customDataClassGenerator
	@Test
	public void testCustomClassSpec() throws Exception { 
		//given
		FieldSpecification field = new FieldSpecification("test", "String");
		FuncSpecification func = new FuncSpecification();
		ClassSpecification classSpec = new ClassSpecification("Test", Arrays.asList(field), func);
		
		File file = new File(".");
		JavaDataClassGenerator generator = new JavaDataClassGenerator();

		//when
		generator.generateJavaSourceFiles(Arrays.asList(classSpec), file);
	}
	
	
}

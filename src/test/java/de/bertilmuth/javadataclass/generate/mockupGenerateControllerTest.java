package de.bertilmuth.javadataclass.generate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.google.gson.JsonObject;

import de.bertilmuth.javadataclass.model.ClassSpecification;
import de.bertilmuth.javadataclass.model.FieldSpecification;
import de.bertilmuth.javadataclass.model.FuncSpecification;
import de.bertilmuth.javadataclass.util.JsonBuilder;

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
	//@Test
	public void testCustomClassSpec() throws Exception { 
		//given
		FieldSpecification field = new FieldSpecification("test", "String");
		FuncSpecification func = new FuncSpecification();
		ClassSpecification classSpec = new ClassSpecification("Test", Arrays.asList(field), Arrays.asList(func));
		
		File file = new File(".");
		JavaDataClassGenerator generator = new JavaDataClassGenerator();

		//when
		generator.generateJavaSourceFiles(Arrays.asList(classSpec), file);
	}
	
//	@Test
	public void testArrayCustomClassSpec() throws Exception { 
		//given
		FieldSpecification field = new FieldSpecification("test", "String");
		List<FuncSpecification> list = new ArrayList<>();
		FuncSpecification func = new FuncSpecification();
		list.add(func);
		list.add(func);
		ClassSpecification classSpec = new ClassSpecification("Test", Arrays.asList(field), list);
		
		File file = new File(".");
		JavaDataClassGenerator generator = new JavaDataClassGenerator();

		//when
		generator.generateJavaSourceFiles(Arrays.asList(classSpec), file);
	}
	
//	@Test
	public void testJsonBuilder() throws JSONException {
		String json = new JsonBuilder()
				.add("key", "value")
				.toJson();

		JSONAssert.assertEquals("{\"key\":\"value\"}", json, false);
		System.out.println(json);
	}
	
//	@Test
	public void testJsonValue() {
		System.out.println(
				new JsonBuilder()
					.add("key", "value")
					.toJson()
		);		
	}
	
	@Test
	public void testReturnCustomClassSpec() throws Exception { 
		//given
		FieldSpecification field = new FieldSpecification("test", "String");
		List<FuncSpecification> list = new ArrayList<>();
		FuncSpecification func = new FuncSpecification();
		list.add(func);
		list.add(func);
		ClassSpecification classSpec = new ClassSpecification("Test", Arrays.asList(field), list);
		
		File file = new File(".");
		JavaDataClassGenerator generator = new JavaDataClassGenerator();

		//when
		generator.generateJavaSourceFiles(Arrays.asList(classSpec), file);
	}
	
	
}

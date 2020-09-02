package de.bertilmuth.javadataclass.util;

import com.google.gson.JsonObject;

public class JsonBuilder {
	public final JsonObject json = new JsonObject();

	public String toJson() {
		return json.toString();
	}

	public JsonBuilder add(String key, String value) {
		json.addProperty(key, value);
		return this;
	}

	public JsonBuilder add(String key, JsonBuilder value) {
		json.add(key, value.json);
		return this;
	}
}

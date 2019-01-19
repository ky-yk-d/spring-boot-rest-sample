package com.example.demo.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class UserResource {

	@JsonProperty("user_id") // @JsonPropertyでJSONにマップしたときのプロパティ名を指定できる
	public abstract String user_id();

	@JsonProperty("full_name")
	public abstract String full_name();

	@JsonProperty("birth_date")
	public abstract String birth_date();

	@JsonCreator // ディシリアライズするときに使用されるメソッドを指定している
	public static UserResource create(
			@JsonProperty("user_id")String user_id,
			@JsonProperty("full_name")String full_name,
			@JsonProperty("birth_date")String birth_date) {
		return new AutoValue_UserResource(user_id, full_name, birth_date);
	};
	

}

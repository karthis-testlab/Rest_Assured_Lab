package com.linkedin.rest.assured.article.two;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ValidateGetCallResponse {
	
	@Test
	public void printWelcomeMessage() {
		given()
		.when()
		    .get("https://simple-books-api.glitch.me")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .body("message", equalTo("Welcome to the Simple Books API."));
	}

}
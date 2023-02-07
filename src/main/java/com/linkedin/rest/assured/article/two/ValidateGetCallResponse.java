package com.linkedin.rest.assured.article.two;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ValidateGetCallResponse {
	
	@Test
	public void printWelcomeMessage() {
		given()
		.when()
		    .get("https://simple-books-api.glitch.me")
		.then()
		    .log()
		    .body();
	}

}
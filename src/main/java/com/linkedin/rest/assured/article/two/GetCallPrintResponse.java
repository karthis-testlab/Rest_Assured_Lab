package com.linkedin.rest.assured.article.two;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallPrintResponse {
	
	@Test
	public void validateWelcomeMessage() {
		given()
		.when()
		    .get("https://simple-books-api.glitch.me")
		.then()
		    .assertThat()
		    .statusCode(200)
		    .body("message", equalTo("Welcome to the Simple Books API."));
	}

}
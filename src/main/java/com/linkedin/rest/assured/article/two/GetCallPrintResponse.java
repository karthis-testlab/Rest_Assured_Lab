package com.linkedin.rest.assured.article.two;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class GetCallPrintResponse {
	
	@Test
	public void validateWelcomeMessage() {	
		String endpoint = "https://simple-books-api.glitch.me";
		given()
		.when()
		    .get(endpoint)		    
		.then()
		    .log()
		    .body();
	}

}
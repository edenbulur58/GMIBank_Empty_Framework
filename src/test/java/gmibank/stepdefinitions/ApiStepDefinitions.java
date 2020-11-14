package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import javax.security.auth.login.Configuration;

import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {
    @Given("kullanici kendisine verilen token ile apiye baglanir")
    public void kullanici_kendisine_verilen_token_ile_apiye_baglanir() {

        Response response=given().headers(
                "Authorization",
                "Bearer"+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_url"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        System.out.println(response.prettyPrint() );

    }

}

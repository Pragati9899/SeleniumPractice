package testUtils;

import com.google.gson.Gson;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class TokenManager {
      public static String fetchAuthToken() {
        Response response = given()
                .contentType("application/json")
                .headers("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoicHJhZ2F0aTI2MDYiLCJleHAiOjE3MjkxNTY4NjIsImlzcyI6Imh0dHBzOi8vYXBpLnRoZWRhcGl0LmNvbSIsImF1ZCI6Imh0dHBzOi8vYXBpLnRoZWRhcGl0LmNvbSJ9.llNuP7vTOSvWTUvbwQIYPAd9feUW5qXJnKduT1nNYew")
                .body("{\"user_name\": \"pragati2606\", \"password\": \"Abcd@1234\", \"usertype\": \"agent\"}")
                .post("https://api.thedapit.com/Auth/login");

        String token = response.jsonPath().getString("data.token");
        System.out.println(token);
        return token;
    }


    public static String fetchUser() {
        Response response = given()
                .contentType("application/json")
                .headers("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoicHJhZ2F0aTI2MDYiLCJleHAiOjE3MjkxNTY4NjIsImlzcyI6Imh0dHBzOi8vYXBpLnRoZWRhcGl0LmNvbSIsImF1ZCI6Imh0dHBzOi8vYXBpLnRoZWRhcGl0LmNvbSJ9.llNuP7vTOSvWTUvbwQIYPAd9feUW5qXJnKduT1nNYew")
                .body("{\"user_name\": \"pragati2606\", \"password\": \"Abcd@1234\", \"usertype\": \"agent\"}")
                .post("https://api.thedapit.com/Auth/login");

        Object jsonObject = response.body().jsonPath().getJsonObject("data");
        Gson gson = new Gson();
        String json = gson.toJson(jsonObject);
        System.out.println(json);
        return json;
    }


}



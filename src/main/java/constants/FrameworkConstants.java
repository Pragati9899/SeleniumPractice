package constants;

public final class FrameworkConstants {
    private FrameworkConstants() {
    }

    private static final String PROJECT_PATH = System.getProperty("user.dir");

    private static final String READCONFIG_PATH = PROJECT_PATH + "\\src\\test\\resources\\config\\config.properties";

    public static String getConfigFilePath() {
        return READCONFIG_PATH;
    }


    public static String getCookie() {
        String s = "%22%7B%5C%22user_id%5C%22%3A669%2C%5C%22user_name%5C%22%3A%5C%22pragati2606%5C%22%2C%5C%22real_name%5C%22%3A%5C%22pragati%20tiwari%5C%22%2C%5C%22email%5C%22%3A%5C%22pragati%40techcompiler.com%5C%22%2C%5C%22password%5C%22%3Anull%2C%5C%22status%5C%22%3A3%2C%5C%22executive%5C%22%3A%5C%22%5C%22%2C%5C%22department%5C%22%3A%5C%22%5C%22%2C%5C%22inactive%5C%22%3A%5C%22%5C%22%2C%5C%22customers%5C%22%3A0%2C%5C%22see_agent_residual%5C%22%3A%5C%221%5C%22%2C%5C%22logged_in%5C%22%3A0%2C%5C%22last_url%5C%22%3A%5C%22https%3A%2F%2Frr.thedapit.com%2Fdashboard%5C%22%2C%5C%22customerid%5C%22%3A%5C%22%5C%22%2C%5C%22agent_id%5C%22%3A%5C%2268%5C%22%2C%5C%22office%5C%22%3A0%2C%5C%22agent_login_id%5C%22%3A507%2C%5C%22company%5C%22%3A0%2C%5C%22return_url%5C%22%3A%5C%22H%5C%22%2C%5C%22ip_restriction%5C%22%3A%5C%22N%5C%22%2C%5C%22system_search%5C%22%3A%5C%22Right%5C%22%2C%5C%22msg%5C%22%3A%5C%22Success%5C%22%2C%5C%22lastlogin%5C%22%3A%5C%2209%2F17%2F2024%2005%3A42%3A11%5C%22%2C%5C%22shortapp%5C%22%3A%5C%22N%5C%22%2C%5C%22token%5C%22%3A%5C%22eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoicHJhZ2F0aTI2MDYiLCJleHAiOjE3MjkxNDM3MzEsImlzcyI6Imh0dHBzOi8vYXBpLnRoZWRhcGl0LmNvbSIsImF1ZCI6Imh0dHBzOi8vYXBpLnRoZWRhcGl0LmNvbSJ9.SEwQRHamL_ZrLqITFnJOqODTecwzhxowIsbL7g_jrpo%5C%22%2C%5C%22refresh_token%5C%22%3A%5C%22%5C%22%2C%5C%22refresh_token_expire_time%5C%22%3Anull%2C%5C%22isSSO%5C%22%3Afalse%7D%22";
        return s;
    }
}


package constants;

public final class FrameworkConstants {

    private static final String PROJECT_PATH = System.getProperty("user.dir");

    private static final String READCONFIG_PATH = PROJECT_PATH + "\\src\\test\\resources\\config\\config.properties";

    public static String getConfigFilePath() {
        return READCONFIG_PATH;
    }
}

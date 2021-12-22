//package JavaTestAutomation;
//
//// import needed dependencies and libraries such as from Selenium WebDriver:
//// JUnit testing tool
//public class BaseTests {
//    private static WebDriver webDriver;
//    protected static Page homePage; // assuming Page class exists that is a generice page holding all elements of
//    // webpage as private and protected fields with POM (Page Object Model) design pattern
//
//    @BeforeClass
//    public static void launchApplication() {
//        setChromeDriverProperty();
//        webDriver = new ChromeDriver();
//        webDriver.get(Links.HOME); // HOME is a static constant(final) variable belonging to Links class
//        homePage = new Page(webDriver);
//    }
//
//    @AfterClass
//    public static void closeBrowser() {
//        webDriver.quit();
//    }
//
//    // getter
//    public static WebDriver getWebDriver() {
//        return webDriver;
//    }
//
//    private static void setChromeDriverProperty() {
//        if (System.getProperty("os.name").contains("Windows")) {
//            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        } else {
//            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//        }
//    }
//
//}

package xohairtoo.platform.web.page;

public abstract class AbstractPage {

    // all common wait, window handle etc. methods, and also init method to initialize page factory

    // All Page object classes will access createPage method to initialise themselves.
//        protected WebDriver driver;
//
//        /**
//         * Generic method to initialise any Page Object.
//         * @param pageClass The class of the page you want to create (e.g., LoginPage.class)
//         * @param <T> The Type of the page class
//         * @return An instance of the page class
//         */
//        public <T extends AbstractPage> T createPage(Class<T> pageClass) {
//            try {
//                // 1. Get the constructor that accepts a WebDriver
//                // 2. Create a new instance and pass our driver
//                return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
//
//            } catch (Exception e) {
//                // We wrap reflection exceptions into our custom AutomationException
//                throw new RuntimeException("CRITICAL: Could not instantiate Page Object: "
//                        + pageClass.getName(), e);
//            }
//        }

}

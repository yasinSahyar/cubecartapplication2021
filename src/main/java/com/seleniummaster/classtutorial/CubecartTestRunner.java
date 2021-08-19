package com.seleniummaster.classtutorial;

public class CubecartTestRunner {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            LoginUser loginUser = new LoginUser("testautomation", "automation123!");
            FunctionLibrary functionLibrary = new FunctionLibrary();
            functionLibrary.openBrowser("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
            functionLibrary.login(loginUser);
            String timestamp = String.valueOf(System.currentTimeMillis());
            Product testProduct = new Product(true, "Java Automation" + timestamp,
                    "New", "JavaAutomation" + timestamp);
            functionLibrary.addProduct(testProduct);
            functionLibrary.logout();
            functionLibrary.closeBrowser();
        }
    }
}

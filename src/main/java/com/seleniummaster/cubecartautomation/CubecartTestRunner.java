package com.seleniummaster.cubecartautomation;

import com.seleniummaster.classtutorial.LoginUser;

public class CubecartTestRunner extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        LoginUser user=new LoginUser("testautomation","automation123!");
        LoginPage loginPage=new LoginPage();
        loginPage.login(user);
        DashBoardPage dashBoardPage=new DashBoardPage();
        dashBoardPage.clickOnCategoriesLink();
        CategoriesPage categoriesPage=new CategoriesPage();
        categoriesPage.clickOnAddCategoryButton();
        categoriesPage.fillCategoryDetails();
        //verify category added successfully or not
        dashBoardPage.clickOnNewslettersLink();
        NewsletterPage newsletterPage=new NewsletterPage();
        newsletterPage.clickOnCreateNewsletterButton();
        newsletterPage.fillNewsletterInfo();
        dashBoardPage.logout();
        closeBrowser();
    }
}

package com.seleniummaster.excel;

import com.seleniummaster.cubecartautomation.CategoriesPage;
import com.seleniummaster.cubecartautomation.DashBoardPage;
import com.seleniummaster.cubecartautomation.LoginPage;
import com.seleniummaster.cubecartautomation.TestBase;

public class CubeCartTest extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        LoginPage loginPage=new LoginPage();
        String username=ExcelUtility.readFromExcell("test-data/testdata.xlsx",
                "logi-info",1,0);
        String password=ExcelUtility.readFromExcell("test-data/testdata.xlsx",
                "logi-info",1,1);
        loginPage.login(username,password);
        DashBoardPage dashBoardPage=new DashBoardPage();
        dashBoardPage.clickOnCategoriesLink();
        CategoriesPage categoriesPage=new CategoriesPage();
        categoriesPage.clickOnAddCategoryButton();
        String categoryName=ExcelUtility.readFromExcell("test-data/testdata.xlsx",
                "Category-Info",1,0);
        categoriesPage.fillCategoryDetails(categoryName);
    }
}

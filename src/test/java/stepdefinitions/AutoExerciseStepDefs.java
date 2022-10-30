package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class AutoExerciseStepDefs {
    AutoExercisePage autoexPage = new AutoExercisePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    SoftAssert softAssert = new SoftAssert();


    @Given("Navigate to {string} autoexercise")
    public void navigateToAutoexercise(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assert actualUrl.equals(expectedUrl);
    }

    @And("Click on Signup_Login button")
    public void clickOnSignup_LoginButton() {
        autoexPage.signup_login.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        assert autoexPage.newUserSignUpText.isDisplayed();

    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        autoexPage.nameBox.sendKeys(faker.name().name());
        actions.sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();

    }

    @And("Click Signup button")
    public void clickSignupButton() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        assert autoexPage.enterAccountInformationText.isDisplayed();
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        autoexPage.maleRadioButton.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
                sendKeys("22").sendKeys(Keys.TAB).
                sendKeys("April").sendKeys(Keys.TAB).
                sendKeys("1988").sendKeys(Keys.TAB).perform();

    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        actions.sendKeys(Keys.SPACE).sendKeys(Keys.TAB).perform();
    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        actions.sendKeys(Keys.SPACE).sendKeys(Keys.TAB).perform();
    }

    @And("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
        actions.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.company().name()).sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("India").
                sendKeys(Keys.TAB).sendKeys(faker.address().state()).
                sendKeys(Keys.TAB).sendKeys(faker.address().city()).
                sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).perform();
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        assert autoexPage.creatAccountText.isDisplayed();
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        autoexPage.continueButton.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        assert autoexPage.loggedInAsText.isDisplayed();
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        autoexPage.deleteButton.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        assert autoexPage.deleteAccountText.isDisplayed();
    }

    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        assert autoexPage.loginYourAccountText.isDisplayed();
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        autoexPage.loginEmailBox.sendKeys(ConfigReader.getProperty("validEmail"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("validPassword")).perform();
    }

    @And("Click login button")
    public void clickLoginButton() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        autoexPage.loginEmailBox.sendKeys(ConfigReader.getProperty("validEmail"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("validPassword")).perform();
    }

    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        assert autoexPage.yourEmailOrPasswordIsIncorrectText.isDisplayed();
    }

    @And("Click Logout button")
    public void clickLogoutButton() {
        autoexPage.logOutButton.click();

    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        assert autoexPage.loginYourAccountText.isDisplayed();
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        autoexPage.nameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("validEmail")).perform();
    }

    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        assert autoexPage.emailAddressAlreadyExistBox.isDisplayed();
    }

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        autoexPage.contactUsButton.click();
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        assert autoexPage.getInTouchText.isDisplayed();
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        autoexPage.contactUsNameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).
                sendKeys(faker.artist().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.lorem().characters(5, 20)).perform();
    }

    @And("Upload file")
    public void uploadFile() {

        String homeDirectory = System.getProperty("user.home");
        String filePath = homeDirectory + "/Desktop\\\\text.txt";
        autoexPage.dosyaSecbutton.sendKeys(filePath);
    }

    @And("Click OK button")
    public void clickOKButton() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Verify success message Success Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        assert autoexPage.successMessageSuccessYourDetailsHaveBeenSubmittedSuccessfully.isDisplayed();
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        autoexPage.homeButton.click();
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assert actualUrl.equals(expectedUrl);
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
        autoexPage.submitButon.click();
    }

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        autoexPage.testCasesButton.click();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        assert autoexPage.testCasePageText.isDisplayed();
    }

    @And("Click on Products button")
    public void clickOnProductsButton() {
        autoexPage.productsButton.click();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        assert autoexPage.allProductsText.isDisplayed();
    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {
        assert !autoexPage.urunlerList.isEmpty();
    }

    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        List<WebElement> wievProductsList = autoexPage.viewProductsList;
        ReusableMethods.jsScrollClick(wievProductsList.get(0));
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        softAssert.assertTrue(autoexPage.productName.isDisplayed());
        softAssert.assertTrue(autoexPage.categoryName.isDisplayed());
        softAssert.assertTrue(autoexPage.productPrice.isDisplayed());
        softAssert.assertTrue(autoexPage.productAvailability.isDisplayed());
        softAssert.assertTrue(autoexPage.productCondition.isDisplayed());
        softAssert.assertTrue(autoexPage.productBrand.isDisplayed());
        softAssert.assertAll();

    }

    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        autoexPage.searchProductsBox.sendKeys("T-Shirt");
        autoexPage.searchButton.click();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(autoexPage.searchProductsText.isDisplayed());
        ;
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        List<WebElement> searchTshirtList = autoexPage.searchTShirtList;
        for (int i = 0; i < searchTshirtList.size(); i++) {
            searchTshirtList.get(i).getText().contains("T-Shirt");
            i++;
        }
    }

    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        ReusableMethods.jsScroll(autoexPage.subscriptionText);
    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        assert autoexPage.subscriptionText.isDisplayed();
    }

    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        autoexPage.susbscribeEmailBox.sendKeys(ConfigReader.getProperty("validEmail"), Keys.ENTER);
    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        System.out.println(autoexPage.youHaveBeenSuccessfullySubscribed.getText());
        assert autoexPage.youHaveBeenSuccessfullySubscribed.isDisplayed();
    }

    @And("Click Cart button")
    public void clickCartButton() {
        autoexPage.cartButton.click();
    }

    @And("Click Products button")
    public void clickProductsButton() {
        autoexPage.productsButton.click();
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        ReusableMethods.jsScrollClick(autoexPage.productsAddCartList.get(1));
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        autoexPage.continueShoppingButton.click();
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        ReusableMethods.jsScrollClick(autoexPage.productsAddCartList.get(3));
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        autoexPage.viewCartButton.click();
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        assert autoexPage.cartShoppingList.size()==2;
    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {

        int firstExpectedPrice= Integer.parseInt(autoexPage.productsPriceList.get(0).getText().replaceAll("\\D",""));
        System.out.println("firstExpectedPrice = " + firstExpectedPrice);
        int secondtExpectedPrice= Integer.parseInt(autoexPage.productsPriceList.get(2).getText().replaceAll("\\D",""));
        System.out.println("secondtExpectedPrice = " + secondtExpectedPrice);
        int expectedTotalPrice=firstExpectedPrice+secondtExpectedPrice;
        System.out.println("expectedTotalPrice = " + expectedTotalPrice);
        int firstActualPrice= Integer.parseInt(autoexPage.cartPriceList.get(0).getText().replaceAll("\\D",""));
        System.out.println("firstActualPrice = " + firstActualPrice);
        int secondActualPrice= Integer.parseInt(autoexPage.cartPriceList.get(1).getText().replaceAll("\\D",""));
        System.out.println("secondActualPrice = " + secondActualPrice);
        int actualTotalPrice=firstActualPrice+secondActualPrice;
        System.out.println("actualTotalPrice = " + actualTotalPrice);
        String acrtualFirstProductQuantity=autoexPage.productQuantityList.get(0).getText();
        System.out.println("acrtualFirstProductQuantity = " + acrtualFirstProductQuantity);
        String acrtualSecondProductQuantity=autoexPage.productQuantityList.get(1).getText();
        System.out.println("acrtualSecondProductQuantity = " + acrtualSecondProductQuantity);

        softAssert.assertEquals(firstActualPrice,firstExpectedPrice);
        softAssert.assertEquals(secondActualPrice,secondtExpectedPrice);
        softAssert.assertEquals(actualTotalPrice,expectedTotalPrice);
        softAssert.assertEquals(acrtualFirstProductQuantity,"1");
        softAssert.assertEquals(acrtualSecondProductQuantity,"1");
        softAssert.assertAll();


    }
}

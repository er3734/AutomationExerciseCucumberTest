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

import java.util.List;
import java.util.Random;

public class AutoExerciseStepDefs {
    AutoExercisePage autoexPage = new AutoExercisePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    SoftAssert softAssert = new SoftAssert();
    Random rnd = new Random();
    String expectedItemsPtoductName;

    int brandIndex;


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
        ReusableMethods.waitFor(2);
        autoexPage.deleteContinueButton.click();
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
        autoexPage.loginEmailBox.sendKeys(ConfigReader.getProperty("wrongEmail"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("wrongPassword")).perform();
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
        int index = rnd.nextInt(wievProductsList.size() - 1);
        ReusableMethods.jsScrollClick(wievProductsList.get(index));
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

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(autoexPage.searchProductsText.isDisplayed());
        ;
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        List<WebElement> searchTshirtList = autoexPage.searchPtoductList;
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
        ReusableMethods.jsScrollClick(autoexPage.viewCartButton);
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        assert autoexPage.cartShoppingList.size() == 2;
    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {

        int firstExpectedPrice = Integer.parseInt(autoexPage.productsPriceList.get(0).getText().replaceAll("\\D", ""));
        System.out.println("firstExpectedPrice = " + firstExpectedPrice);
        int secondtExpectedPrice = Integer.parseInt(autoexPage.productsPriceList.get(2).getText().replaceAll("\\D", ""));
        System.out.println("secondtExpectedPrice = " + secondtExpectedPrice);
        int expectedTotalPrice = firstExpectedPrice + secondtExpectedPrice;
        System.out.println("expectedTotalPrice = " + expectedTotalPrice);
        int firstActualPrice = Integer.parseInt(autoexPage.cartPriceList.get(0).getText().replaceAll("\\D", ""));
        System.out.println("firstActualPrice = " + firstActualPrice);
        int secondActualPrice = Integer.parseInt(autoexPage.cartPriceList.get(1).getText().replaceAll("\\D", ""));
        System.out.println("secondActualPrice = " + secondActualPrice);
        int actualTotalPrice = firstActualPrice + secondActualPrice;
        System.out.println("actualTotalPrice = " + actualTotalPrice);
        String acrtualFirstProductQuantity = autoexPage.productQuantityList.get(0).getText();
        System.out.println("acrtualFirstProductQuantity = " + acrtualFirstProductQuantity);
        String acrtualSecondProductQuantity = autoexPage.productQuantityList.get(1).getText();
        System.out.println("acrtualSecondProductQuantity = " + acrtualSecondProductQuantity);

        softAssert.assertEquals(firstActualPrice, firstExpectedPrice);
        softAssert.assertEquals(secondActualPrice, secondtExpectedPrice);
        softAssert.assertEquals(actualTotalPrice, expectedTotalPrice);
        softAssert.assertEquals(acrtualFirstProductQuantity, "1");
        softAssert.assertEquals(acrtualSecondProductQuantity, "1");
        softAssert.assertAll();
    }

    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        List<WebElement> wievProductsList = autoexPage.viewProductsList;
        ReusableMethods.jsScrollClick(wievProductsList.get(0));
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        assert autoexPage.productDetail.isDisplayed();
    }

    @And("Increase quantity to {int}")
    public void increaseQuantityTo(int index) {
        autoexPage.productQuantityBox.clear();
        autoexPage.productQuantityBox.sendKeys(index + "");
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        autoexPage.addToCartButton.click();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        String expectedQuantity = "4";
        String actualQuantity = autoexPage.productQuantityList.get(0).getText();
        assert actualQuantity.equals(expectedQuantity);
    }

    @And("Add products to cart")
    public void addProductsToCart() {
        ReusableMethods.jsScrollClick(autoexPage.productsAddCartList.get(1));
    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        assert autoexPage.shoppingCartText.isDisplayed();
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        autoexPage.proceedToCheckoutButton.click();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        autoexPage.nameBox.sendKeys(faker.name().name());
        actions.sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.ENTER).perform();
        autoexPage.maleRadioButton.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
                sendKeys("22").sendKeys(Keys.TAB).
                sendKeys("April").sendKeys(Keys.TAB).
                sendKeys("1988").sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.company().name()).sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("India").
                sendKeys(Keys.TAB).sendKeys(faker.address().state()).
                sendKeys(Keys.TAB).sendKeys(faker.address().city()).
                sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        String[] actualAdressArr = autoexPage.deliveryAddressText.getText().split(" ");
        String[] expectedAdressArr = autoexPage.billingAddressText.getText().split(" ");
        for (int i = 2; i < actualAdressArr.length; i++) {
            System.out.println("expectedAdressArr = " + expectedAdressArr[i]);
            softAssert.assertEquals(actualAdressArr[i], expectedAdressArr[i]);
        }
        softAssert.assertAll();
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        autoexPage.commentTextArea.sendKeys(faker.lorem().paragraph(20));
        autoexPage.placeOrderButton.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        autoexPage.paymentNameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).
                sendKeys("1234-4567-1789-1221").
                sendKeys(Keys.TAB).
                sendKeys("213").
                sendKeys(Keys.TAB).
                sendKeys("12").
                sendKeys(Keys.TAB).
                sendKeys("2024").
                perform();
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        autoexPage.payAndConfirmButton.click();
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        assert autoexPage.payPlacedSuccessfullyText.isDisplayed();
    }

    @And("Click on Register_Login button")
    public void clickOnRegister_LoginButton() {
        autoexPage.registerLoginButton.click();
    }

    @And("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        autoexPage.cartQuantityDelete.click();

    }

    @And("Verify that product is removed from the cart.")
    public void verifyThatProductIsRemovedFromTheCart() {
        ReusableMethods.waitFor(3);
        autoexPage.cartShoppingList.forEach(t -> System.out.println(t.getText()));
        assert autoexPage.cartShoppingList.isEmpty();
        assert autoexPage.cartIsEmpty.isDisplayed();
    }

    @And("Click on Women category")
    public void clickOnWomenCategory() {
        ReusableMethods.jsScrollClick(autoexPage.categoryList.get(0));
    }

    @And("Click on any category link under Women category")
    public void clickOnAnyCategoryLinkUnderWomenCategory() {
        int index = rnd.nextInt(autoexPage.womenCategoryList.size() - 1);
        ReusableMethods.jsScrollClick(autoexPage.womenCategoryList.get(index));
    }

    @Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        assert autoexPage.productsCategoryText.getText().contains("WOMEN");
    }

    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        autoexPage.categoryList.get(1).click();
        int index = rnd.nextInt(autoexPage.menCategoryList.size() - 1);
        autoexPage.menCategoryList.get(index).click();
    }

    @And("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        assert autoexPage.productsCategoryText.getText().contains("MEN");
    }

    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        autoexPage.brandsList.forEach(t -> System.out.println(t.getText()));
        assert !autoexPage.brandsList.isEmpty();
    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        brandIndex = rnd.nextInt(autoexPage.brandsList.size() - 1);
        ReusableMethods.jsScrollClick(autoexPage.brandsList.get(brandIndex));
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        String expectedProducts = autoexPage.brandsList.get(brandIndex).getText().
                replaceAll("\\(", "").
                replaceAll("\\)", "").replaceAll("\\d", "").
                replaceFirst("\\s", "");
        String actualProducts = autoexPage.productsCategoryText.getText();
        System.out.println("actualProducts = " + actualProducts);
        System.out.println("expectedProducts = " + expectedProducts);
        assert actualProducts.contains(expectedProducts);
        assert !autoexPage.urunlerList.isEmpty();
    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        brandIndex = rnd.nextInt(autoexPage.brandsList.size() - 1);
        ReusableMethods.jsScrollClick(autoexPage.brandsList.get(brandIndex));
    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        String expectedProducts = autoexPage.brandsList.get(brandIndex).getText().
                replaceAll("\\(", "").
                replaceAll("\\)", "").replaceAll("\\d", "").
                replaceFirst("\\s", "");
        String actualProducts = autoexPage.productsCategoryText.getText();
        System.out.println("actualProducts = " + actualProducts);
        System.out.println("expectedProducts = " + expectedProducts);
        assert actualProducts.contains(expectedProducts);
        assert !autoexPage.urunlerList.isEmpty();
    }

    @And("Add those products to cart")
    public void addThoseProductsToCart() {
        for (int i = 0; i < autoexPage.productsAddCartList.size(); i++) {
            ReusableMethods.jsScrollClick(autoexPage.productsAddCartList.get(i));
            ReusableMethods.waitFor(1);
            autoexPage.continueShoppingButton.click();
            i++;
        }
    }

    @And("Submit login details")
    public void submitLoginDetails() {
        autoexPage.loginEmailBox.sendKeys(ConfigReader.getProperty("validEmail"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("validPassword")).
                sendKeys(Keys.ENTER).perform();
    }

    @And("Again, go to Cart page")
    public void againGoToCartPage() {
        autoexPage.cartButton.click();
    }

    @And("Enter product {string} in search input and click search button")
    public void enterProductInSearchInputAndClickSearchButton(String input) {
        autoexPage.searchProductsBox.sendKeys(input);
        autoexPage.searchButton.click();
    }

    @Then("Verify all the products related to {string} are visible")
    public void verifyAllTheProductsRelatedToAreVisible(String input) {
        List<WebElement> searchTshirtList = autoexPage.searchPtoductList;
        for (int i = 0; i < searchTshirtList.size(); i++) {
            searchTshirtList.get(i).getText().contains(input);
            i++;
        }
    }

    @Then("Verify {string} that products are visible in cart")
    public void verifyThatProductsAreVisibleInCart(String input) {
        for (WebElement w : autoexPage.cartProductNameList
        ) {
            assert w.getText().contains(input);
        }
    }

    @And("Verify that {string} products are visible in cart after login as well")
    public void verifyThatProductsAreVisibleInCartAfterLoginAsWell(String input) {
        for (WebElement w : autoexPage.cartProductNameList
        ) {
            assert w.getText().contains(input);
        }
    }

    @And("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        ReusableMethods.jsScroll(autoexPage.wireteYourReviewText);
        assert autoexPage.wireteYourReviewText.isDisplayed();
    }

    @And("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        assert autoexPage.successMessageThankYouforYourReview.isDisplayed();
    }

    @And("Enter name, email and review an click Submit button")
    public void enterNameEmailAndReviewAnClickSubmitButton() {
        autoexPage.reviewNameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).
                sendKeys(faker.lorem().paragraph()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    }

    @And("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        ReusableMethods.jsScroll(autoexPage.recommendedItemsText);
    }

    @And("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        assert autoexPage.recommendedItemsText.isDisplayed();
    }

    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        int index = rnd.nextInt(autoexPage.recommendItemsAddToCartList.size() - 1);
        autoexPage.recommendItemsAddToCartList.get(index).click();

    }

    @And("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        assert !autoexPage.cartShoppingList.isEmpty();
    }
}

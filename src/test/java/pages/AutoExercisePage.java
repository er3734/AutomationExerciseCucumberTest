package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoExercisePage {
    public AutoExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signup_login;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement newUserSignUpText;
    @FindBy(xpath = "//*[@data-qa=\"signup-name\"]")
    public WebElement nameBox;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement enterAccountInformationText;
    @FindBy(css = "#uniform-id_gender1")
    public WebElement maleRadioButton;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement creatAccountText;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAsText;
    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteButton;
    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement deleteAccountText;
    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginYourAccountText;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement loginEmailBox;
    @FindBy(xpath = "//*[.='Your email or password is incorrect!']")
    public WebElement yourEmailOrPasswordIsIncorrectText;
    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logOutButton;
    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement emailAddressAlreadyExistBox;
    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouchText;
    @FindBy(xpath = "//*[@name=\"name\"]")
    public WebElement contactUsNameBox;
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement dosyaSecbutton;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButon;
    @FindBy(xpath = "//*[@class='status alert alert-success']")
    public WebElement successMessageSuccessYourDetailsHaveBeenSubmittedSuccessfully;
    @FindBy(xpath = "//*[@class='btn btn-success']")
    public WebElement homeButton;
    @FindBy(xpath = "//*[text()=' Test Cases']")
    public WebElement testCasesButton;
    @FindBy(xpath = "//*[text()='Test Cases']")
    public WebElement testCasePageText;
    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsButton;
    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductsText;
    @FindBy(xpath = "//*[@class='col-sm-4']")
    public List<WebElement> urunlerList;
    @FindBy(xpath = "//*[text()='View Product']")
    public List<WebElement> viewProductsList;
    @FindBy(xpath = "//*[text()='Blue Top']")
    public WebElement productName;
    @FindBy(xpath = "//*[text()='Category: Women > Tops']")
    public WebElement categoryName;
    @FindBy(xpath = "//*[text()='Rs. 500']")
    public WebElement productPrice;
    @FindBy(xpath = "//*[text()='Availability:']")
    public WebElement productAvailability;
    @FindBy(xpath = "//*[text()='Condition:']")
    public WebElement productCondition;
    @FindBy(xpath = "//*[text()='Brand:']")
    public WebElement productBrand;
    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchProductsBox;
    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchProductsText;
    @FindBy(xpath = "//*[contains(text(), 'T-Shirt')]")
    public List<WebElement> searchPtoductList;
    @FindBy(xpath = "//*[@class='btn btn-default btn-lg']")
    public WebElement searchButton;
    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscriptionText;
    @FindBy(xpath = "//*[@id='susbscribe_email']")
    public WebElement susbscribeEmailBox;
    @FindBy(xpath = "//*[@id='success-subscribe']")
    public WebElement youHaveBeenSuccessfullySubscribed;
    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//*[@class='btn btn-default add-to-cart']")
    public List<WebElement> productsAddCartList;
    @FindBy(xpath = "//*[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;
    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;
    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> cartShoppingList;
    @FindBy(xpath = "//tbody//tr//td[@class='cart_total']")
    public List<WebElement> cartPriceList;
    @FindBy(xpath = "//*[contains(text(), 'Rs.')]")
    public List<WebElement> productsPriceList;
    @FindBy(xpath = "//tbody//tr//td[@class='cart_quantity']//button")
    public List<WebElement> productQuantityList;
    @FindBy(xpath = "//*[@class='product-information']")
    public WebElement productDetail;
    @FindBy(xpath = "//*[@id='quantity']")
    public WebElement productQuantityBox;
    @FindBy(xpath = "//*[@class='btn btn-default cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//li[@class='active']")
    public WebElement shoppingCartText;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutButton;
    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLoginButton;
    @FindBy(xpath = "//*[@class='address item box']")
    public WebElement deliveryAddressText;
    @FindBy(xpath = "//*[@class='address alternate_item box']")
    public WebElement billingAddressText;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement commentTextArea;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement paymentNameBox;
    @FindBy(xpath = "//*[@class='form-control btn btn-primary submit-button']")
    public WebElement payAndConfirmButton;
    @FindBy(xpath = "//*[contains(text(), 'Your order has been placed successfully!')]")
    public WebElement payPlacedSuccessfullyText;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement deleteContinueButton;
    @FindBy(xpath = "//*[@class='cart_quantity_delete']")
    public WebElement cartQuantityDelete;
    @FindBy(xpath = "(//*[@class='text-center'])[3]")
    public WebElement cartIsEmpty;
    @FindBy(xpath = "//*[@class='badge pull-right']")
    public List<WebElement> categoryList;
    @FindBy(xpath = "(//div[@class='panel-body'])[1]//ul//li//a")
    public List<WebElement> womenCategoryList;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement productsCategoryText;
    @FindBy(xpath = "(//*[@class='panel-body'])[2]//li//a")
    public List<WebElement> menCategoryList;
    @FindBy(xpath = "//*[@class='brands-name']//li//a")
    public List<WebElement> brandsList;
    @FindBy(xpath = "//tbody//tr//td//h4")
    public List<WebElement> cartProductNameList;
    @FindBy(xpath = "//*[text()='Write Your Review']")
    public WebElement wireteYourReviewText;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement reviewNameBox;
    @FindBy(xpath = "//*[text()='Thank you for your review.']")
    public WebElement successMessageThankYouforYourReview;
    @FindBy(xpath = "(//*[@class='title text-center'])[2]")
    public WebElement recommendedItemsText;
    @FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div//a")
    public List<WebElement> recommendItemsAddToCartList;
    @FindBy(xpath = "(//*[@class='address_firstname address_lastname'])[1]")
    public WebElement deliveryAddressFullName;
    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[1]")
    public WebElement deliveryAddressCompany;
    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[2]")
    public WebElement deliveryAddressAddress;
    @FindBy(xpath = "(//*[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement deliveryAddressCityStateZipcode;
    @FindBy(xpath = "(//*[@class='address_country_name'])[1]")
    public WebElement deliveryAddressCountry;
    @FindBy(xpath = "(//*[@class='address_phone'])[1]")
    public WebElement deliveryAddressPhone;
    @FindBy(xpath = "(//*[@class='address_firstname address_lastname'])[2]")
    public WebElement billingAddressFullName;
    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[4]")
    public WebElement billingAddressCompany;
    @FindBy(xpath = "(//*[@class='address_address1 address_address2'])[5]")
    public WebElement billingAddressAddress;
    @FindBy(xpath = "(//*[@class='address_city address_state_name address_postcode'])[2]")
    public WebElement billingAddressCityStateZipcode;
    @FindBy(xpath = "(//*[@class='address_country_name'])[2]")
    public WebElement billingAddressCountry;
    @FindBy(xpath = "(//*[@class='address_phone'])[2]")
    public WebElement billingAddressPhone;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement dowloandInvoiceButton;
    @FindBy(xpath = "//*[@class='fa fa-angle-up']")
    public WebElement moveToUpButton;
    @FindBy(xpath = "(//*[text()='Full-Fledged practice website for Automation Engineers'])[1]")
    public WebElement fullFledgedPracticeWebsiteForAutomationEngineersText;



}

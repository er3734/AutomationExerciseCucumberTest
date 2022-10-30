package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoExercisePage {
    public AutoExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
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
    public List<WebElement> wievProductsList;
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
    public List<WebElement> searchTShirtList;
    @FindBy(xpath = "//*[@class='btn btn-default btn-lg']")
    public WebElement searchButton;
    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscriptionText;
    @FindBy(xpath = "//*[@id='susbscribe_email']")
    public WebElement susbscribeEmailBox;
    @FindBy(xpath = "//*[@id='success-subscribe']")
    public WebElement youHaveBeenSuccessfullySubscribed;














}

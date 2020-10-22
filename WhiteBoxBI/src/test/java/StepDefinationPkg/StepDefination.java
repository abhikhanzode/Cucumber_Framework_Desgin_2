package StepDefinationPkg;

import java.util.concurrent.TimeUnit;

//import org.junit.runner.RunWith;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageFactoryModel.WhiteBoxBI_Maincode;


public class StepDefination {
	WhiteBoxBI_Maincode btljob;
	public static WebDriver driver;
	@Given("^launch the browser and application$")
	public void launch_the_browser_and_application() throws Throwable {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito","--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://qa.m-net.in/login"); 
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("^Login with valid username: \"([^\"]*)\" and Password: \"([^\"]*)\"$")
	public void login_with_valid_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/input")).sendKeys(strArg1);
		driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[2]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button")).click();
		driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/div/input")).sendKeys(strArg2);
		Thread.sleep(3000);
	}

	@Then("^click on login button and user will be on dashboard$")
	public void click_on_login_button_and_user_will_be_on_dashboard() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button/span/span")).click();
		Thread.sleep(4000);
	}


	@Then("^Go to BTL JOB module$")
	public void go_to_btl_job_module() throws Throwable {
		btljob = new WhiteBoxBI_Maincode(driver);
		btljob.SelectBTL();
	}

	@And("^check app opeing and download supporting documents and Job_bill report$")
	public void check_app_opeing_and_download_supporting_documents_and_jobbill_report() throws Throwable {
		btljob.BTL_Job();
		btljob.DownloadJobBillreport();
	}  

	@Then("^Go to BTL Bill module$")
	public void go_to_btl_bill_module() throws Throwable {
		btljob.BTL_BILL();
	}

	@And("^Check app opening and Download supporting documents$")
	public void check_app_opening_and_download_supporting_documents() throws Throwable {
		btljob.Download_supporting_Bill();
	}

	@Then("^Go to Marketing Purchase Order module$")
	public void go_to_marketing_purchase_order_module() throws Throwable {

		btljob.Select_PurchaseOrser();

	}

	@And("^Check app opening and donwload supporting documents and download PO report$")
	public void check_app_opening_and_donwload_supporting_documents_and_download_po_report() throws Throwable {
		btljob.dowbload_Supporing_documents_andPOreport();
	}

	@Then("^Go to ATL Estimate$")
	public void go_to_atl_estimate() throws Throwable {
		btljob.select_ATL();
	}

	@And("^Check app opening, creatives and download supporting documents$")
	public void check_app_opening_creatives_and_download_supporting_documents() throws Throwable {
		btljob.Download_documents_check_creatives();
	}
	@Then("^Go to ATL FMS$")
	public void go_to_atl_fms() throws Throwable {
		btljob.select_ATL_FMS();
	}
	@And("^Check FMS View, creatives and download supporting documents$")
	public void check_fms_view_creatives_and_download_supporting_documents() throws Throwable {
		btljob.Download_FMS_documents_check_creatives();
	}
	@Then("^Go to Creatives$")
	public void go_to_creatives() throws Throwable {
		btljob.select_Creatives();
	}

	@And("^Check create and add new creative details$")
	public void check_create_and_add_new_creative_details() throws Throwable {
		btljob.Check_creative();
	}
}

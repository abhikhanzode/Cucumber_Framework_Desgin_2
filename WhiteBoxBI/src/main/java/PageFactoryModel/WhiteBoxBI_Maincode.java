package PageFactoryModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class WhiteBoxBI_Maincode {
	public static JavascriptExecutor js;
	public Actions action;
	public WebDriver driver;
	public WhiteBoxBI_Maincode(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//BTL-JOB
	By search = By.xpath("//*[@id=\"m_quicksearch_input\"]");	
	By selectBTL = By.xpath("//*[@id=\"m_quicksearch\"]/m-portlet/div/div[3]/perfect-scrollbar/div/div[1]/div/div/div/div[1]/div[2]/span[1]");
	By addnew = By.xpath("/html/body/app-root/app-admin/div/div[1]/app-dashboard-cmp/div[3]/div/div/div/app-datatable/div/div/div/div[1]/button[2]");
	By Back = By.xpath("//*[@id=\"wizardForm\"]/div[1]/div[1]/button");
	By OK = By.xpath("//*[@id=\"canclebtn\"]/div/div/div[3]/button[1]");
	By Action = By.xpath("//*[@id=\"dtjobList\"]/tbody/tr[1]/td[1]/div/button/i");
	By docview = By.xpath("//*[@id=\"docdownload\"]/a");
	By Billdrpdwn = By.xpath("/html/body/app-root/app-admin/div/div[1]/app-dashboard-cmp/div[6]/div/div/div[2]/div/div/div/app-alldocument/div/div[1]/div/a/div/h4/i");
	By Download = By.xpath("//*[@id=\"collapseTwo0\"]/div/div/table/tbody/tr/td[4]/a/i");
	By Closedoc = By.xpath("//*[@id=\"myJobAttachment\"]/div/div/div[1]/button");
	By JBReport = By.xpath("/html/body/app-root/app-admin/div/div[1]/app-jobtracker/div/div[1]/button");

	//BTL-BILL
	By search1 = By.xpath("//*[@id=\"m_quicksearch_input\"]");
	By SelBTLBILL = By.xpath("//*[@id=\"m_quicksearch\"]/m-portlet/div/div[3]/perfect-scrollbar/div/div[1]/div/div/div[1]/div[1]/div[2]/span[1]");
	By createBill = By.xpath("/html/body/app-root/app-admin/div/div[1]/app-mybills/div[9]/div/div/div/app-datatable/div/div/div/div[1]/button");
	By Back1 = By.xpath("//*[@id=\"wizardForm\"]/div[1]/div[1]/button");
	By Ok = By.xpath("//*[@id=\"canclebtn\"]/div/div/div[3]/button");
	By actionBill = By.xpath("//*[@id=\"dtmybills\"]/tbody/tr[1]/td[1]/div/button/i");
	By viewdoc = By.xpath("//*[@id=\"bPoDocuments\"]/a");		
	By BTLJOB = By.xpath("//*[@id=\"accordion\"]/div/a/div");		
	By downdoc = By.xpath("/html/body/app-root/app-admin/div/div[1]/app-mybills/div[4]/div/div/div[2]/div/div/div/app-alldocument/div/div[1]/div/div/div/div/table/tbody/tr/td[4]/a/i");		
	By closedoc = By.xpath("/html/body/app-root/app-admin/div/div[1]/app-mybills/div[4]/div/div/div[1]/button");		

	//Marketing Purchase Order
	By search3 = By.xpath("//*[@id=\"m_quicksearch_input\"]");
	By PO = By.xpath("//*[@id=\"m_quicksearch\"]/m-portlet/div/div[3]/perfect-scrollbar/div/div[1]/div/div/div/div[1]/div[2]/span[1]");
	By attaccor = By.partialLinkText("Attach Documents");
	By billaccor= By.xpath("//*[@id=\"docDiv\"]/div[1]");
	By downloadpo = By.xpath("//*[@id=\"docDiv\"]/div[2]/ul/li/input");
	By datef = By.xpath("//*[@id=\"ContentPlaceHolder1_ucPOList_txtPOFromDt\"]");
	By datet = By.xpath("//*[@id=\"ContentPlaceHolder1_ucPOList_txtPOToDt\"]");
	By Downloadpr = By.xpath("//*[@id=\"ContentPlaceHolder1_ucPOList_lnkSelBrandGenerateTemp0\"]");

	//ATL Estimate
	By search4 = By.xpath("//*[@id=\"m_quicksearch_input\"]");
	By SelATL = By.xpath("//span[@class='app-desc']");
	By attachments = By.xpath("/html/body/div[2]/div/div[2]/app-view-estimate/div[3]/mat-card/table/tbody/tr[1]/td[10]/button/span/mat-icon");
	By atlest = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]/span[1]");
	By downloadest = By.xpath("/html/body/div[6]/div[2]/div/mat-dialog-container/app-document-view/div/mat-accordion/mat-expansion-panel[1]/div/div/table/tbody/tr[1]/td[3]/i");
	By close = By.xpath("//*[@id=\"mat-dialog-0\"]/app-document-view/div/div/nav/mat-icon");
	By creatives = By.xpath("/html/body/div[2]/div/div[2]/app-view-estimate/div[3]/mat-card/table/tbody/tr[1]/td[11]/button/span/mat-icon");
	By closecreative = By.xpath("//*[@id=\"mat-dialog-1\"]/app-creative-details/div/div[1]/nav/button/mat-icon");


	//ATL FMS 
	By searchFMS = By.xpath("//*[@id=\"m_quicksearch_input\"]");
	By SelATLFMS = By.xpath("//*[@id=\"m_quicksearch\"]/m-portlet/div/div[3]/perfect-scrollbar/div/div[1]/div/div/div/div[1]/div[2]/span[1]");
	By TV = By.xpath("/html/body/div[2]/div/div[2]/app-view-schedule/div/div[2]/mat-card/div/div[1]/button[1]/span");
	By FYyear = By.xpath("//*[@id=\"mat-select-4\"]/div/div[1]");
	By selfy = By.xpath("//*[@id=\"mat-option-89\"]/span");
	By checkbox = By.xpath("//*[@id=\"mat-checkbox-3\"]/label/div");
	By select = By.xpath("//*[@id=\"mat-dialog-0\"]/app-multiselect-polist/div/button");
	By fmsattachment = By.xpath("/html/body/div[2]/div/div[2]/app-view-schedule/div/div[4]/div/mat-card/div[2]/table/tbody/tr[1]/td[12]/button/span/mat-icon");
	By fmsdrp = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-document-view/div/mat-accordion/mat-expansion-panel[1]/mat-expansion-panel-header/span[1]/mat-panel-title/b");
	By fmsdownload = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-document-view/div/mat-accordion/mat-expansion-panel[1]/div/div/table/tbody/tr/td[3]/i");
	By fmsclose = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-document-view/div/div/nav/mat-icon");
	By fmscreatives = By.xpath("/html/body/div[2]/div/div[2]/app-view-schedule/div/div[4]/div/mat-card/div[2]/table/tbody/tr[1]/td[13]/button/span/mat-icon");
	By fmsclosecreative = By.xpath("/html/body/div[5]/div[2]/div/mat-dialog-container/app-creative-details/div/div[1]/nav/button/mat-icon");

	//Creatives 
	By searchCAC = By.xpath("//*[@id=\"m_quicksearch_input\"]");
	By creative = By.xpath("//*[@id=\"m_quicksearch\"]/m-portlet/div/div[3]/perfect-scrollbar/div/div[1]/div/div/div/div[1]/div[2]/span[1]");
	By mw = By.xpath("/html/body/m-modules/modal-container/div[2]/m-application-user-branch/section/div[2]/div[1]/div/p[1]");
	By brands = By.xpath("//*[@id=\"mat-dialog-0\"]/app-create-caption-master/div/div[2]/div/form/div/div[1]/div/div[4]/ng-multiselect-dropdown/div/div[1]/span");
	By searchbrand = By.xpath("//*[@id=\"mat-dialog-0\"]/app-create-caption-master/div/div[2]/div/form/div/div[1]/div/div[4]/ng-multiselect-dropdown/div/div[2]/ul[1]/li/input");
	By cancel = By.xpath("//*[@id=\"mat-dialog-0\"]/app-create-caption-master/div/div[2]/div/form/div/div[2]/div/div/div[2]/button[2]");
	By add = By.xpath("/html/body/div[2]/div[2]/div/app-list-caption-master/div/div[2]/app-list-creative/div/div/div/div[1]/div/div/div/a/span");
	By addclose = By.xpath("//*[@id=\"mat-dialog-1\"]/app-caption-details/div/div[2]/div/form/div/div[2]/div/div/div[2]/button[2]");


	public void SelectBTL() throws Exception {
		Thread.sleep(4000);
		driver.findElement(search).sendKeys("Jobs");
		driver.findElement(selectBTL).click();
		Thread.sleep(3000);
	}
	public void BTL_Job() throws Exception {
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		Thread.sleep(6000);
		Actions action1 = new Actions(driver);
		WebElement sidebar = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/app-sidebar/div[2]"));
		action1.moveToElement(sidebar).build().perform();
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"minimizeSidebar\"]"));
		action1.moveToElement(menu).click().perform();
		Thread.sleep(4000);
		WebElement myjob = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/app-sidebar/div[2]/ul/li[2]/a"));
		action1.moveToElement(myjob).click().perform();
		Thread.sleep(3000);
		WebElement listofJob = driver.findElement(By.partialLinkText("List of Jobs"));
		action1.moveToElement(listofJob).click().perform();
		Thread.sleep(3000);
		driver.findElement(addnew).click();
		Thread.sleep(2000);
		driver.findElement(Back).click();
		driver.findElement(OK).click();
		driver.findElement(Action).click();
		Thread.sleep(2000);
		driver.findElement(docview).click();
		Thread.sleep(3000);	
		driver.findElement(Billdrpdwn).click();
		Thread.sleep(3000);
		driver.findElement(Download).click();
		Thread.sleep(3000);
		driver.findElement(Closedoc).click();
		Thread.sleep(3000);

		WebElement sidebar1 = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]"));
		action1.moveToElement(sidebar1).build().perform();
		WebElement menu1 = driver.findElement(By.xpath("//*[@id=\"minimizeSidebar\"]"));
		action1.moveToElement(menu1).click().perform();
		Thread.sleep(3000);
	}
	public void DownloadJobBillreport() throws Exception {
		Actions action2 = new Actions(driver);
		Thread.sleep(3000);
		WebElement jb = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/app-sidebar/div[2]/ul/li[2]/a"));
		action2.moveToElement(jb).click().perform();
		Thread.sleep(4000);
		WebElement JBTracker = driver.findElement(By.partialLinkText("JOB-BILL TRACKER"));
		action2.moveToElement(JBTracker).click().perform();
		Thread.sleep(4000);
		driver.findElement(JBReport).click();
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		js = (JavascriptExecutor)driver;
		WebElement CloseApp = driver.findElement(By.xpath("//*[@id=\"m-header\"]/div[2]/div/div/div[2]/span[5]"));
		Thread.sleep(3000); 
		js.executeScript("arguments[0].click();", CloseApp);
		Thread.sleep(3000);
	}	

	public void BTL_BILL() throws Exception {
		driver.findElement(search).sendKeys("Bills");
		Thread.sleep(8000);
		driver.findElement(SelBTLBILL).click();
		Thread.sleep(5000);

	}
	public void Download_supporting_Bill() throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(6000);
		Actions action1 = new Actions(driver);
		WebElement sidebar = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/app-sidebar/div[1]/div/div/a[2]"));
		action1.moveToElement(sidebar).build().perform();
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"minimizeSidebar\"]"));
		action1.moveToElement(menu).click().perform();
		Thread.sleep(4000);
		WebElement mybills = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/app-sidebar/div[2]/ul/li[3]/a/p"));
		action1.moveToElement(mybills).click().build().perform();
		Thread.sleep(2000);
		WebElement listofbills = driver.findElement(By.xpath("//*[@id=\"MYBILLS\"]/ul/li[1]/a/span[2]"));
		action1.moveToElement(listofbills).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(createBill).click();
		Thread.sleep(3000);
		driver.findElement(Back1).click();
		Thread.sleep(2000);
		driver.findElement(Ok).click();
		Thread.sleep(3000);
		driver.findElement(actionBill).click();
		driver.findElement(viewdoc).click();
		Thread.sleep(3000);
		driver.findElement(BTLJOB).click();
		Thread.sleep(2000);
		driver.findElement(downdoc).click();
		Thread.sleep(3000);
		//		driver.findElement(Closedoc).click();
		//        Thread.sleep(4000);
		driver.switchTo().defaultContent();
		js = (JavascriptExecutor)driver;
		WebElement CloseApp = driver.findElement(By.xpath("//*[@id=\"m-header\"]/div[2]/div/div/div[2]/span[5]"));
		Thread.sleep(3000); 
		js.executeScript("arguments[0].click();", CloseApp);
		Thread.sleep(4000);
	}

	public void Select_PurchaseOrser() throws Exception {

		driver.findElement(search3).sendKeys("Purchase Order");
		Thread.sleep(6000);
		driver.findElement(PO).click();
		Thread.sleep(4000);
	}

	public void dowbload_Supporing_documents_andPOreport() throws Exception {	
		Thread.sleep(4000);
		WebElement iframe= driver.findElement(By.xpath("//iframe[@id='appIframe']"));
		driver.switchTo().frame(iframe);
		Actions nwaction = new Actions(driver);
		Thread.sleep(4000);
		WebElement btljob = driver.findElement(By.partialLinkText("BTL POs"));
		js.executeScript("arguments[0].click();", btljob);
		WebElement actionbtl = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div/div[5]/div[2]/table/tbody/tr[1]/td[1]/a/div/i"));
		nwaction.moveToElement(actionbtl).click().build().perform();
		Thread.sleep(3000);
		WebElement attachdoc = driver.findElement(By.xpath("//table[@id='PO_BTLdatatable']//tr[1]//i[@class='fa fa-ellipsis-v']"));
		
		
		nwaction.moveToElement(attachdoc).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(attaccor).click();
		Thread.sleep(4000);
		driver.findElement(billaccor).click();
		Thread.sleep(3000);
		driver.findElement(downloadpo).click();
		Thread.sleep(6000);
		WebElement POreport = driver.findElement(By.id("menuitem_poreport"));
		js.executeScript("arguments[0].click();", POreport);
		Thread.sleep(3000);
		WebElement datef = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucPOList_txtPOFromDt\"]"));
		datef.clear();
		datef.sendKeys("01/04/2020");
		Thread.sleep(2000);
		WebElement datet = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucPOList_txtPOToDt\"]"));
		datet.clear();
		datet.sendKeys("31/08/2020");
		Thread.sleep(3000);
		driver.findElement(Downloadpr).click();			
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		js = (JavascriptExecutor)driver;
		WebElement CloseApp = driver.findElement(By.xpath("//*[@id=\"m-header\"]/div[2]/div/div/div[2]/span[5]"));
		Thread.sleep(3000); 
		js.executeScript("arguments[0].click();", CloseApp);
		Thread.sleep(3000);
	}


	public void select_ATL() throws Exception {	
		driver.findElement(search4).sendKeys("Estimate");
		Thread.sleep(5000);
		driver.findElement(SelATL).click();
		Thread.sleep(8000);
	}

	public void Download_documents_check_creatives() throws Exception {
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement ClickHam= driver.findElement(By.xpath("//*[@id=\"m_header\"]/div/div/div[1]/div"));
		action.moveToElement(ClickHam).click().build().perform();
		WebElement clksidebar = driver.findElement(By.xpath("//*[@id=\"m_ver_menu\"]/ul[3]/li/a/i[1]"));
		action.moveToElement(clksidebar).click().build().perform();
		Thread.sleep(3000);
		WebElement view = driver.findElement(By.xpath("//*[@id=\"m_ver_menu\"]/ul[3]/li/div/ul/li[2]/a/span"));
		action.moveToElement(view).click().build().perform();
		driver.findElement(attachments).click();
		Thread.sleep(2000);
		driver.findElement(atlest).click();
		Thread.sleep(2000);
		driver.findElement(downloadest).click();
		Thread.sleep(3000);
		driver.findElement(close).click();
		Thread.sleep(2000);
		driver.findElement(creatives).click();
		Thread.sleep(3000);
		driver.findElement(closecreative).click();
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		js = (JavascriptExecutor)driver;
		WebElement CloseApp = driver.findElement(By.xpath("//*[@id=\"m-header\"]/div[2]/div/div/div[2]/span[5]"));
		Thread.sleep(3000); 
		js.executeScript("arguments[0].click();", CloseApp);
		Thread.sleep(3000);

	}
	public void select_ATL_FMS() throws Exception {	
		driver.findElement(searchFMS).sendKeys("Schedule");
		Thread.sleep(5000);
		driver.findElement(SelATLFMS).click();
		Thread.sleep(8000);
	}

	public void Download_FMS_documents_check_creatives() throws Exception {
		Thread.sleep(8000);
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement ClickHam= driver.findElement(By.xpath("//*[@id=\"m_header\"]/div/div/div[1]/div"));
		action.moveToElement(ClickHam).click().build().perform();
		WebElement schedule = driver.findElement(By.xpath("//*[@id=\"m_ver_menu\"]/ul[4]/li/a/i[2]"));
		action.moveToElement(schedule).click().build().perform();
		Thread.sleep(3000);
		WebElement viefms = driver.findElement(By.xpath("//*[@id=\"m_ver_menu\"]/ul[4]/li/div/ul/li[2]/a/span"));
		action.moveToElement(viefms).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(TV).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-select-3\"]/div/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-option-77\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(FYyear).click();
		Thread.sleep(3000);
		driver.findElement(selfy).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-select-5\"]/div/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-option-98\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[4]/div/div/mat-option[3]/span")).click();
		Thread.sleep(3000);		
		driver.findElement(checkbox).click();
		Thread.sleep(2000);
		driver.findElement(select).click();
		Thread.sleep(3000);
		driver.findElement(fmsattachment).click();
		Thread.sleep(2000);
		driver.findElement(fmsdrp).click();
		Thread.sleep(2000);
		driver.findElement(fmsdownload).click();
		Thread.sleep(3000);
		driver.findElement(fmsclose).click();
		Thread.sleep(2000);
		driver.findElement(fmscreatives).click();
		Thread.sleep(3000);
		driver.findElement(fmsclosecreative).click();
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		js = (JavascriptExecutor)driver;
		WebElement CloseApp = driver.findElement(By.xpath("//*[@id=\"m-header\"]/div[2]/div/div/div[2]/span[5]"));
		Thread.sleep(3000); 
		js.executeScript("arguments[0].click();", CloseApp);
		Thread.sleep(3000);
	}
	public void select_Creatives() throws Exception {	
		driver.findElement(searchCAC).sendKeys("Creative");
		Thread.sleep(5000);
		driver.findElement(creative).click();
		Thread.sleep(5000);
	}
	public void Check_creative() throws Exception {
		driver.findElement(mw).click();
		Thread.sleep(8000);
		driver.switchTo().frame(0);
		Actions actioncrea = new Actions(driver);
		WebElement create = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/app-list-caption-master/div/div[1]/div/div/div/div[1]/div/div/div/a/span/span"));
		actioncrea.moveToElement(create).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(brands).click();
		Thread.sleep(3000);
		driver.findElement(searchbrand).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(cancel).click();
		Thread.sleep(3000);
		driver.findElement(add).click();
		Thread.sleep(3000);
		driver.findElement(addclose).click();
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		js = (JavascriptExecutor)driver;
		WebElement CloseApp = driver.findElement(By.xpath("//*[@id=\"m-header\"]/div[2]/div/div/div[2]/span[5]"));
		Thread.sleep(3000); 
		js.executeScript("arguments[0].click();", CloseApp);
		Thread.sleep(3000);
	}	

}
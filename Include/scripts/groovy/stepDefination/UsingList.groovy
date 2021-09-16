package stepDefination
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.cucumber.datatable.DataTable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class UsingList {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Launch the Website")
	def oepnBrowser() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl("https://test.qatechhub.com/form-elements/")
	}

	@When("Enter the input details")
	def inputDetails(DataTable data) {
		List<String> dataValue=data.asList()
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_Form Elements/firstName'), dataValue.get(0))
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_Form Elements/lastName'), dataValue.get(1))
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_Form Elements/email'), dataValue.get(2))
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_Form Elements/phoneNumber'), dataValue.get(3))
		
		WebUI.click(findTestObject('Object Repository/Page_Form Elements/Male'))
		
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Form Elements/select_Select CourseSeleniumCypressTestComplete'), 1, FailureHandling.STOP_ON_FAILURE)
		
	}

	@Then("Click on submit button")
	def I_verify_the_status_in_step(String status) {
		println status
	}
}
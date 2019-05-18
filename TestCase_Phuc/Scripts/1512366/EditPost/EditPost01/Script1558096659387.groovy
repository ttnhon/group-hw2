import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://localhost:3000/login')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('TC_1/Page_PostInCommunity/div_clicktopost'))

WebUI.setText(findTestObject('TC_1/Page_PostInCommunity/input_post'), 'this is a test post')

WebUI.click(findTestObject('TC_1/Page_PostInCommunity/button_Post'))

WebUI.clickOffset(findTestObject('Page_Edit Post  Spectrum/div_settings'), 16, 16)

WebUI.click(findTestObject('Page_Edit Post  Spectrum/button_editEdit post'))

WebUI.sendKeys(findTestObject('Page_Edit Post  Spectrum/textarea1'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Edit Post  Spectrum/textarea1'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Edit Post  Spectrum/textarea1'), 'Edit Post')

WebUI.sendKeys(findTestObject('Page_Edit Post  Spectrum/textarea2'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Edit Post  Spectrum/textarea2'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Edit Post  Spectrum/textarea2'), 'Edit Post')

WebUI.click(findTestObject('Page_Edit Post  Spectrum/button_Save'))

WebUI.clickOffset(findTestObject('Page_Edit Post  Spectrum/span_view-close'), 16, 16)

WebUI.delay(2)

WebUI.closeBrowser()


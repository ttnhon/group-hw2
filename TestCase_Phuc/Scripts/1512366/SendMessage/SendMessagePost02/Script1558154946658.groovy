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

WebUI.openBrowser('http://localhost:3000/login')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('TC_1/Page_SendMessageToAPost/a_post'))

WebUI.setText(findTestObject('TC_1/Page_SendMessageToAPost/input_message'), '***test message***')

WebUI.click(findTestObject('TC_1/Page_SendMessageToAPost/button_SendMessage'))

WebUI.clickOffset(findTestObject('Page_iEdit Posti  Spectrum/span_view-close'), 20, 20)

WebUI.refresh()

WebUI.waitForPageLoad(15)

WebUI.delay(3)

WebUI.closeBrowser()


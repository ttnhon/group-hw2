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

WebUI.click(findTestObject('Page_Spectrum community/a_Post_style__InboxLinkWrapper-q7eler-1 iENQxs (1)'))

WebUI.clickOffset(findTestObject('Object Repository/Page_Edit Post  Spectrum/div_settings'), 16, 16)

WebUI.click(findTestObject('Object Repository/Page_Edit Post  Spectrum/button_deleteDelete'))

WebUI.click(findTestObject('Object Repository/Page_Edit Post  Spectrum/button_Delete'))

WebUI.delay(1)

WebUI.refresh()

WebUI.waitForPageLoad(4)

WebUI.delay(2)

WebUI.closeBrowser()


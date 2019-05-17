import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.bouncycastle.operator.KeyWrapper as KeyWrapper
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser('http://localhost:3000/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC_1/Page_Spectrum/button_Create your community'))

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('TC_1/Page_New community/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy'), 
    findTestData('Community').getValue(1, 1))

WebUI.setText(findTestObject('TC_1/Page_New community/textarea_Describe it in 140 characters or less_style__StyledTextArea-sc-17zryot-3 hSQZHk'), 
    findTestData('Community').getValue(2, 1))

if (findTestData('Community').getValue(4, 1) == '1') {
    WebUI.check(findTestObject('TC_1/Page_New community/p_Public'))
} else {
    WebUI.check(findTestObject('TC_1/Page_New community/p_Private'))
}

WebUI.check(findTestObject('TC_1/Page_New community/div_checkmarkI have read the Spectrum Code of Conduct and agree to enforce it in my community'))

if (WebUI.verifyElementClickable(findTestObject('Object Repository/TC_1/Page_New community/button_Create Community  Continue'))) {
    WebUI.click(findTestObject('TC_1/Page_New community/button_Create Community  Continue'))

    log.logInfo('Tao Community thanh cong')
} else {
    log.logInfo('Tao Community khong thanh cong')
}

WebUI.closeBrowser()


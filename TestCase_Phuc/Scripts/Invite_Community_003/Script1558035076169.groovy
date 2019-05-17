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

WebUI.openBrowser('http://localhost:3000/test-community/settings/members')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('TC_1/Page_test_community community/button_Settings'))

WebUI.click(findTestObject('TC_1/Page_update community settings/div_Members'))

for(int i=0; i<3; i++) {
	WebUI.setText(findTestObject('TC_1/Page_update community settings/input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 gNxvqX'),
		'abc@gmail.com')
	
	WebUI.setText(findTestObject('TC_1/Page_update community settings/input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 kRLwzc'),
		'abc')
	
	if(WebUI.verifyElementNotVisible(findTestObject('Object Repository/TC_1/Page_update community settings/input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 gNxvqX'))) {
		
		WebUI.click(findTestObject('Object Repository/TC_1/Page_update community settings/button_plus Add row'))
		
		WebUI.setText(findTestObject('TC_1/Page_update community settings/input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 gNxvqX'),
			'abc@gmail.com')
		
		WebUI.setText(findTestObject('TC_1/Page_update community settings/input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 kRLwzc'),
			'abc')
	}
}

WebUI.click(findTestObject('TC_1/Page_update community settings/button_Send Invitations'))

WebUI.closeBrowser()


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint



import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startApplication(GlobalVariable.applicationQA, false)
// Mobile.callTestCase(findTestCase('REGISTRATION/RegistrationFlow/TC-Positive-Registration flow'), [:], FailureHandling.OPTIONAL)
//if(  GlobalVariable.status =='Pass')
//{


//set code page 1111
if (Mobile.verifyElementExist(findTestObject('Object Repository/13Dec-RegistrationPage/set code1111/XSetcode page logo verify- bpd-popular'), 
    20)) {
    Mobile.tap(findTestObject('Object Repository/13Dec-RegistrationPage/set code1111/Xset code-codigo secrto 1st field'), 
        1)

    Mobile.setText(findTestObject('Object Repository/13Dec-RegistrationPage/set code1111/Xset code-1111'), '1111', 6)

    Mobile.verifyElementExist(findTestObject('Dash-Board-Page/trailLaunch/XCUIElementTypeStaticText - Consulta'), 
        20)

    KeywordUtil.markPassed('welcome to  ambasa dashbord')
	Mobile.delay(20)
	GlobalVariable.status = "Pass"

    CustomKeywords.'com.login.Login.erros'()
  
//	  //log out	-salir (from dashbord)
//    Mobile.waitForElementPresent(   findTestObject('Object Repository/13Dec-RegistrationPage/ambasa dashbord/XCUIElementTypeStaticText - Salir'),20)
//
//    Mobile.tap(findTestObject('Object Repository/13Dec-RegistrationPage/ambasa dashbord/XCUIElementTypeStaticText - Salir'), 1)
//
//    KeywordUtil.markPassed(' clicked on salir')
//
//    Mobile.verifyElementExist(findTestObject('null'), 
//        5)
//
//    Mobile.tap(findTestObject('null'), 
//        1)
//
//    KeywordUtil.markPassed('succefully logout')
//
//    Mobile.verifyElementExist(findTestObject('null'), 
//        20)
//	GlobalVariable.status = "Pass"
//    KeywordUtil.markPassed('your on login page')
	
}
	 else {
	

		 KeywordUtil.markFailed('*login failed*')
		 GlobalVariable.status = "Fail"
	 }
 
//}
//	else {
//	
//	
//		println GlobalVariable.status
//		KeywordUtil.markFailed('login fail')
//		}
//


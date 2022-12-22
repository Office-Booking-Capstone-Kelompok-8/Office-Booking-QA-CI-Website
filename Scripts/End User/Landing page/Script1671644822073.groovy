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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/')

WebUI.click(findTestObject('Object Repository/Object End User/Page_React App/div_City_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object End User/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object End User/Page_React App/div_Capacity_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object End User/Page_React App/div_1 - 50 Person'))

WebUI.click(findTestObject('Object Repository/Object End User/Page_React App/div_option 1 Month focused, 1 of 12. 12 res_5988e9'))

WebUI.click(findTestObject('Object Repository/DatePicker/Page_/22-12-21'))

WebUI.click(findTestObject('Object Repository/Object End User/Page_React App/div_1 Month'))

WebUI.click(findTestObject('Object Repository/Object End User/Page_React App/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Object End User/Page_React App/h5_please try another search'), 
    '')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/')

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_City_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_Capacity_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_1 - 50 Person'))

WebUI.uploadFile(findTestObject('Object Repository/Object end user 2/Page_React App/div_option 1 Month focused, 1 of 12. 12 res_5988e9'), 
    '')

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_1 Month'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Object end user 2/Page_React App/h5_please try another search'), 
    '')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/')

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_City_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_Capacity_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_1 - 50 Person'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/svg_Duration_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/div_1 Month'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Object end user 2/Page_React App/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Object end user 2/Page_React App/h5_please try another search'), 
    '')


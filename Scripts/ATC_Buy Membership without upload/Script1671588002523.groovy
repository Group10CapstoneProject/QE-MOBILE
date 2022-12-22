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

Mobile.startExistingApplication('com.example.capstone_alterra_flutter')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Membership/Profile ID'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Membership/android.widget.Button-Activasi Member'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.EditText - Masukkan jumlah angka disini'), 0)

Mobile.setText(findTestObject('Object Repository/Membership/android.widget.EditText - Masukkan jumlah angka disini (1)'), 
    '3', 0)

Mobile.tap(findTestObject('Object Repository/Membership/android.widget.Button-Lanjutkan Pembayaran'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transaksi/PILIH METODE PEMBAYARAN ID'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transaksi/Metode pembayaran 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transaksi/TERAPKAN ID'), 0)

Mobile.tap(findTestObject('Transaksi/Bayar ID'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transaksi/KIRIMKAN ID'), 0)

Mobile.verifyElementExist(findTestObject('Transaksi/verify Konfirmasi Pembayaran'), 0)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


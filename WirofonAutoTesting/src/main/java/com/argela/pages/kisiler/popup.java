package com.argela.pages.kisiler;

import com.argela.enumarations.*;
import com.argela.functions.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class popup {
	public static void clickSesliAra(AndroidDriver<MobileElement> driver){
		
		SpesificMobilElement.clickByText(driver, Enumarations.SesliAra);
	}
	public static void clickGoruntuluAra(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.GoruntuluAra);
		
	}
	public static void clickMobilAra(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.MobilAra);

	}
	public static void clickSil(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.Sil);
	
	}
	public static void clickSohbet(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.Sohbet);

	}
	public static void clickWirofonPopUpTamam(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.WirofonPopupTamam);

	}
	public static void clickWirofonPopUpIptal(AndroidDriver<MobileElement> driver){
		SpesificMobilElement.clickByText(driver, Enumarations.WirofonPopupIptal);
	}
}

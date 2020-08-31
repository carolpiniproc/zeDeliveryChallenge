package pages;

import mappers.AddressMap;
import org.openqa.selenium.Keys;
import settings.Driver;
import settings.Elements;

import static java.lang.Thread.*;

public class AddressPage {
    AddressMap addressMap = new AddressMap();

    public void setAllowedToDrink() {
        addressMap.age18.click();
    }

    public void setNotAllowedToDrink() {
        addressMap.minor18.click();
    }

    public void allowCookies(){
        addressMap.cookies.waitVisibleElement().click();
    }

    public void setAddress(String value) {
        addressMap.clickInputAddress.click();
        addressMap.inputAddress.sendKeys(value);
        addressMap.selectAddress.waitVisibleElement().click();
    }

    public void setNumber(CharSequence... value) {
        addressMap.number.sendKeys(value);
    }

    public void setComplement(CharSequence... value) {
        addressMap.complement.sendKeys(value);
    }

    public void setNoComplement(){
        addressMap.noComplement.click();
    }

    public void setAddressType(CharSequence... value) {
        addressMap.addressTypeHome.sendKeys(value);
        addressMap.addressTypeHome.click();
    }

    public void clickSeeProducts() {
        addressMap.seeProducts.click();
    }

    public String checkAddress(){
        addressMap.checkInputAddress.waitVisibleElement();
        return addressMap.checkInputAddress.getAttribute("value");
    }

    public String checkSavedAddress(String value) throws InterruptedException {
        addressMap.checkSavedAddress.waitVisibleElement();
        Thread.sleep(5000);
        return addressMap.checkSavedAddress.getText();
    }

    public boolean checkMinorMessage(){
        addressMap.minorMessage.waitVisibleElement();
        return addressMap.minorMessage.isDisplayed();
    }

}

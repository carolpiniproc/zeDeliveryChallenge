package pages;

import mappers.AddressMap;

public class AddressPage {
    AddressMap addressMap = new AddressMap();

    public void setMaior() {
        addressMap.age18.waitVisibleElement().click();
        addressMap.sayAddress.click();
    }

    public void setMenor() {
        addressMap.minor18.waitVisibleElement().click();
    }

    public void setAddress(CharSequence... value) {
        addressMap.inputAddress.sendKeys(value);
        addressMap.selectAddress.click();
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
        addressMap.addressType.sendKeys(value);
        addressMap.addressType.click();
    }

    public void clickSeeProducts() {
        addressMap.seeProducts.click();
    }

    public String checkAddress(){
        return addressMap.checkInputAddress.getText();
    }

    public String checkSavedAddress(){
        return addressMap.checkSavedAddress.getText();
    }

    public String checkMinorMessage(){
        return addressMap.minorMessage.getText();
    }

}

package mappers;

import settings.ByValue;
import settings.Elements;

public class AddressMap {

    public Elements age18 = new Elements(ByValue.ID,"age-gate-button-yes");
    public Elements minor18 = new Elements(ByValue.ID, "age-gate-button-no");
    public Elements minorMessage = new Elements(ByValue.ID, "age-gate-button-try-again");
    public Elements cookies = new Elements(ByValue.CSS, ".optanon-button-allow button");
    public Elements clickInputAddress = new Elements(ByValue.ID, "fake-address-search-input");
    public Elements sayAddress = new Elements(ByValue.CSS, ".css-qbj9am-addressContainer");
    public Elements inputAddress = new Elements(ByValue.CSS, "input[name=address-search-input-address]");
    public Elements selectAddress = new Elements(ByValue.CSS,"#backdrop li");
    public Elements checkInputAddress = new Elements(ByValue.ID, "address-search-input");
    public Elements number = new Elements(ByValue.ID, "address-details-input-number");
    public Elements complement = new Elements(ByValue.ID, "address-details-input-complement");
    public Elements noComplement = new Elements(ByValue.ID, "address-details-checkbox-without-complement");
    public Elements addressTypeHome = new Elements(ByValue.ID, "address-details-button-home");
    public Elements seeProducts = new Elements(ByValue.ID, "address-details-button-continue");
    public Elements checkSavedAddress = new Elements(ByValue.CSS, "#delivery-options-card  .css-152ezmh-address");
}

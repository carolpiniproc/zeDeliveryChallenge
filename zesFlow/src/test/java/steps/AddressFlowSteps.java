package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddressPage;
import settings.Driver;
import static org.hamcrest.CoreMatchers.containsString;

public class AddressFlowSteps {
    AddressPage addressPage = new AddressPage();

    @Given("customer is on ZeDelivery page")
    public void customerIsOnZeDeliveryPage() {
        Driver.setUrl("https://www.ze.delivery/");
    }

    @When("customer is {int} years old")
    public void customerIsYearsOld(int value) {
        if(value >= 18){
            addressPage.setAllowedToDrink();
        }
        else {
            addressPage.setNotAllowedToDrink();
        }
    }

    @And("customer needs to accept cookies")
    public void customerNeedsToAcceptCookies() {
        addressPage.allowCookies();
    }

    @And("customer can set his address as {string}")
    public void customerCanSetHisHersAddressAs(String value) {
        addressPage.setAddress(value);
        Assert.assertThat(addressPage.checkAddress(), containsString(value));
    }

    @And("type the address number as {string}")
    public void typeTheAddressNumberAs(String value) {
        addressPage.setNumber(value);
    }

    @And("does not have a complement")
    public void doesNotHaveAComplement() {
        addressPage.setNoComplement();
        addressPage.clickSeeProducts();
    }

    @And("it is a {string}")
    public void itIsA(String value) {
        addressPage.setAddressType(value);
        addressPage.clickSeeProducts();
    }

    @Then("customer can see his address registered as {string}")
    public void customerCanSeeHisHersAddressRegisteredAs(String value) throws InterruptedException {
        Assert.assertThat(addressPage.checkSavedAddress(value), containsString(value));
    }

    @Then("customer reads a warning message")
    public void customerReadsAWarningMessage() {
        Assert.assertTrue(addressPage.checkMinorMessage());
    }



}

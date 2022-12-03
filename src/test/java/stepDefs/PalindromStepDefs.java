package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class PalindromStepDefs {
    String str ;
    private boolean actual;
    @Given("memasukkan kata berupa {string}")
    public void memasukkan_kata_berupa(String string) {
        str = string;
    }

    @When("cek polindrom")
    public void cek_polindrom() {
        String tampungPalindrom = "";
        for (int i=str.length(); i > 0; i--) {
            String tampung = str.substring(i-1, i);
            tampungPalindrom += tampung;
        }
        if (str.equals(tampungPalindrom)) {
            actual = true ;
        } else {
            actual = false ;
        }

    }

    @Then("hasil tes harus {string}")
    public void hasil_tes_harus(String string) {
        boolean expect = Boolean.parseBoolean(string);
        assertEquals(actual, expect);
    }

}



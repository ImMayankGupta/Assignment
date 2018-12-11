package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Chocolate {

    @Given("^A basket of (\\d+) chocolate bar$")
    public void a_basket_of_total_chocolate_bar(int total){
        System.out.format("A basket of %n chocolate bar", total);
    }
    
    @When("^I give (\\d+) chocolate bar as a treat$")
    public void i_give_give_chocolate_bar_as_a_treat(int give){
    	System.out.format("I give %n chocolate bar as a treat", give);
    }
    
    @When("^Friends eat (\\d+) chocolate bar$")
    public void friends_eat_eat_chocolate_bar(int eat) {
    	System.out.format("Friends eat %n chocolate bar", eat);
    }
    
    @When("^I share (\\d+) chocolate bar with co-worker$")
    public void i_share_share_chocolate_bar_with_co_worker(int share){
    	System.out.format("I share %n chocolate bar with co-worker", share);
    }
    
    @Then("^I keep remaining (\\d+) chocolate bar in storage$")
    public void i_keep_remaining_remaining_chocolate_bar_in_storage(int remaining){
    	System.out.format("I keep remaining %n chocolate bar in storage", remaining);
    }
    

}

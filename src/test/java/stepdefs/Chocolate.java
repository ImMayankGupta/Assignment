package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class Chocolate {
	
	private int total_chocolate;
	private int given_chocolate;
	private int eaten_chocolate;
	private int shared_chocolate;
	private int remaining_chocolate;
	

    @Given("^A basket of (\\d+) chocolate bar$")
    public void a_basket_of_total_chocolate_bar(int total){
    	total_chocolate = total;
        System.out.format("A basket of %n chocolate bar", total);
    }
    
    @When("^I give (\\d+) chocolate bar as a treat$")
    public void i_give_give_chocolate_bar_as_a_treat(int give){
    	given_chocolate = give;
    	System.out.format("I give %n chocolate bar as a treat", give);
    }
    
    @When("^Friends eat (\\d+) chocolate bar$")
    public void friends_eat_eat_chocolate_bar(int eat) {
    	eaten_chocolate = eat;
    	System.out.format("Friends eat %n chocolate bar", eat);
    }
    
    @When("^I share (\\d+) chocolate bar with co-worker$")
    public void i_share_share_chocolate_bar_with_co_worker(int share){
    	shared_chocolate = share;
    	System.out.format("I share %n chocolate bar with co-worker", share);
    }
    
    @Then("^I keep remaining (\\d+) chocolate bar in storage$")
    public void i_keep_remaining_remaining_chocolate_bar_in_storage(int remaining){
    	remaining_chocolate = total_chocolate - given_chocolate - eaten_chocolate - shared_chocolate;
    	assertTrue(remaining_chocolate==remaining);
    	System.out.format("I keep remaining %n chocolate bar in storage", remaining);
    }
    
    @Given("^A basket of chocolate bar$")
    public void a_basket_of_chocolate_bar() {
    	System.out.format("A basket of chocolate bar");
    }

    @When("^The basket has (\\d+) chocolate$")
    public void the_basket_has_chocolate(int total){
    	if(total==0) {
    		given_chocolate=0;
    		eaten_chocolate=0;
    		shared_chocolate=0;
    		remaining_chocolate=0;
    	}
    }
}

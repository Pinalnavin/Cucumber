package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
 HomePage homepage = new HomePage();
 RegistrationPage registrationPage = new RegistrationPage();
 RegistrationPage registrationPage1=new RegistrationPage();


 public RegistrationPage getRegistrationPage() {
  return registrationPage;
 }

 public void i_am_on_registration_page() {
  // Write code here that turns the phrase above into concrete actions
  homepage.clickOnRegisterButton();
 }
 @When("I click on register submit button")
 public void i_click_on_register_submit_button() {
  // Write code here that turns the phrase above into concrete actions
  homepage.clickOnRegisterButton();
 }
 @Then("I should able to registered successfully")
 public void i_should_able_to_registered_successfully() {
  // Write code here that turns the phrase above into concrete actions
  homepage.clickOnRegisterButton();

 }
 @Then("I should be logged in")
 public void i_should_be_logged_in() {
  // Write code here that turns the phrase above into concrete actions
  homepage.clickOnRegisterButton();

 }

 //-----------------------------------------------------
 @Given("I am on Homepage")
 public void i_am_on_homepage() {
  // Write code here that turns the phrase above into concrete actions
 }
 @When("I click on {string} link from top menu header")
 public void i_click_on_link_from_top_menu_header(String string) {
  // Write code here that turns the phrase above into concrete actions
 }
 @Then("I should able to successfully navigated to related {string} page successfully")
 public void i_should_able_to_successfully_navigated_to_related_page_successfully(String string) {
  // Write code here that turns the phrase above into concrete actions

 }

}
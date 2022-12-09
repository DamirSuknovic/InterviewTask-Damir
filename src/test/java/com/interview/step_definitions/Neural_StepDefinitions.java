package com.interview.step_definitions;

import com.interview.pages.NeuralNetwork_Page;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Neural_StepDefinitions {

    NeuralNetwork_Page neuralNetworkPage = new NeuralNetwork_Page();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User changes dataset to exclusive")
    public void user_changes_dataset_to_exclusive() {
        neuralNetworkPage.datasetChoice.click();
    }
    @When("User changes noise to given percent")
    public void user_changes_noise_to_percent() {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDropBy(neuralNetworkPage.noiseSlider, -50,0).perform();
    }
    @When("User selects two more features")
    public void user_selects_two_more_features() {
        neuralNetworkPage.x1Feature.click();
        neuralNetworkPage.x2Feature.click();
    }
    @When("User removes one neuron of each")
    public void user_removes_one_neuron_of_each() {
        neuralNetworkPage.reduceNeuronsFirst.click();
        neuralNetworkPage.reduceNeuronsSecond.click();
    }
    @When("User changes learning rate to given value")
    public void user_changes_learning_rate_to_given_value() {
        neuralNetworkPage.learningRate.click();
        neuralNetworkPage.rateValue.click();
    }
    @When("User clicks to run the simulator")
    public void user_clicks_to_run_the_simulator() {
        neuralNetworkPage.playButton.click();
    }
    @When("User waits until Epoch is more than given value")
    public void user_waits_until_epoch_is_more_than_given_value() throws InterruptedException {
        Thread.sleep(5500);
        neuralNetworkPage.pauseButton.click();
    }
    @Then("User reports the Test loss value")
    public void user_reports_the_test_loss_value() {
        Assert.assertTrue(neuralNetworkPage.testLoss.isDisplayed());
        System.out.println("Test Loss value is: "+neuralNetworkPage.testLoss.getText());
    }

}

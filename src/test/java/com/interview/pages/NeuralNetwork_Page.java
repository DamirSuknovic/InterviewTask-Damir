package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeuralNetwork_Page {

    public NeuralNetwork_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@title='Exclusive or']")
    public WebElement datasetChoice;

    @FindBy(id = "noise")
    public WebElement noiseSlider;



}

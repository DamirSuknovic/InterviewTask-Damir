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

    @FindBy(id = "canvas-xSquared")
    public WebElement x1Feature;

    @FindBy(id = "canvas-ySquared")
    public WebElement x2Feature;

    @FindBy(xpath = "(//i[.='remove'])[1]")
    public WebElement reduceNeuronsFirst;

    @FindBy(xpath = "(//i[.='remove'])[2]")
    public WebElement reduceNeuronsSecond;

    @FindBy(id = "learningRate")
    public WebElement learningRate;

    @FindBy(xpath = "(//option[@value='0.1'])[1]")
    public WebElement rateValue;

    @FindBy(xpath = "//i[.='play_arrow']")
    public WebElement playButton;

    @FindBy(xpath = "//i[.='pause']")
    public WebElement pauseButton;

    @FindBy(id = "iter-number")
    public WebElement epochCounter;

    @FindBy(id = "loss-test")
    public WebElement testLoss;



}

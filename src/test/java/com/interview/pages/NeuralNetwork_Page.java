package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class NeuralNetwork_Page {

    public NeuralNetwork_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

package org.example.StepDefination;

import com.gemini.generic.ui.utils.DriverManager;
import io.cucumber.java.Before;

public class hooks
{
    @Before
    public static void start(){
        DriverManager.setUpBrowser();
    }
}

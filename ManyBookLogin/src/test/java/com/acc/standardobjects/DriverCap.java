package com.acc.standardobjects;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;


public class DriverCap {
    private static final Logger LOG = Logger.getLogger("Driver Initialization");

  public static WebDriver driver;
    public static HashMap<String, String> myMap = new HashMap<>();
    static ObjectMapper mapper = new ObjectMapper();




  public WebDriver initializeDriver() {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        LOG.info("Driver initialized");
       return driver;
    }

    public void setFromJson(String fileNode) {
        try {
            LOG.info("Node of file : " + fileNode);
            JsonNode node = mapper.readTree(new File("src/test/resources/testData/loginCred.json")).get(fileNode);
            Iterator<String> fieldNames = node.fieldNames();
            while (fieldNames.hasNext()) {
                String key = fieldNames.next();
                String value = node.get(key).asText();
                myMap.put(key, value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LOG.info("Data added to Global TestData variable from Json file");
    }

    public void waitForelementToBeVisible(By by, long time) {
        LOG.info("Waiting element to be visible");
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        LOG.info("Element Found");
    }

}

package com.example.demo.objects;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;


public class User {
    int userId;

    public User(){
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // simulates a slow call
    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphabetic(1000);

        return generatedString;
    }
}

package com.dov.calculator;

import java.util.ArrayList;

public class ApplicationData {
    private static ApplicationData instance;
    private ArrayList<String> operationsHistory = new ArrayList<>();

    public static ApplicationData getInstance() {
        if (instance == null) {
            instance = new ApplicationData();
        }
        return instance;
    }

    public ArrayList<String> getOperationsHistory() {
        return operationsHistory;
    }


}

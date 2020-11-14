package gmibank.stepdefinitions;

import gmibank.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;

import java.util.List;

public class DBStepDefinitions {
    @Given("kullanıcı veritabanına bağlanır")
    public void kullanıcı_veritabanına_bağlanır() {

        DatabaseUtility.createConnection();

        String query="SELECT * FROM public.tp_customer";
        List<Object>list=DatabaseUtility.getColumnData(query,"email");

        for (Object w:list) {
            System.out.println(w.toString());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forexnepal.allbanks;

import com.forexnepal.service.BankService;
import com.forexnepal.service.CurrencyService;
import com.forexnepal.service.ExchangeRatesService;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Anuz
 */
public class ScrapData {

    private final CurrencyService currencyService;
    private final BankService bankService;
    private final ExchangeRatesService exchangeRatesService;
    Date date;
    Time time;

    public ScrapData(CurrencyService currencyService, BankService bankService, ExchangeRatesService exchangeRatesService,Date date,Time time) {
        this.currencyService = currencyService;
        this.bankService = bankService;
        this.exchangeRatesService = exchangeRatesService;
        this.date=date;
        this.time=time;

    }

    public void scrapChoice(String choice) throws IOException {
        ScrapCommand cmd = ScrapCommandFactory.get(choice);
        if (cmd != null) {
            
            cmd.setService(currencyService, bankService, exchangeRatesService,date,time);
            cmd.scrap(choice);
        } else {
            System.out.println("Invalid Command Please Try Again!!!!");
        }
    }   
       
    
    
}

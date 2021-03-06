/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forexnepal.service;

import com.forexnepal.dao.ExchangeRatesDAO;
import com.forexnepal.entity.Bank;
import com.forexnepal.entity.Currency;
import com.forexnepal.entity.ExchangeRates;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anuz
 */
@Service
public class ExchangeRatesService {

    @Autowired
    private ExchangeRatesDAO exchangeRatesDAO;

    public List<ExchangeRates> getAll() {
        return exchangeRatesDAO.getAll();
    }

    public ExchangeRates getById(int id) {
        return exchangeRatesDAO.getById(id);
    }

    public int insertOrUpdate(ExchangeRates e) {
        return exchangeRatesDAO.insertOrUpdate(e);
    }

    public int delete(int id) {
        return exchangeRatesDAO.delete(id);
    }

    public List<ExchangeRates> getByBank(int bankId) {
        return exchangeRatesDAO.getByBank(bankId);
    }

    public List<ExchangeRates> getByCurency(int currencyId) {
        return exchangeRatesDAO.getByCurrency(currencyId);
    }

    public List<ExchangeRates> getByDate(Date date) {
        return exchangeRatesDAO.getByDate(date);
    }

    public List<ExchangeRates> getByTime(Time time) {
        return exchangeRatesDAO.getByTime(time);
    }

    public List<Date> getAllDate() {
        return exchangeRatesDAO.getAllDate();
    }

    public List<Time> getAllTime() {
        return exchangeRatesDAO.getAllTime();
    }

    public List<ExchangeRates> getByCurrencyDateTime(int currencyId,Date date, Time time){
        //System.out.println(currency+""+date+""+time);
        return exchangeRatesDAO.getByCurrencyDateTime(currencyId, date, time);
    }
     public List<ExchangeRates> getByBankDateTime(int bankId,Date date, Time time){
        //System.out.println(currency+""+date+""+time);
        return exchangeRatesDAO.getByBankDateTime(bankId, date, time);
    }
    
    public List<Time> getAllTimeByDate(Date date){
        return exchangeRatesDAO.getAllTimeByDate(date);
    }
    public List<Currency> getCurrencyList(){
        return exchangeRatesDAO.getCurrencyList();
    }
    public List<Bank> getBankList(){
        return exchangeRatesDAO.getBankList();
    }
    public Date getLatestDate(){
     return exchangeRatesDAO.getLatestDate();
    }
    
    public Time getLatestTime(Date date){
        return exchangeRatesDAO.getLatestTime(date);
    }
    public List<ExchangeRates> getExchangeRatesByDateTime(Date date,Time time){
        return exchangeRatesDAO.getExchangeRatesByDateTime(date, time);
    }
     public List<ExchangeRates> getExchangeRatesByCurrencyBank(int currencyId, int bankId){
         return exchangeRatesDAO.getExchangeRatesByCurrencyBank(currencyId, bankId);
     }
}

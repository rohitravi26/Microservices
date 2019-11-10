package com.rohit26.controller;

import com.rohit26.entity.CurrencyExchangeBean;
import com.rohit26.proxy.ICurrencyExchangeProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CurrencyConversionController {

    ICurrencyExchangeProxy proxy;
    @GetMapping("/currency-exchange/src{src}/dest{dest}")
    public CurrencyExchangeBean getCurrencyConversion(@PathVariable String src,@PathVariable String dest)
    {
        CurrencyExchangeBean bean =(CurrencyExchangeBean)proxy.retrieveExchangeValue(src,dest);

        return bean;
    }

}

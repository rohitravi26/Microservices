package com.rohit26.controller;

import com.rohit26.entity.ExchangeValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class CurrencyExchangeController {
    @GetMapping("/currency-exchange/from/{src}/to/{dest}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String src,@PathVariable String dest)
    {


        return new ExchangeValue();
    }


}

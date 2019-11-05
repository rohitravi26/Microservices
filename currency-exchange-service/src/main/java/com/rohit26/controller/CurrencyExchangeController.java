package com.rohit26.controller;

import com.rohit26.RepoSitory.ExchangeValueRepository;
import com.rohit26.entity.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeValueRepository exchangeRepository;

    @Autowired
    private Environment env;
    @GetMapping("/currency-exchange/from/{src}/to/{dest}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String src,@PathVariable String dest)
    {
        ExchangeValue exchangeValue=exchangeRepository.findByFrmAndTo(src,dest);
        exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));

        return exchangeValue;
    }


}

package com.rohit26.proxy;

import com.rohit26.entity.CurrencyExchangeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="currency-exchange-value",url="localhost:8000")
public interface ICurrencyExchangeProxy  {

    @GetMapping("/currency-exchange/from/{src}/to/{dest}")
    public CurrencyExchangeBean retrieveExchangeValue(@PathVariable String src,@PathVariable String dest);
}

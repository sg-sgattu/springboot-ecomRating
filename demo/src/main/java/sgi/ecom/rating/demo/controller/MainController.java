package sgi.ecom.rating.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sgi.ecom.rating.demo.model.Dealer;
import sgi.ecom.rating.demo.model.ProdRates;
import sgi.ecom.rating.demo.repository.DealerRepository;
import sgi.ecom.rating.demo.repository.ProductRatesRepository;

import java.util.List;

@RestController
@RequestMapping("/get")
public class MainController{

    @Autowired
    DealerRepository dealerRepository;

    @Autowired
    ProductRatesRepository productRatesRepository;

    @GetMapping("/dealer/{dealerCode}")
    public Mono<Dealer> getDealers(@PathVariable("dealerCode") String dealerCode)
    {
        System.out.println("DEALER CODE " + dealerCode);
        return dealerRepository.findByDealerCode(dealerCode);
    }

    @GetMapping("/rates")
    public Flux<ProdRates> getRates(@RequestBody ProdRates body)
    {
        System.out.println("PROD RATES REQ" + body);

        return productRatesRepository.findProdRates(body.getProductCode());

    }

    @GetMapping("/prodrates")
    public Flux<ProdRates> getProdRates(@RequestBody List<ProdRates> body)
    {
        System.out.println("PROD RATES REQ" + body);
        return productRatesRepository.findRates(body);

    }



}

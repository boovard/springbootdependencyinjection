package com.switchfully.springdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.inject.Inject;
import java.math.BigDecimal;

@SpringBootApplication
public class TaxRunner implements CommandLineRunner{

    private final ApplicationContext applicationContext;

    @Inject
    public TaxRunner(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(TaxRunner.class, args);
    }

    public void run(String... args) throws Exception {
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(new BigDecimal(23000)));
    }
}

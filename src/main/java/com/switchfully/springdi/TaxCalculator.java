package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculation.TaxCalculation;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class TaxCalculator {

    private TaxCalculation taxCalculation;

    @Inject
    public TaxCalculator(@Qualifier("USTax") TaxCalculation taxCalculation){
        this.taxCalculation = taxCalculation;
    }

    public BigDecimal calculateTaxesBasedOnYearlyIncome(BigDecimal yearlyIncome){
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}

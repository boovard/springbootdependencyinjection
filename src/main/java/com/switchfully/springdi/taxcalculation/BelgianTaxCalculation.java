package com.switchfully.springdi.taxcalculation;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("BelgianTax")
@Primary
public class BelgianTaxCalculation implements TaxCalculation{

    private BigDecimal taxRate;

    public BelgianTaxCalculation() {
        this.taxRate = new BigDecimal(0.45);
    }

    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return yearlyIncome.multiply(taxRate);
    }
}

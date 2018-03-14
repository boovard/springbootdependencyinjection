package com.switchfully.springdi.taxcalculation;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("USTax")
public class AmericanTaxCalculation implements TaxCalculation{

    private BigDecimal taxRate;
    private BigDecimal lumpSum;

    public AmericanTaxCalculation() {
        this.taxRate = new BigDecimal(0.18);
        this.lumpSum = new BigDecimal(950);
    }

    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return yearlyIncome.multiply(taxRate).add(lumpSum);
    }
}

package com.switchfully.springdi.taxcalculation;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("FrenchTax")
public class FrenchTaxCalculation  implements TaxCalculation{
    private BigDecimal taxRate;

    public FrenchTaxCalculation() {
        this.taxRate = new BigDecimal(0.48);
    }

    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return yearlyIncome.multiply(taxRate);
    }
}

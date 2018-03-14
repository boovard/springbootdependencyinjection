package com.switchfully.springdi.taxcalculation;

import java.math.BigDecimal;

public interface TaxCalculation {

    BigDecimal calculateTaxes(BigDecimal yearlyIncome);
}

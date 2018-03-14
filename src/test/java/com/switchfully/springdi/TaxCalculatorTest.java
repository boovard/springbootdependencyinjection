package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculation.AmericanTaxCalculation;
import com.switchfully.springdi.taxcalculation.TaxCalculation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

class TaxCalculatorTest {

    @Test
    void taxCalculator_givenAnAmericanTaxCalculateTheTax(){
        TaxCalculation americanTaxCalculationMock = Mockito.mock(AmericanTaxCalculation.class);
        Mockito.when(americanTaxCalculationMock.calculateTaxes(new BigDecimal(35000))).thenReturn(new BigDecimal(11505));

        TaxCalculator taxCalculator = new TaxCalculator(americanTaxCalculationMock);

        Assertions.assertThat(taxCalculator.calculateTaxesBasedOnYearlyIncome(new BigDecimal(35000))).isEqualTo(new BigDecimal(11505));
    }


}
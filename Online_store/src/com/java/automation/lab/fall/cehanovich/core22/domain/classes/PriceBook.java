package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

import com.java.automation.lab.fall.cehanovich.core22.domain.enums.Currency;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PriceBook {
    private Currency currency;
    private boolean enabled;
    private Date validFrom;
    private Date validTo;
    private Map<Variation, BigDecimal> priceAndProduct;

    public PriceBook(Currency currency, boolean enabled, Date validFrom, Date validTo,
                     HashMap<Variation, BigDecimal> priceAndProduct) {
        this.currency = currency;
        this.enabled = enabled;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.priceAndProduct = priceAndProduct;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public Map<Variation, BigDecimal> getPriceAndProduct() {
        return priceAndProduct;
    }

    public void setPriceAndProduct(Map<Variation, BigDecimal> priceAndProduct) {
        this.priceAndProduct = priceAndProduct;
    }


    @Override
    public String toString() {
        return "PriceBook {\nСurrency: " + currency + "Is enabled: " + enabled + "Valid from: " + validFrom +
                "Valid To: " + validTo + "Price and Product" + priceAndProduct.toString() + "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        PriceBook other = (PriceBook) that;
        return currency.equals(other.currency) && enabled == other.enabled && validFrom.equals(other.validFrom) &&
                validTo.equals(other.validTo) && priceAndProduct.equals(other.priceAndProduct);
    }

    @Override
    public int hashCode() {
        return currency.hashCode() + validFrom.hashCode() + validTo.hashCode() - priceAndProduct.hashCode();
    }


}

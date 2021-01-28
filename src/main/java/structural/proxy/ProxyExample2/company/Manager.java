package structural.proxy.ProxyExample2.company;

import java.math.BigDecimal;

public class Manager implements CompanyDetails {
    @Override
    public BigDecimal getTurnOver() {
        return BigDecimal.valueOf(1e6);
    }
}

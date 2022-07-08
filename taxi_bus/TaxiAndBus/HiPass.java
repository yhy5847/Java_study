package TaxiAndBus;

import TaxiAndBus.Payment;

public interface HiPass extends Payment {

    default void pay(int age, int money) {

    }
}

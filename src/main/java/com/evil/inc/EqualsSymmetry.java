package com.evil.inc;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsSymmetry {
    static class Money {
        int amount;
        String currencyCode;

        public Money(final int amount, final String currencyCode) {
            this.amount = amount;
            this.currencyCode = currencyCode;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Money))
                return false;
            Money other = (Money)o;
            boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                    || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
            return this.amount == other.amount && currencyCodeEquals;
        }
    }

    static class Voucher extends Money {

        private String store;

        public Voucher(final int amount, final String currencyCode, final String store) {
            super(amount, currencyCode);
            this.store = store;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Voucher))
                return false;
            Voucher other = (Voucher)o;
            boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                    || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
            boolean storeEquals = (this.store == null && other.store == null)
                    || (this.store != null && this.store.equals(other.store));
            return this.amount == other.amount && currencyCodeEquals && storeEquals;
        }

    }

    public static void main(String[] args) {
        final Voucher voucher = new Voucher(1, "eur", "m1");
        final Money voucher2 = new Money(1, "eur");

        //this one matters
        Set<Money> money = new HashSet<>();
        money.add(voucher);
        money.add(voucher2);
    }
}

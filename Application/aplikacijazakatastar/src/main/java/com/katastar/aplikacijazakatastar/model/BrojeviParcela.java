package com.katastar.aplikacijazakatastar.model;

public enum BrojeviParcela {

    VALUE1(1111),
    VALUE2(1112),
    VALUE3(1113),
    VALUE4(1114),
    VALUE5(1115),
    VALUE6(1116),
    VALUE7(1117),
    VALUE8(1118);

    private int value;

    private BrojeviParcela(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BrojeviParcela fromValue(int value) {
        for (BrojeviParcela e : BrojeviParcela.values()) {
            if (e.value == value) {
                return e;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }
}

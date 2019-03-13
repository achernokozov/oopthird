package com.company;

public interface Constants {
    double Pi = 3.1415926;

    default void setColor(Object o, Color color) throws NumberFormatException, NoSuchFieldException, IllegalAccessException {
        o.getClass().getField("color").set(o, color);
    }


}

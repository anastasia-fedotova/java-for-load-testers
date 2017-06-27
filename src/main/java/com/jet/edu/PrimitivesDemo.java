package com.jet.edu;

import java.io.File;

public class PrimitivesDemo {
    public static void main(String[] args) {
        //region Целочисленные
        byte b = 0; //0..255 | -127..128
        short s = 07; //-32000..32000
        int i = 0xA;
        long l = 9999999999999L;

//        b = s;
//        s = b;
        //endregion

        //region Плавающая точка
        float f = 0.F;
        double d = -3.14e-10;
        //endregion

        //region Логический тип
        boolean bb = true | false;
        //endregion

        //region Символ
        char c = '\u1234'; //'\n'; //File.separator
        System.out.println("1" + c + "2");
        //endregion

    }
}

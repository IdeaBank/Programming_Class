import javafx.util.Pair;

import java.util.ArrayList;

public class TwoDimension {
    public static void main(String[] args) {
        System.out.println(CentimeterToInch((float) 172));
        System.out.println(CentimeterToFeet((float) 172));
        System.out.println(CentimeterToFeetAndInch(172)[0] + " feet " + CentimeterToFeetAndInch(172)[1] + " inch");

        System.out.println(CentimeterToFeet(165) > 13 + InchToFeet(3));
    }

    public static float CentimeterToInch(float centimeter) {
        return (float) (centimeter / 2.54);
    }

    public static float CentimeterToFeet(float centimeter) {
        return (float) (centimeter / 12.0);
    }

    public static float InchToCentimeter(float inch) {
        return (float) (inch * 2.54);
    }

    public static float FeetToCentimeter(float feet) {
        return (float) (feet * 12);
    }

    public static float InchToFeet(float inch) {
        return CentimeterToFeet(InchToCentimeter(inch));
    }

    public static float FeetToInch(float feet) {
        return CentimeterToInch(FeetToCentimeter(feet));
    }

    public static float[] CentimeterToFeetAndInch(float centimeter) {
        float feet = (float) (centimeter / 12.0);
        float inch = (float) ((centimeter % 12) / 2.54);
        float[] arr = new float[2];
        arr[0] = feet;
        arr[1] = inch;
        return arr;
    }
}
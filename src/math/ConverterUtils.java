package math;

/**
 * @author Mario Hidalgo
 *
 * **/
public class ConverterUtils {
    /**
     * @param celsius grados celsius
     * @return grados farenheit
     * **/
    public static double convierteCelsiusaFarenheit(double celsius) {
        double farenheit = (9*celsius+(32*5))/5;

        return farenheit;
    }

}

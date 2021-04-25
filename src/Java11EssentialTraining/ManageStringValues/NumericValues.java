package Java11EssentialTraining.ManageStringValues;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumericValues {
    public static void main(String[] args) {

        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue)); //Number: 10.000.000,53

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Num: " + intF.format(doubleValue)); // Num: 10.000.001

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue)); //Number: 10000001

        var locale = Locale.getDefault();
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number:" + localeFormatter.format(doubleValue)); // Number:10.000.000,53

        var locale1 = new Locale("de", "DE");
        var localeFormatter1 = NumberFormat.getNumberInstance(locale1);
        System.out.println("Number: " + localeFormatter.format(doubleValue)); //Number: 10.000.000,53

        var currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatter.format(doubleValue)); //10.000.000,53 €

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1)); //$01,00

    }
}

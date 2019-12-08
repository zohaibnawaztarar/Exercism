import java.util.ArrayList;
import java.util.Arrays;

class ResistorColorDuo {

    private ArrayList<String> ColorPalette = new ArrayList<String>(Arrays.asList("black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"));

    int value(String[] colors) {
        String result = "";
        String num1 = Integer.toString(ColorPalette.indexOf(colors[0]));
        String num2 = Integer.toString(ColorPalette.indexOf(colors[1]));
        result = num1+num2;
        return Integer.parseInt(result);
    }
}

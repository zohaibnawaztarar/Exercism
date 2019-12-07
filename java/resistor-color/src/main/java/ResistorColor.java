import java.util.Arrays;
import java.util.List;

class ResistorColor {
    int colorCode(String color) {
        //Convert array of string to list
        List<String> myResistorColorList = Arrays.asList(this.colors());
        return myResistorColorList.indexOf(color);
    }

    String[] colors() {
       // Order of return string colors in resistor number sequence.
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    }
}

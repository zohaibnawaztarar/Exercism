class ReverseString {

    String reverse(String inputString) {
        StringBuilder rev = new StringBuilder(inputString);
        rev.reverse();

        return rev.toString();
    }
  
}
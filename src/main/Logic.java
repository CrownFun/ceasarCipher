package main;

// !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
//32                               65                              97                          125
public class Logic {

    public static boolean checkString = false;
    private static final int SHIFT = 3;

    public static void checkString(String text) {

        for (int i = 0; i < text.length(); i++) {

            if (Character.isUpperCase(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
                checkString = true;
            }

        }
    }

    public static String decryptTextUsingBasicSymbols(String text) {
        StringBuilder textToCode;
        int place;

        textToCode = new StringBuilder(text);

        for (int i = 0; i < textToCode.length(); i++) {

            place = textToCode.charAt(i);

            switch (place) {
                case 65:
                    place = 88;
                    break;
                case 66:
                    place = 89;
                    break;
                case 67:
                    place = 90;
                    break;
                case 32:
                    place = 32;
                    break;
                default:
                    place = place - SHIFT;
                    break;
            }

            textToCode.setCharAt(i, (char) place);
        }
        return textToCode.toString();
    }

    public static String decryptTextUsingExtendSymbols(String text) {
        StringBuilder textToCode;
        int place;

        textToCode = new StringBuilder(text);

        for (int i = 0; i < textToCode.length(); i++) {

            place = textToCode.charAt(i);

            switch (place) {
                case 33:
                    place = 125;
                    break;
                case 34:
                    place = 124;
                    break;
                case 35:
                    place = 123;
                    break;
                case 32:
                    place = 32;
                    break;
                default:
                    place = place - SHIFT;
                    break;
            }

            textToCode.setCharAt(i, (char) place);
        }
        return textToCode.toString();
    }

    public static String encryptTextUsingExtendSymbols(String text) {
        StringBuilder textToCode;
        int place;

        textToCode = new StringBuilder(text);

        for (int i = 0; i < textToCode.length(); i++) {

            place = textToCode.charAt(i);

            if (place + SHIFT > 125) {
                place = 32 + (SHIFT - (125 - place));
            } else if (place == 32) {
                place = 32;
            } else {
                place = place + SHIFT;
            }
            textToCode.setCharAt(i, (char) place);
        }

        return textToCode.toString();

    }

    public static String encryptTextUsingBasicSymbols(String text) {
        StringBuilder textToCode;
        int place;

        textToCode = new StringBuilder(text);

        for (int i = 0; i < textToCode.length(); i++) {

            place = textToCode.charAt(i);

            if (place + SHIFT > 90) {
                place = 65 + (SHIFT - (90 - place));
            } else if (place == 32) {
                place = 32;
            } else {
                place = place + SHIFT;
            }
            textToCode.setCharAt(i, (char) place);
        }

        return textToCode.toString();

    }

}

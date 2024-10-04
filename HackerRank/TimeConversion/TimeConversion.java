package TimeConversion;

class Result {

    /*
     * A resolução do problema foi feita com a manipulação da String de entrada para
     * substrings;
     */

    // input: 07:05:45PM

    public static String timeConversion(String s) {
        String amPm = s.substring(s.length() - 2);
        String timeWithoutAmPm = s.substring(0, s.length() - 2);
        String firstTwoNumbers = s.substring(0, 2);
        String middleNumbers = s.substring(2, s.length() - 2);

        String retorno = "";
        if (amPm.equals("AM")) {
            if (firstTwoNumbers.equals("12")) {
                retorno = "00".concat(middleNumbers);
            } else {
                retorno = timeWithoutAmPm;
            }
        } else { // "PM"
            if (firstTwoNumbers.equals("12")) {
                retorno = timeWithoutAmPm;
            } else {
                int militaryHourNumber = Integer.parseInt(firstTwoNumbers) + 12;
                String militaryHourString = String.valueOf(militaryHourNumber);
                retorno = militaryHourString.concat(middleNumbers);
            }
        }

        return retorno;
    }
}

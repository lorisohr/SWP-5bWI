public class StringHelper {
    private String myString;

    public String getString() {
        return myString;
    }

    public void setString(String string) {
        this.myString = string;
    }

    public boolean isPalindrome() {
        String cleanedString = myString.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (right > left) {
            if(cleanedString.charAt(left) != cleanedString.charAt(right)) {

                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public String reverseString() {
        int length = myString.length() - 1;
        char Char;
        String reversedString = "";
        while(length >= 0) {
            Char = myString.charAt(length);
            reversedString = reversedString + Char;
            length--;
        }
        return reversedString;
    }

    public String printAmountOfLetter() {
        String uniqueCharString = "";

        for (int i = 0; i < myString.length(); i++) {
            if(!uniqueCharString.contains(String.valueOf(myString.charAt(i)))) {
                uniqueCharString += myString.charAt(i);
            }


        }
        uniqueCharString = uniqueCharString.replaceAll("\\s", "");
        String characterAmount = "";
        for (int i = 0; i < uniqueCharString.length(); i++) {
            char target = uniqueCharString.charAt(i);
            int count = 0;
            for (int j = 0; j < myString.length(); j++) {
                if(myString.charAt(j) == target) {
                    count++;
                }
            }

            characterAmount += String.valueOf(count);
        }

        String returnString = "";
        for (int i = 0; i < uniqueCharString.length(); i++) {
            returnString += String.valueOf(uniqueCharString.charAt(i));
            returnString += " - ";
            returnString += String.valueOf(characterAmount.charAt(i));
            returnString += "\n";

        }
        return returnString;
    }
}


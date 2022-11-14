public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        /* to be implemented */
        int count = 0;
        for (int i = 0; i < searchString.length(); i++) {
            if (searchString.substring(i, i + 1).toLowerCase().equals(character.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        /* to be implemented */
        String newString = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            newString += origString.substring(i, i + 1);
        }
        return newString;
    }

    public String reverseString2(String origString) {
        /* to be implemented */
        String newString = "";
        for (int i = 0; i < origString.length(); i++) {
            newString = origString.substring(i, i + 1) + newString;
        }
        return newString;
    }

    public int countString(String searchString, String origString) {
        /* to be implemented */
        int idx = origString.indexOf(searchString);
        int count = 0;
        while (idx != -1) {
            origString = origString.substring(idx + 1);
            idx = origString.indexOf(searchString);
            count++;
        }
        return count;
    }

    public String replaceCharacter(String searchChar, String origString, String replaceChar) {
        /* to be implemented */
        int idx = origString.indexOf(searchChar);
        while (idx != -1) {
            origString = origString.replace(searchChar, replaceChar);
            idx = origString.indexOf(searchChar);
        }
        return origString;
    }

    public boolean isPalindrome(String myString) {
        /* to be implemented */
        System.out.println(myString.replace(" ", "") + " | " + reverseString(myString.replace(" ", "")));
        return myString.replace(" ", "") == reverseString(myString.replace(" ", ""));
    }


    public String removeString(String searchString, String origString) {
        /* to be implemented */
        int idx = origString.indexOf(searchString);
        while (idx != -1) {
            origString = origString.replace(searchString, "");
            idx = origString.indexOf(searchString);
        }
        return origString;
    }


    public void multiPrint(String toPrint, int num) {
        /* to be implemented */
        System.out.print("[");

        if (num > 0) {
            int finalLen = num * (toPrint.length() + 1) - 1;
            System.out.print((toPrint + " ").repeat(num).substring(0, finalLen));
        }
        System.out.println("]");
    }


}

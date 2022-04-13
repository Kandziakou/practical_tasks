// tasks from https://docs.google.com/document/d/1uEnQGkvfcE75nl6K_X1k43qJ2QZ8_0BVV_gP3OytamU/edit

import lombok.Getter;

import java.util.Arrays;
import java.util.StringJoiner;

@Getter
public class Code {
    private final String originalString = "Hello World";
    private String separator;
    private String reversedString;
    private String stringWithChangedSymbolWithIndex;
    private String stringWithChangedSymbolWithValue;
    private String stringWithoutDeletedSymbolWithIndex;
    private String stringWithoutDeletedSymbolWithValue;
    private long qtyOfCharInString;
    private final int[] digitsCollection = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
    private final String[] surnames = new String[]{"Абрамов", "Авдеев", "Азов", "Афанасенко",
            "Богданов", "Дегтярев", "Заяц", "Черноручко"};


    public void reverseOriginalString(){
        this.reversedString = new StringBuilder(this.originalString).reverse().toString();
    }

    public void changeSymbolInStringByIndex(int index, char newChar){
        char[] chars = this.originalString.toCharArray();
        chars[index] = newChar;
        this.stringWithChangedSymbolWithIndex = String.valueOf(chars);
    }

    public void changeSymbolInStringByValue(String value, String newValue){
        this.stringWithChangedSymbolWithValue = this.originalString.replace(value, newValue);
    }

    public void deleteSymbolInStringByValue(String value){
        this.stringWithoutDeletedSymbolWithValue = this.originalString.replace(value, "");
    }

    public void deleteSymbolInStringByIndex(int index){
        this.stringWithoutDeletedSymbolWithIndex = new StringBuilder(this.originalString).deleteCharAt(index).toString();
    }

    public void countQtyOfGivenCharInOriginalString(char givenChar){
        this.qtyOfCharInString = this.originalString.chars().filter(ch -> ch == Character.toLowerCase(givenChar)).count();
        this.qtyOfCharInString += this.originalString.chars().filter(ch -> ch == Character.toUpperCase(givenChar)).count();
        System.out.println("Qty of \"" + givenChar + "\" in " + "\"" +this.originalString + "\" = " + this.qtyOfCharInString);
    }

    public void showStringNTimesWithGivenSeparator(String separator, int count){
        StringJoiner joiner = new StringJoiner(separator);
        for (int i = 0; i < count; i++) {
            joiner.add(this.originalString);
        }
        System.out.println(joiner);
    }

    public boolean isThisStringPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public void areTheseWordsAnagrams(String firstWord, String secondWord) {
        char[] first = firstWord.toUpperCase().replaceAll("[^A-Za-z]", "").toCharArray();
        char[] second = secondWord.toUpperCase().replaceAll("[^A-Za-z]", "").toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if (Arrays.equals(first, second)){
            System.out.println(firstWord + " is anagram of " + secondWord);
        }
        else
            System.out.println(firstWord + " isn't anagram of " + secondWord);
    }

    public int fibonacci(int N){
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fibonacci(N - 1) + fibonacci(N - 2);
        }
    }

    public int factorial(int N){
        return N >= 1 ? N*factorial(N-1) : 1;
    }

    public int[] returnArrayOfModularDigits(){
        return Arrays.stream(this.digitsCollection).map(Math::abs).toArray();
    }

    public int[] returnArrayOfModifiedDigits(){
        // if number is even - it is multiplied by 100
        // else if number is odd - 100 is subtracted from it
        return Arrays.stream(this.digitsCollection).map(n -> Math.abs(n)%2 == 0 ? n*100 : n-100).toArray();
    }

    public Object[] returnSurnamesThatStartWithA(){
        return Arrays.stream(this.surnames).filter(str -> str.startsWith("А")).toArray();
    }
}
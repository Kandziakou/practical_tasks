import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Code code = new Code();

        System.out.println("1. Переворот строки \"".concat(code.getOriginalString()).concat("\":"));
        code.reverseOriginalString();
        System.out.println(code.getReversedString());

        System.out.println("2. Замена символа в строке (замена по индексу и по значению):");
        code.changeSymbolInStringByIndex(0, 'h');
        code.changeSymbolInStringByValue("l", "L");
        System.out.println(code.getStringWithChangedSymbolWithIndex());
        System.out.println(code.getStringWithChangedSymbolWithValue());

        System.out.println("3. Удаление символа в строке (по индексу и по значению):");
        code.deleteSymbolInStringByIndex(0);
        code.deleteSymbolInStringByValue("l");
        System.out.println(code.getStringWithoutDeletedSymbolWithIndex());
        System.out.println(code.getStringWithoutDeletedSymbolWithValue());

        System.out.println("4. Подсчет числа вхождения символа в строке, учитывая различные раскладки");
        code.countQtyOfGivenCharInOriginalString('l');
        code.countQtyOfGivenCharInOriginalString('L');
        code.countQtyOfGivenCharInOriginalString('@');

        System.out.println("5. Вывод строки указанное количество раз с разделителем");
        code.showStringNTimesWithGivenSeparator("!!!", 3);

        System.out.println("6. Проверка на палиндром");
        code.isThisStringPalindrome("abcd");
        code.isThisStringPalindrome("abcdcba");

        System.out.println("7. Проверка на анаграмму");
        code.areTheseWordsAnagrams("Santa", "Satan");
        code.areTheseWordsAnagrams("S a n t a", "Satan");
        code.areTheseWordsAnagrams("Santa", "satan");
        code.areTheseWordsAnagrams("Santa", "s.a.t.a.n.");
        code.areTheseWordsAnagrams("Santa", "Latin");

        System.out.println("8. Фибоначчи числа " + 10 + " равно " + code.fibonacci(10));

        System.out.println("9. Факториал " + 5 + " равен " + code.factorial(5));

        System.out.println(Arrays.toString(code.getDigitsCollection()));
        System.out.println(Arrays.toString(code.getSurnames()));

        System.out.println("10. Стрим возвращает коллекцию чисел, отрицательные делает положительными");
        System.out.println(Arrays.toString(code.returnArrayOfModularDigits()));

        System.out.println("11. Стрим возвращает коллекцию чисел, чет умножает на 100, нечет- вычитает 100");
        System.out.println(Arrays.toString(code.returnArrayOfModifiedDigits()));

        System.out.println("12. Стрим возвращает коллекцию фамилий, которые начинаются с А");
        System.out.println(Arrays.toString(code.returnSurnamesThatStartWithA()));
    }
}

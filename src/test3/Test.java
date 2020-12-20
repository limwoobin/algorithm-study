package test3;

import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        String[] cardNumbers = {"-3285-3764-9934-2453" , "3285376499342453" , "3285-3764-99342453" , "328537649934245" , "3285376499342459" , "3285-3764-9934-2452"};
        int cardNumberIndex = 0;
        int[] result = new int[cardNumbers.length];


        for (String cardNumber : cardNumbers) {

            if (isAvailableCardNumberForm(cardNumber)) {
                cardNumber = cardNumber.replace("-" , "");
            } else {
                result[cardNumberIndex] = 0;
                cardNumberIndex++;
                continue;
            }

            List<Integer> list = stringToIntegerArray(cardNumber);
            result[cardNumberIndex] = cardNumberRegexCheck(list);
            cardNumberIndex++;
        }

        for (int i=0; i< result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static boolean isAvailableCardNumberForm(String cardNumber) {
        if (cardNumber.contains("-")) {
            int dashStrCount = 0;
            for (int i=0; i<cardNumber.length(); i++) {
                String number = String.valueOf(cardNumber.charAt(i));
                if ("-".equals(number)) {
                    dashStrCount++;

                    if (i >=4) {
                        for (int j=i-4; j<i; j++) {
                            String dashNumber = String.valueOf(cardNumber.charAt(j));
                            if ("-".equals(dashNumber)) {
                                return false;
                            }
                        }
                    }
                }
            }

            return dashStrCount == 3;
        } else {
            return cardNumber.length() == 16;
        }
    }

    private static int cardNumberRegexCheck(List<Integer> list) {
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i=0; i<list.size(); i++) {
            if (i % 2 == 0) {
                evenNumber += getEvenCardNumber(list.get(i));
            } else {
                oddNumber += list.get(i);
            }
        }

        return getAvailableCardNumber(oddNumber + evenNumber);
    }

    private static int getEvenCardNumber(int cardNumber) {
        int evenNumber = cardNumber * 2;

        if (evenNumber * 2 >= 10) {
            int tempNumber = 0;
            String evenNumberStr = String.valueOf(evenNumber);

            for (int i=0; i<evenNumberStr.length(); i++) {
                tempNumber += Integer.parseInt(String.valueOf(evenNumberStr.charAt(i)));
            }

            evenNumber = tempNumber;
        }

        return evenNumber;
    }

    private static int getAvailableCardNumber(int cardNumberCount) {
        int result = 0;

        if (cardNumberCount % 10 == 0) {
            result = 1;
        }

        return result;
    }

    private static List<Integer> stringToIntegerArray(String str) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<str.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        return list;
    }
}

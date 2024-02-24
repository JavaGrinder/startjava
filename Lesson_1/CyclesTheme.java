public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int initialValue = -10;
        System.out.print("В отрезке [" + initialValue + ",");
        int sumEven = 0;
        int sumOdd = 0;
        
        do {
            if (initialValue % 2 == 0) {
                sumEven += initialValue;
            } else { 
                sumOdd += initialValue;
            }
            initialValue++;
        } while (initialValue <= 21);
        System.out.println(initialValue + "] сумма четных чисел = " + sumEven + 
                " а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания\n");

        int a = 10;
        int b = 5;
        int c = -1;

        int max = a; 
        int min = b;

        if (a < b) {
            max = b;
            min = a;
        }
        if (max < c) {
            max = c;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("Максимальное число " + max + ", минимальное число " + min);
        
        for (int i = max - 1; i > min + 1; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num = 1234;
        int sumDigits = 0;
        
        while (num > 0) {
            int remainder = num % 10;
            sumDigits += remainder;
            System.out.print(remainder);
            num /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        int counter = 1;
        
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            if (counter % 5 == 0) {
                System.out.println();
            }
            counter++;
        }
        while ((counter - 1) % 5 != 0) {
            System.out.printf("%3d", 0);
            counter++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность\n");

        num = 3242592;
        int countTwos = 0;
        System.out.print("В " + num);
        
        while (num > 0) {
            int remainder = num % 10;
            num /= 10;
            
            if (remainder == 2) {
                countTwos++;
            }
        }
        
        if (countTwos % 2 == 0) {
            System.out.print(" четное количество двоек - ");
        } else {
            System.out.print(" нечетное количество двоек - ");
        } 
        System.out.println(countTwos);

        System.out.println("\n6. Отображение геометрических фигур\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int numLines = 5; 
        int numSymbols = 1;

        while (numLines >= 1) { 
            while (numSymbols <= numLines) { 
                System.out.print("#");
                numSymbols++;
            }
            System.out.println();
            numSymbols = 1;
            numLines--;
        }
        System.out.println();

        int counterLine = -2;

        while (counterLine <= 2) {
            int counterSymbol = 1;
            int triangleHeight = counterLine;
            if (counterLine < 0) {
                triangleHeight = - triangleHeight;
            }
            while (counterSymbol <= 3 - triangleHeight) {
                System.out.print("$");
                counterSymbol++;
            }
            System.out.println();
            counterLine++;
        }

        System.out.println("\n7. Отображение ASCII-символов\n");

        System.out.printf("%-11s%-13s%-15s%n","DECIMAL","CHARACTER","DESCRIPTION");
        
        for (int i = 15; i <= 122; i++) {
            String tab = "        ";
            
            if (i % 2 != 0) {
                if (i < 48) {
                    System.out.printf("%4s%12c%s%-1s%n", i, i, tab, Character.getName(i));
                } else if (i > 97) {
                    System.out.printf("%4s%12c%s%-1s%n", i, i, tab, Character.getName(i));
                }
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int num2 = 1234321;
        int reverseNum = 0;
        int remainder = 0;
        int originNum = num2;

        while (num2 % 10 > 0) {
            remainder = num2 % 10; 
            reverseNum = reverseNum * 10 + remainder;
            num2 /= 10;
        }

        if (reverseNum == originNum) {
            System.out.println("число " + originNum + " является палиндромом");
        } else {
            System.out.println("число " + originNum + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым\n");

        int num3 = 334172;
        int originalNum = num3;
        int firstDigits = num3 / 1000;
        int lastDigits = num3 % 1000;
        int sumFirst = 0;
        int sumLast = 0;
        
        while (num3 > 0) {
            int remainderFirst = firstDigits % 10;
            int remainderLast = lastDigits % 10;
            firstDigits /= 10;
            lastDigits /= 10;
            sumFirst += remainderFirst;
            sumLast += remainderLast;
            num3 /= 10; 
        }
        
        if (sumFirst == sumLast) {
            System.out.println("Число " + originalNum + " является счастливым");
        } else {
            System.out.println("Число " + originalNum + " не является счастливым");
        }
        
        System.out.println("Сумма цифр " + originalNum / 1000 + " = " + sumFirst + ", а сумма " + 
                originalNum % 1000 + " = " + sumLast);

        System.out.println("\n10. Отображение таблицы умножения Пифагора\n");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1) {
                    System.out.printf("%4d" +" |", i);
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            if (i == 1) {
                System.out.println("\n   ------------------------------------");
            } else {
                System.out.println();
            }
        }
    }
}
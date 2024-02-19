public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int min = -10;
        int sumEven = 0;
        int sumOdd = 0;
        
        do {
            if (min % 2 == 0) {
                sumEven += min;
            } else { 
                sumOdd += min;
            }
            min++;
        } while (min <= 21);
        System.out.println("Сумма четных равна " + sumEven + " сумма нечетных равна " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания\n");

        int a = 10;
        int b = 5;
        int c = -1;

        if (a > b) {
            if (b < c || b > c) {
                if (a > c) {
                    System.out.println("Максимальное число " + a + " , минимальное число " + c); 
                }
                else if (a < c) {
                    System.out.println("Максимальное число " + c + " , минимальное число " + b); 
                }
            }
        }
        else if (a < b) {
            if (b < c || b > c) {
                if (a < c) {
                    System.out.println("Максимальное число " + c + " , минимальное число " + a); 
                }
                else if (a > c) {
                    System.out.println("Максимальное число " + b + " , минимальное число " + c); 
                }
            }
        }
        for (int i = 9; i > -1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num = 1234;
        int sumDigits = num % 10;
        
        while (num > 0) {
            System.out.print(num % 10);
            num = num / 10;
            sumDigits += (num % 10); 
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        int counter = 1;
        
        for (int i = 1; i < 30; i += 2) {
            if (counter % 5 != 0) {
                System.out.printf("%3d", i);
            } else {
                System.out.printf("%3d", i);
                System.out.println();
            }
            counter++;
        }
        while ((counter - 1) % 5 != 0) {
        System.out.printf("%3d", 0);
        counter++;
        } 

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        int num1 = 3242592;
        System.out.print("В " + num1);
        int remainder;
        int twos = 0;
        
        while (num1 > 0) {
            remainder = num1 % 10;
            num1 = num1 / 10;
            
            if (remainder == 2) {
                twos += 1;
            }
        }
        if (twos % 2 == 0) {
             System.out.print(" четное количество двоек - ");
        } else {
            System.out.print(" нечетное количество двоек - ");
        } 
        System.out.println(twos);

        System.out.println("\n6. Отображение геометрических фигур\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int numLines = 6; 
        int numSymbols = 1;

        while (numLines > 1) { 
            while (numSymbols < numLines) { 
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
            int n = counterLine;
            if (counterLine < 0) {
            n = - n;
            }
             while (counterSymbol <= 3 - n) {
                System.out.print("$");
                counterSymbol++;
            }
        System.out.println();
        counterLine++;
        }

        System.out.println("\n7. Отображение ASCII-символов\n");

        System.out.printf("%-11s%-13s%-15s%n","DECIMAL","CHARACTER","DESCRIPTION");
        
        for (int i = 15; i <= 122; i++) {
            char symbol = (char) i;
            String tab = "        ";
            
            if (i % 2 != 0) {
                if (i < 48) {
                System.out.printf("%4s%12s%s%-1s%n", i, symbol, tab, Character.getName(i));
                } else if (i > 97) {
                System.out.printf("%4s%12s%s%-1s%n", i, symbol, tab, Character.getName(i));
                }
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int num2 = 1234321;
        int reverseNum = 0;
        int remainderNum = 0;
        int originNum = num2;

        while (num2 % 10 > 0) {
            remainderNum = num2 % 10; 
            reverseNum = reverseNum * 10 + remainderNum;
            num2 = num2 / 10;
        }

        if (reverseNum == originNum) {
            System.out.println("число " + originNum + " является палиндромом");
        } else {
            System.out.println("число " + originNum + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым\n");

        int num3 = 324072;
        System.out.print("Число " + num3);
        int firstDigits = num3 / 1000;
        int remainderFirst;
        int sumFirst = 0;
        
        while (firstDigits > 0) {
            remainderFirst = firstDigits % 10;
            firstDigits = firstDigits / 10;
            sumFirst += remainderFirst;
        }
        
        int lastDigits = num3 % 1000;
        int remainderLast;
        int sumLast = 0;
        
        while (lastDigits > 0) {
            remainderLast = lastDigits % 10;
            lastDigits = lastDigits / 10;
            sumLast += remainderLast;
        }
        
        if (sumFirst == sumLast) {
            System.out.println(" является счастливым");
        } else {
            System.out.println(" не является счастливым");
        }
        
        System.out.println("Сумма цифр " + num3 / 1000 + " = " + sumFirst + ", а сумма " + 
            num3 % 1000 + " = " + sumLast);


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
                System.out.print("\n   ------------------------------------\n");
            } else {
                System.out.print("\n");
            }
        }
    }
}
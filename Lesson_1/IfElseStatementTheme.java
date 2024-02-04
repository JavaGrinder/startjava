public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("пол мужской");
        } else {
            System.out.println("пол женский");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("несовершеннолетний");
        }

        float height = 1.5f;
        if (height < 1.8) {
            System.out.println("рост невысокий");
        } else {
            System.out.println("рост высокий");
        }

        if ("Mihail".charAt(0) == 'M') {
            System.out.println("Имя начинается с буквы \"M\"");
        } else if ("Mihail".charAt(0) == 'I') {
            System.out.println("Имя начинается с буквы \"I\"");
        } else {
            System.out.println("Имя не удовлетворяет условиям");
        }


        System.out.println("\n2. Поиск большего числа\n");

        int a = 2;
        int b = 3;

        if (a < b) {
            System.out.println("Число " + a + " меньше " + b);
        } else if (a > b) {
            System.out.println("Число " + a + " больше " + b);
        } else {
            System.out.println("Число " + a + " равно " + b);
        }

        System.out.println("\n3. Проверка числа\n");

        int c = -4;
        System.out.print("Число " + c);
      
        if (c != 0) {
            if (c % 2 == 0) {
                System.out.print(" чётное");
            } else {
                System.out.print(" нечетное");
            }
            if (c > 0) {
                System.out.print(" и положительное\n");
            } else {
                System.out.print(" и отрицательное\n");
            }
        } else {
            System.out.println(" равно нулю");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int num1 = 123;
        int num2 = 426;

        System.out.println("Исходные числа " + num1 + " и " + num2);

        int ones1 = num1 % 100;
        int ones2 = num2 % 100;
        int tens1 = ones1 / 10;
        int tens2 = ones2 / 10;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        
        if (ones1 == ones2 || tens1 == tens2 || hundreds1 == hundreds2) {
            if (hundreds1 == hundreds2) {
                System.out.println("цифра " + hundreds1 + " совпадает в сотнях");
            }
            if (tens1 == tens2) {
                System.out.println("цифра " + tens1 + " совпадает в десятках");
            } 
            if (ones1 == ones2) {
                System.out.println("цифра " + ones1 + " совпадает в единицах");
            }
        } else {
            System.out.println("цифры в разрядах чисел разные");
        }

        System.out.println("\n5. Определение символа по его коду\n");

        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");

        double deposit = 301_000;
        double percent = 0.1;
        
        if (deposit >= 100_000 && deposit < 300_000) {
            percent = 0.07;
        } else if (deposit < 100_000) { 
            percent = 0.05;
        }

        System.out.println("Сумма вклада " + deposit + " руб.");
        System.out.println("Сумма начисленного % " + (deposit * percent) + " руб.");
        System.out.println("Итоговая сумма с % " + (deposit + deposit * percent) + " руб.");

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyGrade = 59;
        int historyScore = 2;
        
        if (historyGrade > 91) {
            historyScore = 5;
        } else if (historyGrade > 73) {
            historyScore = 4;
        } else if (historyGrade > 60) {
            historyScore = 3;
        }
        
        int programmingGrade = 92;
        int programmingScore = 2;

        if (programmingGrade > 91) {
            programmingScore = 5;
        } else if (programmingGrade > 73) {
            programmingScore = 4;
        } else if (programmingGrade > 60) {
            programmingScore = 3;
        }
        System.out.println( "История " + historyScore + " Программирование " + programmingScore);
        System.out.println("Средний % по предметам " + (historyGrade + programmingGrade) / 2f);
        System.out.println("Средний балл по предметам " + (historyScore + programmingScore) / 2f);

        System.out.println("\n8. Расчёт годовой прибыли\n");

        int salesPerMonth = 13000;
        int rentals = 5000;
        int costPrice = 9000;
        int annualProfit = (salesPerMonth - rentals - costPrice) * 12;

        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}
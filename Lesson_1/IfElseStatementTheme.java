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

        String name = "Mihail";
        if (name.charAt(0) == 'M') {
            System.out.println("Имя начинается с буквы \"M\"");
        } else if (name.charAt(0) == 'I') {
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

        if ((num1 / 100) == (num2 / 100) || ((num1 % 100) / 10 ) == ((num2 % 100) / 10) ||
                (num1 % 10) == (num2 % 10)) {
            if ((num1 / 100) == (num2 / 100)) {
                System.out.println("цифра " + num1 / 100 + " совпадает в сотнях");
            }
            if (((num1 % 100) / 10 ) == ((num2 % 100) / 10)) {
                System.out.println("цифра " + ((num1 % 100) / 10 ) + " совпадает в десятках");
            } 
            if ((num1 % 10 ) == (num2 % 10)) {
                System.out.println("цифра " + (num1 % 10) + " совпадает в единицах");
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
        double sumPercent = 30_100;
        
        if (deposit < 300_000 && deposit >= 100_000) {
            sumPercent = deposit * 0.07;
        } else if (deposit < 100_000) { 
            sumPercent = deposit * 0.05;
        }

        System.out.println("Сумма вклада " + deposit + " руб.");
        System.out.println("Сумма начисленного % " + sumPercent + " руб.");
        System.out.println("Итоговая сумма с % " + (deposit + sumPercent) + " руб.");

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyGrade = 59;
        int programmingGrade = 92;
        int historyScore = 2;
        int programmingScore = 2;
        
        if (historyGrade > 91) {
            historyScore = 5;
        } else if (historyGrade > 73) {
            historyScore = 4;
        } else if (historyGrade > 60) {
            historyScore = 3;
        }
        
        if (programmingGrade > 91) {
            programmingScore = 5;
        } else if (programmingGrade > 73) {
            programmingScore = 4;
        } else if (programmingGrade > 60) {
            programmingScore = 3;
        }
        System.out.println( "История " + historyScore + " Программирование " + programmingScore);
        System.out.println("Средний % по предметам " + (((double) historyGrade) +
            ((double) programmingGrade)) / 2);
        System.out.println("Средний балл по предметам " + (((double) historyScore) + 
            ((double) programmingScore)) / 2);

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
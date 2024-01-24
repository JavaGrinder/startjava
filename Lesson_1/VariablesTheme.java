public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        byte cpuBitness = 64;
        short numCpuCores = 4;
        int ramCapacity = 32;
        long ssdSpace = 128;
        float cpuFreq = 3.8F;
        double monitorSize = 21.5;
        char genDdr = '3';
        boolean isWinOs = true;

        System.out.println("разрядность процессора х" + cpuBitness);
        System.out.println("количество ядер процессора " + numCpuCores);
        System.out.println("объем оперативной памяти " + ramCapacity + "GB");
        System.out.println("емкость твердотельного диска " + ssdSpace + "GB");
        System.out.println("частота процессора " + cpuFreq + "GHz");
        System.out.println("размер монитора " + monitorSize + " дюйма");
        System.out.println("поколение оперативной памяти " + genDdr);
        System.out.println("установлена операционная система Windows? " + isWinOs);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int pricePen = 100;
        int priceBook = 200;
        int totalPrice = pricePen + priceBook;
        float discount = totalPrice * 0.11f;
        float discountPrice = totalPrice - discount;

        System.out.println("общая стоимость товаров без скидки = " + totalPrice + " руб.");
        System.out.println("скидка = " + discount + " руб.");
        System.out.println("общая стоимость товаров со скидкой = " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte minByte = -128;
        System.out.println("минимальное значение Byte: " + minByte);
        minByte++;
        System.out.println("значение после инкремента: " + minByte);
        minByte--;
        System.out.println("значение после декремента: " + minByte + '\n');

        byte maxByte = 127;
        System.out.println("максимальное значение Byte: " + maxByte);
        maxByte--;
        System.out.println("значение после декремента: " + maxByte);
        maxByte++;
        System.out.println("значение после инкремента: " + maxByte + '\n');

        short minShort = -32768;
        System.out.println("минимальное значение Short: " + minShort);
        minShort++;
        System.out.println("значение после инкремента "+ minShort);
        minShort--;
        System.out.println("значение после декремента "+ minShort + '\n');

        short maxShort = 32767;
        System.out.println("максимальное значение Short: " + maxShort);
        maxShort--;
        System.out.println("значение после декремента "+ maxShort);
        maxShort++;
        System.out.println("значение после инкремента "+ maxShort + '\n');

        int minInt = Integer.MIN_VALUE;
        System.out.println("минимальное значение Int: " + minInt);
        minInt++;
        System.out.println("значение после инкремента "+ minInt);
        minInt--;
        System.out.println("значение после декремента "+ minInt + '\n');

        int maxInt = Integer.MAX_VALUE;
        System.out.println("максимальное значение Int: " + maxInt);
        maxInt--;
        System.out.println("значение после декремента "+ maxInt);
        maxInt++;
        System.out.println("значение после инкремента "+ maxInt + '\n');

        long minLong = -9_223_372_036_854_775_808L;
        System.out.println("минимальное значение Long: " + minLong);
        maxInt++;
        System.out.println("значение после инкремента "+ maxInt);
        maxInt--;
        System.out.println("значение после декремента "+ maxInt + '\n');

        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("максимальное значение Long: " + maxLong);
        maxLong--;
        System.out.println("значение после декремента "+ maxLong);
        maxLong++;
        System.out.println("значение после инкремента "+ maxLong);

        System.out.println("\n5. Перестановка значений переменных\n");

        System.out.println("Перестановка с помощью третьей переменной\n");
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        int c = b;
        b = a;
        a = c;
        System.out.println("Новые значения a = " + a + ", b = " + b + '\n');

        System.out.println("Перестановка с помощью арифметических операций\n");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        System.out.println("Новые значения a= " + (a - (a - b)) + ", b= " + (b + (a - b)) + '\n');

        System.out.println("Перестановка с помощью побитовой операции\n");
        System.out.println("Исходные значения: a= " + a + ", b = " + b);
        System.out.print("Новые значения: a = ");
        System.out.print((a^a)^b);
        System.out.print(", b = ");
        System.out.print((b^b)^a);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asterisk + " " + asterisk);
        System.out.println((int) atSign + " " + atSign);
        System.out.println((int) verticalBar + " " + verticalBar);
        System.out.println((int) tilde + " " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash + '\n' + 
                "   " + slash + "  " + backslash + '\n' + 
                "  " + slash + underscore + leftParenthesis + " " + rightParenthesis + 
                backslash + '\n' + 
                " " + slash + "      " + backslash + '\n' + 
                slash + underscore + underscore + underscore + underscore + slash + backslash + 
                underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
                           
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = (num % 100) % 10;
        int sumDigits = hundreds + tens + ones;
        int productDigits = hundreds * tens * ones;
        System.out.println("Число " + num + " содержит:\n" + 
                "сотен - " + hundreds + '\n' + 
                "десятков - " + tens + '\n' + 
                "единиц - " + ones + '\n' + 
                "Сумма цифр = " + sumDigits + '\n' + 
                "Произведение цифр = " + productDigits); 
                           
        System.out.println("\n9. Вывод времени\n");
                           
        int time = 86399;
        int hh = time / 3600;
        int mm = (time % 3600) / 60;
        int ss = mm % 60;
        
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
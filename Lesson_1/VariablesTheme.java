public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера" + '\n');

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

        System.out.println('\n' + "2. Расчет стоимости товара со скидкой" + '\n');

        int pricePen = 100;
        int priceBook = 200;
        int totalPrice = pricePen + priceBook;
        float discount = totalPrice * 0.11f;
        float discountPrice = totalPrice - discount;

        System.out.println("общая стоимость товаров без скидки = " + totalPrice + " руб.");
        System.out.println("скидка = " + discount + " руб.");
        System.out.println("общая стоимость товаров со скидкой = " + discountPrice + " руб.");

        System.out.println('\n' + "3. Вывод слова JAVA" + '\n');

        System.out.println("   J    a  v     v  a     " + '\n' +
                "   J   a a  v   v  a a    " + '\n' +
                "J  J  aaaaa  V V  aaaaa   " + '\n' +
                " JJ  a     a  V  a     a");

        System.out.println('\n' + "4. Вывод min и max значений целых числовых типов" + '\n');

        byte minByte = -128;
        System.out.println("минимальное значение Byte: " + minByte);
        minByte++;
        System.out.println("значение после инкрементирования: " + minByte);
        byte maxByte = 127;
        System.out.println("максимальное значение Byte: " + maxByte);
        maxByte--;
        System.out.println("значение после декрементирования: " + maxByte + '\n');

        short minShort = -32768;
        System.out.println("минимальное значение Short: " + minShort);
        minShort++;
        System.out.println("значение после инкрементирования "+ minShort);
        short maxShort = 32767;
        System.out.println("максимальное значение Short: " + maxShort);
        maxShort--;
        System.out.println("значение после декрементирования "+ maxShort + '\n');

        int minInt = Integer.MIN_VALUE;
        System.out.println("минимальное значение Int: " + minInt);
        minInt++;
        System.out.println("значение после инкрементирования "+ minInt);
        int maxInt = Integer.MAX_VALUE;
        System.out.println("максимальное значение Int: " + maxInt);
        maxInt--;
        System.out.println("значение после декрементирования "+ maxInt + '\n');

        long minLong = -9_223_372_036_854_775_808L;
        System.out.println("минимальное значение Long: " + minLong);
        minLong++;
        System.out.println("значение после инкрементирования "+ minLong);
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("максимальное значение Long: " + maxLong);
        maxLong--;
        System.out.println("значение после декрементирования "+ maxLong);

        System.out.println('\n' + "5. Перестановка значений переменных" + '\n');

        System.out.println("Перестановка с помощью третьей переменной" + '\n');
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения: a=" + a + ", b=" + b);
        int c = b;
        b = a;
        a = c;
        System.out.println("Новые значения a=" + a + ", b=" + b + '\n');

        System.out.println("Перестановка с помощью арифметических операций" + '\n');
        System.out.println("Исходные значения: a=" + a + ", b=" + b);
        int difference = a - b;
        a -= difference;
        b += difference;
        System.out.println("Новые значения a=" + a + ", b=" + b + '\n');

        System.out.println("Перестановка с помощью побитовой операции" + '\n');
        System.out.println("Исходные значения: a=" + a + ", b=" + b);
        System.out.print("Новые значения: a=");
        System.out.print(a^(b+a));
        System.out.print(", b=");
        System.out.print(b^(b+a));

        System.out.println('\n' + "6. Вывод символов и их кодов" + '\n');

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println("36 " + dollar);
        System.out.println("42 " + asterisk);
        System.out.println("64 " + atSign);
        System.out.println("124 " + verticalBar);
        System.out.println("126 " + tilde);

        System.out.println('\n' + "7. Вывод в консоль ASCII-арт Дюка" + '\n');

        char d = '/';
        char e = '\\';
        char f = '_';
        char g = '(';
        char h = ')';

        System.out.println("    " + d + "" + e + "    " + '\n' +  
                "   " + d + "  " + e + "   " + '\n' +
                "  " + d + "" + f + "" + g + " " + h + "" + e + '\n' +
                " " + d + "      " + e + '\n' + 
                d + "" + f + "" + f + "" + f + "" + f + "" + d + 
                "" + e + "" + f + "" + f  + "" + e);
                           
        System.out.println('\n' + "8. Вывод количества сотен, десятков и единиц числа" + '\n');
                           
        int x = 123;
        int hundreds = x/100;
        int remainder = x%100;
        int tens = remainder/10;
        int units = remainder%10;
        int sumDigits = hundreds + tens + units;
        int productDigits = hundreds * tens * units;
        System.out.println("Число " + x + " содержит:" + '\n' + 
                "сотен - " + hundreds + '\n' + 
                "десятков - " + tens + '\n' + 
                "единиц - " + units + '\n' + 
                "Суммма цифр = " + sumDigits + '\n' + 
                "Произведение цифр = " + productDigits); 
                           
        System.out.println('\n' + "9. Вывод времени" + '\n');
                           
        int t = 86399;
        int hr = t/3600;
        int remainderMin = t%3600;
        int min = remainderMin/60;
        int sec = remainderMin%60;
        
        System.out.println(hr + ":" + min + ":" + sec);
    }
}
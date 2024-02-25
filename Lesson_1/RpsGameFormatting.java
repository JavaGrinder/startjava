import java.util.Random;

public class RpsGameFormatting {
    // Игра Камень-Ножницы-Бумага
    public static void main(String[] args) throws InterruptedException {
        String rock = "✊";
        String scissors = "✌\uFE0F";
        String paper = "✋";

        // Ход первого игрока
        String name1 = "HEL";
        String sign1 = rock;
        System.out.println("Ход "+ name1 + ": ");

        Random r = new Random();
        int position1 = r.nextInt(100);
            if (position1 > 66) {
                sign1 = paper;
            } else if (position1 > 33) {
                sign1 = scissors;
            }
        System.out.print(sign1);

        // Ход второго игрока
        String name2 = "WALLE";
        String sign2 = rock;
        System.out.println("\nХод "+ name2 + ": ");

        int position2 = r.nextInt(100);
            if (position2 > 66) {
                sign2 = paper;
            } else if (position2 > 33) {
                sign2 = scissors;
            }
        System.out.print(sign2);

        if (sign1.equals(sign2)) {
            System.out.println("\nПобедила дружба!");
            return;
        }

        boolean isName1Equal = sign1.equals(rock) && sign2.equals(scissors) ||
                sign1.equals(scissors) && sign2.equals(paper) ||
                sign1.equals(paper) && sign2.equals(rock);

        if (isName1Equal) {
            System.out.println("\nПобедил - " + name1);
        } else {
            System.out.println("\nПобедил - " + name2);
        }
    }
}
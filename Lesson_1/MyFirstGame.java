public class MyFirstGame {
    
    public static void main(String[] args) {
        int numComputer = 1;
        int numPlayer = 8;

        while (numPlayer != numComputer) {
            if (numPlayer > numComputer && numPlayer <= 100) {
                System.out.println("Число " + numPlayer + " больше того, что загадал компьютер");
                numPlayer--;
            } else if (numPlayer < numComputer && numPlayer > 0) {
                System.out.println("Число " + numPlayer + " меньше того, что загадал компьютер");
                numPlayer++;
            }
        }
        System.out.println("Вы выиграли");
    }
}
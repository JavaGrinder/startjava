public class MyFirstGame {
    
    public static void main(String[] args) {
        
        int numOfComputer = 1;
        int numOfGamer = 8;
        
        if (numOfGamer > numOfComputer) {
            while (numOfGamer > numOfComputer && numOfGamer > 0) {
                System.out.println("Число " + numOfGamer + " больше того, что загадал компьютер");
                numOfGamer--;
            }
        } else if (numOfGamer < numOfComputer) {
            while (numOfGamer < numOfComputer && numOfGamer <= 100) {
                System.out.println("Число " + numOfGamer + " меньше того, что загадал компьютер");
                numOfGamer++;
            }
        }
        if (numOfGamer == numOfComputer) {
        System.out.println("Вы выиграли");
        }
    }
}
package code.diff.conditionals;

public class Fix {

    public static void main(String[] args) {

        // Problem 1
        System.out.println(3 >= 2);

        // Problem 2
        System.out.println(25 == 25);

        // Problem 3
        int speed = 10;

        if (speed > 0) {
            System.out.println("vehicle is moving forward");
        } else if (speed< 0) {
            System.out.println("vehicle is moving in reverse");
        } else{
            System.out.println("vehicle is in park");
        }

        //Problem 4
        double lastMarketPrice = 23.98;
        double currentMarketPrice = 24.15;

        double diff = currentMarketPrice - lastMarketPrice;

        if (diff > 0) {
            System.out.println("Price has increased");
        } else if(diff < 0) {
            System.out.println("Price has decreased");
        } else{
            System.out.println("Price has stayed the same");
        }

        // Problem 5
        int budget = 250;
        int currentTotal = 0;

        currentTotal += 75;
        currentTotal += 50;
        currentTotal += 82;

        if (currentTotal <= budget) {
            System.out.println("Still within budget");
        }
        else {
            System.out.println("Over budget");
        }

        //Problem 6
        int numberOfPackages = 45;
        int packagesPerDriver = 20;

        if (numberOfPackages / packagesPerDriver > 1){
            System.out.println("we need more drivers");
        }

        // Problem 7
        double trackLength = 5.36;
        double playTime = 2.45;

        if (trackLength - playTime > 0) {
            System.out.println(trackLength - playTime + " still remaining");
        } else if (trackLength - playTime == 0) {
            System.out.println("Replay Song?");
        }

        // Problem 8
        int stockQuantity = 100;
        int purchaseOrderQty = 50;

        if (purchaseOrderQty <= stockQuantity){
            stockQuantity -= purchaseOrderQty;
        System.out.println("Order Complete");}
        else {
            System.out.println("Order Exceeds availability. Try a lesser quantity");
        }
        System.out.println(stockQuantity +" items remaining");

        // Problem 9
        boolean powerUp = true;
        int bonusPoints = 10000;
        int totalPoints = 0;

        if (powerUp && bonusPoints >= 10000) {
            totalPoints += bonusPoints * 3;
        }
        if (powerUp && bonusPoints >= 1000) {
            totalPoints += bonusPoints * 2;
        }
        if (powerUp) {
            totalPoints += bonusPoints * 1.5;
        } else {
            totalPoints += bonusPoints;
        }

        System.out.println(totalPoints);

        // Problem 10
        int number = 411;

        if (number == 911 || number == 511) {
            System.out.println("This is a special number");
        } else {
            System.out.println("This is not special");
        }

    }

}

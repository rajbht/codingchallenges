import java.util.*;

public class BottleCaps {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int money, beerCost, bottleCaps;

        for (int i=0; i<t; i++) {
            money = sc.nextInt();
            beerCost = sc.nextInt();
            bottleCaps = sc.nextInt();

            int beerFromMoney = money / beerCost;

            int totalBeers = beerFromMoney + beerFromCaps(beerFromMoney, bottleCaps);

            System.out.println(totalBeers);

        }
    }

    public static int beerFromCaps(int capsFromMoney, int bottleCapsToTrade) {
        if (capsFromMoney >= bottleCapsToTrade) {
            int moreBeer = capsFromMoney / bottleCapsToTrade;
            int newBeerCaps = capsFromMoney % bottleCapsToTrade;
            return moreBeer + beerFromCaps(newBeerCaps, bottleCapsToTrade);
        }
        else {
            return 0;
        }



    }
}

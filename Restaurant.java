package cricket.app;

import org.junit.jupiter.api.Test;

public class Restaurant {


    /*print total bill amount based on the below conditions

    cost of items
    idly = $3
    puri = $5
    biriyani = $15

    offer
    1 puri is free with 1 biriyani
    1 idly is free for 1 puri

     Note: We do not give any offer on free items. which means, if you get puri for free because of biriyani then you won't get
     idly for free.

     Eg: for 1 idly, 1 puri and 1 biriyani, bill will be
     $18 - because puri is free for biriyani and you pay for biriyani and idly
     $20 - becase idly is free for puri and you pay for biriyani and puri
     */

    @Test
    public void processBill() {
        calculateBill(1, 1, 1);
    }

    public void calculateBill(int idlyCount, int puriCount, int biriyaniCount) {
        int idlycost = 3;
        int puricost = 5;
        int biriyanicost = 15;

        int freepuri = biriyaniCount;
        int freeidly = puriCount;
        int puriformoneyCount = puriCount - freepuri;
        if (puriformoneyCount > 0) {
            puriformoneyCount = 0;

        }


        int total = idlycost * idlyCount + puricost * puriformoneyCount + biriyanicost * biriyaniCount;
        System.out.println("total cost of orders:" + total);


    }

    @Test
    public void bill() {
        calbill(1, 1, 1);
    }

    public void calbill(int idlyCount, int puriCount, int biriyaniCount) {
        int idlycost = 3;
        int puricost = 5;
        int biriyanicost = 15;
        int freeidly = puriCount / 5;
        int freepuri = idlyCount / 2;
        int idlyformoney = idlyCount - freeidly;
        if (idlyformoney > 0) {
            idlyformoney = 0;
        }
        int total = idlycost * idlyformoney + puricost * puriCount + biriyanicost * biriyaniCount;
        System.out.println("total cost of orders:" + total);


    }

    @Test
    public void bill1() {
        bill2(64, 30, 20);

    }

    public void bill2(int idlyCount, int puriCount, int biriyaniCount) {
        int idlyCost = 20 / 10;
        int puriCost = 10;
        int biriyaniCost = 15;

        if (puriCount <= biriyaniCount) {
            System.out.println("Free puri Count=" + puriCount);
            System.out.println("paid puri Count= 0");
        } else {
            System.out.println("Free puri Count= " + biriyaniCount);
            int paid_puri = puriCount - biriyaniCount;
            System.out.println("paid puri Count= " + paid_puri);
        }

        if (idlyCount <= puriCount) {
            System.out.println("paid idly Count = 0");
            System.out.println("Free idly Count = " + idlyCount);
        } else {
            int paid_puri = puriCount - biriyaniCount;
            int paid_idly = idlyCount - paid_puri;
            System.out.println("paid idly Count= " + paid_idly);
            System.out.println("Free idly Count=" + paid_puri);
        }

        int total_price = biriyaniCount * biriyaniCost + (puriCount - biriyaniCount) * puriCost + (idlyCount - (puriCount - biriyaniCount)) * idlyCost;
        System.out.println("Total bill = " + total_price);

    }
}


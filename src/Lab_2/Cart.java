package Lab_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private float totalcost = 0;
    private int qtyOrdered = 0;
    ArrayList<DigitalVideoDisc> itemsOderList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);

    private DigitalVideoDisc itemlist[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];


    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered >= 0 && qtyOrdered < 20) {                  
            itemlist[qtyOrdered] = disc;
            qtyOrdered++;
            totalcost = 0;
            System.out.println("San pham " + disc.getTitle() + " da duoc them vao");
        }
        else {
            System.out.println("Gio hang da day");                 
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    	for(int i=0;i < dvdList.length; i++) {
    		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
    			itemsOderList.add(dvdList[i]);
    			System.out.println("San pham " + dvdList[i].getTitle() + " da duoc them vao");
    		}
    		
    		else System.out.println("Gio hang da day");
    	}
    }

    
    public void addDigitalVideoDisc() {
    	
    }
    public float totalCost() {
        for (int i = 0; i < qtyOrdered; i++) {
            totalcost = totalcost + itemlist[i].getCost();
        }
        return totalcost;
    }

    public void hienthi() {
        System.out.println("Gio hang co " + qtyOrdered + " san pham");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemlist[i].getTitle());
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i;
        if(qtyOrdered == 0 ) {
            System.out.println("Gio hang chua co gi , khong the xoa");
        }
        else {
            for (int c = i = 0; i < qtyOrdered; i++) {
                if (!itemlist[i].equals(disc)) {
                    itemlist[c] = itemlist[i];
                    c++;
                }
            }
            System.out.println("San pham " + disc.getTitle() + " da duoc xoa");
            qtyOrdered--;
            totalcost = 0;
        }

    }

    public void remove(String name) {
        int check = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (name.equals(itemlist[i].getTitle())) {
                removeDigitalVideoDisc(itemlist[i]);
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay");            
        }
    }
}
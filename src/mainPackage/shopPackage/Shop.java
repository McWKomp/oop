package mainPackage.shopPackage;

public class Shop {
    private String[][] goods = new String[3][];
    private int size = 0;

    public void add(String[] good) {
        if (goods.length == size) {
            String[][] tmp = new String[size * 2][];
            for (int i = 0; i < size; i++) {
                tmp[i] = goods[i];
            }
            goods = tmp;
        }
        goods[size] = good;
        size++;
    }

    public void remove(int index) {
        if (index <= size) {
            for (int i = 0; i < size; i++) {
                if (i >= index) {
                    goods[i] = goods[i + 1];
                }
            }
            System.out.println("Good with index " + index + " has been removed");
            --size;
            print();
        } else {
            System.out.println("There is no index " + index + " in our assortment");
        }

    }

    public void print() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" * ");
        }
        System.out.println("Our goods assortment:");
        for (int i = 0; i < size; i++) {
            System.out.print(" - ");
            System.out.println(goods[i][0]);
        }
    }

    public void find(String looked) {
        if (looked.length() >= 3) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < goods[i].length; j++) {
                    if (goods[i][j].toLowerCase().contains(looked.toLowerCase())) {
                        System.out.println("Good " + '"' + goods[i][0] + '"' + " by " + goods[i][1] + " has been found by search " + '"' + looked + '"');
                    }
                }
            }
        } else {
            System.out.println("Type 3 symbols at least");
        }


    }

    public void priceRange(int start, int end) {
        if (start < end) {
            int i;
            for (i = 0; i < size; i++) {
                if (Integer.parseInt(goods[i][2]) >= start && Integer.parseInt(goods[i][2]) <= end) {
                    System.out.println("Good " + '"' + this.goods[i][0] + '"' + " by " + this.goods[i][1] + " has been found in range from " + start + " to " + end + " with price of " + Integer.parseInt(goods[i][2]) + " USD");
                }
            }
        } else {
            System.out.println("Start can't be bigger than end");
        }

    }
}

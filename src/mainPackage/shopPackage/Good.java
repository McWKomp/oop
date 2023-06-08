package mainPackage.shopPackage;

public class Good {

    public String[] getGood() {
        return good;
    }

    private String name;

    private String developer;

    private String price;

    private String characteristics;

    private String[] good;

    Good(String name, String developer, String price, String characteristics) {
        this.name = name;
        this.developer = developer;
        this.price = price;
        this.characteristics = characteristics;
        this.good = new String[]{name, developer, price, characteristics};
    }
}

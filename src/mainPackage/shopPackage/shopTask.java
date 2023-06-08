package mainPackage.shopPackage;

public class shopTask {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Good good1 = new Good("RTX 4080", "Nvidia", "1500", "powerful");
        Good good2 = new Good("Xiaomi 12T", "Xiaomi", "500", "powerful, good camera");
        Good good3 = new Good("Legion", "Lenovo", "1000", "powerful, good graphics card");
        Good good4 = new Good("Intel i7 10700", "Intel", "240", "mid power, long lifetime");
        Good good5 = new Good("MSI Optix", "MSI", "110", "big screen, curved monitor");

        shop.add(good1.getGood());
        shop.add(good2.getGood());
        shop.add(good3.getGood());
        shop.add(good4.getGood());
        shop.add(good5.getGood());

        shop.print();
        shop.remove(2);

        shop.find("4080");
        shop.find("big scReen");
        shop.find("mId poweR");
        shop.find("er");
        shop.find("XiAoMi");

        shop.priceRange(199, 1499);
    }
}



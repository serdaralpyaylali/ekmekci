import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Egg egg = new Egg();
        Coal coal = new Coal();


        Scanner scanner = new Scanner(System.in);
        System.out.print("*-*-*-*Ekmekçi'ye hoşgeldiniz*-*-*-*" +
                "\n1-Ürün stok" +
                "\n2-Hizmet satış" +
                "\n3-Müşteri hesap  sayfası" +
                "\n4-İşletme Defteri" +
                "\n5-Çıkış" +
                "\nLütfen bir sayfa seçin: ");
        int service;
        do {
            service = scanner.nextInt();
            System.out.println("Yönlendiriliyor...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (service) {
                case 1:
                    page1(bread, egg, coal);
                    break;
                case 2:
                    page2();
                    break;
                case 3:
                    page3();
                    break;
                case 4:
                    page4();
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
            }
        }
        while (service != 5);
    }

    private static void page1(Bread bread, Egg egg, Coal coal) {

        System.out.println("Ürün stok sayfasına hoşgeldiniz." +
                "\nYapmak istedğiniz işlemi seçiniz:  " +
                "\n1 - Tüm ürünler için stok ve fiyat bilgisini göster" +
                "\n2 - Stok bilgisini güncelle" +
                "\n3 - Fiyat bilgisini güncelle\n"
        );
        Scanner scanner = new Scanner(System.in);
        int selectOperation = scanner.nextInt();
        System.out.println("Hesaplanıyor...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        switch (selectOperation) {
            case 1:
                System.out.println("Ekmek stok miktarı: " + bread.getStock() + " Ekmek fiyatı: " + bread.getPrice() +
                        "\nYumurta stok miktarı: " + egg.getStock() + " Yumurta fiyatı: " + egg.getPrice() +
                        "\nKömür stok miktarı: " + coal.getStock() + " Kömür fiyatı: " + coal.getPrice());
                break;
            case 2:
                System.out.println("Lütfen stok bilgisi güncellenecek ürünü seçin: " +
                        "\n1-Ekmek \n2-Yumurta \n3-Kömür");
                int selectOperation2 = scanner.nextInt();
                System.out.println("Lütfen yeni değeri girin");
                int newStockValue = scanner.nextInt();
                switch (selectOperation2) {
                    case 1:
                        bread.setStock(newStockValue);
                        System.out.println("Stok değeri: " + bread.getStock());
                        break;
                    case 2:
                        egg.setStock(newStockValue);
                        System.out.println("Stok değeri: " + egg.getStock());
                        break;
                    case 3:
                        coal.setStock(newStockValue);
                        System.out.println("Stok değeri: " + coal.getStock());
                        break;
                }
                break;
            case 3:
                System.out.println("Lütfen fiyat bilgisi güncellenecek ürünü seçin: " +
                        "\n1-Ekmek \n2-Yumurta \n3-Kömür");
                int selectOperation3 = scanner.nextInt();
                System.out.println("Lütfen yeni değeri girin");
                int newPriceValue = scanner.nextInt();
                switch (selectOperation3) {
                    case 1:
                        bread.setPrice(newPriceValue);
                        System.out.println("Fiyat değeri: " + bread.getPrice());
                        break;
                    case 2:
                        egg.setPrice(newPriceValue);
                        System.out.println("Fiyat değeri: " + egg.getPrice());
                        break;
                    case 3:
                        coal.setPrice(newPriceValue);
                        System.out.println("Fiyat değeri: " + coal.getPrice());
                        break;
                }
                break;
        }
    }

    private static void page2() {
        System.out.println("Hizmet satış sayfasına hoşgeldiniz.");
        Scanner scanner = new Scanner(System.in);
        List<String> customerList = new ArrayList<>();
        System.out.print("Müşteri oluşturmak için 1, varolan kullanıcı için 2 girin: ");
        int customerSelect = scanner.nextInt();
        switch (customerSelect) {
            case 1:
                System.out.print("Lütfen müşteri adı giriniz: ");
                Scanner scanner2 = new Scanner(System.in);
                String customerName = scanner2.nextLine();
                Customer customer1 = new Customer(customerName);
                customer1.name = customerName;
                customerList.add(customerName);
                break;
            case 2:
                for (String customers : customerList) {
                    System.out.println(customers);
                }
                break;
        }
    }

    private static void page3() {
        System.out.println("Müşteri hesap  sayfasına hoşgeldiniz.");
    }

    private static void page4() {
        System.out.println("İşletme Defteri sayfasına hoşgeldiniz.");
    }
}

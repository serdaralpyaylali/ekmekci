import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a page : ");
        int service = scanner.nextInt();
        while (service !=5) {
            switch (service) {
                case 1:
                    page1();
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
    }
    private static void page1() {
        Bread bread = new Bread();
        Egg egg = new Egg();
        Coal coal = new Coal();
        System.out.println("Ürün stok sayfasına hoşgeldiniz.");
        System.out.print("Yapmak istedğiniz işlemi seçiniz : " +
                "\n1 - Tüm ürünler için stok ve fiyat bilgisini göster" +
                "\n2 - Stok bilgisini güncelle" +
                "\n3 - Fiyat bilgisini güncelle\n"
                );
        Scanner scanner = new Scanner(System.in);
        int selectOperation = scanner.nextInt();
        switch (selectOperation) {
            case 1:
                System.out.println("Stoktaki ekmek miktarı: " + bread.getStock()+
                        "\nEkmek fiyatı: "+ bread.getPrice());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                break;
            case 3:
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
        // Sayfa 1'e özgü işlemler burada yapılabilir
    }
    private static void page4() {
        System.out.println("İşletme Defteri  sayfasına hoşgeldiniz.");
        // Sayfa 1'e özgü işlemler burada yapılabilir
    }
}

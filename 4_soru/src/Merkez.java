import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Merkez {
    public static void main(String[] args) {
    	
        // Rastgele sayılarla dolu bir liste oluşturma işlemi.
        List<Integer> orijinalListe = new ArrayList<>();
        
        Random random = new Random();
        
        for (int i = 0; i < 100; i++) {
            int rastgeleSayi = random.nextInt(101); // 0 ile 100 arasında rastgele bir sayı üretme işlemi.
            orijinalListe.add(rastgeleSayi);
        }

        // Orijinal listenin bir kopyasını oluşturma işlemi
        List<Integer> kopyaListe = new ArrayList<>(orijinalListe);

        // 0 ile 100 arasında rastgele bir sayı üretme işlemi
        int rastgeleSayi = random.nextInt(101); 

        // Kopya listeden rastgele sayının olduğu indeksi silme işlemi
        kopyaListe.remove(Integer.valueOf(rastgeleSayi)); 

        // Eksik olan elemanı buluyoruz.
        int eksikEleman = 0;
        for (int eleman : orijinalListe) {
            if (!kopyaListe.contains(eleman)) {
                eksikEleman = eleman;
                break;
            }
        }

        // Eksik olan elemanı ekrana yazdır
        System.out.println("Eksik olan eleman: " + eksikEleman);
    }
}

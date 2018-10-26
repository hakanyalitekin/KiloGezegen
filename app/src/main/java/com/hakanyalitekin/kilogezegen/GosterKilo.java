package com.hakanyalitekin.kilogezegen;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class GosterKilo extends AppCompatActivity {

    private SliderAdapter sliderAdapter;
    private ViewPager mSliderViewPager;
    private String gelecekKiloDegeri = "";

    private double GUNES = 24.720;
    private double MERKUR = 0.378;
    private double VENUS = 0.907;
    private double MARS = 0.377;
    private double JUPITER = 0.236;
    private double SATURN = 0.916;
    private double URANUS = 0.889;
    private double NEPTUN = 1.12;
    //private LinearLayout mDotLayout;

    public String hesaplaKilo(double gelenKilo, double gezegen) {

        String donenKilo = String.format("%.2f",gelenKilo * gezegen);

        return  donenKilo;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goster_kilo);


        if (getIntent() != null) {

            gelecekKiloDegeri = getIntent().getStringExtra("girilenKilo");
            double kilo = Double.parseDouble(gelecekKiloDegeri);
            String gunes = hesaplaKilo(kilo, GUNES);
            String merkur = hesaplaKilo(kilo, MERKUR);
            String venus = hesaplaKilo(kilo, VENUS);
            String mars = hesaplaKilo(kilo, MARS);
            String jupiter = hesaplaKilo(kilo, JUPITER);
            String saturn = hesaplaKilo(kilo, SATURN);
            String uranus = hesaplaKilo(kilo, URANUS);
            String neptun = hesaplaKilo(kilo, NEPTUN);


            //ARRAYS
            int[] slide_images = {
                    R.drawable.gunes,
                    R.drawable.merkur,
                    R.drawable.venus,
                    R.drawable.mars,
                    R.drawable.jupiter,
                    R.drawable.saturn,
                    R.drawable.uranus,
                    R.drawable.neptun,
            };

            String[] slide_heading = {

                    "Güneş",
                    "Merkür",
                    "Venus",
                    "Mars",
                    "Jüpiter",
                    "Satürn",
                    "Uranüs",
                    "Neptün",
            };

            String[] slide_kilo = {

                    "Güneş'te " + gunes + "kg",
                    "Merkür'de " + merkur + "kg",
                    "Venüs'te " + venus + "kg",
                    "Mars'ta " + mars + "kg",
                    "Jüpiter'de " + jupiter + "kg",
                    "Satürn'de " + saturn + "kg",
                    "Uranüs'de " + uranus + "kg",
                    "Neptün'de " + neptun + "kg"
            };
            String[] slide_desc = {
                    "Güneş, Güneş Sistemi'nin merkezinde yer alan yıldız. Orta büyüklükte bir yıldız olan Güneş, tek başına Güneş Sistemi kütlesinin % 99,8'ini oluşturur. Geri kalan kütle Güneş'in çevresinde dönen gezegenler, asteroitler, gök taşları, kuyruklu yıldızlar ve kozmik tozlardan oluşur.",

                    "Merkür Güneş Sistemi'ndeki en küçük ve Güneş'e en yakın gezegen. Yaklaşık 88 Dünya gününe eşit yörünge süresi ile Güneş Sistemi'ndeki diğer gezegenlerden daha hızlıdır. Dünya'dan bakıldığında, kendi yörüngesi etrafında 116 günde hareket ettiği görünür. Bilinen hiç doğal uydusu yoktur. ",

                    "Venüs, Güneş Sisteminde, Güneş'e uzaklık bakımından ikinci sıradaki, sıcaklık bakımından da birinci sıradaki gezegen. Güneşe uzaklık bakımından ikinci sırada olmasına rağmen en sıcak gezegen olmasının nedeni de atmosferinin gelen güneş ışınlarının dışarı çıkmasına izin vermemesidir. ",


                    "Latince Mars veya Arapça Merih, Güneş Sistemi'nin Güneş'ten itibâren dördüncü gezegeni. Roma mitolojisindeki savaş tanrısı Mars'a ithâfen adlandırılmıştır. Yüzeyindeki yaygın demiroksitten dolayı kızılımsı bir görünüme sahip olduğu için Kızıl Gezegen de denir.",

                    "Jüpiter Güneş Sistemi'nin en büyük gezegeni. Güneş'ten uzaklığa göre beşinci sırada yer alır. Adını Roma mitolojisindeki tanrıların en büyüğü olan Jüpiter'den alır. Büyük ölçüde hidrojen ve helyumdan oluşmakta ve gaz devleri sınıfına girmektedir. ",

                    "Satürn Güneş Sisteminin Güneş'e yakınlık sırasına göre 6. gezegenidir. Büyüklük açısından Jüpiter'den sonra ikinci sırada gelir. Adını Yunan mitolojisindeki Kronos'tan alır. Çıplak gözle izlenebilen 5 gezegenden biri olarak eski çağlardan beri insanoğlunun dikkatini çekmiştir. ",

                    "Uranüs Güneş Sisteminin Güneş'ten yakınlık sırasına göre 7. gezegenidir. Çap açısından Jüpiter ve Satürn'den sonra üçüncü, kütle açısından bu iki gezegen ve Neptün'ün ardından dördüncü sırada gelir. Adını Yunan mitolojisi'ndeki gökyüzü tanrısı Uranos'tan alır. 1781 yılında William Herschel tarafından bulunmuştur. ",
                    "Neptün, Güneş Sistemi'nin sekizinci ve Güneş'e en uzak gezegenidir. Adını Roma deniz tanrısı Neptunus'ten alan gezegen, çapına göre en büyük dördüncü, kütlesine göre ise en büyük üçüncü gezegendir. Dünya'nın 17 katı kütlesiyle ikizi sayılabilecek Uranüs'ten çok az büyük ve daha yoğundur."
            };

            mSliderViewPager = findViewById(R.id.slideViewPager);
            //mDotLayout = findViewById(R.id.dotsLayout);
            sliderAdapter = new SliderAdapter(this, slide_images, slide_heading, slide_kilo, slide_desc);
            mSliderViewPager.setAdapter(sliderAdapter);

        }

    }
}

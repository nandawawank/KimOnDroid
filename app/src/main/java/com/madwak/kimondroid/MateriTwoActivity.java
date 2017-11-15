package com.madwak.kimondroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MateriTwoActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static Integer[] image_two={
            R.drawable.imgmateriduasatu,R.drawable.imgmateriduadua,R.drawable.imgmateriduatiga,R.drawable.imgmateriduaempat,
            R.drawable.imgmateridualima,R.drawable.imgmateriduaenam};

    public static String[] materi_two={
           "Koloid mempunyai sifat-sifat yang khas, misalnya menunjukkan efek Tyndall, gerak Brown, dan mempunyai muatan listrik.\n" +
           "    1. Efek Tyndall\n" +
           "       Gejala pemantulan dan pembauran cahaya oleh partikel dispersi sistem koloid disebut efek Tyndall. Gejala ini pertama kali\n" +
           "       ditemukan oleh Michael Faraday kemudian diselidiki lebih lanjut oleh John Tyndall (1820 – 1893), seorang ahli Fisika bangsa\n" +
           "       Inggris. Efek Tyndall dapat digunakan untuk membedakan larutan sejati dari koloid.",
           "    2. Gerak Brown\n" +
           "       Gerakan partikel koloid yang tidak menentu arahnya ini pertama kali ditemukan oleh seorang sarjana Biologi bernama Robert Brown\n" +
           "       (1773-1859). Gerak Brown adalah gerak lurus partikel-partikel koloid yang arahnya tidak tentu yang disebabkan oleh tumbukan dari\n" +
           "       molekul-molekul medium pendispersi dengan partikel-partikel koloid. Gerak Brown bisa berlangsung terus karena gaya yang bekerja\n" +
           "       pada partikel itu dihasilkan terus menerus oleh tumbukan partikel dengan partikel dan partikel dengan molekul medium pendispersi.\n" +
           "       Hal ini menyebabkan berkurangnya efek gaya gravitasi bumi terhadap partikel fasa dispersi.",
           "    3. Adsorpsi\n" +
           "       Adsorpsi adalah peristiwa di mana suatu zat menempel pada permukaan zat lain, seperti ion H+ dan OH- dari medium pendispersi.\n" +
           "       Untuk berlangsungnya adsorpsi, minimum harus ada dua macam zat, yaitu zat yang tertarik disebut adsorbat, dan zat yang menarik\n" +
           "       disebut adsorban. Apabila terjadi penyerapan ion pada permukaan partikel koloid maka partikel koloid dapat bermuatan listrik\n" +
           "       yang muatannya ditentukan oleh muatan ion-ion yang mengelilinginya. Contoh: Koloid Fe(OH)3 dalam air menyerap ion hidrogen\n" +
           "       (ion H+) sehinggapartikel bermuatan positif, sedangkan koloid As2S3 menyerap ion hidroksida (ion OH-) sehingga partikel\n" +
           "       bermuatan negatif.",
           "    4. Elektroforesis\n" +
           "       Elektroforesis adalah peristiwa mengalirnya partikel-partikel koloid menuju elektroda, bergeraknya partikel koloid ke dalam\n" +
           "       satu elektroda menunjukkan bahwa partikel-partikel koloid bermuatan listrik. Elektroforesis dapat dipakai untuk memisahkan\n" +
           "       protein-protein dalam larutan. Muatan pada protein berbeda-beda, tergantung pH. Dengan membuat pH larutan tertentu (misalnya dalam larutan penyangga), pemisahan molekul-molekul protein yang berlainan jenis terjadi.",
           "    5. Koagulasi\n" +
           "       Koagulasi adalah penggumpalan koloid yang disebabkan oleh penambahan elektrolit atau terjadinya perubahan fisik melalui\n" +
           "       cara mekanik. Koagulasi dengan penambahan zat kimia Ion yang efektif untuk menggumpalkan koloid ialah ion yang muatannya\n" +
           "       berlawanan dengan muatan koloid.\n" +
           "       Contoh :\n" +
           "       1) Koloid Fe(OH)3 dicampur dengan koloid As2S3.\n" +
           "       2) Sol emas yang bermuatan negatif dapat dikoagulasikan dengan NaCl, CaCl2, atau AlCl3\n" +
           "       3) Partikel-partikel karet dalam lateks digumpalkan dengan penambahan asam cuka.\n" +
           "       Apakah kamu pernah berjalan-jalan di sekitar muara sungai, jika pernah mungkin kamu pernah melihat daratan kecil di tengah\n" +
           "       muara tersebut. Daratan kecil tersebut sering dinamai sebagai delta.Delta terbentuk dari pengendapan partikel koloid, karena\n" +
           "       partikel koloid yang bermuatan mengalami reaksi dengan muatan lawannya ketika partikel tersebut terbawa oleh air sungai dan\n" +
           "       bertemu dengan air laut yang kaya dengan elektrolit. Hal itu terjadi karena keberadaan ion pasangannya menyebabkan partikel\n" +
           "       koloid berkumpul bersama akibat menghilangkannya tolakan muatan antar partikel.",
           "    6. Liofil dan Liofob\n" +
           "       Berdasarkan daya tarik-menarik antar partikel fase terdispersi dan medium pendispersinya, sol dibedakan menjadi sol liofil\n" +
           "       dan sol liofob. Sol liofil adalah sol yang fase terdispersinya mempunyai kemampuan menarik medium pendispersi. Contoh, gelatin\n" +
           "       dalam air dan putih telur dalam air. Sol liofob adalah sol yang fase terdispersinya tidak menarik medium pendispersi. Contoh\n" +
           "       As2S3 dalam air, garam sulfida dalam air, dan belerang dalam air.Perbedaan sol  liofil dengan sol liofob dapat dilihat pada\n" +
           "       tabel berikut."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.activity_materi_two);

        context=this;

        lv=(ListView) findViewById(R.id.materi_two);
        lv.setAdapter(new CostomAdapterTwo(this, materi_two, image_two));
    }

    public void funcBack(View view) {
        Intent back= new Intent(MateriTwoActivity.this, MateriActivity.class);
        startActivity(back);
        finish();
    }
}

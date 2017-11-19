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
            R.drawable.imgmateridualima,R.drawable.imgmateriduaenam,R.drawable.imgmateriduatujuh};

    public static String[] materi_two={
           "Koloid mempunyai sifat-sifat yang khas, misalnya menunjukkan efek Tyndall, gerak Brown, dan mempunyai muatan listrik.\n\n" +
           "1. Efek Tyndall\n" +
           "Gejala pemantulan dan pembauran cahaya oleh partikel dispersi sistem koloid disebut efek Tyndall. Gejala ini pertama kali " +
           "ditemukan oleh Michael Faraday kemudian diselidiki lebih lanjut oleh John Tyndall (1820 – 1893), seorang ahli Fisika bangsa " +
           "Inggris. Efek Tyndall dapat digunakan untuk membedakan larutan sejati dari koloid.",
           "2. Gerak Brown\n" +
           "Gerakan partikel koloid yang tidak menentu arahnya ini pertama kali ditemukan oleh seorang sarjana Biologi bernama Robert Brown " +
           "(1773-1859). Gerak Brown adalah gerak lurus partikel-partikel koloid yang arahnya tidak tentu yang disebabkan oleh tumbukan dari " +
           "molekul-molekul medium pendispersi dengan partikel-partikel koloid. Gerak Brown bisa berlangsung terus karena gaya yang bekerja " +
           "pada partikel itu dihasilkan terus menerus oleh tumbukan partikel dengan partikel dan partikel dengan molekul medium pendispersi. " +
           "Hal ini menyebabkan berkurangnya efek gaya gravitasi bumi terhadap partikel fasa dispersi.",
           "3. Adsorpsi\n" +
           "Adsorpsi adalah peristiwa di mana suatu zat menempel pada permukaan zat lain, seperti ion H+ dan OH- dari medium pendispersi. " +
           "Untuk berlangsungnya adsorpsi, minimum harus ada dua macam zat, yaitu zat yang tertarik disebut adsorbat, dan zat yang menarik " +
           "disebut adsorban. Apabila terjadi penyerapan ion pada permukaan partikel koloid maka partikel koloid dapat bermuatan listrik " +
           "yang muatannya ditentukan oleh muatan ion-ion yang mengelilinginya. Contoh: Koloid Fe(OH)3 dalam air menyerap ion hidrogen " +
           "(ion H+) sehinggapartikel bermuatan positif, sedangkan koloid As2S3 menyerap ion hidroksida (ion OH-) sehingga partikel " +
           "bermuatan negatif.",
           "4. Elektroforesis\n" +
           "Elektroforesis adalah peristiwa mengalirnya partikel-partikel koloid menuju elektroda, bergeraknya partikel koloid ke dalam " +
           "satu elektroda menunjukkan bahwa partikel-partikel koloid bermuatan listrik. Elektroforesis dapat dipakai untuk memisahkan " +
           "protein-protein dalam larutan. Muatan pada protein berbeda-beda, tergantung pH. Dengan membuat pH larutan tertentu " +
           "(misalnya dalam larutan penyangga), pemisahan molekul-molekul protein yang berlainan jenis terjadi.",
           "5. Koagulasi\n" +
           "Koagulasi adalah penggumpalan koloid yang disebabkan oleh penambahan elektrolit atau terjadinya perubahan fisik melalui " +
           "cara mekanik.\n\n" +
           "Koagulasi dengan penambahan zat kimia " +
           "Ion yang efektif untuk menggumpalkan koloid ialah ion yang muatannya dengan muatan koloid.\n\n" +
           "Contoh :\n" +
           "a) Koloid Fe(OH)3 dicampur dengan koloid As2S3.\n" +
           "b) Sol emas yang bermuatan negatif dapat dikoagulasikan dengan NaCl, CaCl2, atau AlCl3\n" +
           "c) Partikel-partikel karet dalam lateks digumpalkan dengan penambahan asam cuka.\n\n" +
           "Apakah kamu pernah berjalan-jalan di sekitar muara sungai, jika pernah mungkin kamu pernah melihat daratan kecil di tengah " +
           "muara tersebut. Daratan kecil tersebut sering dinamai sebagai delta.Delta terbentuk dari pengendapan partikel koloid, karena " +
           "partikel koloid yang bermuatan mengalami reaksi dengan muatan lawannya ketika partikel tersebut terbawa oleh air sungai dan " +
           "bertemu dengan air laut yang kaya dengan elektrolit. Hal itu terjadi karena keberadaan ion pasangannya menyebabkan partikel " +
           "koloid berkumpul bersama akibat menghilangkannya tolakan muatan antar partikel.",
           "6. Liofil dan Liofob\n" +
           "Berdasarkan daya tarik-menarik antar partikel fase terdispersi dan medium pendispersinya, sol dibedakan menjadi sol liofil " +
           "dan sol liofob. \nSol liofil adalah sol yang fase terdispersinya mempunyai kemampuan menarik medium pendispersi. Contoh, gelatin " +
           "dalam air dan putih telur dalam air. \nSol liofob adalah sol yang fase terdispersinya tidak menarik medium pendispersi. Contoh " +
           "As2S3 dalam air, garam sulfida dalam air, dan belerang dalam air.",
           "Perbedaan sol  liofil dengan sol liofob dapat dilihat pada tabel berikut:"
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
//        Intent back= new Intent(MateriTwoActivity.this, MateriActivity.class);
//        startActivity(back);
        finish();
    }
}

package com.example.projeoyun2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView2);
        ArrayList<oyunClass> oyunlar = new ArrayList<>();
        oyunlar.add(new oyunClass(" The Witcher 3: Wild Hunt","Aksiyon RPG","PC: 93/100","2015", R.drawable.witcher,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/uqtFg2C2v_0?si=AttaBH1Sia-Bsurx\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>","2015'te çıkan oyun, destansı bir açık dünyada geçer ve oyuncuları canavar avcısı Rivialı Geralt'ın yerine koyar. Oyunda, kayıp kızı Ciri’yi bulmak için tehlikeli bir maceraya atılırken, büyü, politik entrikalar ve unutulmaz karakterlerle dolu bir hikaye sunar."));
        oyunlar.add(new oyunClass("Mafia: The City of Lost Heaven (Mafia 1)","Aksiyon-Macera","PC: 88/100","2002", R.drawable.mafia,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vfwfA_iTOng?si=3CPMvnsv9lhLsn7h\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>","Mafia: The City of Lost Heaven, 2002 yılında Illusion Softworks tarafından geliştirilen bir aksiyon-macera oyunudur. 1930'ların Amerika'sında geçen oyun, taksi şoförü Tommy Angelo'nun bir mafya ailesine katılışını ve suç dünyasındaki yükselişini konu alır. Etkileyici hikayesi, döneme uygun atmosferi ve sinematik anlatımıyla klasikler arasında yer alır.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"));
        oyunlar.add(new oyunClass("Mount & Blade II: Bannerlord","Strateji, RPG, Sandbox","PC: 80/100","2020", R.drawable.bannerlord,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/q6oH5cW7PaA?si=DxrzeoNXm2GVgfW9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>","Mount & Blade II: Bannerlord, TaleWorlds Entertainment tarafından geliştirilmiş bir strateji ve rol yapma oyunudur. 2020'de çıkan oyun, savaşlar, krallık yönetimi ve diplomasiyle dolu bir orta çağ dünyasında geçer. Oyuncular, kendi hikayelerini yazarak ordularını kurar, kaleleri fetheder ve imparatorluklarını inşa eder. Geniş özgürlük sunan yapısıyla, serinin hayranları için büyüleyici bir deneyim sunar."));
        oyunlar.add(new oyunClass("Red Dead Redemption 2","Aksiyon-Macera","97/100 (Metacritic)","2018", R.drawable.ragnarok,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6rsvzE5hNzA?si=gmfCcOO2B20JS1qj\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>","Red Dead Redemption 2 (RDR2), Rockstar Games tarafından geliştirilen ve yayımlanan bir aksiyon-macera oyunudur. 1899 yılında Vahşi Batı'nın son dönemlerinde geçen oyun, haydut çetesi üyesi Arthur Morgan'ın hikâyesini anlatır. Açık dünyası, detaylı grafikleri ve derin hikaye anlatımıyla büyük övgü toplayan oyun, hem oyuncular hem de eleştirmenler tarafından yılın en iyilerinden biri olarak kabul edilmiştir. Oyun, özgürce keşfedilebilecek geniş bir dünya, zengin karakterler ve kararlarınızın sonucu etkilediği bir hikaye sunar." ));
        oyunlar.add(new oyunClass("God of War: Ragnarok","Aksiyon-Macera","94/100 (Metacritic)","2022",R.drawable.ragnarok,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9y1IQk7cuy0?si=FCWVPpq0H6aysrUL\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>","God of War: Ragnarok, Santa Monica Studio tarafından geliştirilen ve Sony Interactive Entertainment tarafından yayımlanan bir aksiyon-macera oyunudur. Kratos ve oğlu Atreus'un İskandinav mitolojisindeki maceralarının devamını anlatır."));

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this , oyunlar);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                oyunClass secilenOyun = oyunlar.get(position);

                Intent git = new Intent(MainActivity.this, Sayfa3.class);
                git.putExtra("youtubeUrl",secilenOyun.getYoutubeUrl());
                git.putExtra("aciklama",secilenOyun.getAciklama());

                startActivity(git);
            }
        });
    }
}
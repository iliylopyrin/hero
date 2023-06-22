package com.example.hero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Hero> heroes = new ArrayList<Hero>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        HeroAdapter adapter = new HeroAdapter(this, heroes);

        recyclerView.setAdapter(adapter);

    }
    private void setInitialData(){
        heroes.add(new Hero("Рыцарь", "Способность: Позволяет ненадолго использовать текущее оружие обеими руками. Время восст. навыка: 10 сек.",
                R.drawable.hero1, "Кол-во жизней: 6"));
        heroes.add(new Hero("Паладин", "Способность: Активирует энергетический щит, который поглощает весь урон. Время восст. навыка: 12 сек.",
                R.drawable.hero2,"Кол-во жизней: 1"));
        heroes.add(new Hero("Асасин","Способность: Мгновенно ускоряется и наносит мощный рубящий удар. При ускорении персонаж не получает урон .Победа над врагом сбрасывает время восстановления (до 5 раз). Время восст. навыка: 11 сек.",
                R.drawable.hero3,"Кол-во жизней: 4"));
        heroes.add(new Hero("Алхимик", "Способность: Бростает снаряды с ядовитым газом, который наносит урон по области и замедляет врагов. Некоторое время враги будут отравлены. После трех отравлений враги будут получать больший урон и заражать врагов поблизости. Время восст. навыка: 6 сек.",
                R.drawable.hero4,"Кол-во жизней: 5"));
        heroes.add(new Hero("Священик", "Способность: Восстанавливает здоровье всех союзников. Время восст. навыка: 14 сек.",
                R.drawable.hero5,"Кол-во жизней: 3"));
        heroes.add(new Hero("Оборотень", "Способность: Впадает в состояние берсерка и атакует когтями. Персонаж может наносить больше урона по мере потери здоровья. В состоянии берсерка при низком уровне здоровья восстанавливается здоровье. Восстанавливает 1 очко брони за 3 успешных удара. Время восст. навыка: 12 сек.",
                R.drawable.hero6,"Кол-во жизней: 11"));






    }
}
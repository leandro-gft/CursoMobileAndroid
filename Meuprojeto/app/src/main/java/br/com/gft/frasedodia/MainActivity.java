package br.com.gft.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geraFrase(View view){
        TextView frase = findViewById(R.id.fraseNova);
        String[] quote = {
                "O importante não é vencer todos os dias, mas lutar sempre.",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
                "É melhor conquistar a si mesmo do que vencer mil batalhas.",
                "Quem ousou conquistar e saiu pra lutar, chega mais longe!",
                "O amor é o segundo sol da natureza.",
                "Saber encontrar a alegria na alegria dos outros, é o segredo da felicidade.",
                "É igualmente difícil viver com uma pessoa que amamos e amar aquela com quem vivemos.",
                "A amizade desenvolve a felicidade e reduz o sofrimento, duplicando a nossa alegria e dividindo a nossa dor.",
                "A alegria é uma rede de amor com a qual você pode pegar almas.",
                "Um amigo de verdade é aquele que te apóia nos fracassos e tolera o teu sucesso.",
                "Cada vez que se ama é a única vez que se amou. A diferença de objeto não altera a singularidade da paixão. Simplesmente a intensifica.",
                "A vida não passa de uma oportunidade de encontro; só depois da morte se dá a junção; os corpos apenas têm o abraço, as almas têm o enlace.",
                "Um amigo é um presente que se dá a si mesmo.",
                "O amor é a asa veloz que Deus deu à alma para que ela voe até o céu.",
                "Amigos não são aqueles que enxugam as lágrimas, e sim aqueles que não as deixam cair.",
                "O laço que une a sua família verdadeira não é de sangue, mas de respeito e alegria pela vida um do outro.",
                "A alegria de fazer o bem é a única felicidade verdadeira.",
                "Há muito mais amor na amizade do que amizade no amor.",
                "Que o amor é tudo, é tudo que sabemos do amor.",
                "O amor é um jogo que duas pessoas jogam e ambas ganham.",
                "Aparentar-se pelo coração é ser amigo.",
                "O amor é a beleza da alma.",
                "Amar é mudar a alma de casa.",
                "Enquanto houver vontade de lutar haverá esperança de vencer."
        };
        int n = new Random().nextInt(23);
        frase.setText(quote[n]);
    }


}

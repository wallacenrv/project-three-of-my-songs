package principal;

import modal.MinhasPreferidas;
import modal.Musica;
import modal.Podcast;

public class Principal {

    public static void main(String[] args) {

    Musica minhaMusica = new Musica();
    minhaMusica.setTitulo("Forever");
    minhaMusica.setCantor("kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();

        }
        for (int i = 0; i < 100; i++) {
            minhaMusica.curte();

        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();

        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();

        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);
    }
}

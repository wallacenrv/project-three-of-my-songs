package modal;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >=8){
            System.out.println(audio.getTitulo() + "é considerado suceeso absoluto");
        }else {
            System.out.println(audio.getTitulo() + "é um dos que todo mundo esta curtindo ");
        }
    }
}

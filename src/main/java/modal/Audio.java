package modal;

public class Audio {

 private  String titulo;
 private int totalDeReprocoes;
 private int totalCurtidas;
 private int classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalDeReprocoes() {
        return totalDeReprocoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;

    }

    public void reproduz(){
        this.totalDeReprocoes++;
    }


}

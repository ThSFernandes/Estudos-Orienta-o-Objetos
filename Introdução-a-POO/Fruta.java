
package fruta;


public class Fruta {
    
    private int caloriasPorGrama;
    private String nomeFruta;
    private int gramas;
    
    public Fruta ( int caloirasPorFrama, String nomeFruta, int gramas){
        this.caloriasPorGrama = caloirasPorFrama;
        this.nomeFruta = nomeFruta;
        this.gramas = gramas;
    }
    
    public Fruta(){
        
    }

    public int getCaloriasPorGrama() {
        return caloriasPorGrama;
    }

    public void setCaloriasPorGrama(int caloriasPorGrama) {
        this.caloriasPorGrama = caloriasPorGrama;
    }

    public String getNomeFruta() {
        return nomeFruta;
    }

    public void setNomeFruta(String nomeFruta) {
        this.nomeFruta = nomeFruta;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }
    
    public void imprimir(){
        System.out.println("O numero de calorias da fruta é: " + caloriasPorGrama);
        System.out.println("O nome da fruta é: " + nomeFruta);
        System.out.println("A quantidade de gramas é: " + gramas);
    }
}

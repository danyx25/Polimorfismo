package poliformismo;


public class armas {
    
protected int numero_serie;
protected String cañon;
protected String culata;

    public armas(int numero_serie, String cañon, String culata) {
        this.numero_serie = numero_serie;
        this.cañon = cañon;
        this.culata = culata;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public String getCañon() {
        return cañon;
    }

    public String getCulata() {
        return culata;
    }
    public String mostrar_datos(){
        return "Número de serie: "+ numero_serie+"\nCañon tipo: "+cañon+"\nCulata tipo: "+culata;
    }

}

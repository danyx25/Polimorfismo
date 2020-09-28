package poliformismo;


import poliformismo.armas;


public class escopetas extends armas {
    private String guardamanos;

    public escopetas( int numero_serie, String cañon, String culata, String guardamanos) {
        super(numero_serie, cañon, culata);
        this.guardamanos = guardamanos;
    }

    public String getGuardamanos() {
        return guardamanos;
    }
    @Override
    public String mostrar_datos(){
        return "Escopeta."+"\nNúmero de serie: "+ numero_serie+"\nCañon tipo : "+cañon+"\nCulata tipo: "+culata+"\nGuardamanos tipo: "+guardamanos;
    }
}

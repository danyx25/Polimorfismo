package poliformismo;


import poliformismo.armas;


public class pistolas extends armas {
    private String corredera;
    
    public pistolas(int numero_serie, String cañon, String culata, String corredera){
        super(numero_serie, cañon, culata);
        this.corredera =corredera;
    }
    public String getCorredera(){
        return corredera;
    }
    @Override
    public String mostrar_datos(){
        return "Pistola."+"\nNúmero de serie: "+ numero_serie+"\nCañon: "+cañon+"\nCulata: "+culata+"\nCorredera tipo: "+corredera;
    }
}

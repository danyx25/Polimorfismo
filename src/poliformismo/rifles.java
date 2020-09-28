package poliformismo;


import poliformismo.armas;


public class rifles extends armas {
    private String cantonera;
    
    public rifles(int numero_serie, String cañon, String culata, String cantonera){
        super (numero_serie, cañon, culata);
        this.cantonera =cantonera;
    }

    public String getCantonera() {
        return cantonera;
    }
    @Override
     public String mostrar_datos(){
         return "Rifle de asalto."+"\nNúmero de serie: "+ numero_serie+"\nCañon tipo: "+cañon+"\nCulata: "+culata+"\nCantonera tipo: "+cantonera;
    }
    
}

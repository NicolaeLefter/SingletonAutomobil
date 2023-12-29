public  final  class AutomobilSingleton {

    // Creem o variabila statica private pentru instanta unica
    private static AutomobilSingleton automobilSingleton;

    public String denAuto;
    public String combustibil;
    public int anulProducerii;
    public int km;
//Constructor privat
    private AutomobilSingleton(String denAuto, String combustibil, int anulProducerii, int km){
        this.denAuto = denAuto;
        this.combustibil = combustibil;
        this.anulProducerii = anulProducerii;
        this.km = km;
    }

    //Metoda publica pentru obtinerea instantei unice

    public static AutomobilSingleton getAutomobilSingleton(String denAuto,String combustibil, int anulProducerii, int km){
        if(automobilSingleton == null){
            automobilSingleton = new AutomobilSingleton(denAuto, combustibil, anulProducerii, km);
        }
        return automobilSingleton;


    }





    public void setDenAuto(String denAuto) {
        automobilSingleton.denAuto = denAuto;
    }

    public void setCombustibil(String combustibil) {
        automobilSingleton.combustibil = combustibil;
    }

    public void setAnulProducerii(int anulProducerii) {
        automobilSingleton.anulProducerii = anulProducerii;
    }

    public void setKm(int km) {
        automobilSingleton.km = km;
    }

    @Override
    public String toString() {
        return "AutomobilSingleton{" +
                "denAuto='" + denAuto + '\'' +
                ", combustibil='" + combustibil + '\'' +
                ", anulProducerii=" + anulProducerii +
                ", km=" + km +
                '}';
    }
}

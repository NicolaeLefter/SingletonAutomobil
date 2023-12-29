public class Main {

    public static void main(String[] args) {


        AutomobilSingleton automobilSingleton = AutomobilSingleton.getAutomobilSingleton("BMW", "benzina", 2013, 22000);
        System.out.println(automobilSingleton);
        automobilSingleton.anulProducerii = 2000;
        System.out.println(automobilSingleton);



    }
}

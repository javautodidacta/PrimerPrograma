package es.javautodidacta;

public class Main {

    public static void main(String[] args) {
        Persona miguel = new Persona("Miguel", 32);
        Persona paco = new Persona("Paco", 45);
    
        quienEsMayor(miguel, paco);
    }
    
    private static void quienEsMayor(Persona miguel, Persona manolo) {
        if(manolo.getEdad() > miguel.getEdad()){
            System.out.print(miguel.getNombre());
        } else {
            System.out.print(manolo.getNombre());
        }
    
        System.out.println(" es mayor.");
    }
}

public class Armada {

    public static void main (String[] args ){
        System.out.println("Flota imperial");

        Planetaria naveUno = new Planetaria();
        Interestelar naveDos = new Interestelar();

        Piloto oficialUno = new Piloto(naveUno);
        oficialUno.setName("Almirante Tarkin");


        System.out.println("Superior: "+oficialUno.getName());
        System.out.println("Nave asignada: "+naveUno.setName("Death Star"));
        System.out.println(naveUno.orbitar());
        System.out.println("");


        Piloto oficialDos = new Piloto(naveDos);
        oficialDos.setName("Almirante Thrawn");

        System.out.println("Superior: "+oficialDos.getName());
        System.out.println("Nave asignada: "+naveDos.setName("Kimera"));
        System.out.println(naveDos.orbitar());
        System.out.println(naveDos.saltoEstelar());

    }
}

public class Planetaria implements Nave {
    @Override
    public String setName(String nombre) {
        return nombre;
    }

    @Override
    public String encender() {
        return "Nave encendida";
    }

    @Override
    public String apagar() {
        return "Nave apagada";
    }

    @Override
    public String abastecer() {
        return "Abasteciendo nave";
    }

    @Override
    public  String orbitar() {
        return "Nave orbitando";
    }
}

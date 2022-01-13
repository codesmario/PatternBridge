public class Interestelar implements Nave{

    @Override
    public String setName(String s) {
        return s;
    }

    @Override
    public String encender() {
        return null;
    }

    @Override
    public String apagar() {
        return null;
    }

    @Override
    public String abastecer() {
        return null;
    }

    @Override
    public String orbitar() {
        return "Nave orbitando";
    }

    public String saltoEstelar() {
        return  "Entrando a velocidad luz";
    }
}

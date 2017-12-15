public class Lateral extends Jugador {
    public Lateral() {
        super();
        this.nombre="LATERAL";
    }
    @Override
    public boolean pichichi() {
        return true;
    }

    @Override
    public void visualizar() {
        System.out.println(nombre + "      " + golesMarcados);
    }

    @Override
    public boolean zamora() {
        return false;
    }
}

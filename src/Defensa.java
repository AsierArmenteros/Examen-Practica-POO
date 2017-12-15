public class Defensa extends Jugador {
    public Defensa() {
        super();
        this.nombre="DEFENSA";
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

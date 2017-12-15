public class Medio extends Jugador {
    public Medio() {
        super();
        this.nombre="MEDIO";
    }
    @Override
    public boolean pichichi() {
        return true;
    }

    @Override
    public void visualizar() {
        System.out.println(nombre + "        " + golesMarcados);
    }

    @Override
    public boolean zamora() {
        return false;
    }
}

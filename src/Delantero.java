public class Delantero extends Jugador{
    public Delantero() {
        super();
        this.nombre="DELANTERO";
    }
    @Override
    public boolean pichichi() {
        return true;
    }

    @Override
    public void visualizar() {
        System.out.println(nombre + "    " + golesMarcados);
    }

    @Override
    public boolean zamora() {
        return false;
    }
}

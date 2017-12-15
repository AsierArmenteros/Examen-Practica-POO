public abstract class Jugador {
    protected int golesMarcados;
    protected String nombre; // Los nombres que he puesto son las posiciones que juegan, si hubiese que poner sus nombres a partir de un archivo externo
    public Jugador(){        // habría que cambiarlo en el constructor de equipo.
        int random=(int)Math.floor(Math.random()*20);
        this.golesMarcados=random;
    }


    public abstract boolean pichichi();

    public abstract void visualizar();

    public abstract boolean zamora();
}

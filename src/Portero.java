public class Portero extends Jugador{
    private int golesEncajados;
    public Portero(){
        int random=(int)Math.floor(Math.random()*20);
        this.golesEncajados=random;
        this.nombre="PORTERO";

    }

    @Override
    public boolean pichichi() {
        return false;
    }

    @Override
    public void visualizar() {
        System.out.println(nombre + "     "+ golesEncajados);
    }

    @Override
    public boolean zamora() {
        return true;
    }
}

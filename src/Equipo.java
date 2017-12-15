import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private Entrenador entrenador;
    private List<Jugador> plantilla=new ArrayList<Jugador>();
    public Equipo(String entrenador){
        this.entrenador=new Entrenador(entrenador);
        for (int i = 0; i <20; i++) {
            int random=(int)Math.floor(Math.random()*5);
            if (random==0){
                plantilla.add(new Portero());
            }
            if(random==1){
                plantilla.add(new Defensa());
            }
            if(random==2){
                plantilla.add(new Medio());
            }
            if(random==3){
                plantilla.add(new Lateral());
            }
            if(random==4){
                plantilla.add(new Delantero());
            }
        }
    }


    public void candidatosAPremio() {
        System.out.println("*****************************");
        System.out.println("EQUIPO");
        System.out.println("*****************************");
        System.out.println("Entrenador:    "+ entrenador.getNombre()+ "\n");
        this.visualizarPichichi();
        this.visualizarZamora();
    }

    private void visualizarPichichi() {
        System.out.println("*****************************");
        System.out.println("CANDIDATOS A PICHICHI");
        System.out.println("*****************************");
        System.out.println("POSICION:   Goles:\n");
        for (Jugador jugador:plantilla) {
            if(jugador.pichichi()){
                jugador.visualizar();
            }
        }
    }
    private void visualizarZamora(){
        System.out.println("*****************************");
        System.out.println("CANDIDATOS A ZAMORA");
        System.out.println("*****************************");
        System.out.println("POSICION:   Goles Encajados:\n");
        for (Jugador jugador:plantilla) {
            if(jugador.zamora()){
                jugador.visualizar();
            }
        }

    }
}

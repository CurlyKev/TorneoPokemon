public class TorneoController {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private TorneoVista vista;
    private int rondasGanadas1 = 0;
    private int rondasGanadas2 = 0;

    public TorneoController(TorneoVista vista) {
        this.vista = vista;
    }

    public void iniciarTorneo(Entrenador e1, Entrenador e2) {
        this.entrenador1 = e1;
        this.entrenador2 = e2;

        for (int ronda = 1; ronda <= 4; ronda++) {
            vista.mostrarRonda(ronda);
            Pokemon p1 = vista.seleccionarPokemon(entrenador1);
            boolean usarHab1 = vista.decidirUsoHabilidad(entrenador1, p1);

            Pokemon p2 = vista.seleccionarPokemon(entrenador2);
            boolean usarHab2 = vista.decidirUsoHabilidad(entrenador2, p2);

            int ataque1 = Batalla.calcularAtaqueTotal(p1, p2, usarHab1);
            int ataque2 = Batalla.calcularAtaqueTotal(p2, p1, usarHab2);

            vista.mostrarResultadoRonda(p1, ataque1, p2, ataque2);

            if (ataque1 > ataque2) rondasGanadas1++;
            else if (ataque2 > ataque1) rondasGanadas2++;
        }

        vista.mostrarGanadorFinal(entrenador1, rondasGanadas1, entrenador2, rondasGanadas2);
    }
}

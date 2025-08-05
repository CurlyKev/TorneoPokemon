public class Batalla {
    public static int calcularEfectoTipo(String tipoA, String tipoB) {
        if ((tipoA.equals("Fuego") && tipoB.equals("Planta")) ||
            (tipoA.equals("Planta") && tipoB.equals("Agua")) ||
            (tipoA.equals("Agua") && tipoB.equals("Fuego")) ||
            (tipoA.equals("Eléctrico") && tipoB.equals("Agua"))) {
            return 20;
        } else if ((tipoA.equals("Fuego") && tipoB.equals("Agua")) ||
                   (tipoA.equals("Agua") && tipoB.equals("Planta")) ||
                   (tipoA.equals("Planta") && tipoB.equals("Fuego"))) {
            return -10;
        }
        return 0;
    }

    public static int calcularAtaqueTotal(Pokemon atacante, Pokemon defensor, boolean usarHabilidad) {
        int efectoTipo = calcularEfectoTipo(atacante.getTipo(), defensor.getTipo());
        if (usarHabilidad) atacante.activarHabilidad();

        int ataqueBase = atacante.getAtaque();
        int defensaTotal = defensor.getDefensa();

        if (atacante.isHabilidadActiva() && atacante.getHabilidad().getEfecto().equals("daño")) {
            defensaTotal -= atacante.getHabilidad().getValor();
        }

        return ataqueBase + efectoTipo - defensaTotal;
    }
}


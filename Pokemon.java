public class Pokemon {
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private Habilidad habilidad;
    private boolean habilidadActiva = false;

    public Pokemon(String nombre, String tipo, int ataque, int defensa, Habilidad habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAtaque() {
        return ataque + (habilidadActiva && habilidad.getEfecto().equals("ataque") ? habilidad.getValor() : 0);
    }

    public int getDefensa() {
        return defensa + (habilidadActiva && habilidad.getEfecto().equals("defensa") ? habilidad.getValor() : 0);
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void activarHabilidad() {
        habilidadActiva = habilidad.seActiva();
    }

    public boolean isHabilidadActiva() {
        return habilidadActiva;
    }
}


public class Habilidad {
    private String nombre;
    private String efecto; 
    private int valor;
    private int probabilidad;

    public Habilidad(String nombre, String efecto, int valor, int probabilidad) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.valor = valor;
        this.probabilidad = probabilidad;
    }

    public boolean seActiva() {
        int random = (int)(Math.random() * 100);
        return random < probabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public int getValor() {
        return valor;
    }
}


public class Temperatura {
    public static int CELCIUS = 2;
    public static int FARENHEIT = 1;
    double valor;
    int escala;

    public Temperatura(double valor, int escala) {
        this.valor = valor;
        this.escala = escala;
    }

    public double convertirAcelcius(double valorc) {
        if (escala == CELCIUS) {
            return (valorc - 32) / 1.8;
        }
        return valor;
    }

    public double convertirAfarenheit(double valorf) {
        if (escala == FARENHEIT) {
            return (valorf * 1.8) + 32;
        }
        return valor;
    }

    public double obtenerTemperaturaFarEnCelsius(double valor) {
        if (escala == CELCIUS) {
            return (valor * 1.8) + 32;
        }
        return valor;
    }

    public double ObtenerTemperaturaCelEnfarenheit(double valor) {
        if (escala == FARENHEIT) {
            return valor;
        }
        return valor;
    }

    public boolean esIgual(Temperatura temp) {
        return escala == temp.escala && valor == temp.valor;
    }

}

package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int m, int n) {
        this.m = m;
        this.n = n;
        datos = new double[m][n];
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
        return this.datos[i][j];
    }

    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
        this.datos[i][j] = dato;
    }

    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
        if (this.m == otra.m && this.n == otra.n) {
            Matriz suma = new Matriz(this.m, this.n);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    suma.datos[i][j] = this.datos[i][j] + otra.datos[i][j];
                }
            }
            return suma;
        } else {
            return null;
        }
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
        Matriz escalar = new Matriz(this.m, this.n);

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                escalar.datos[i][j] = datos[i][j] * c;
            }
        }
        return escalar;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
        int salto;
        Matriz filaEliminada = new Matriz(this.m - 1, this.n);
        for (int i = 0; i < (m - 1); i++) {
            for (int j = 0; j < n; j++) {
                salto = (i >= k) ? 1 : 0;
                filaEliminada.datos[i][j] = this.datos[i + salto][j];
            }
        }
        return filaEliminada;
    }

    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
        int salto;
        Matriz columnaEliminada = new Matriz(this.m, this.n - 1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < (n - 1); j++) {
                salto = (j >= k) ? 1 : 0;
                columnaEliminada.datos[i][j] = this.datos[i][j + salto];
            }
        }
        return columnaEliminada;
    }

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
        double deter = 0;
        if (n == 1) {
            return this.datos[0][0];
        } else {
            for (int i = 0; i < m; i++) {
                Matriz cofactor = this.eliminarFila(i).eliminarColumna(0);
                deter = +(this.obtenerEntrada(0, i) * Math.pow(-1, 1 + (i + 1)) * cofactor.determinante());
            }
        }
        return deter;
    }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                resultado = resultado + datos[i][j] + " ";
            }
            resultado = resultado.substring(0, resultado.length() - 1);
            resultado = resultado + "\n";
        }
        return resultado;
    }

    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     * entrada
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            Matriz otra = (Matriz) obj;
            if (m != otra.m || n != otra.n) {
                return false;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (datos[i][j] != otra.datos[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
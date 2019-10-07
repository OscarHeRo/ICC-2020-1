package aplicacion;

import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Main.class.getName());
    }

    @Override
    public void settings() {
        size(800, 800);
	
    }

    public void draw(){
        //j cambia la fila
        for(int j = 0; j <= 7; j++){
            //base: cambia el valor en x (donde se empieza la columna), dependiendo si j es par
            int base = (j % 2 == 0) ?  0 : -100;
            //i genera la fila
            for(int i = 0 ; i <= 4; i++ ){
                //imprime un cuadrado blanco seguido de uno negro
                fill(0XFFFFFFFF);		
                rect(  0 + base + (i * 200), 0 + (j * 100) , 100, 100 );
                fill(0XFF000000);
                rect(  100 + base + (i * 200), 0 + (j * 100) , 100, 100 );
            }
        }
    }
}

/*No estoy convencido al 100 de este algoritmo, pues imprime fuera de la pantalla
  pero me gusta porque es sencillo*/




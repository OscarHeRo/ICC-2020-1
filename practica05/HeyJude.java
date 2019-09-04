import com.sun.source.tree.WhileLoopTree;

public class HeyJude {
    public static void main(String[] args) {

        String HEY_JUDE = "Hey Jude";
        String DONT = ", don´t";
        String MAKE_IT_BAD = " make it bad";
        String BE_AFRAID = " be afraid";
        String LET_ME = " let me down";
        String TAKE = "Take a sad song and make it better";
        String YOU_WERE = "You were made to go out and get her";
        String YOU_HAVE = "You have found her, now go and get her";
        String REMEMBER = "Remember";
        String LET_HEART = "to let her into your heart";
        String THEN_YOU = "Then you";
        String CAN_START = " can start";
        String BEGIN = " begin";
        String TO_MAKE_IT_BE = " to make it better";
        String LET_SKIN = "let her under your skin";
        String NA = "na ";
        String BETTER = "better ";
        String BETTEROH = "better, oh";
        int contador = 1;
        int contadorNA = 0;

        while (contador < 5) {
            System.out.println("");
            System.out.print(HEY_JUDE);
            System.out.print(DONT);
            if (contador == 1 || contador == 4) {
                System.out.println(MAKE_IT_BAD);
                System.out.println(TAKE);
            } else if (contador == 2) {
                System.out.println(BE_AFRAID);
                System.out.println(YOU_WERE);
            } else if (contador == 3) {
                System.out.println(LET_ME);
                System.out.println(YOU_HAVE);
            }

            System.out.print(REMEMBER);
            if (contador % 2 == 1) {
                System.out.println(LET_HEART);
            } else {
                System.out.println(LET_SKIN);
            }

            System.out.print(THEN_YOU);
            if (contador % 2 == 1) {
                System.out.print(CAN_START);
            } else {
                System.out.print(BEGIN);
            }
            System.out.println(TO_MAKE_IT_BE);


            if (contador == 4){
                for (int i = 0; i < 4; i++) {
                    System.out.print(BETTER);
                }
                System.out.println(BETTEROH);

            }
            if (contador > 1) {
                while (contadorNA < 11) {
                    if (contadorNA == 0){
                        System.out.println("");
                    }
                    System.out.print(NA);
                    contadorNA++;
                }

            }


            System.out.println(" ");
            System.out.println(" ");
            contadorNA = 0;

            contador++;
        }
        // La neta este Hey Jude es trampa, pero no se me ocurre como hacerlo sin cambiar toda la estructura
        System.out.println(HEY_JUDE);
    }

}


// Exercício Módulo 5: Usar classes do tipo Wrapper

public class VariaveisWrapper {

    public static void main(String[] args) {

        // Declaração de variáveis como objetos do tipo Wrapper:
        Boolean variavelBoolean = true;
        Byte numeroByte = 20;
        Short numeroShort = 30;
        Integer numeroInteiro = 40;
        Long numeroLong = 50L;
        Float numeroFloat = 10.55f;
        Double numeroDouble = 10.42;
        Character caracter = 'M';
        String texto = "Curso Java";

        // Alguns usos:
        System.out.println("Número Float: " + numeroFloat);
        String string1 = numeroFloat.toString();
        System.out.println("Convertido para String: " + string1);
        System.out.println("Número de caracteres: " + string1.length());
        Float numFloat = Float.valueOf(string1);
        System.out.println("String convertido para Float: " + numFloat);
        Integer numInt = Math.round(numFloat);
        System.out.println("Número Float arredondado por método 'Math.round()' : " + numInt);
        Integer numInt2 = numFloat.intValue();
        System.out.println("Número Float arredondado por método '.intValue()' : " + numInt2);

    }
}

import jdk.swing.interop.SwingInterOpUtils;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Variavel {

    // Tipos de variável:
    byte tipoByte = 127;
    short tipoShort = 32767;
    char tipoChar = 'C'; // Tipo char se colocar com aspas SIMPLES
    float tipoFloat = 2.6f; // Coloca-se um f para declarar que o dado é do tipo float
    double tipoDouble = 3.59;
    int tipoInt = 214748367;
    long tipoLong = 9223372036854775807L; // Coloca-se um L para declarar que o dado é do tipo long
    boolean tipoBoolean = true; // true ou false

    public static void main(String[] args) {

        String texto = "Mentorama - Java";
        String texto1 = "Mentorama - JavA";
        System.out.println(texto.charAt(0));

        System.out.println(texto.compareTo(texto1));
        System.out.println(texto.compareToIgnoreCase(texto1));

        System.out.println(texto.equals(texto1));
        System.out.println(texto.equalsIgnoreCase(texto1));

        System.out.println(texto.startsWith("Men"));
        System.out.println(texto1.endsWith("Java"));

//        for (char c : texto.toCharArray()) {
//            System.out.println("Caracter: " + c);
//        }
        // Retorna array de todos os caracteres da String.

//        String valor = "Mentorama";
//        for (byte b : valor.getBytes()) {
//            System.out.println("byte: " + b);

        String[] textos = texto.split("-");
        for (String t : textos) {
            System.out.println(t);
        }

        System.out.println("Carro ".concat("Veloz"));

        System.out.println(Cores.AZUL.getTexto()); // Exemplo de uso da Classe tipo Enum

        // Classe Calendar
        Calendar data = Calendar.getInstance(); // Instancia a Classe Calendar no objeto data.
        System.out.println(data.getTime()); // Representa a data do exato momento da execução.
        data.add(Calendar.MONTH, 1); // Adiciona 1 mês à data atual.
        System.out.println(data.getTime());
        data.add(Calendar.DAY_OF_MONTH,-5); // Subtrai 5 dias da data atual.
        System.out.println(data.getTime());
        data.set(Calendar.MONTH, Calendar.AUGUST); // Atribui o valor mês de Agosto à data, mantendo o mesmo dia.
        System.out.println(data.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Altera formato da data.
        System.out.println(sdf.format(data.getTime())); // Imprime data no novo formato.

        // Classe Math
        System.out.println(Math.round(15.49999999)); // Arrendondamento
        System.out.println(Math.round(15.5)); // Arrendondamento
        System.out.println(Math.round(15.6)); // Arrendondamento
        System.out.println(Math.random()); // Trazer número aleatório
        System.out.println(Math.max(1.5, 10)); // Trazer o maior número
        System.out.println(Math.PI); // Retorna constante Pi.
        System.out.println(Math.pow(5,2));

        // Expressões Regulares ou Regex

        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})"; // Fórmula montada no site https://regexr.com/
        String cpf = "asd 111.111.111-00 efg"; // Trecho onde será buscado
        Pattern pattern = Pattern.compile(regex); // Instanciar classe Pattern no objeto pattern, compilando a fórmula regex
        Matcher match = pattern.matcher(cpf); // Usur o método matcher para indicar o texto onde será buscado o padrão informado.
        System.out.println(match.find()); /* Realiza a busca no texto cpf de acordo com o padrão informado em regex.
                                             Retorna true ou false se encontrar ou não.*/

        String numInt = "9822";

        //Representação em String do tipo que está sendo criado
        float fNum1 = Float.parseFloat("500.50");
        int iNum1 = Integer.parseInt(numInt);
        Double dNum1 = Double.valueOf("512.22");

        //o argumento somente aceita do tipo char, por isso que é usado aspas simples
        char cNum = 'a';

        //Criação do tipo primitivo natural
        Float fNum2 = Float.valueOf(500.50F);
        Integer iNum2 = Integer.valueOf(2800);
        Double dNum2 = Double.valueOf(512.22);

        System.out.println("Float representado por string: "+fNum1);
        System.out.println("Float natural: "+fNum2);
        System.out.println("Integer representado por string: "+iNum1);
        System.out.println("Char: "+cNum);

        }
}

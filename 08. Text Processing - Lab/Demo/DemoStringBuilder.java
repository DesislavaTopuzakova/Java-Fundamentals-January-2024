package textProcessing;

public class DemoStringBuilder {
    public static void main(String[] args) {

        //STRING BUILDER
        StringBuilder sb = new StringBuilder(); //празен string builder
        //1. лесно се модифицира текста
        //2. бърз
        sb.append("Hello, ");
        sb.append("John! ");
        sb.append("I sent you an email.");
        System.out.println(sb.toString());

        StringBuilder sbName = new StringBuilder("Desi");
        //добавям текст
        sbName.append(" Topuzakova");
        //взимам текста
        System.out.println(sbName.toString());
        //изтривам елементи от текст
        sbName.delete(3, 9);
        //обръщане на текст
        String fullName = "Desislava Topuzakova";
        StringBuilder fullNameBuilder = new StringBuilder(fullName);
        fullNameBuilder.reverse();
        System.out.println(fullNameBuilder);


        System.out.println(sb.length()); //дължината на текста в StringBuilder-a

        //вмъкване в текст
        sb.insert(0, "Ivan");

        //достъпване на символ в текста в StringBuilder
        System.out.println(sb.charAt(0));

    }
}

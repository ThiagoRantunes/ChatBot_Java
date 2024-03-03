import java.util.Scanner;
import java.util.ArrayList;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){
            options(args);
            System.out.println("Escolha sua Opção: ");
            int op = scanner.nextInt();
            if(op == 1){
                suboptionsEletronics(args);
                System.out.println("Escolha sua Opção: ");
                int subopE = scanner.nextInt();
            }else if(op == 2){
                suboptionsFoods(args);
                System.out.println("Escolha sua Opção: ");
                int subopF = scanner.nextInt();
            }else if(op == 3){ 

            }else if(op == 4){
                break;
            }
        }

    }

    public static void options(String[] op){
        String[] option = new String[4];
        option[0] = "1 - Eletronicos";
        option[1] = "2 - Foods";
        option[2] = "3 - Sua Lista";
        option[3] = "4 - Sair";

        for (String string : option) {
            System.out.println(string);
        }
    }

    public static void suboptionsEletronics(String[] op){
        String[] suboptions = new String[3];
        suboptions[0] = "1 - TV";
        suboptions[1] = "2 - Celular";
        suboptions[2] = "3 - SmartWatch";

        for (String string : suboptions){
            System.out.println(string);
        }
    }

    public static void suboptionsFoods(String[] op){
        String[] suboptions = new String[3];
        suboptions[0] = "1 - Hamburgues";
        suboptions[1] = "2 - Lasanha";
        suboptions[2] = "3 - Pizza";

        for (String string : suboptions){
            System.out.println(string);
        }
    }

    // public static void pusharray(int list){
    //     ArrayList<Integer> lista = new ArrayList<>();
    //     lista.add(list);
    // }

}
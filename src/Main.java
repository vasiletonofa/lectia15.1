import animal.*;
import filter.FilterService;

public class Main {
    public static void main(String[] args) {


//        Erbivor erbivor = (String nume) -> System.out.println("Mananca iarba " + nume);

//        erbivor.manancaIarba("Panda");

//        Zebra zebra = new Zebra();
//        zebra.manancaIarba("Zebra 1");
//        zebra.manancaIarba("Zebra 2");
//        zebra.manancaIarba("Zebra 3");
//
//        Carnivor carnivor = (String nume) -> System.out.println("Mananca carne " + nume);
//        carnivor.manancaCarne("Urs");
//        carnivor.manancaCarne("Lup");
//
//
//        Erbivor erbivor = (String nume) -> {
//            String s = "Mananca iarba " + nume;
//            s = s + "!";
//
//            return s;
//        };
//
////        Erbivor erbivor = (String nume) -> "Mananca iarba " + nume;
//
//        System.out.println(erbivor.manancaIarba("Panda"));

//        Leu leu = new Leu();
//        System.out.println(leu.manancaCarne("Leu", 5));
//
//        Carnivor carnivor = (String nume1, int kg2) -> {
//            return  "Mananca Carne " + nume1 + " " + kg2 + " kilograme";
//        };
//
//        String s = carnivor.manancaCarne("Lup", 2);
//
//        System.out.println(s);


        FilterService filterService = new FilterService();

       String[] filteredValues = filterService.filter(new String[]{"Andrei", "Ion", "Anton"},  (String s) -> s.startsWith("A") );
       String[] filteredValues2 = filterService.filter(new String[]{"Andrei", "Ion", "Anton"},  (String s) -> s.endsWith("n") );
       String[] filteredValues3 = filterService.filter(new String[]{"Andrei", "Ion", "Anton"},  (String s) -> s.contains("o") );


        for (String name: filteredValues3) {
            System.out.println(name);
        }





















        //        AnimalService animalService = new AnimalService();
//
//
//
//        animalService.mancaIarba(new Zebra());
//
//
//        Erbivor erbivor = new Erbivor() {
//            @Override
//            public void manancaIarba() {
//                System.out.println("Mananca Iarba Panda");
//            }
//        };
//
//        animalService.mancaIarba(erbivor);
//
//        animalService.mancaIarba(() -> System.out.println("Mananca Iarba Epure"));
//        animalService.mananca(() -> System.out.println("Mananca Carne Leu"));

//        Carnivor[] carnivorList = new Carnivor[3];
//        carnivorList[0] = new Leu();
//        carnivorList[1] = () -> System.out.println("Mananca Carne Urs");
//        carnivorList[2] = () -> System.out.println("Mananca Carne Panda"); // Java a creat o Clasa si un obiect
//
//        for (Carnivor carnivor : carnivorList) {
//            carnivor.manancaCarne();
//        }

//        String[] numeList = new String[4];
//        numeList[0] = "Leu";
//        numeList[1] = "Urs";
//        numeList[2] = "Panda";
//
//
//        String[] numeList2 = new String[] {"Leu", "Urs", "Panda"};

//        AnimalService animalService = new AnimalService();
//        animalService.mananca(new String[] {"Urs", "Leu", "Panda"});


    }
}
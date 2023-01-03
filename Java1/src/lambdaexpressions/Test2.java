package lambdaexpressions;


//class Ola implements Manga{
//    public void cabManga(String source, String destination){
//        System.out.println("Ola manga is cabbed from" + source + "to" + destination);
//    }
//}

public class Test2 {
    public static void main(String[] args) {

        Manga manga = (String source, String destination) ->
                System.out.println("Ola manga is cabbed from " + source + " to " + destination);
        manga.cabManga("Berserk", "Georgia");


    }
}

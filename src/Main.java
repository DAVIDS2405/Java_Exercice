public class Main {
    public static void main(String[] args) throws Exception {
        //Presentation
        System.out.println("Presentacion del juego de God of War");
        System.out.println(" El que tendra el goty del año <3");

        //New God of War Name
        Videogames Game1 = new Videogames();

        //Get the Atrributes of the game
        
        //PS5

        System.out.println("  --------------------------------------"); // Getter extrac the original description and numebers of the game
        System.out.println(" |                  "+ Game1.getConsole_Name() + "                 |");
        System.out.println(" |          "+ Game1.getName() + "         |");
        System.out.println(" |          "+ Game1.getCompany() + "         |"); 
        System.out.println(" |          "+ Game1.getSerial_Number() + "                   |");
        System.out.println(" |          "+ Game1.getNumber_Of_Players() +"                           |");
        System.out.println(" |          " + Game1.getDescription() + "           |");
        System.out.println(" |          " + Game1.getGame_Price() + "$                      |");
        System.out.println(" |          " + Game1.getRestriction() + "                       |");
        System.out.println("  --------------------------------------");
        System.out.println();

        //PS4
        Videogames Game2 = new Videogames(); //Setter change the words numbers, etc of the original
        Game2.setConsole_Name("PS4");
        Game2.setGame_Price(49.99);
        Game2.setSerial_Number(2123213221);


        System.out.println("  --------------------------------------"); // Getter extrac the new and old description
        System.out.println(" |                  " + Game2.getConsole_Name() + "                 |");
        System.out.println(" |          " + Game2.getName() + "         |");
        System.out.println(" |          " + Game2.getCompany() + "         |");
        System.out.println(" |          " + Game1.getDescription() + "           |");
        System.out.println(" |          " + Game2.getSerial_Number() + "                  |");
        System.out.println(" |          " + Game2.getNumber_Of_Players() + "                           |");
        System.out.println(" |          " + Game2.getGame_Price() + "$                      |");
        System.out.println(" |          " + Game2.getRestriction() + "                       |");
        System.out.println("  --------------------------------------");

        




        
    }
}

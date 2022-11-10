public class Videogames {
    //ATTRIBUTES
    String Console_Name;
    String Name;
    String Restriction;
    String Company;
    String Description;
    int Serial_Number;
    int Number_Of_Players;
    double Game_Price;

    //CONSTRUCTOR
    public Videogames(){
        Console_Name = "PS5";
        Name = "God of war Ragnarok";
        Restriction = "M 17+";
        Company = "Santa Monica Studio";
        Description = "God of War: Ragnarok        |\n |          es la secuela del aclamado  |\n |          God of War (2018)";
        Serial_Number = 213762312;
        Number_Of_Players = 1; 
        Game_Price = 69.99;

    }

    // METHODS
    public void Fabricate_The_Game(){

    }
    public void Paint_The_Game(){

    }
    public void runnig_The_Game() {

    }
    public void charge_The_Grafics() {

    }
    public void Read_The_Joystick() {

    }
    public void In_Game_Jump(){

    }
    public void In_Game_Run(){

    }
    public void In_Game_Kill_Enemys() {

    }
    public void In_Game_Bend(){
    }

    //GETTER AND SETTER

    public String getConsole_Name() { // Extrac the name original of the console put in the method
        return Console_Name;
    }

    public void setConsole_Name(String console_Name) { // Change the name of the console
        Console_Name = console_Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRestriction() {
        return Restriction;
    }

    public void setRestriction(String restriction) {
        Restriction = restriction;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getSerial_Number() {
        return Serial_Number;
    }

    public void setSerial_Number(int serial_Number) {
        Serial_Number = serial_Number;
    }

    public int getNumber_Of_Players() {
        return Number_Of_Players;
    }

    public void setNumber_Of_Players(int number_Of_Players) {
        Number_Of_Players = number_Of_Players;
    }

    public double getGame_Price() {
        return Game_Price;
    }

    public void setGame_Price(double game_Price) {
        Game_Price = game_Price;
    }

    

    
    


}

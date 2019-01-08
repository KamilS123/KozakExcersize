package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_6;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(30,"white","Janek",187,"Black",30,"kowalski");
        human.sound();

        GoldFish fish = new GoldFish(30,"red","Karp",100,"Pacyfik","Marcel",30);
        fish.sound();
        System.out.println(fish.toString());

        Fish fish1 = new Fish(34,"red","makita",567,"Europe");
        Mammal mammal = new Mammal(45,"green","kosa",178,"white");

        Zbieranina zbieranina = new Zbieranina();
        zbieranina.addFish(fish1);
        zbieranina.addMammal(mammal);

        System.out.println("mammal list-------------------------");
        zbieranina.showMammalList();

        System.out.println("\nfishlist..........................");
        zbieranina.showFishList();
    }
}
/*
Zadanie 6. Napisz program, w którym zasymulujesz hierarchię dziedziczenia zwierząt.
Stwórz abstrakcyjną klasę Animal, po której będą dziedziczyły klasy Fish i Mammal.
 Wszystkie te klasy powinny być abstrakcyjne. Następnie stwórz konkretne klasy,
 które dziedziczą po Fish i Mammal. Będą to odpowiednio Goldfish i Human.
  Nadpisz metodę toString w każdej z tych klas.
   Stwórz instancje obu tych klas i wyświetl je na konsoli.*/
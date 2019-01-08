package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadanie_7;

public class Forum {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("Kaja","Paschalska",30);
        User user2 = new User("Bronek","Warek",26);
        User user3 = new User("Olek","Kos",49);

        user.logIn(user1);
        user.userCounter();
        user.logIn(user2);
        user.userCounter();
        user.logIn(user3);
        user.userCounter();
        System.out.println("\n");

        user.wswielListe();
        user.logOut(user1);
        System.out.println("\n");
        user.wswielListe();

        System.out.println("\n");
        user.logOut(user3);
        user.wswielListe();
    }
}
/*Zadanie 7. Napisz dwie klasy: Forum, User. Klasa User powinna posiadać następujące atrybuty: name, sex, age; zaś
klasa Forum powinna zawierać atrybut określający liczbę zalogowanych użytkowników. Proszę zaprojektować oraz
zaimplementować tak klasy aby symulowały one działanie forum w internecie, tzn. przy tworzeniu obiektu z klasy User
 licznik zalogowanych użytkowników powinien się zwiększyć o 1. Napisz dodatkowe metody np. logout. Przetestuj działanie
  tych klas.*/

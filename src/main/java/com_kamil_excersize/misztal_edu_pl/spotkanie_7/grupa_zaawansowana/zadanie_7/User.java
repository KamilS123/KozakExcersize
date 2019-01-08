package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadanie_7;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String sex;
    Integer age;
    Integer counter = 0;
    List<User>usreList = new ArrayList<>();

    public User(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public User() {
    }

    public void logIn(User user) {
        usreList.add(user);
            counter++;
    }

    public void logOut(User user) {
            if(usreList.contains(user)) {
                usreList.remove(user);
            }
            counter--;
    }

    public void userCounter() {
        System.out.println("Zalogowanych -> " + counter);
        System.out.println("userlist size " + usreList.size());
    }

    public void wswielListe() {
        for(User u : usreList)  {
            System.out.println(u);
        }
    }

    @Override
    public String toString() {
        return  name + " " + sex + " " + age;
    }
}


package org.greeting;

public class Greeting {

    public String getGreetingByCountryCode(String countryCode){

        switch(countryCode) {
            case "BR":  return "Oi meus amigos!";
            case "US":  return "Hello, my friends!";
            case "ES":  return "Hola amigos!";
            default: return "Hello";


        }

    }

    public static void main(String[] args) {
        var greeting = new Greeting();
        System.out.println(greeting.getGreetingByCountryCode("ES"));
    }
}

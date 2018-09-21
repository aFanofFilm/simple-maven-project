package com.mycompany.app;
 import java.util.UUID;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println(("You did it "+" Do it again"));
        System.out.println( "Unique ID : " + obj.generateUniqueKey() );
        System.out.println("I made a change");
    }

    public String generateUniqueKey(){
        String id = UUID.randomUUID().toString();
        return id;

    }
}

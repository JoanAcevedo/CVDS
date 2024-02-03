package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length == 0) {
            System.out.println( "Hola Mundo!\nSomos Miguel y Joan" );
        } else if (args.length >= 1) {
            System.out.println("Hola " + args[0]);
        }
    }
}

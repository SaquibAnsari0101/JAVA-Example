package com.company;


public class Strings {

    public static void main(String[] args) {

        //String : Size depends on the length, Stores a sequence of characters.

        //Declaration :
        String message = "Hi I am Saquib!!"; //String name = "String literals in this quotes";
        //or
        String messageSecond = new String(" How Amazing is JAVA! ");

        String messageThird = "   HEY   ";

        //String Methods :
        //as strings are immutable everytime we apply a method new object instance of string is created!!!

        //Length of string : Returns length of string.
        System.out.println("\nLength of string \"Hi I am Saquib!!\" : "+message.length());

        //Replace : replace a given char in the string to the target string
        System.out.println("\nReplaced '!' in \"Hi I am Saquib!!\" : "+message.replace('!','#'));

        //Endswith : returns a boolean true if the sting ends with the string or character provided.
        System.out.println("\nEndswith 'b!!' on \"Hi I am Saquib!!\" : "+message.endsWith("b!!"));

        //Concatenation of two strings.
        System.out.println("\nConcatenation : "+message.concat(messageSecond));

        //Lowercase the string.
        System.out.println("\nLowercase : "+message.toLowerCase());

        //Uppercase the string.
        System.out.println("\nUppercase : "+messageSecond.toUpperCase());

        //Index of a character : returns -1 is character is not present.
        System.out.println("\nIndex of 'S' in \"Hi I am Saquib!!\" : "+message.indexOf('S'));

        //Trim : trims unnecessary white spaces from front and back of the sting
        System.out.println("\nTrimmed white spaces from\"   HEY   \" : "+messageThird.trim());
    }
}


/*
OUTPUT :
    Length of string "Hi I am Saquib!!" : 16

    Replaced '!' in "Hi I am Saquib!!" : Hi I am Saquib##

    Endswith 'b!!' on "Hi I am Saquib!!" : true

    Concatenation : Hi I am Saquib!! How Amazing is JAVA!

    Lowercase : hi i am saquib!!

    Uppercase :  HOW AMAZING IS JAVA!

    Index of 'S' in "Hi I am Saquib!!" : 8

    Trimmed white spaces from"   HEY   " : HEY

*/
public class Type {

    public static void main(String[] args) {
        //Data types are divided into two groups:
            //Primitive data types - includes byte, short, int, long, float, double, boolean and char
            //Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later codes)

        /*Primitive Data Types*/
        System.out.println("PRIMITIVE DATA TYPES ---------\n");
        //size 1 byte, 	Stores whole numbers from -128 to 127
        byte count = 100;
        System.out.println("byte count : "+count);

        //size 4 bytes, Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int lettersInBook = 300_980_123; //'_' indicate ',' for ease of reading
        System.out.println("int lettersInBook : "+lettersInBook);

        //size 8 bytes, Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long speedOfLightInCM = 29_979_245_800L; // L to denote long
        System.out.println("long speedOfLightInCM : "+speedOfLightInCM);

        //size 4 bytes, Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float price = 18.15F; //F to denote float
        System.out.println("float price : "+price);

        //size 8 bytes, Stores fractional numbers. Sufficient for storing 15 decimal digits
        double pi = 3.141592653589793;
        System.out.println("double pi : "+pi);

        //size 2 bytes, Stores a single character/letter or ASCII values
        char letter = 'D';
        System.out.println("char letter : "+letter);

        //size 1 byte, 	Stores true or false values
        boolean isEligible = true;
        System.out.println("boolean isEligible : "+isEligible);

        /*Reference Data Types some examples*/
        System.out.println("\nREFERENTIAL DATA TYPES ---------\n");
        //size depends on the length, Stores a sequence of characters
        String message = "Jesus Christ!";
        System.out.println("String message : "+message);

        //size depends on number of elements, Stores
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Array arr : "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" ");
    }
}

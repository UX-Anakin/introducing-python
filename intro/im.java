public class im {
    public static void main (String[] args) {
        int language = 3;
        System.out.format("Language %d: I am Java! Scarier than C!\n", language);
    }
}
/*
 * A: How to run a Java program from the command line?
 * -1. The Java File 
 *      im.java 
 * -2. Compile the Java File to *.class file 
 *      javac im.java # This will create a im.class file 
 * -3. Execution of the Java File
 *      java im 
 * -4. Creation of an executable *.jar file 
 *      You've got two options here
 *          1. With an external manifest file:
 *              jar -cvfm im.jar MANIFEST.mf im.class 
 *          2. Executable by Entry Point:
 *              jar -cvfe im.jar <MainClass> im.class 
 * -5. To run the Jar file
 *      java -jar im.jar
 * 
 * */

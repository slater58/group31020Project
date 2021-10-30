public class App {
    public static void main(String[] group3) {
        System.out.println("Print Your Name Below:");
        System.out.println("Timothy");
        System.out.println("Andrew");



        System.out.println("Expected Name List:");
        while (fileIn.hasNextLine()) {
            String s = fileIn.nextLine();
            names.add(s);
            System.out.println(s);
        }
        saved.println(names.toString());
        saved.close();
        fileIn.close();



    }
}

public class MyApp {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("******* Welcome To MyApp ********");

        for (int i=0;i<5;i++){
            System.out.println("Program is running");
            Thread.sleep(3000);
        }

        System.out.println("***** Closing MyApp ******");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        int UpCount = 0;

        for(int i = 0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
                UpCount++;
            }
        }

        System.out.println("The number of uppercase letters is " + UpCount);

    }
}

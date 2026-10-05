public class Voting {
    public static void main(String[] args) {

        int age = 1800;

        if (age < 0 || age > 120)
            System.out.println("Invalid Age");
        else if (age >= 18)
            System.out.println("Eligible for Voting");
        else
            System.out.println("Not Eligible for Voting");
    }
}

public class VerificationMajorite {
    public static void main(String[] args) {
        double votreAge = Double . parseDouble ( args [0]) ;
        System.out.println("Âge passé en argument : " + votreAge);
        if (votreAge < 18) {
            System.out.println("Vous êtes mineur");
        }
        else {
            System.out.println("Vous êtes majeur");
        }
        }
}
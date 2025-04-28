import java.util.Random;

class BooksNamesGenerator {
    private static final int MaxNameLength = 20;
    private static final String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";

    public static String[] generateNames(int BooksNumber) {
        Random random = new Random();
        String[] BooksNames = new String[BooksNumber];

        for (int i = 0; i < BooksNumber; i++) {
            BooksNames[i] = generateRandomName(random);
        }

        for (int i = 0; i < 10; i++){
            System.err.println(BooksNames[i]);
        }

        return BooksNames;
    } 

    private static String generateRandomName(Random random){
        int nameLength = random.nextInt(MaxNameLength) + 1;
        StringBuilder sb = new StringBuilder(nameLength);

        for (int i = 0; i < nameLength; i++){
            sb.append(Alphabet.charAt(random.nextInt(Alphabet.length())));
        }

        return sb.toString();
    }
}

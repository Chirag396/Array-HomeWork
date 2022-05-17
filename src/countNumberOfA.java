import com.sun.deploy.util.StringUtils;

public class countNumberOfA {
        public static void main(String[] args) {

            //counting how many specific character in a String

            //user enter his text

            String exampleString = "I would love to go to London city";



            int totalCharacters = 0;
            char temp;
            // for loop to check how many time 'o' is used in the text
            for (int i = 0; i < exampleString.length(); i++) {

                temp = exampleString.charAt(i);
                if (temp == 'o')
                    totalCharacters++;
            }

            System.out.println("o appears " + totalCharacters + " times in example String");
        }









}





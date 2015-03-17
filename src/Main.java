public class Main {

    public static void main(String[] args) {

        char[] letter = {'a', '.', '.', '.', 'd', '.', 'a', '.', '.', 's','u','p','e','.','r'};

        char temp;
        int i = 0;
        while (i < letter.length) {
            System.out.println(letter);
            System.out.println("i: " + i + "; letter[i] " + letter[i]);
            if (letter[i] == '.') {
                int k = i+ 1;
                while(k<letter.length){

                    System.out.println("k: " + k + "; letter[k] " + letter[k]);
                    if (letter[k] == '.') {


                        k++;

                    } else {


                        temp = letter[i];
                        letter[i] = letter[k];
                        letter[k] = temp;

                        break;
                    }

                }


            }

            i++;


        }
    }
}

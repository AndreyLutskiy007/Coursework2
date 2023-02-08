import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        String[] java = {"java", "best", "best", "language"};
        for (int i = 0; i < java.length; i++) {
            String currentString = java[i];
            for (int j = i + 1; j < java.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(java[j])) {
                    java[j] = null;
                    java[i] = null;
                }
            }
            System.out.println(java[i]);
        }
        StringBuilder sn = new StringBuilder();
        for (String ja : java) {
            if (ja != null) {
                sn.append(ja);
            }

        }
        String string = sn.toString();
        System.out.println(string);


    }


}
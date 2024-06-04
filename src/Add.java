
public class Add {
    public static void main(String[] args) {

        String teks = "AhmadSholihin";
        char[] plain = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w'};
        char[] chipper = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e'};

        StringBuilder a = new StringBuilder();
        for (int i = 0; i < teks.length(); i++) {
            char ubah = Character.toLowerCase(teks.charAt(i));
            for (int j = 0; j < plain.length; j++) {
                if (ubah == plain[j]) {
                    a.append(chipper[j]);
                    break;
                }
            }
        }
        System.out.println(a);
    }
}
public class paidHomeWork4 {

    public static void main(String[] args) {


        String text = "პეტრე ჩაიკოვსკი";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'ა' || ch == 'ე' || ch == 'ი' || ch == 'ო' || ch == 'უ')
                     {

                count++;
            }
        }
        System.out.println("ხმოვნების რაოდენობა: " + count);
    }
}

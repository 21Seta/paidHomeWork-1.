public class paidHomeWork5
{
    public static void main(String[] args)
    {


        String text = "გამარჯობა მეგობარო";
        int i = 0;
        int count = 0;

        while (i < text.length()) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch) && !(ch == 'ა' || ch == 'ე' || ch == 'ი' || ch == 'ო' || ch == 'უ')){

                count++;
            }
            i++;
        }

        System.out.println( "თანხმოვნების რაოდენობა " + count);
    }
}

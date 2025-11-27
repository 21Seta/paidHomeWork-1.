public class paidHomeWork5
{
    public static void main(String[] args)
    {


        String text = "hello friend";
        int i = 0;
        int count = 0;

        while (i < text.length()) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){

                count++;
            }
            i++;
        }

        System.out.println( "თანხმოვნების რაოდენობა " + count);
    }
}

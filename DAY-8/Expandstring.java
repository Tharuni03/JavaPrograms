public class Expandstring {

    public static void main(String[] args) {
        String str = "a1c4t2";
        char alphabets[] = new char[6];
        int digits[] = new int[6];
        int x = 0, y = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                alphabets[x] = str.charAt(i);
                x++;

            }
            else if(Character.isDigit(str.charAt(i)))
            {
                digits[y] = str.charAt(i) - '0';
                y++;
            }

        }
        for(int i=0;i<alphabets.length; i++)
        {
            char ch= alphabets[i];
            for(int j=0; j<digits[i];j++)
                System.out.print(ch);
        }
    }
    
}

//OUTPUT:
//acccctt
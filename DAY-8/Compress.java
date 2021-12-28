
public class Compress {
    public static void main(String[] args) {
        String str = "hhhyqqpppp";
        for(int i=0; i<str.length();i++)
        {
            int count=0;
            char ch=str.charAt(i);
            if(ch!='\0')
            {
            for(int j=i; j<str.length(); j++)
            {
                if(ch==str.charAt(j))
                    count++;
                else
                {
                    break;
                }
            }
            System.out.print(ch+""+count);
        }
            str=str.replace(ch,'\0');
        }
            
    }
    
}

//OUTPUT:
//h3y1q2p4


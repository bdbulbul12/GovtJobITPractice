
package stringtocamelcase;

import java.util.Calendar;

public class CaseConvert {
    
    String camelCase(String str){
        StringBuilder builder = new StringBuilder(str);
        boolean isLastSpace = true;
        
        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);
            
            if(isLastSpace && ch>='a' && ch<='z'){
                builder.setCharAt(i, (char) (ch + ('A'-'a')));
                isLastSpace=false;
                
            }else if(ch!= ' '){
                isLastSpace=false;
            }else{
                isLastSpace=true;
            }
            
        }
        return  builder.toString();
    }
    
    public static void main(String[] args) {
        CaseConvert convert = new CaseConvert();
        String str = convert.camelCase("this is sample string2");
        System.out.println(str);
    }
}

package org.itstep.task06;
import java.util.Arrays;
public class MainString {
    private char []chars=new char[0];

    public MainString() {

    }
    public MainString(CharSequence str){
        chars=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            chars[i]=str.charAt( i );
        }
    }
    public MainString(char s,int len){
        chars=new char[len];
        Arrays.fill(chars,s);
    }
public int length(){
        return chars.length;
}
public void clean(){
        chars=new char[0];
}
public MainString concat(MainString other) {
    MainString res=new MainString();
    res.chars=Arrays.copyOf( this.chars,this.chars.length+other.chars.length );
    System.arraycopy( other.chars,0,res.chars,this.chars.length,other.chars.length );
    return res;
}
public int indexOf(int s){
        int idx=-1;
    for(int i=0;i<chars.length;i++) {
if(chars[i]==s){
idx=i;
break;
}
    }
        return idx;
}
@Override
    public String toString(){
        return new String(chars);
}


}

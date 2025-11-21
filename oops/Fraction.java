public class Fraction
{
    int num;
    int den;
    static Fraction add(Fraction f1,Fraction f2){
        int num = f1.num*f2.den + f1.den*f2.num;
        int den = f1.den*f2.den;
        Fraction f3 = new Fraction(num,den);
        return f3;
    }
    Fraction(int num,int den){
        this.num=num;
        this.den=den;
        simplyfy();
    }
    void simplyfy(){
        for(int i=num;i>=1;i--){
            if(num%i==0&&den%i==0){
                num/=i;
                den/=i;
                return;
            }
        }
    }
   public static void main (String[] args) {
       Fraction f1 = new Fraction(35,21);
       Fraction f2 = new Fraction(7,3);
       Fraction f3 = add(f1,f2);  //we can directly call don't need class bcz func. main is in the scope of class
       System.out.println(f3.num+"/"+f3.den);
   } 
}

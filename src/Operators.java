public class Operators {
    public static void main(String[] args) {
        //Basic operators -, +, *, /, % (modžul-izruna? dalīts, mēģina izdalīt cik reizes var, ir atlikums?)
        int x=100;
        int y=100;
        System.out.println(x);
        x=x+10;
        System.out.println(x);
        y=y%76;
        System.out.println(y);

        //Assignment operator =. -=, +=, *=, /=
        int a=10;
        a=20;
        System.out.println(a);
        a*=20;
        System.out.println(a);

        //Logical operators
        //incrementation - palielina par 1, tikai par 1
        //pre
        int b=5;
        ++b;
        b++;
        System.out.println(b);
        //post
        int c=10;
        System.out.println(c++);
        System.out.println(c);

        //4 ways to increase by 1
        c=c+1;
        c+=1;
        c++;
        ++c;
        System.out.println(b==c);
    }
}

class unary_arithmatic_relational_operators{
 
           public static void main(String args[])
           {
                int a=10;
                int b=5;
                System.out.println("Value of a: " + a);
                System.out.println("Value of b: " + b);
                System.out.println();

                System.out.println("Unary Operators");
                a++;
                ++a;
                a--;
                --a;
                System.out.println("Value of a: " + a);

                System.out.println();

                System.out.println("Arithmatic Operators");
                int add=a+b;
                int sub=a-b;
                int mult=a*b;
                int div=a/b;
                int mod=a%b;
 		System.out.println("Addition of a & b: " + add);
                System.out.println("Subtraction of a & b: " + sub);
                System.out.println("Multiplication of a & b: " + mult);
                System.out.println("Division of a & b: " + div);
                System.out.println("Modulus of a & b:" + mod);

                System.out.println();
 
                System.out.println("Relational Operators");
                boolean equal_to = a==b;
                System.out.println("a & b are equal : " + equal_to);
                boolean not_equalto= a!=b;
                System.out.println("a & b are not equal :" + not_equalto);
                boolean greater= a>b;
                System.out.println("a is greather than b:" + greater);
                boolean small= a<b;
                System.out.println("a is less than b: "+ small);
                boolean greater_Equal= a>=b;
                System.out.println("a is greater than or equalto b :" + greater_Equal);
                boolean less_Equal= a<=b;
                System.out.println("a is less than or equalto b :" + less_Equal);
          }

}
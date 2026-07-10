public class methods {
    public static void main(String[] args) {

        // methods syntax:
        // accessModifier returnType methodName(Parameter){
        //                method body
        // }

        int[] a = {1, 2, 5, 67, 3, 32, 43};
        sumOfArray(a);


        String b = "       ekta  ";
        String str = upperStr(b);
        System.out.println(str);

        int x = 12;
        int y = 12;
        System.out.println(sum(x,y));

        System.out.println(sum(1,2,4));

        System.out.println(sum(12,54));

        System.out.println(sum(1,4,4,3,2));  //sout(sum(new arr{1,2,4,5,6}))
    }

        public static void sumOfArray(int[] arr){
            int sum = 0;
            for (int i : arr){
                sum += i;
            }
            System.out.printf("Sum of array is : %d%n",sum);
        }

        public static String upperStr(String str){
        return str.strip().toUpperCase();
        }

        private static int sum(int a, int b){
        return a + b;
        }

        // method Overloading : same method name but different number of parameters or different type of parameters
        // method signature : method name + parameters (signature should be different or else it will result in error)


        private static int sum(int a, int b, int c){
        return a + b +c;
        }

        private static float sum(float a, float b){
        return a + b;
        }

        // variable args

        private static int sum(int...a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
        }
}

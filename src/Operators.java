public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        int mark = 80;
        char grade;

        double x = 100.25;
        double y = 100.33;

        int result;
        boolean success = false;

        result = success ? a : b;

        System.out.println("Result:" +result);

    //IF STATEMENTS AND OPERATORS

        if (a>b)
        {
            System.out.println("a is grater than b");
        }
        else {
            System.out.println("b is the grater than a");
        }

        if ((a==1) || (b!=1))
        {
            System.out.println("Success a is 1");
        }

        if ((a>=1) && (b>=1))
        {
            System.out.println("Success");
        }

    // GRADE WITH CASE STATEMENT

        switch (mark){
            case 90:
                grade = 'A';
                System.out.println("GRADE:" +grade);
                break;
            case 80:
                grade = 'B';
                System.out.println("GRADE:" +grade);
                break;
            default:
                grade = 'X';
                System.out.println("Cannot determine GRADE");
                break;
        }

        // DO WHILE STATEMENT

        int count = 1;

        do {
            System.out.println("count's value is:" +count);
            count++;
           } while (count <= 10);

    }
}


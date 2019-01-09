public class runner {

    public static void main(String[] args)
    {
        int[] integer = util.randIntArr(10);
        int[] before = integer;

        for(int num:integer)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        util.bubbleSort(integer);
        time=System.nanoTime()-time;

        for(int num:integer)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Time Taken: "+time);

        double[] dou = util.randDouArr(10);
        double[] before = dou;

        for(double num:dou)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        util.selectionSort(dou);
        time=System.nanoTime()-time;

        for(double num:dou)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Time Taken: "+time);


    }
}
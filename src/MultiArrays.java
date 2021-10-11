import java.util.Arrays;

public class MultiArrays {

    public static void main(String[] args) throws Exception{
        //	int [][] arr = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
        //	char[][] aray = {{'a','b','v'},{'c','d','z'},{'x','y','z'}};
        long[][] arr1 = {{10,11,12},{15,10,10},{15,10,10},{15,7777,10}};

        boolean [][] arr2 ={{true, false, false},{true, false, false},{true, true, true},{false, true, false},{true}};

        System.out.println(Arrays.toString(MultiArrays.returnLongArray(arr1, arr2)));



    }

    // task 1
    public static int multiArraySumOfDiagonals(int [][] mass) {
        int sum=0;
        int counter=0;

        for (int i=0; i<mass.length; i++) {

            counter++;
            for(int x=0; x<mass[i].length;x++) {

                sum+=mass[i][x+i]+mass[i][(mass[i].length-1)-i];
                break;

            }

        }

        if(mass.length%2==0) {
            return sum;

        }
        else {
            return sum-mass[counter/2][counter/2];

        }

    }
    // task2
    public static long[] returnLongArray(long [][]mass1, boolean [][]mass2)  throws Exception{
        if(mass1.length!=mass2.length) {
            System.out.println("Make lenghts of arrays the same!!! Method#2");
            System.exit(0);
            //throw new Exception("Wrong length of arrays!!! Method#2");
        }


        int count=0;
        for (int i=0; i<mass2.length; i++) {
            for(int x=0; x<mass2[i].length; x++) {
                if(mass2[i][x]) {count++;}
            }
        }

        long [] temp = new long[count];
        int count2=0;

        for (int i=0; i<mass2.length; i++) {
            for(int x=0; x<mass2[i].length; x++) {
                if(mass2[i][x]) {temp[count2++]=mass1[i][x];}
            }
        }

        return temp;
    }



    // task 3
    public static void multiArrayPrint(char [][] mass) {


        for (int i=0; i<mass.length; i++) {
            for(int x=0; x<mass[i].length; x++) {
                System.out.print(mass[i][x]+ " ");

            }

            System.out.println();

        }

    }





}

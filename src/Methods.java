public class Methods {
    public static void main(String[] args) {

        System.out.println("Need to create different arrays");
        System.out.println("All methods are static");


    }

    //1
    public static void arrayPrint(char [] mass) {
        for(int i=0; i<mass.length;i++) {
            System.out.print(mass[i]+ " ");
        }
    }
    //2
    public static char[] getChars(int [] mass) {
        char[] temp = new char[mass.length];

        for(int i=0; i<mass.length;i++) {
            temp[i]=(char)mass[i];
        }
        return temp;
    }
    //3
    public static int getBigger2(int a, int b) {
        if(a>b) {return a;}
        else {return b;}
    }
    //4
    public static int getBigger3(int a, int b, int c) {

        return Math.max(c,Math.max(a, b));
    }
    //5
    public static int getBigger5(int a, int b, int c, int d, int z) {

        return Math.max(z,Math.max(d,Math.max(c,Math.max(a, b))));
    }
    //6
    public static String getStringFromChars(char [] mass) {
        return String.valueOf(mass);
    }
//7 no task



    //8
    public static int getValidIntFromStart(int [] mass, int a) {
        int temp=-1;
        for(int i=0; i<mass.length;i++) {

            if(mass[i]==a) {temp=i;break;}

        }

        return temp;

    }


//9

    public static int getValidIntFromEnd(int [] mass, int a) {
        int temp=-1;
        for(int i=0; i<mass.length;i++) {

            if(mass[i]==a) {temp=i;}

        }

        return temp;

    }



    //10
    public static int factorial(int number) {
        int sum = 1;
        int[] mass = new int[number];
        mass[0]=1;

        for(int z=1; z<=mass.length; z++){
            mass[z-1]=z;
        }

        for(int i=1; i<mass.length; i++){
            sum*=mass[i];
        }

        return sum;
    }
    //11
    public static boolean leapYear(int year) {
        if(year%4==0){ //1
            if(year%100==0){ //2
                if(year%400==0){return true;} else{return false;}
            }
            else{return true;}//2
        }
        else{return false;} //1

    }
    // 12
    public static int[] multipleArray(int [] mass, int number) {
        int count=0;
        int count2=0;
        for(int i=0; i<mass.length;i++) {
            if(mass[i]%number==0) {
                count++;
            }
        }

        int [] massTemp = new int[count];

        for(int i=0; i<mass.length;i++) {
            if(mass[i]%number==0) {
                massTemp[count2++]=mass[i];
            }
        }

        return massTemp;
    }
    //13
    public static void  arraySort(int[] mass) {
        int temp=0;
        for(int z=0; z<mass.length;z++){
            for(int i=0; i<mass.length-1;i++) {
                if(mass[i]>mass[i+1]){
                    temp=mass[i];
                    mass[i]=mass[i+1];
                    mass[i+1]=temp;

                }

            }
            System.out.print(mass[z]+" ");

        }

    }
//14

    public static boolean repeatedElement(byte [] mass) {
        boolean temp = false;
        int counter=0;

        for(int i=0; i<mass.length;i++){

            for(int z=i+1; z<mass.length;z++) {
                if(mass[i]==mass[z]){
                    counter++;
                }
            }
        }

        if(counter>0){
            temp=true;
        }


        return temp;

    }

    // 15
    public static  int[] arrayReturn(int [] mass1,int [] mass2) {
        int [] temp = new int[mass1.length];
        if(mass1.length!=mass2.length){
            return null;}
        else{
            for(int i=0; i<mass1.length;i++) {
                temp[i]=mass1[i]*mass2[i];
            }
        }
        return temp;
    }

    //16
    public static int[] uniqueElementsInArray(int[] mass,int[] mass2){

        int counter=0;
        int [] temp = new int[mass.length+mass2.length];
        int[] temp2=new int[mass.length];

        //write mass to temp2
        for(int r=0; r<mass.length;r++) {
            temp2[r]=mass[r];
        }
        // find the same elements in mass and make them 0
        for(int i=0; i<mass.length;i++){

            for(int z=0; z<mass2.length;z++) {
                if(mass[i]==mass2[z]){
                    mass[i]=0;
                }
            }

        }
        // write left elements from mass to temp
        for(int z=0; z<mass.length;z++) {
            if(mass[z]!=0) {
                temp[counter++]=mass[z];
            }
        }
        // ==========Part2===============

        //find the same elements in mass2 and make them 0
        for(int i=0; i<mass2.length;i++){

            for(int z=0; z<temp2.length;z++) {
                if(mass2[i]==temp2[z]){
                    mass2[i]=0;
                }
            }
        }
        // write left elements from mass2 to temp
        for(int z=0; z<mass2.length;z++) {
            if(mass2[z]!=0) {
                temp[counter++]=mass2[z];
            }
        }

        int [] temp3 = new int[counter];
        // make new array temp3 with length counter and write elements from temp to it
        for(int r=0; r<temp3.length; r++) {
            temp3[r]=temp[r];
        }

        return temp3;

    }

    //17
    public static  int[] reverseArrayReturn(int[] mass) {

        int counter=0;
        int[] temp = new int[mass.length];

        for(int z=mass.length-1; z>=0;z--) {
            temp[counter]=mass[z];
            counter++;
        }

        return temp;
    }
//18

    public static  int[] randomValues(int size, int bottom, int upper) {

        int[] temp = new int[size];


        for (int i=0; i<size;i++) {

            temp[i] = (int)(bottom + Math.random() * upper);

        }

        return temp;
    }

    //19
    public static boolean checkCharactersSequence(char [] mass1, char [] mass2) {

        boolean temp=false;
        int count=0;

        for(int i=0; i<mass2.length;i++) {
            for(int x=0; x<mass1.length;x++) {
                if(mass2[i]==mass1[x]) {
                    count++;
                    break;
                }

            }

        }

        if(count>1) {temp=true;}

        return temp;

    }


}

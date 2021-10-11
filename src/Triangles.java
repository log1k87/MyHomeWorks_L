public class Triangles {

    public static void main(String[] args) {

// 1 triangle;
        for(int i=0;i<=3;i++){
            for(int z=0;z<i;z++){
                System.out.print("*");
            }

            System.out.println();

        }
        System.out.println("     ");
// 2 triangle;
        String s="";
        for(int i=0;i<=3;i++){
            System.out.print(s);
            for(int z=3;z>i;z--){
                System.out.print("*");
            }
            s+=" ";
            System.out.println();
        }

// 3 triangle;

        String z="*";
        for(int i=0;i<3;i++){
            for(int t=i;t<2;t++){
                System.out.print(" ");
            }
            System.out.print(z);
            z+="*";
            System.out.println();
        }

    }


}

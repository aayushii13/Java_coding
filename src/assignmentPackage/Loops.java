package assignmentPackage;

public class Loops {
	
	public static void main(String[] args) {
        int i = 1;
        while (i <= 0){
            System.out.println(i +".Hii");
            i++;
        }
        System.out.println("Value of i: " + i);
        System.out.println();

        int j = 1;
        do {
            System.out.println(j +". Hello");
            j++;
        } while(j <= 0);
        System.out.println("Value of j: " + j);
        System.out.println();

        for (int k = 1; k<=5; k++){
            if(k ==3){
                break;
            }
            System.out.println(k +". Okay");
        }
        System.out.println();

        for (int k = 1; k<=5; k++){
            for (int l = 1; l<=2; l++){
                System.out.println("k=" + k + " l=" + l + "Fine");
            }
        }
        System.out.println();
    }
}



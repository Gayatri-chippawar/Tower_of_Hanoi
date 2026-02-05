public class game{
public static void towerOfHanoi(int n, String source , String helper, String dest){

            towerOfHanoi(n-1, source, dest , helper);
            System.out.println("Disk "+n+" moved from "+source+" to "+dest);
            towerOfHanoi(n-1, helper, source , dest);

    }

    public static void main(String[] args) {
        towerOfHanoi(3,"source","helper","dest");
    }
}

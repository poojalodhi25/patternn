public class numberPettern{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows & col");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<=m;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
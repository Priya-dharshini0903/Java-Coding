class Main {
    public static void main(String[] args) {
        int n=31;
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
           for(int j=2;j<i;j++){
            if((i%j)==0){
            isPrime=false;
            break;
            }
        }
        if(isPrime){
            System.out.print(i+" ");
        }
        }
        
        
    }
}

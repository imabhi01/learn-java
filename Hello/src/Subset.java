public class Subset {
    public static void main(String[] args){
        char set[] = {'a', 'b', 'c'};
        findingSubset(set);
    }

    static void findingSubset(char get[]){
        int n = get.length;
        for(int i = 0; i < (2^n) ; i++){
            if(i == 0){
                System.out.println("{}");
            }
            System.out.print("{");
            System.out.print(get[i] + ",");
        }
    }
}

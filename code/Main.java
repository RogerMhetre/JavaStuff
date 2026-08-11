public class Main {
    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0 && j == 0){
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}

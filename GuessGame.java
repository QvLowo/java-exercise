public class GuessGame{
    public static void main(String[] args){
        
        if (args.length == 0 || args[0].equalsIgnoreCase("help")){
            System.out.println("�{���Ϊk:java GuessGame (�Ʀr1-5)");
        }else if(!args[0].matches("\\d")){
            System.out.println("�ݿ�J���ԧB�Ʀr");
        }else{
        int guessing = Integer.parseInt(args[0]);    
        if (guessing >5 || guessing <1){
            System.out.println("��J�d����~,�п�J�Ʀr1-5");
        }else if (guessing >=1 && guessing <= 5){
            int random = (int)((Math.random()*5)+1); //0-0.9*5=4.5 4.5+1=5(int)
            if (random == guessing)
                System.out.println("���ߧA,�q��F!");
            else
                System.out.println("�q���F,�Э��s��J"); 
            }
        }
    }
}
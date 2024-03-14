public class GuessGame{
    public static void main(String[] args){
        
        if (args.length == 0 || args[0].equalsIgnoreCase("help")){
            System.out.println("程式用法:java GuessGame (數字1-5)");
        }else if(!args[0].matches("\\d")){
            System.out.println("需輸入阿拉伯數字");
        }else{
        int guessing = Integer.parseInt(args[0]);    
        if (guessing >5 || guessing <1){
            System.out.println("輸入範圍錯誤,請輸入數字1-5");
        }else if (guessing >=1 && guessing <= 5){
            int random = (int)((Math.random()*5)+1); //0-0.9*5=4.5 4.5+1=5(int)
            if (random == guessing)
                System.out.println("恭喜你,猜對了!");
            else
                System.out.println("猜錯了,請重新輸入"); 
            }
        }
    }
}

import java.util.Scanner;

public class Receipt{
    public static void main(String[] args)
    {
        System.out.println("Hello, dear customer! Welcome to my store!");
        System.out.println("We have apples, bananas, pears, strawberries and watermelons here. High quality guaranteed.");
        Scanner scan = new Scanner(System.in);
        int apple;
        int banana;
        int pear;
        int strawberry;
        int watermelon;
        System.out.println("How many apples do you want?");
        apple = scan.nextInt();
        System.out.println("How many banana do you want?");
        banana = scan.nextInt();
        System.out.println("How many pears do you want?");
        pear = scan.nextInt();
        System.out.println("How many pounds of strawberries do you want?");
        strawberry = scan.nextInt();
        System.out.println("How many watermelons do you want?");
        watermelon = scan.nextInt();
        System.out.println("           5400 Red Bank Rd             ");
        System.out.println("****************************************");
        System.out.println(" I'm too lazy to actually put words     ");
        System.out.println(" here. So I will just type some random  "); 
        System.out.println(" things here. Just ignore what I just   ");
        System.out.println(" wrote, I'm just making this look like  ");
        System.out.println(" an actual receipt.                     ");
        System.out.println("****************************************");
        if(apple != 0){
        if(apple<10&&1.49*apple<10){
        System.out.println(" Apple         "+apple+"      1.49      "+String.format("%.2f", 1.49*apple));
        }
        else if(apple<10&&1.49*apple>=10){
        System.out.println(" Apple         "+apple+"      1.49     "+String.format("%.2f", 1.49*apple));
        }
        else if(apple>=10){
        System.out.println(" Apple         "+apple+"     1.49     "+String.format("%.2f", 1.49*apple));
        }
        }   
        
        if(banana != 0){
        if(banana<10&&1.19*banana<10){
        System.out.println(" Banana        "+banana+"      1.19      "+String.format("%.2f", 1.19*banana));
        }
        else if(banana<10&&1.19*banana>=10){
        System.out.println(" Banana        "+banana+"      1.19     "+String.format("%.2f", 1.19*banana));
        }
        else if(banana>=10){
        System.out.println(" Banana        "+banana+"     1.19     "+String.format("%.2f", 1.19*banana));
        }
        }

        if(pear!= 0){
        if(pear<10&2.29*pear<10){
        System.out.println(" Pear          "+pear+"      2.29      "+String.format("%.2f", 2.29*pear));
        }
        else if(pear<10&&2.29*pear>=10){
        System.out.println(" Pear          "+pear+"      2.29     "+String.format("%.2f", 2.29*pear));
        }
        else if(pear>=10){
        System.out.println(" Pear          "+pear+"     2.29     "+String.format("%.2f", 2.29*pear));
        }
        }


        if(strawberry!= 0){
        if(strawberry<10&3.59*strawberry<10){
        System.out.println(" Strawberry    "+strawberry+"      3.59      "+String.format("%.2f", 3.59*strawberry));
        }
        else if(strawberry<10&&3.59*pear>=10){
        System.out.println(" Strawberry    "+strawberry+"      3.59     "+String.format("%.2f", 3.59*strawberry));
        }
        else if(strawberry>=10){
        System.out.println(" Strawberry    "+strawberry+"     3.59     "+String.format("%.2f", 3.59*strawberry));
        }
        }

        if(watermelon!= 0){
        if(watermelon<10&4.99*watermelon<10){
        System.out.println(" Watermelon    "+watermelon+"      4.99      "+String.format("%.2f", 4.99*watermelon));
        }
        else if(watermelon<10&&4.99*pear>=10){
        System.out.println(" Watermelon    "+watermelon+"      4.99     "+String.format("%.2f", 4.99*watermelon));
        }
        else if(watermelon>=10){
        System.out.println(" Watermelon    "+watermelon+"     4.99     "+String.format("%.2f", 4.99*watermelon));
        }
        }

        double total = 1.49*apple+1.19*banana+2.29*pear+3.59*strawberry+4.99*watermelon;
        System.out.println("              Tax     7.0%      "+String.format("%.2f", total*0.07));
        total = total*1.07;
        System.out.println("              Total             "+String.format("%.2f", total));
        System.out.println("****************************************");
    }

}

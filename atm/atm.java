import java.util.*;

 

public class atm {
    static int arr[]={0,0,0,0};
    static int arr1[]={0,0,0,0};
    static int arr2[]={0,0,0,0};
    static Date time=java.util.Calendar.getInstance().getTime();
    static int i=0;
    static int at=0;
    static int pin=1234;
    static int vin=1234;
    static int gg=0;
    static int balance=0;
    static int balance1=0;
    static ArrayList<String> pk=new ArrayList();
    static ArrayList<String> pc=new ArrayList();
    static void function1(){
        System.out.println("welcome admin");
        boolean kit=true;
        Scanner sc=new Scanner(System.in);
        int s;
        do{ 

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("1.LOAD");
            System.out.println("2.SHOW");
            System.out.println("3.EXIT");
            s=sc.nextInt();
            switch(s)
            {
             case 1:
             
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("add  2000 notes");
                arr[0]=sc.nextInt();
                System.out.println("add  500 notes");
                arr[1]=sc.nextInt();
                System.out.println("add  200 notes");
                arr[2]=sc.nextInt();
                System.out.println("add  100 notes");
                arr[3]=sc.nextInt();
                System.out.println((arr[0]*2000+arr[1]*500+arr[2]*200+arr[3]*100));
                
                      
             
            
                System.out.println("loaded successfully");
                System.out.println("Enter zero to continue");
                int kpr=sc.nextInt();
                if(kpr==0){
                  continue;
                }
                break;
             case 2:
             
                 
                 System.out.println("no of 2000 present");
                 System.out.println(arr[0]);
                 System.out.println("no of 500 present");
                 System.out.println(arr[1]);
                 System.out.println("no of 200 present");
                 System.out.println(arr[2]);
                 System.out.println("no of 100 present");
                 System.out.println(arr[3]);
                 System.out.println("press 0 to continue");
                 gg=(arr[0]*2000+arr[1]*500+arr[2]*200+arr[3]*100);
                 System.out.println("total balance:" + gg );
                 int b=sc.nextInt();
                 if(b==0){
                     continue;
                 }
                 break;
             case 3:
             System.out.print("\033[H\033[2J");
             System.out.flush();
             System.out.println("Invalid input");
             System.out.println("Enter 0 to continue");
             int sb=sc.nextInt();
             if(sb==1){
                 continue;
             }
             break;
            }
            kit=false;

          }while(kit);
        

    }
   
    static void bala4(){
        arr[0]=arr2[0]+arr[0];
        arr[1]=arr2[1]+arr[1];
        arr[2]=arr2[2]+arr[2];
        arr[3]=arr2[3]+arr[3];
    }
    static void bala2(){
        if(arr1[0]>arr[0]){
            int m=arr1[0]-arr[0];
            int n=m*2000;
            if(n%10==0){
                arr1[1]=arr1[1]+(n/500);
                arr1[0]=arr[0];
            }
        }
        if(arr1[1]>arr[1]){
            int m=arr1[1]-arr[1];
            int n=m*500;
            int k=n/200;
            n=n%200;
            int kl=n/100;
            arr1[1]=arr[1];
            arr1[2]=arr1[2]+k;
            arr1[3]=arr1[3]+kl;

        }
        if(arr1[2]>arr[2]){
            int m=arr1[2]-arr[2];
            int n=m*2;
            arr1[2]=arr[2];
            arr1[3]=arr1[3]+n;

        }
        
    }
    static void bala(int kk){
        if(kk/2000!=0){
            arr1[0]=kk/2000;
            kk=kk%2000;
        }
        if(kk/500!=0){
            arr1[1]=kk/500;
            kk=kk%500;
        }
        if(kk/200!=0){
            arr1[2]=kk/200;
            kk=kk%200;
        }
        if(kk/100!=0){
            arr1[3]=kk/100;
            kk=kk%100;
        }
    }

    



    
   



    
    static void function2(){
       int sum=0;
        balance=30000;
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        boolean ram=true;
        do{
        System.out.println("\n canara bank \n Welcome user A");
        System.out.println("1.withdrawal");
        System.out.println("2.deposit");
        System.out.println("3.check Balance");
        System.out.println("4.Mini Statement");
        System.out.println("5.pin change");
        int bd=sc.nextInt();
       
        switch(bd){
            case 1:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Select the amount to be withdraw");
             at=sc.nextInt();
             bala(at);
             if(at<=balance){
                bala2();
                for(int i=0;i<4;i++){
                    System.out.print(arr1[i]+" ");
                }
                if(arr1[3]>arr[3]){
                    System.out.println("Amount Unavailable Pls Enter less amount!!!");
                }
                else if(arr1[3]<=arr[3]){
                    balance=balance-at;
                    System.out.println("Amount Withdrawn Sucessfully");
                    pk.add(time+" "+"Amount debited:"+at);
                    arr[0]=arr[0]-arr1[0];
                    arr[1]=arr[1]-arr1[1];
                    arr[2]=arr[2]-arr1[2];
                    arr[3]=arr[3]-arr1[3];
                    System.out.println("Current balance:Rs:"+balance);

                }
            }
            else if(at>balance){
                System.out.println("Insufficient Balance Pls Try again after checking balance!!!");
            }
            
                System.out.println("enter 0 to exit");
                int d=sc.nextInt();
                if(d==1){
                     System.exit(0);
                }
            

            break;
            case 2:
            System.out.println("Enter the no.of.2000 rupess:");
                arr2[0]=sc.nextInt();
                System.out.println("Enter the no.of.500 rupess:");
                arr2[1]=sc.nextInt();
                System.out.println("Enter the no.of.200 rupess:");
                arr2[2]=sc.nextInt();
                System.out.println("Enter the no.of.100 rupess:");
                arr2[3]=sc.nextInt();
                int depo=(arr2[0]*2000+arr2[1]*500+arr2[3]*200+arr2[3]*100);
                balance=balance+depo;
                System.out.println("Total amount="+depo);
                bala4();
                System.out.println("Amount Deposited Sucessfully");
                pc.add(time+" "+"Amount deposited:"+depo);
                System.out.println("Current Balance:"+balance);
                System.out.println("Enter 0 to continue:");
                int n=sc.nextInt();
                if(n==0){
                    continue;
                }
        
            System.out.println("added balance is:"+balance);
            System.out.println("enter 0 to exit");
                int c=sc.nextInt();
                if(c==1){
                     System.exit(0);
                }
            
            break;
            case 3:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("balance");
            System.out.println(balance);
            System.out.println("enter zero to continue");
            int k=sc.nextInt();
            
            if(k==1){
            
            }

            break;
            case 4:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("mini statement");
            for(int i=0;i<pk.size();i++){
            System.out.println("Amount withdrawn"+pk.get(i));
            }
            for(int i=0;i<pc.size();i++){
                System.out.println("Amount deposited"+pc.get(i));
                }
            
            break;
            case 5:
            System.out.println("enter new pin to continue");
            int newpin=sc.nextInt();
            pin=newpin;
            System.out.println("your pin was successfully changed");
            break;
            case 6:
            ram=false;
        }
    }while(ram);
}
static void function3(){
    int sum=0;
     balance1=40000;
     Scanner sc=new Scanner(System.in);
     System.out.print("\033[H\033[2J");
     System.out.flush();
     boolean ram=true;
     do{
     System.out.println("\n canara bank \n Welcome user Gowtham");
     System.out.println("1.withdrawal");
     System.out.println("2.deposit");
     System.out.println("3.check Balance");
     System.out.println("4.Mini Statement");
     System.out.println("5.pin change");
     int bd=sc.nextInt();
    
     switch(bd){
         case 1:
         System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("Select the amount to be withdraw");
          at=sc.nextInt();
          bala(at);
          if(at<=balance1){
             bala2();
             for(int i=0;i<4;i++){
                 System.out.print(arr1[i]+" ");
             }
             if(arr1[3]>arr[3]){
                 System.out.println("Amount Unavailable Pls Enter less amount!!!");
             }
             else if(arr1[3]<=arr[3]){
                 balance1=balance1-at;
                 System.out.println("Amount Withdrawn Sucessfully");
                 pk.add(time+" "+"Amount debited:"+at);
                 arr[0]=arr[0]-arr1[0];
                 arr[1]=arr[1]-arr1[1];
                 arr[2]=arr[2]-arr1[2];
                 arr[3]=arr[3]-arr1[3];
                 System.out.println("Current balance:Rs:"+balance1);

             }
         }
         else if(at>balance1){
             System.out.println("Insufficient Balance Pls Try again after checking balance!!!");
         }
         
             System.out.println("enter 0 to exit");
             int d=sc.nextInt();
             if(d==1){
                  System.exit(0);
             }
         

         break;
         case 2:
         System.out.println("Enter the no.of.2000 rupess:");
             arr2[0]=sc.nextInt();
             System.out.println("Enter the no.of.500 rupess:");
             arr2[1]=sc.nextInt();
             System.out.println("Enter the no.of.200 rupess:");
             arr2[2]=sc.nextInt();
             System.out.println("Enter the no.of.100 rupess:");
             arr2[3]=sc.nextInt();
             int depo=(arr2[0]*2000+arr2[1]*500+arr2[3]*200+arr2[3]*100);
             balance=balance+depo;
             System.out.println("Total amount="+depo);
             bala4();
             System.out.println("Amount Deposited Sucessfully");
             pc.add(time+" "+"Amount deposited:"+depo);
             System.out.println("Current Balance:"+balance1);
             System.out.println("Enter 0 to continue:");
             int n=sc.nextInt();
             if(n==0){
                 continue;
             }
     
         System.out.println("added balance is:"+balance);
         System.out.println("enter 0 to exit");
             int c=sc.nextInt();
             if(c==1){
                  System.exit(0);
             }
         
         break;
         case 3:
         System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("balance");
         System.out.println(balance);
         System.out.println("enter zero to continue");
         int k=sc.nextInt();
         
         if(k==1){
         
         }

         break;
         case 4:
         System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("mini statement");
         for(int i=0;i<pk.size();i++){
         System.out.println("Amount withdrawn"+pk.get(i));
         }
         for(int i=0;i<pc.size();i++){
             System.out.println("Amount deposited"+pc.get(i));
             }
         
         break;
         case 5:
         System.out.println("enter new pin to continue");
         int newpin=sc.nextInt();
         pin=newpin;
         System.out.println("your pin was successfully changed");
         break;
         case 6:
         ram=false;
     }
 }while(ram);
}

     


     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int g=0;
        int ac=0;
        int a=0;
        int kala;
        
        boolean bala=true;
        
        do{
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Welcome to ATM");
        System.out.println("type 1 for Admin");
        System.out.println("type 2 for Customer");
        System.out.println("exit");
        ac=sc.nextInt();
       
        switch(ac){
           case 1:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Enter the username:");
            String username=sc.next();
            System.out.println("Enter the password:");
            String password=sc.next();
            if(username.equals("bala") && password.equals("1234")){
                function1();
                break;
            }
            else if(username.equals("gowtham") && password.equals("equals")){
                function1();
                break;
            }
            else{
                System.out.println("invalid input");
                System.out.println("press 0 to continue");
                int dc=sc.nextInt();
                if(dc==0){
                    continue;
                }
            }
            break;
            case 2:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Enter the username:");
            username=sc.next();
            System.out.println("Enter the pin:");
            int pin1=sc.nextInt();
            for(int i=3;i>=0;i--){
              
               if(username.equals("ezhil") && pin1==pin  ){
               
                  System.out.println("welcome user");
                  function2();
                  break;
               
               }
               else if(username.equals("boss") && pin1==vin){
                function3();
                break;
               }
               else if(i>0){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("you have "+i+"attempts remaining");
               }
               else if(i==0){
                System.out.println("sorry you have no attempts remaining");
               
               }
            }
            System.out.println("enter zero to continue");
            int y=sc.nextInt();
            if(y==0){
                 continue;
            }

            break;
            case 3:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Invalid input");
            bala=false;
            break;

            
        }
        
        }while(bala);


    }
    
}

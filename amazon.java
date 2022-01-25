import java.util.*;

public class amazon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        admin vb=new admin();
        user  kp=new user();

        boolean raju=true;
        do{
            System.out.println("welcome to Amazon");
            System.out.println("1.admin");
            System.out.println("2.merchant");
            System.out.println("3.user");
            System.out.println("4.product feedback");
            System.out.println("5.Exit");
            int ab=sc.nextInt();
            switch(ab){
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                vb.adm();
                System.out.println("enter zero t0 continue");
                int a=sc.nextInt();
                if(a==0){
                    continue;
                }
                
                break;
                case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                vb.merchant();
                System.out.println("enter zero t0 continue");
                int b=sc.nextInt();
                if(b==0){
                    continue;
                }
                break;
                case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                kp.user();
                int v=sc.nextInt();

                if(v==0){
                    continue;
                }
                break;
                case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("write your feedback about products you bought");
                String oo=sc.nextLine();
                break;
                case 5:
                raju=false;

            }
        }while(raju);
    }
}
class admin{
    static ArrayList<String> mint=new ArrayList();
    static ArrayList<String> mint1=new ArrayList();
    static ArrayList<String> user=new ArrayList();
    static ArrayList<String> user1=new ArrayList();
    static ArrayList<String> we=new ArrayList();
    static ArrayList<String> qe=new ArrayList();
    static ArrayList<ArrayList<String>> bala=new ArrayList<>();
    ArrayList<String> kala=new ArrayList();
    ArrayList<String> jolo=new ArrayList();
    ArrayList<String> kolo=new ArrayList();
    ArrayList<String> bolo=new ArrayList();
    Scanner sc=new Scanner(System.in);
        
    public void adm(){
        System.out.println("enter the username and password");
        String username=sc.next();
        int password=sc.next();
        if(username.equals("bala") && password==1234){
           System.out.println("1.add merchant");
           System.out.println("2.approve merchant");
           System.out.println("3.remove user");
           int d=sc.nextInt();
           switch(d){
           case 1:
           System.out.print("\033[H\033[2J");
           System.out.flush();
           addmerchant();
           break;
           case 2:
           System.out.print("\033[H\033[2J");
           System.out.flush();
           for(int i=0;i<user1.size();i++){
           System.out.println("Enter 0 to aprove 1 to reject:");
           int app=sc.nextInt();
           if(app==0){
               System.out.println("approved sucessfully");
               mint.add(user.get(i));
               mint1.add(user1.get(i));
           }

           }
           
           

           }
             
       }
        
       }
        static void  addmerchant(){
            Scanner sc=new Scanner(System.in);
            System.out.println(" Add merchant");
            System.out.println(" Add email");
            String username=sc.next();
            System.out.println(" Add password");
            String password=sc.next();
            mint.add(username);
            mint1.add(password);
           
           

        }
        
             
         
         void merchant(){
         System.out.println("welcome merchant");
         System.out.println("1.new user");
         System.out.println("2.existing user");
         System.out.println("exit");
         int su=sc.nextInt();
         sc.nextLine();
         switch(su){
             case 1:
             System.out.print("\033[H\033[2J");
             System.out.flush();
             System.out.println(" Add email");
             String username=sc.next();
             user.add(username);
             System.out.println(" Add password");
             String password=sc.next();
             user1.add(password);
             
             break;
             case 2:
             System.out.print("\033[H\033[2J");
             System.out.flush();
             System.out.println("Enter Username:");
             String user=sc.nextLine();
             System.out.println("Enter Password:");
             String pass=sc.nextLine();
             int count=0;
             for(int i=0;i<mint.size() && i<mint.size();i++){
                 if(user.equals(mint.get(i))){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    count++;
                    System.out.println("welcome merchant");
                    System.out.println("1.add");
                    System.out.println("2.remove");
                    System.out.println("3.change prize");
                    int f=sc.nextInt();
                    switch(f){
                        case 1:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("add");
                        System.out.println("enter product names");
                        System.out.println("\n 1.Mobiles \n 2.Tv \n 3.refridgerator \n 4.clothes");
                        int y=sc.nextInt();
                        switch(y){
                            case 1:
                           
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("enter mobile  to be added\n model\n prize");
                            String g=sc.next();
                            String h=sc.next();
                            String q=sc.next();
                            kala.add(g);
                            kala.add(h);
                            kala.add(q);
                            bala.add(kala);
                           
                            break;
                            case 2:
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("enter tv to be added\n model\n prize");
                             g=sc.next();
                             h=sc.next();
                             q=sc.next();
                            jolo.add(g);
                            jolo.add(h);
                            jolo.add(q);
                            bala.add(jolo);
                            break;
                            case 3:
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("enter  refriderator to be added\n model\n prize");
                             g=sc.next();
                             h=sc.next();
                             q=sc.next();
                            kolo.add(g);
                            kolo.add(h);
                            kolo.add(q);
                            bala.add(kolo);
                            break;
                            case 4:
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("enter  clothes to be added\n model\n prize");
                             g=sc.next();
                             h=sc.next();
                             q=sc.next();
                            bolo.add(g);
                            bolo.add(h);
                            bolo.add(q);
                            bala.add(bolo);
                            break;
                            case 5:
                            System.exit(0);
                            break;

                        }
                    }
                    
                    count++;

                 }

             }
             if(count==0){
                 System.out.println("pending for approval");
             }
             break;
         }
         

        }
        
        

        
}
class user{
    Scanner sc=new Scanner(System.in);
    static ArrayList<String> no=new ArrayList();
    static ArrayList<String> na=new ArrayList();
    static ArrayList<String> mala=new ArrayList();
    static ArrayList<String> uala=new ArrayList();
    boolean ezhil=true;
     void user(){
        System.out.println("new user");
        System.out.println("existing user");
        System.out.println("exit");
        int d=sc.nextInt();
        switch(d){
            case 1:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("add email");
            String e=sc.next();
            no.add(e);
            System.out.println("add password");
            String w=sc.next();
            na.add(w);
            break;
            case 2:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Existing user");
            
                System.out.println("add user");
                String g=sc.next();
                System.out.println("add password");
                String y=sc.next();
                for(int i=0;i<no.size();i++){
                  if(g.equals(no.get(i)) && y.equals(na.get(i))){
                      System.out.println("\n 1.go to shopping \n 2.cart \n 3.your orders\n4.exit");
                      int p=sc.nextInt();
                      switch(p){
                          case 1:
                          System.out.print("\033[H\033[2J");
                          System.out.flush();
                         
                              for(int j=0;j<admin.bala.size();j++){
                                   System.out.println(admin.bala.get(j));
                                    System.out.println("click 1 to add to cart");
                                    int b=sc.nextInt();
                                    if(b==1){
                                        
                                        System.out.println("item add to cart successfully");
                                    }

                                }
                            
                          break;
                          case 2:
                          System.out.print("\033[H\033[2J");
                          System.out.flush();
                          for(int j=0;j<mala.size();j++){
                            System.out.println(mala.get(j));
                            System.out.println("click 1 to buy");
                            int o=sc.nextInt();
                            if(o==1){
                                
                                System.out.println("item bought successfully");
                            }
                          }

                          break;
                          case 3:
                          break;
                      }
                  }
                }
            break;
             case 3:
             System.out.print("\033[H\033[2J");
             System.out.flush();
             ezhil=false;
             break;


        }
    }
}

import java.util.*;
class VideoLauncher{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch;
        VideoStore ob2=new VideoStore();
        do{
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos : ");
            System.out.println("2. Check Out Video : ");
            System.out.println("3. Return Video : ");
            System.out.println("4. Receive Rating : ");
            System.out.println("5. List Inventory : ");
            System.out.println("6. Exit : ");
            System.out.println("Enter your choice (1..6) : ");
            ch=sc.nextInt();
        switch(ch){
            case 1: System.out.println("Enter the name of the video you want to add :");
                    ob2.addVideo(sc.next());
                    break;
            case 2: System.out.println("Enter the name of the video you want to check out :");
                    ob2.doCheckout(sc.next());
                    break;
            case 3: System.out.println("Enter the name of the video you want to return :");
                    ob2.doReturn(sc.next());
                    break;
            case 4: System.out.println("Enter the name of the video you want to rate :");
                    ob2.receiveRating(sc.next(),sc.nextInt());
                    break;
            case 5: ob2.listinventory();
                    break;
            case 6: System.out.println("Exiting...!! Thanks for using the application.");
                    System.exit(1);
                    break;
        }
    }
    while(ch!=6);  
    sc.close();      
    }
}
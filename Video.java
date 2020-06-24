public class Video{
    String videoName;
    boolean checkout;
    int rating;
    Video(String name){
        videoName=name;
    }
    String getName(){
        return videoName;
    }
    void doCheckout(){
        System.out.println("Video \""+getName()+"\" checked out successfully.");
    }
    void doReturn(){
        System.out.println("Video \""+getName()+"\" returned successfully.");
    }
    void receiveRating(int rating){
        this.rating=rating;
    }
    int getRating(){
        return rating;
    }
    boolean getCheckout(){
        return checkout;
    }
}
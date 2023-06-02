package activities;

public class Activity5 {

    public static void main(String[] args) {
        String title = "How to make friends!";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title of the book is: " + newNovel.getTitle());
    }
}

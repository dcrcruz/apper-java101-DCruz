public class CategoryEnum {
    public static void main(String[] args) {
    
    // variable value from enum categories
    Category chosenCategory = Category.MEN;

    // Switch Statement
    switch (chosenCategory) {
            case MEN: System.out.println(13.57); break;
            case WOMEN: System.out.println(20.45); break;
            case KID: System.out.println(45.6); break;
            case GRANDMA: System.out.println(56.67); break;
            case GRANDPA: System.out.println(3.56); break;
        }
    }

    public enum Category {
        MEN, WOMEN, KID, GRANDMA, GRANDPA

    }

}
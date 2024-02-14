package lesson20240214;

public class CustomArrayList {

    private String[] data;

    public CustomArrayList(String[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(new String[] {"A", "B", "C", "D"});

//        for (String s : list) { // TODO
//            System.out.println(s);
//        }
    }

}

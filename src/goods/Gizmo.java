package goods;

public class Gizmo {

    public static void main(String[] args) {
        Widget widget = new Widget();
        System.out.println(widget.name1);
        System.out.println(widget.name2);
        System.out.println(widget.name3);
        // Cannot access the private variable
    }

}

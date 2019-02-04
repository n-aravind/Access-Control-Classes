package stuff;

import goods.Widget;

public class Doodad {

    public static void main(String[] args) {
        Widget widget = new Widget();
        System.out.println(widget.name1);
        //Can only access the public access modifier
    }

    public void method(){
        Widget widget = new Widget();
        System.out.println(widget.name1);
    }
}

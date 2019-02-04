package stuff;

import goods.Widget;

public class Thingamajig extends Widget {
    public static void main(String[] args) {
        Thingamajig thingamajig = new Thingamajig();
        System.out.println(thingamajig.name1);
        System.out.println(thingamajig.name2);
        //Cannot access empty and private access modifiers
    }

    public void method(){
        System.out.println(name1);
        System.out.println(name2);
    }
}

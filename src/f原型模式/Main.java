package f原型模式;

// 注意区别深拷贝和浅拷贝，String 类型的修改会改变，引用类型的修改不会改变，这里不知道怎么回事

public class Main {
    public static void main(String[] args) {
        //原型A对象
        Resume a = new Resume("小李子");
        a.setPersonInfo("2.16", "男", "牛逼大学");
        a.setWorkExperience("2012.09.05", "太牛逼科技有限公司");

        Resume b = (Resume) a.clone(); //浅拷贝，对象不相同，但对象的属性指向同一个引用，因此修改一个对象的属性另外一个对象的属性也会改变
        b.setWorkExperience("2014-2019", "富土康");

        a.display();
        b.display();
        System.out.println(a.getName().equals(b.getName()));
//        //克隆B对象
//        Resume b = (Resume) a.clone();
//
//        //输出A和B对象
//        System.out.println("----------------A--------------");
//        a.display();
//        System.out.println("----------------B--------------");
//        b.display();
//
//        /*
//         * 测试A==B?
//         * 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象
//         */
//        System.out.print("A==B?");
//        System.out.println( a == b);
//
//        /*
//         * 对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
//         */
//        System.out.print("A.getClass()==B.getClass()?");
//        System.out.println(a.getClass() == b.getClass());
    }


}

package c装饰模式;

public class Person {
    private String name;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.printf("%s",name);
    }


}

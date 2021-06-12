package t中介者模式;

public abstract class Country {
    protected UnitedNations mediator;

    Country(UnitedNations mediator){
        this.mediator = mediator;
    }
}

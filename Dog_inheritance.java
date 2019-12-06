class Animal{
    void eat(){
        System.out.println("eating");
    }
}


class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class Babydog extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}

class Testing{
    public static void main(string args[]){
        Babydog bd = new Babydog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
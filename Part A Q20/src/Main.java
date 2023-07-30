class Flower{
    public Flower(){
        System.out.println("The default constructor of Flower class is invoked");
    }
}

class Orchid extends Flower{
    public Orchid(){
        System.out.println("The default constructor of Orchid class is invoked");
    }
}

class Main{
    public static void main(String[] args){
        Orchid orchid = new Orchid();
    }
}
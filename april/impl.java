package april;

public class impl implements inex {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("eating");
    }

    @Override
    public void hello() {
        // TODO Auto-generated method stub
        System.out.println("Hello");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("playing");
    }

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("working");
    }
    
    public static void main(String[] args) {
        new impl().hello();
        new impl().eat();
        new impl().play();
        new impl().work();
    }
}

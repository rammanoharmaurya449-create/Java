
class First {
    int a;
    void setvalue(int a) {
        this.a = a;
    }
    void display() {
        System.out.println("Value of a  first class : " + a);
    }
}
class Second {
    int b;
    void setvalue(int b) {
        this.b = b;
    }
    void display() {
        System.out.println("Value of b second class : " + b);
    }
}
class Third {
    int c;
    void setvalue(int c) {
        this.c = c;
    }
    void display() {
        System.out.println("Value of c third class : " + c);
    }
}

public class ParameterizedMethod {
    public static void main(String[] args) {
        First obj1 = new First();
        obj1.setvalue(10);
        obj1.display();
        Second obj2 = new Second();
        obj2.setvalue(20);
        obj2.display();
        Third obj3 = new Third();
        obj3.setvalue(30);
        obj3.display();
    }
}

public class calculator {
    private int a,b;

    public calculator() {
    }

    public calculator(int a, int b){
        this.a=a;
        this.b=b;

    }

    public int add(){
        return a+b;
    }

    public int substract(){
        return a-b;

    }

    public int div(){
        return a/b;
    }

    public int mul(){
        return a*b;
    }
}

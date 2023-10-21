class Box<P>{
    private P t;
    public P getT(){
        return t;
    }
    public void setT(P t){
        this.t=t;
    }
}
public class test {
    public static void main(String args[]){
        Box box=new Box();
        box.setT(50);
        Object result=box.getT();
        //Integer n=(Integer)result;
        System.out.println(result);
    }
}

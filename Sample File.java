class Box<P>{
    private P t;
    public P getT(){
        return t;
    }
    public void set(P t){
        this.t=t;
    }
}
public class test {
    public static void main(String args[]){
        Box<Integer> box=new Box<>();
        Integer result=box.getT()+25;
    }
}

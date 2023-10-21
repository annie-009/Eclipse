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
        Box<Integer> box=new Box<>();
        box.setT(50);
        Integer result=box.getT()+25;
        System.out.println(result);
    }
}

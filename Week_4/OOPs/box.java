interface test{
    int sq(int n);
}
class arithmatic implements test{
    @Override
    public int sq(int n){
        return n*n;
    }
}
class outer{
    void display(){
        System.out.println("outer class");
    }
}
class inner extends outer{
    void display(){
        System.out.println("inner class");
    }
}
class point{
    private int x,y;
    public point(){
        x=0;
        y=0;
    }
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){
        this.y=y;
    }
    public void setxy(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class box{
    double l,b;
    box(double l,double b){
        this.l=l;
        this.b=b;
    }
    double area(){
        return l*b;
    }
}
class box3d extends box{
    double h;
    box3d(double l,double b,double h){
        super(l,b);
        this.h=h;
    }
    double volume(){
        return l*b*h;
    }
}
public class main{
    public static void main(String[] args){
        arithmatic a=new arithmatic();
        System.out.println(a.sq(5));
        outer o=new outer();
        o.display();
        inner i=new inner();
        i.display();
        point p=new point(10,20);
        p.display();
        p.setxy(3,4);
        p.display();
        box b=new box(10,20);
        System.out.println(b.area());
        box3d b3=new box3d(10,20,30);
        System.out.println(b3.volume());
    }
}
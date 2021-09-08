package arithmeticop;
import java.util.ArrayList;
import java.util.List;
public class lam2 {

	public static void main(String[] args) {
		Orders a1 = new Orders(111,15000,"Accepted");
        Orders a2 = new Orders(112,21500,"completed");
        Orders a3 = new Orders(113,7500,"Accepted");
        Orders a4= new Orders(114,15000,"completed");

        checking c1 = (Orders obj)->{
          if (obj.orderPrice>10000&&(obj.status.equalsIgnoreCase("accepted")||obj.status.equalsIgnoreCase("completed")))
              obj.display();
        };

        c1.check(a1);
        c1.check(a2);
        c1.check(a3);
        c1.check(a4);
		
	}
}
interface checking{
	public void check(Orders obj);
}
class Orders{

    int orderid;
    int orderPrice;
    String status;

    public Orders(int orderid, int orderPrice, String status) {
        this.orderid = orderid;
        this.orderPrice = orderPrice;
        this.status = status;
    }

    
    public void display(){
        System.out.println("Orderid:"+this.orderid+"  Price: "+this.orderPrice+"  Status: "+this.status);
    }
}

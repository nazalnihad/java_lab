package sample;

/**
 *
 * @author nazal
 */
public class Sample {
	public static void main(String[] args) {
		get_set object1 = new get_set();
		get_set object2 = new get_set();
		object1.set_x(10);
		object1.set_y(20);
		
		object1.show();
		object2.set_values(5, 6);
		System.out.println(object2.get_x()+" + "+object2.get_y()+" = "+object2.get_sum());
		
	}
    
}

package sample;

/**
 *
 * @author nazal
 */
public class get_set {
    
	public int x,y,sum;
	
	public void set_values(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void set_x(int x) {
		this.x=x;
	}
	
	public void set_y(int y) {
		this.y=y;
	}
	
	public int get_x() {
		return x;
	}
	public int get_y() {
		return y;
	}
	
	public int get_sum() {
		this.sum = x+y;
		return sum;
	}

	public void show() {
		System.out.println(x+" + "+y+" = "+get_sum());
	}
}

public class SecondHandler extends AbstractHandler {


	public SecondHandler(AbstractHandler handler) {
		super(handler);
	}

	public boolean processing(int i) {
		
		boolean response = false;
		if(i<20) {
			System.out.println("less than 20. Processed by SecondHandler");
			response = true;
		}
		return response;
	}
	
}

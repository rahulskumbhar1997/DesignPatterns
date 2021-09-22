
public class FirstHandler extends AbstractHandler{

	public FirstHandler(AbstractHandler handler) {
		super(handler);
		
	}

	@Override
	public boolean processing(int i) {
		
		boolean response = false;
		if(i<10) {
			response = true;
			System.out.println("less than 10. Processed by FirstHandler");
		}
		return response;
	}

	
}

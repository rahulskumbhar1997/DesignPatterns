
public class ThirdHandler extends AbstractHandler {

	public ThirdHandler(AbstractHandler handler) {
		super(handler);
	}

	@Override
	public boolean processing(int i) {
		
		boolean response = false;
		if(i<30) {
			response = true;
			System.out.println("less than 30. Processed by ThirdHandler");
		}
		return response;
	}

	
}

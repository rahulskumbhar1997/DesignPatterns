
public class User {
	
	private AbstractHandler initial_handler = null;
	
	

	public void agent(int request) {
		
		
		AbstractHandler handler = new FirstHandler(new SecondHandler(new ThirdHandler(new DefaultHandler(initial_handler))));
		
		handler.handle(request);
	}
}

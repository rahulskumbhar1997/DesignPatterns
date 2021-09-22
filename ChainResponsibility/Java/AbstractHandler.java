
public abstract class AbstractHandler {

	private AbstractHandler next_handler;
	public AbstractHandler(AbstractHandler handler) {
		this.next_handler = handler;
	}
	
	public abstract boolean processing(int i);
	
	public void handle(int i) {
		
		boolean handler_response;
		
		handler_response = processing(i);
		if(!handler_response) {
			
			this.next_handler.handle(i);
		}
	}
}


public class DefaultHandler extends AbstractHandler {

	public DefaultHandler(AbstractHandler handler) {
		super(handler);
	}

	@Override
	public boolean processing(int i) {
		
		System.out.println("Greater than 30. Processed by DefaultHandler");
		return true;
	}

	
}

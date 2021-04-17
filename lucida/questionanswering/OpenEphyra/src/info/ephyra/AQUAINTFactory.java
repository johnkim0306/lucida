public class AQUAINTFactory {
	public AQUAINTPreprocessTemplate getAQUAINTType(String type) {
		if(type == null) {
			return null;
		} else if(type.equalsIgnoreCase("AQUAINTPreprocess")) {
			return new AQUAINTPreprocess;
		} else if(type.equalsIgnoreCase("AQUAINT2Preprocess")) {
			return new AQUAINT2Preprocess;
		} else {
			return null;
		}
	}
}
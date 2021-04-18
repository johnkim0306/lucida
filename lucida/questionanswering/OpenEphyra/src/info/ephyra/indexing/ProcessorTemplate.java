	
	
	
	
	
public class AQUAINTFactory {	
	public static void main(String[] args) {
		if (args.length < 1) {
			MsgPrinter.printUsage("java AQUAINTPreprocessor AQUAINT_directory");
			System.exit(1);
		}
		dir = args[0];
		
		// enable output of status and error messages
		MsgPrinter.enableStatusMsgs(true);
		MsgPrinter.enableErrorMsgs(true);
		
		// add paragraph tags if missing
		MsgPrinter.printStatusMsg("Adding paragraph tags...");
		if (addParagraphTags())
			MsgPrinter.printStatusMsg("Paragraph tags added successfully.");
		else {
			MsgPrinter.printErrorMsg("Could not add paragraph tags.");
			System.exit(1);
		}
		
		// split paragraphs
		MsgPrinter.printStatusMsg("Splitting paragraphs...");
		if (splitParagraphs())
			MsgPrinter.printStatusMsg("Paragraphs splitted successfully.");
		else {
			MsgPrinter.printErrorMsg("Could not split paragraphs.");
			System.exit(1);
		}
	}
}
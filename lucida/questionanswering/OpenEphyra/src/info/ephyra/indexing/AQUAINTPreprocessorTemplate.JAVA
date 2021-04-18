package info.ephyra.indexing;

public abstract class AQUAINTPreprocessorTemplate{
	/** Directory of the AQUAINT corpus */
	protected static String dir;

	@Override
	protected abstract static boolean addParagraphTags();
}
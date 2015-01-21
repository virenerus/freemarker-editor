package org.github.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class FMTokenToAttributeMapper extends DefaultAntlrTokenToAttributeIdMapper {

	
	protected String calculateId(String tokenName, int tokenType) {
		return FMHightlighter.DEFAULT_ID;
	}
}

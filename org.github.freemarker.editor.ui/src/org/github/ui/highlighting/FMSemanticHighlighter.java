package org.github.ui.highlighting;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.github.freemarkerEditor.CloseTag;
import org.github.freemarkerEditor.Comment;
import org.github.freemarkerEditor.OpenTag;
import org.github.freemarkerEditor.Print;

public class FMSemanticHighlighter implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if(node.getSemanticElement() instanceof Comment)
				acceptor.addPosition(node.getOffset(), node.getLength(), FMHightlighter.COMMENT_ID);
			else if(node.getSemanticElement() instanceof Print)
				acceptor.addPosition(node.getOffset(), node.getLength(), FMHightlighter.PRINT_ID);
			else if(node.getSemanticElement() instanceof OpenTag || node.getSemanticElement() instanceof CloseTag)
				acceptor.addPosition(node.getOffset(), node.getLength(), FMHightlighter.TAG_ID);
		}
	}

}

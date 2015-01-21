package org.github.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class FMHightlighter  implements IHighlightingConfiguration {
	public static final String DEFAULT_ID = "default";
	public static final String PRINT_ID = "print";
	public static final String COMMENT_ID = "comment";
	public static final String TAG_ID = "tag";

    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
    	acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
    	acceptor.acceptDefaultHighlighting(PRINT_ID, "Prints", printTextStyle());
    	acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comments", commentTextStyle());
    	acceptor.acceptDefaultHighlighting(TAG_ID, "Tags", tagTextStyle());
    }

	protected TextStyle defaultTextStyle() {
        TextStyle textStyle = new TextStyle();
        return textStyle;
    }
	
	protected TextStyle printTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(255,120,120));
        return textStyle;
    }
	
	protected TextStyle commentTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(120,120,120));
        return textStyle;
    }
	
	protected TextStyle tagTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(0,0,60));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }
}

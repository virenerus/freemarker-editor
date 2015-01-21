package org.github.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.github.services.FreemarkerEditorGrammarAccess;

@SuppressWarnings("all")
public class FreemarkerEditorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FreemarkerEditorGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FreemarkerEditorGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMENT_CLOSERule())
			return getCOMMENT_CLOSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMENT_OPENRule())
			return getCOMMENT_OPENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPRINT_ENDRule())
			return getPRINT_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPRINT_STARTRule())
			return getPRINT_STARTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_CLOSE_STARTRule())
			return getTAG_CLOSE_STARTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_ENDRule())
			return getTAG_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_OPEN_STARTRule())
			return getTAG_OPEN_STARTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMENT_CLOSE returns ecore::EString:'-->';
	 */
	protected String getCOMMENT_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-->";
	}
	
	/**
	 * terminal COMMENT_OPEN returns ecore::EString:'<#--';
	 */
	protected String getCOMMENT_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<#--";
	}
	
	/**
	 * terminal PRINT_END returns ecore::EString:'}';
	 */
	protected String getPRINT_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal PRINT_START returns ecore::EString:'${';
	 */
	protected String getPRINT_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "${";
	}
	
	/**
	 * terminal TAG_CLOSE_START returns ecore::EString:'</#';
	 */
	protected String getTAG_CLOSE_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "</#";
	}
	
	/**
	 * terminal TAG_END returns ecore::EString:'>';
	 */
	protected String getTAG_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal TAG_OPEN_START returns ecore::EString:'<#';
	 */
	protected String getTAG_OPEN_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<#";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}

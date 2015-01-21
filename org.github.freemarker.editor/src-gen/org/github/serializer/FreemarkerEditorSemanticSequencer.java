package org.github.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.github.freemarkerEditor.CloseTag;
import org.github.freemarkerEditor.Comment;
import org.github.freemarkerEditor.Freemarker;
import org.github.freemarkerEditor.FreemarkerEditorPackage;
import org.github.freemarkerEditor.OpenTag;
import org.github.freemarkerEditor.Print;
import org.github.freemarkerEditor.Tag;
import org.github.freemarkerEditor.Text;
import org.github.services.FreemarkerEditorGrammarAccess;

@SuppressWarnings("all")
public class FreemarkerEditorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FreemarkerEditorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FreemarkerEditorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FreemarkerEditorPackage.CLOSE_TAG:
				if(context == grammarAccess.getCloseTagRule() ||
				   context == grammarAccess.getTagPartRule()) {
					sequence_CloseTag(context, (CloseTag) semanticObject); 
					return; 
				}
				else break;
			case FreemarkerEditorPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case FreemarkerEditorPackage.FREEMARKER:
				if(context == grammarAccess.getFreemarkerRule()) {
					sequence_Freemarker(context, (Freemarker) semanticObject); 
					return; 
				}
				else break;
			case FreemarkerEditorPackage.OPEN_TAG:
				if(context == grammarAccess.getOpenTagRule() ||
				   context == grammarAccess.getTagPartRule()) {
					sequence_OpenTag(context, (OpenTag) semanticObject); 
					return; 
				}
				else break;
			case FreemarkerEditorPackage.PRINT:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPrintRule()) {
					sequence_Print(context, (Print) semanticObject); 
					return; 
				}
				else break;
			case FreemarkerEditorPackage.TAG:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getTagRule()) {
					sequence_Tag(context, (Tag) semanticObject); 
					return; 
				}
				else break;
			case FreemarkerEditorPackage.TEXT:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     content=TagContent
	 */
	protected void sequence_CloseTag(EObject context, CloseTag semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FreemarkerEditorPackage.Literals.TAG_PART__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FreemarkerEditorPackage.Literals.TAG_PART__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCloseTagAccess().getContentTagContentParserRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     text=CommentContent
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FreemarkerEditorPackage.Literals.COMMENT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FreemarkerEditorPackage.Literals.COMMENT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getTextCommentContentParserRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Element*
	 */
	protected void sequence_Freemarker(EObject context, Freemarker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=TagContent
	 */
	protected void sequence_OpenTag(EObject context, OpenTag semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FreemarkerEditorPackage.Literals.TAG_PART__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FreemarkerEditorPackage.Literals.TAG_PART__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpenTagAccess().getContentTagContentParserRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=PrintContent
	 */
	protected void sequence_Print(EObject context, Print semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FreemarkerEditorPackage.Literals.PRINT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FreemarkerEditorPackage.Literals.PRINT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrintAccess().getExpressionPrintContentParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (openTag=OpenTag elements+=Element* closeTag=CloseTag)
	 */
	protected void sequence_Tag(EObject context, Tag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=TextContent
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FreemarkerEditorPackage.Literals.TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FreemarkerEditorPackage.Literals.TEXT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextAccess().getTextTextContentParserRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
}

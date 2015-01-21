package org.github.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.github.services.FreemarkerEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFreemarkerEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PRINT_START", "RULE_PRINT_END", "RULE_CHAR", "RULE_COMMENT_OPEN", "RULE_COMMENT_CLOSE", "RULE_TAG_OPEN_START", "RULE_TAG_CLOSE_START", "RULE_TAG_END"
    };
    public static final int RULE_TAG_OPEN_START=9;
    public static final int RULE_COMMENT_OPEN=7;
    public static final int RULE_TAG_END=11;
    public static final int RULE_PRINT_START=4;
    public static final int RULE_TAG_CLOSE_START=10;
    public static final int RULE_COMMENT_CLOSE=8;
    public static final int RULE_CHAR=6;
    public static final int RULE_PRINT_END=5;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFreemarkerEditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFreemarkerEditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFreemarkerEditorParser.tokenNames; }
    public String getGrammarFileName() { return "../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g"; }



     	private FreemarkerEditorGrammarAccess grammarAccess;
     	
        public InternalFreemarkerEditorParser(TokenStream input, FreemarkerEditorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Freemarker";	
       	}
       	
       	@Override
       	protected FreemarkerEditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFreemarker"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:67:1: entryRuleFreemarker returns [EObject current=null] : iv_ruleFreemarker= ruleFreemarker EOF ;
    public final EObject entryRuleFreemarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreemarker = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:68:2: (iv_ruleFreemarker= ruleFreemarker EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:69:2: iv_ruleFreemarker= ruleFreemarker EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFreemarkerRule()); 
            }
            pushFollow(FOLLOW_ruleFreemarker_in_entryRuleFreemarker75);
            iv_ruleFreemarker=ruleFreemarker();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFreemarker; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreemarker85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFreemarker"


    // $ANTLR start "ruleFreemarker"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:76:1: ruleFreemarker returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleFreemarker() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:79:28: ( ( (lv_elements_0_0= ruleElement ) )* )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:80:1: ( (lv_elements_0_0= ruleElement ) )*
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:80:1: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_PRINT_START && LA1_0<=RULE_TAG_OPEN_START)||LA1_0==RULE_TAG_END) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:81:1: (lv_elements_0_0= ruleElement )
            	    {
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:81:1: (lv_elements_0_0= ruleElement )
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:82:3: lv_elements_0_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFreemarkerAccess().getElementsElementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleFreemarker130);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFreemarkerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFreemarker"


    // $ANTLR start "entryRuleElement"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:107:2: (iv_ruleElement= ruleElement EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:108:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement166);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:115:1: ruleElement returns [EObject current=null] : (this_Print_0= rulePrint | this_Comment_1= ruleComment | this_Tag_2= ruleTag | this_Text_3= ruleText ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Print_0 = null;

        EObject this_Comment_1 = null;

        EObject this_Tag_2 = null;

        EObject this_Text_3 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:118:28: ( (this_Print_0= rulePrint | this_Comment_1= ruleComment | this_Tag_2= ruleTag | this_Text_3= ruleText ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:119:1: (this_Print_0= rulePrint | this_Comment_1= ruleComment | this_Tag_2= ruleTag | this_Text_3= ruleText )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:119:1: (this_Print_0= rulePrint | this_Comment_1= ruleComment | this_Tag_2= ruleTag | this_Text_3= ruleText )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_PRINT_START:
                {
                alt2=1;
                }
                break;
            case RULE_COMMENT_OPEN:
                {
                alt2=2;
                }
                break;
            case RULE_TAG_OPEN_START:
                {
                alt2=3;
                }
                break;
            case RULE_PRINT_END:
            case RULE_CHAR:
            case RULE_COMMENT_CLOSE:
            case RULE_TAG_END:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:120:5: this_Print_0= rulePrint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getPrintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrint_in_ruleElement223);
                    this_Print_0=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Print_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:130:5: this_Comment_1= ruleComment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getCommentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComment_in_ruleElement250);
                    this_Comment_1=ruleComment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Comment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:140:5: this_Tag_2= ruleTag
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getTagParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTag_in_ruleElement277);
                    this_Tag_2=ruleTag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Tag_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:150:5: this_Text_3= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getTextParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleElement304);
                    this_Text_3=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Text_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePrint"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:166:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:167:2: (iv_rulePrint= rulePrint EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:168:2: iv_rulePrint= rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint339);
            iv_rulePrint=rulePrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint349); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:175:1: rulePrint returns [EObject current=null] : (this_PRINT_START_0= RULE_PRINT_START ( (lv_expression_1_0= rulePrintContent ) ) this_PRINT_END_2= RULE_PRINT_END ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token this_PRINT_START_0=null;
        Token this_PRINT_END_2=null;
        AntlrDatatypeRuleToken lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:178:28: ( (this_PRINT_START_0= RULE_PRINT_START ( (lv_expression_1_0= rulePrintContent ) ) this_PRINT_END_2= RULE_PRINT_END ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:179:1: (this_PRINT_START_0= RULE_PRINT_START ( (lv_expression_1_0= rulePrintContent ) ) this_PRINT_END_2= RULE_PRINT_END )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:179:1: (this_PRINT_START_0= RULE_PRINT_START ( (lv_expression_1_0= rulePrintContent ) ) this_PRINT_END_2= RULE_PRINT_END )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:179:2: this_PRINT_START_0= RULE_PRINT_START ( (lv_expression_1_0= rulePrintContent ) ) this_PRINT_END_2= RULE_PRINT_END
            {
            this_PRINT_START_0=(Token)match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_rulePrint385); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_PRINT_START_0, grammarAccess.getPrintAccess().getPRINT_STARTTerminalRuleCall_0()); 
                  
            }
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:183:1: ( (lv_expression_1_0= rulePrintContent ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:184:1: (lv_expression_1_0= rulePrintContent )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:184:1: (lv_expression_1_0= rulePrintContent )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:185:3: lv_expression_1_0= rulePrintContent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrintAccess().getExpressionPrintContentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePrintContent_in_rulePrint405);
            lv_expression_1_0=rulePrintContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrintRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"PrintContent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_PRINT_END_2=(Token)match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_rulePrint416); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_PRINT_END_2, grammarAccess.getPrintAccess().getPRINT_ENDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRulePrintContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:213:1: entryRulePrintContent returns [String current=null] : iv_rulePrintContent= rulePrintContent EOF ;
    public final String entryRulePrintContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrintContent = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:214:2: (iv_rulePrintContent= rulePrintContent EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:215:2: iv_rulePrintContent= rulePrintContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintContentRule()); 
            }
            pushFollow(FOLLOW_rulePrintContent_in_entryRulePrintContent452);
            iv_rulePrintContent=rulePrintContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintContent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrintContent463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintContent"


    // $ANTLR start "rulePrintContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:222:1: rulePrintContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_TAG_END_6= RULE_TAG_END )+ ;
    public final AntlrDatatypeRuleToken rulePrintContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAR_0=null;
        Token this_COMMENT_OPEN_1=null;
        Token this_COMMENT_CLOSE_2=null;
        Token this_TAG_OPEN_START_3=null;
        Token this_TAG_CLOSE_START_4=null;
        Token this_PRINT_START_5=null;
        Token this_TAG_END_6=null;

         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:225:28: ( (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_TAG_END_6= RULE_TAG_END )+ )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:226:1: (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_TAG_END_6= RULE_TAG_END )+
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:226:1: (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_TAG_END_6= RULE_TAG_END )+
            int cnt3=0;
            loop3:
            do {
                int alt3=8;
                switch ( input.LA(1) ) {
                case RULE_CHAR:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_COMMENT_OPEN:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_COMMENT_CLOSE:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_TAG_OPEN_START:
                    {
                    alt3=4;
                    }
                    break;
                case RULE_TAG_CLOSE_START:
                    {
                    alt3=5;
                    }
                    break;
                case RULE_PRINT_START:
                    {
                    alt3=6;
                    }
                    break;
                case RULE_TAG_END:
                    {
                    alt3=7;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:226:6: this_CHAR_0= RULE_CHAR
            	    {
            	    this_CHAR_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rulePrintContent503); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CHAR_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CHAR_0, grammarAccess.getPrintContentAccess().getCHARTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:234:10: this_COMMENT_OPEN_1= RULE_COMMENT_OPEN
            	    {
            	    this_COMMENT_OPEN_1=(Token)match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_rulePrintContent529); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMENT_OPEN_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMENT_OPEN_1, grammarAccess.getPrintContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:242:10: this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE
            	    {
            	    this_COMMENT_CLOSE_2=(Token)match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_rulePrintContent555); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMENT_CLOSE_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMENT_CLOSE_2, grammarAccess.getPrintContentAccess().getCOMMENT_CLOSETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:250:10: this_TAG_OPEN_START_3= RULE_TAG_OPEN_START
            	    {
            	    this_TAG_OPEN_START_3=(Token)match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_rulePrintContent581); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_OPEN_START_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_OPEN_START_3, grammarAccess.getPrintContentAccess().getTAG_OPEN_STARTTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:258:10: this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START
            	    {
            	    this_TAG_CLOSE_START_4=(Token)match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_rulePrintContent607); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_CLOSE_START_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_CLOSE_START_4, grammarAccess.getPrintContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:266:10: this_PRINT_START_5= RULE_PRINT_START
            	    {
            	    this_PRINT_START_5=(Token)match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_rulePrintContent633); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PRINT_START_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PRINT_START_5, grammarAccess.getPrintContentAccess().getPRINT_STARTTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:274:10: this_TAG_END_6= RULE_TAG_END
            	    {
            	    this_TAG_END_6=(Token)match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rulePrintContent659); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_END_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_END_6, grammarAccess.getPrintContentAccess().getTAG_ENDTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintContent"


    // $ANTLR start "entryRuleTag"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:289:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:290:2: (iv_ruleTag= ruleTag EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:291:2: iv_ruleTag= ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag705);
            iv_ruleTag=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag715); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:298:1: ruleTag returns [EObject current=null] : ( ( (lv_openTag_0_0= ruleOpenTag ) ) ( (lv_elements_1_0= ruleElement ) )* ( (lv_closeTag_2_0= ruleCloseTag ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        EObject lv_openTag_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_closeTag_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:301:28: ( ( ( (lv_openTag_0_0= ruleOpenTag ) ) ( (lv_elements_1_0= ruleElement ) )* ( (lv_closeTag_2_0= ruleCloseTag ) ) ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:302:1: ( ( (lv_openTag_0_0= ruleOpenTag ) ) ( (lv_elements_1_0= ruleElement ) )* ( (lv_closeTag_2_0= ruleCloseTag ) ) )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:302:1: ( ( (lv_openTag_0_0= ruleOpenTag ) ) ( (lv_elements_1_0= ruleElement ) )* ( (lv_closeTag_2_0= ruleCloseTag ) ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:302:2: ( (lv_openTag_0_0= ruleOpenTag ) ) ( (lv_elements_1_0= ruleElement ) )* ( (lv_closeTag_2_0= ruleCloseTag ) )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:302:2: ( (lv_openTag_0_0= ruleOpenTag ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:303:1: (lv_openTag_0_0= ruleOpenTag )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:303:1: (lv_openTag_0_0= ruleOpenTag )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:304:3: lv_openTag_0_0= ruleOpenTag
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAccess().getOpenTagOpenTagParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOpenTag_in_ruleTag761);
            lv_openTag_0_0=ruleOpenTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagRule());
              	        }
                     		set(
                     			current, 
                     			"openTag",
                      		lv_openTag_0_0, 
                      		"OpenTag");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:320:2: ( (lv_elements_1_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_PRINT_START && LA4_0<=RULE_TAG_OPEN_START)||LA4_0==RULE_TAG_END) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:321:1: (lv_elements_1_0= ruleElement )
            	    {
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:321:1: (lv_elements_1_0= ruleElement )
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:322:3: lv_elements_1_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTagAccess().getElementsElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleTag782);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTagRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:338:3: ( (lv_closeTag_2_0= ruleCloseTag ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:339:1: (lv_closeTag_2_0= ruleCloseTag )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:339:1: (lv_closeTag_2_0= ruleCloseTag )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:340:3: lv_closeTag_2_0= ruleCloseTag
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAccess().getCloseTagCloseTagParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCloseTag_in_ruleTag804);
            lv_closeTag_2_0=ruleCloseTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagRule());
              	        }
                     		set(
                     			current, 
                     			"closeTag",
                      		lv_closeTag_2_0, 
                      		"CloseTag");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleOpenTag"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:366:1: entryRuleOpenTag returns [EObject current=null] : iv_ruleOpenTag= ruleOpenTag EOF ;
    public final EObject entryRuleOpenTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenTag = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:367:2: (iv_ruleOpenTag= ruleOpenTag EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:368:2: iv_ruleOpenTag= ruleOpenTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenTagRule()); 
            }
            pushFollow(FOLLOW_ruleOpenTag_in_entryRuleOpenTag842);
            iv_ruleOpenTag=ruleOpenTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpenTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenTag852); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenTag"


    // $ANTLR start "ruleOpenTag"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:375:1: ruleOpenTag returns [EObject current=null] : (this_TAG_OPEN_START_0= RULE_TAG_OPEN_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END ) ;
    public final EObject ruleOpenTag() throws RecognitionException {
        EObject current = null;

        Token this_TAG_OPEN_START_0=null;
        Token this_TAG_END_2=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:378:28: ( (this_TAG_OPEN_START_0= RULE_TAG_OPEN_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:379:1: (this_TAG_OPEN_START_0= RULE_TAG_OPEN_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:379:1: (this_TAG_OPEN_START_0= RULE_TAG_OPEN_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:379:2: this_TAG_OPEN_START_0= RULE_TAG_OPEN_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END
            {
            this_TAG_OPEN_START_0=(Token)match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_ruleOpenTag888); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TAG_OPEN_START_0, grammarAccess.getOpenTagAccess().getTAG_OPEN_STARTTerminalRuleCall_0()); 
                  
            }
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:383:1: ( (lv_content_1_0= ruleTagContent ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:384:1: (lv_content_1_0= ruleTagContent )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:384:1: (lv_content_1_0= ruleTagContent )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:385:3: lv_content_1_0= ruleTagContent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOpenTagAccess().getContentTagContentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTagContent_in_ruleOpenTag908);
            lv_content_1_0=ruleTagContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOpenTagRule());
              	        }
                     		set(
                     			current, 
                     			"content",
                      		lv_content_1_0, 
                      		"TagContent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_TAG_END_2=(Token)match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_ruleOpenTag919); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TAG_END_2, grammarAccess.getOpenTagAccess().getTAG_ENDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenTag"


    // $ANTLR start "entryRuleCloseTag"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:413:1: entryRuleCloseTag returns [EObject current=null] : iv_ruleCloseTag= ruleCloseTag EOF ;
    public final EObject entryRuleCloseTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseTag = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:414:2: (iv_ruleCloseTag= ruleCloseTag EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:415:2: iv_ruleCloseTag= ruleCloseTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCloseTagRule()); 
            }
            pushFollow(FOLLOW_ruleCloseTag_in_entryRuleCloseTag954);
            iv_ruleCloseTag=ruleCloseTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCloseTag; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloseTag964); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloseTag"


    // $ANTLR start "ruleCloseTag"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:422:1: ruleCloseTag returns [EObject current=null] : (this_TAG_CLOSE_START_0= RULE_TAG_CLOSE_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END ) ;
    public final EObject ruleCloseTag() throws RecognitionException {
        EObject current = null;

        Token this_TAG_CLOSE_START_0=null;
        Token this_TAG_END_2=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:425:28: ( (this_TAG_CLOSE_START_0= RULE_TAG_CLOSE_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:426:1: (this_TAG_CLOSE_START_0= RULE_TAG_CLOSE_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:426:1: (this_TAG_CLOSE_START_0= RULE_TAG_CLOSE_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:426:2: this_TAG_CLOSE_START_0= RULE_TAG_CLOSE_START ( (lv_content_1_0= ruleTagContent ) ) this_TAG_END_2= RULE_TAG_END
            {
            this_TAG_CLOSE_START_0=(Token)match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_ruleCloseTag1000); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TAG_CLOSE_START_0, grammarAccess.getCloseTagAccess().getTAG_CLOSE_STARTTerminalRuleCall_0()); 
                  
            }
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:430:1: ( (lv_content_1_0= ruleTagContent ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:431:1: (lv_content_1_0= ruleTagContent )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:431:1: (lv_content_1_0= ruleTagContent )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:432:3: lv_content_1_0= ruleTagContent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCloseTagAccess().getContentTagContentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTagContent_in_ruleCloseTag1020);
            lv_content_1_0=ruleTagContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCloseTagRule());
              	        }
                     		set(
                     			current, 
                     			"content",
                      		lv_content_1_0, 
                      		"TagContent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_TAG_END_2=(Token)match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_ruleCloseTag1031); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TAG_END_2, grammarAccess.getCloseTagAccess().getTAG_ENDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCloseTag"


    // $ANTLR start "entryRuleTagContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:460:1: entryRuleTagContent returns [String current=null] : iv_ruleTagContent= ruleTagContent EOF ;
    public final String entryRuleTagContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTagContent = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:461:2: (iv_ruleTagContent= ruleTagContent EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:462:2: iv_ruleTagContent= ruleTagContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagContentRule()); 
            }
            pushFollow(FOLLOW_ruleTagContent_in_entryRuleTagContent1067);
            iv_ruleTagContent=ruleTagContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagContent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagContent1078); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagContent"


    // $ANTLR start "ruleTagContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:469:1: ruleTagContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_PRINT_END_6= RULE_PRINT_END )+ ;
    public final AntlrDatatypeRuleToken ruleTagContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAR_0=null;
        Token this_COMMENT_OPEN_1=null;
        Token this_COMMENT_CLOSE_2=null;
        Token this_TAG_OPEN_START_3=null;
        Token this_TAG_CLOSE_START_4=null;
        Token this_PRINT_START_5=null;
        Token this_PRINT_END_6=null;

         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:472:28: ( (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_PRINT_END_6= RULE_PRINT_END )+ )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:473:1: (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_PRINT_END_6= RULE_PRINT_END )+
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:473:1: (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE | this_TAG_OPEN_START_3= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START | this_PRINT_START_5= RULE_PRINT_START | this_PRINT_END_6= RULE_PRINT_END )+
            int cnt5=0;
            loop5:
            do {
                int alt5=8;
                switch ( input.LA(1) ) {
                case RULE_CHAR:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_COMMENT_OPEN:
                    {
                    alt5=2;
                    }
                    break;
                case RULE_COMMENT_CLOSE:
                    {
                    alt5=3;
                    }
                    break;
                case RULE_TAG_OPEN_START:
                    {
                    alt5=4;
                    }
                    break;
                case RULE_TAG_CLOSE_START:
                    {
                    alt5=5;
                    }
                    break;
                case RULE_PRINT_START:
                    {
                    alt5=6;
                    }
                    break;
                case RULE_PRINT_END:
                    {
                    alt5=7;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:473:6: this_CHAR_0= RULE_CHAR
            	    {
            	    this_CHAR_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleTagContent1118); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CHAR_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CHAR_0, grammarAccess.getTagContentAccess().getCHARTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:481:10: this_COMMENT_OPEN_1= RULE_COMMENT_OPEN
            	    {
            	    this_COMMENT_OPEN_1=(Token)match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_ruleTagContent1144); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMENT_OPEN_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMENT_OPEN_1, grammarAccess.getTagContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:489:10: this_COMMENT_CLOSE_2= RULE_COMMENT_CLOSE
            	    {
            	    this_COMMENT_CLOSE_2=(Token)match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_ruleTagContent1170); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMENT_CLOSE_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMENT_CLOSE_2, grammarAccess.getTagContentAccess().getCOMMENT_CLOSETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:497:10: this_TAG_OPEN_START_3= RULE_TAG_OPEN_START
            	    {
            	    this_TAG_OPEN_START_3=(Token)match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_ruleTagContent1196); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_OPEN_START_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_OPEN_START_3, grammarAccess.getTagContentAccess().getTAG_OPEN_STARTTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:505:10: this_TAG_CLOSE_START_4= RULE_TAG_CLOSE_START
            	    {
            	    this_TAG_CLOSE_START_4=(Token)match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_ruleTagContent1222); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_CLOSE_START_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_CLOSE_START_4, grammarAccess.getTagContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:513:10: this_PRINT_START_5= RULE_PRINT_START
            	    {
            	    this_PRINT_START_5=(Token)match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_ruleTagContent1248); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PRINT_START_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PRINT_START_5, grammarAccess.getTagContentAccess().getPRINT_STARTTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:521:10: this_PRINT_END_6= RULE_PRINT_END
            	    {
            	    this_PRINT_END_6=(Token)match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_ruleTagContent1274); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PRINT_END_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PRINT_END_6, grammarAccess.getTagContentAccess().getPRINT_ENDTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagContent"


    // $ANTLR start "entryRuleText"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:536:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:537:2: (iv_ruleText= ruleText EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:538:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText1320);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1330); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:545:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= ruleTextContent ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:548:28: ( ( (lv_text_0_0= ruleTextContent ) ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:549:1: ( (lv_text_0_0= ruleTextContent ) )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:549:1: ( (lv_text_0_0= ruleTextContent ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:550:1: (lv_text_0_0= ruleTextContent )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:550:1: (lv_text_0_0= ruleTextContent )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:551:3: lv_text_0_0= ruleTextContent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAccess().getTextTextContentParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTextContent_in_ruleText1375);
            lv_text_0_0=ruleTextContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTextRule());
              	        }
                     		set(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"TextContent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleTextContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:575:1: entryRuleTextContent returns [String current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final String entryRuleTextContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextContent = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:576:2: (iv_ruleTextContent= ruleTextContent EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:577:2: iv_ruleTextContent= ruleTextContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextContentRule()); 
            }
            pushFollow(FOLLOW_ruleTextContent_in_entryRuleTextContent1411);
            iv_ruleTextContent=ruleTextContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextContent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextContent1422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:584:1: ruleTextContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( RULE_CHAR | RULE_COMMENT_CLOSE | RULE_PRINT_END | RULE_TAG_END ) )=> (this_CHAR_0= RULE_CHAR | this_COMMENT_CLOSE_1= RULE_COMMENT_CLOSE | this_PRINT_END_2= RULE_PRINT_END | this_TAG_END_3= RULE_TAG_END ) )+ ;
    public final AntlrDatatypeRuleToken ruleTextContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAR_0=null;
        Token this_COMMENT_CLOSE_1=null;
        Token this_PRINT_END_2=null;
        Token this_TAG_END_3=null;

         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:587:28: ( ( ( ( RULE_CHAR | RULE_COMMENT_CLOSE | RULE_PRINT_END | RULE_TAG_END ) )=> (this_CHAR_0= RULE_CHAR | this_COMMENT_CLOSE_1= RULE_COMMENT_CLOSE | this_PRINT_END_2= RULE_PRINT_END | this_TAG_END_3= RULE_TAG_END ) )+ )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:588:1: ( ( ( RULE_CHAR | RULE_COMMENT_CLOSE | RULE_PRINT_END | RULE_TAG_END ) )=> (this_CHAR_0= RULE_CHAR | this_COMMENT_CLOSE_1= RULE_COMMENT_CLOSE | this_PRINT_END_2= RULE_PRINT_END | this_TAG_END_3= RULE_TAG_END ) )+
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:588:1: ( ( ( RULE_CHAR | RULE_COMMENT_CLOSE | RULE_PRINT_END | RULE_TAG_END ) )=> (this_CHAR_0= RULE_CHAR | this_COMMENT_CLOSE_1= RULE_COMMENT_CLOSE | this_PRINT_END_2= RULE_PRINT_END | this_TAG_END_3= RULE_TAG_END ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case RULE_CHAR:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (synpred1_InternalFreemarkerEditor()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case RULE_COMMENT_CLOSE:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (synpred1_InternalFreemarkerEditor()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case RULE_PRINT_END:
                    {
                    int LA7_4 = input.LA(2);

                    if ( (synpred1_InternalFreemarkerEditor()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case RULE_TAG_END:
                    {
                    int LA7_5 = input.LA(2);

                    if ( (synpred1_InternalFreemarkerEditor()) ) {
                        alt7=1;
                    }


                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:588:2: ( ( RULE_CHAR | RULE_COMMENT_CLOSE | RULE_PRINT_END | RULE_TAG_END ) )=> (this_CHAR_0= RULE_CHAR | this_COMMENT_CLOSE_1= RULE_COMMENT_CLOSE | this_PRINT_END_2= RULE_PRINT_END | this_TAG_END_3= RULE_TAG_END )
            	    {
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:591:23: (this_CHAR_0= RULE_CHAR | this_COMMENT_CLOSE_1= RULE_COMMENT_CLOSE | this_PRINT_END_2= RULE_PRINT_END | this_TAG_END_3= RULE_TAG_END )
            	    int alt6=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_CHAR:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case RULE_COMMENT_CLOSE:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case RULE_PRINT_END:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case RULE_TAG_END:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:591:28: this_CHAR_0= RULE_CHAR
            	            {
            	            this_CHAR_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleTextContent1494); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CHAR_0);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CHAR_0, grammarAccess.getTextContentAccess().getCHARTerminalRuleCall_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:599:10: this_COMMENT_CLOSE_1= RULE_COMMENT_CLOSE
            	            {
            	            this_COMMENT_CLOSE_1=(Token)match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_ruleTextContent1520); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMENT_CLOSE_1);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMENT_CLOSE_1, grammarAccess.getTextContentAccess().getCOMMENT_CLOSETerminalRuleCall_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:607:10: this_PRINT_END_2= RULE_PRINT_END
            	            {
            	            this_PRINT_END_2=(Token)match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_ruleTextContent1546); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PRINT_END_2);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PRINT_END_2, grammarAccess.getTextContentAccess().getPRINT_ENDTerminalRuleCall_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:615:10: this_TAG_END_3= RULE_TAG_END
            	            {
            	            this_TAG_END_3=(Token)match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_ruleTextContent1572); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_TAG_END_3);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_TAG_END_3, grammarAccess.getTextContentAccess().getTAG_ENDTerminalRuleCall_0_3()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleComment"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:630:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:631:2: (iv_ruleComment= ruleComment EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:632:2: iv_ruleComment= ruleComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentRule()); 
            }
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1619);
            iv_ruleComment=ruleComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:639:1: ruleComment returns [EObject current=null] : ( () this_COMMENT_OPEN_1= RULE_COMMENT_OPEN ( (lv_text_2_0= ruleCommentContent ) ) this_COMMENT_CLOSE_3= RULE_COMMENT_CLOSE ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token this_COMMENT_OPEN_1=null;
        Token this_COMMENT_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:642:28: ( ( () this_COMMENT_OPEN_1= RULE_COMMENT_OPEN ( (lv_text_2_0= ruleCommentContent ) ) this_COMMENT_CLOSE_3= RULE_COMMENT_CLOSE ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:643:1: ( () this_COMMENT_OPEN_1= RULE_COMMENT_OPEN ( (lv_text_2_0= ruleCommentContent ) ) this_COMMENT_CLOSE_3= RULE_COMMENT_CLOSE )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:643:1: ( () this_COMMENT_OPEN_1= RULE_COMMENT_OPEN ( (lv_text_2_0= ruleCommentContent ) ) this_COMMENT_CLOSE_3= RULE_COMMENT_CLOSE )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:643:2: () this_COMMENT_OPEN_1= RULE_COMMENT_OPEN ( (lv_text_2_0= ruleCommentContent ) ) this_COMMENT_CLOSE_3= RULE_COMMENT_CLOSE
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:643:2: ()
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:644:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommentAccess().getCommentAction_0(),
                          current);
                  
            }

            }

            this_COMMENT_OPEN_1=(Token)match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_ruleComment1674); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMENT_OPEN_1, grammarAccess.getCommentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
                  
            }
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:653:1: ( (lv_text_2_0= ruleCommentContent ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:654:1: (lv_text_2_0= ruleCommentContent )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:654:1: (lv_text_2_0= ruleCommentContent )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:655:3: lv_text_2_0= ruleCommentContent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommentAccess().getTextCommentContentParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommentContent_in_ruleComment1694);
            lv_text_2_0=ruleCommentContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommentRule());
              	        }
                     		set(
                     			current, 
                     			"text",
                      		lv_text_2_0, 
                      		"CommentContent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COMMENT_CLOSE_3=(Token)match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_ruleComment1705); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMENT_CLOSE_3, grammarAccess.getCommentAccess().getCOMMENT_CLOSETerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleCommentContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:683:1: entryRuleCommentContent returns [String current=null] : iv_ruleCommentContent= ruleCommentContent EOF ;
    public final String entryRuleCommentContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentContent = null;


        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:684:2: (iv_ruleCommentContent= ruleCommentContent EOF )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:685:2: iv_ruleCommentContent= ruleCommentContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentContentRule()); 
            }
            pushFollow(FOLLOW_ruleCommentContent_in_entryRuleCommentContent1741);
            iv_ruleCommentContent=ruleCommentContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentContent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentContent1752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentContent"


    // $ANTLR start "ruleCommentContent"
    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:692:1: ruleCommentContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_TAG_OPEN_START_2= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_3= RULE_TAG_CLOSE_START | this_PRINT_START_4= RULE_PRINT_START | this_PRINT_END_5= RULE_PRINT_END | this_TAG_END_6= RULE_TAG_END )* ;
    public final AntlrDatatypeRuleToken ruleCommentContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAR_0=null;
        Token this_COMMENT_OPEN_1=null;
        Token this_TAG_OPEN_START_2=null;
        Token this_TAG_CLOSE_START_3=null;
        Token this_PRINT_START_4=null;
        Token this_PRINT_END_5=null;
        Token this_TAG_END_6=null;

         enterRule(); 
            
        try {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:695:28: ( (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_TAG_OPEN_START_2= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_3= RULE_TAG_CLOSE_START | this_PRINT_START_4= RULE_PRINT_START | this_PRINT_END_5= RULE_PRINT_END | this_TAG_END_6= RULE_TAG_END )* )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:696:1: (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_TAG_OPEN_START_2= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_3= RULE_TAG_CLOSE_START | this_PRINT_START_4= RULE_PRINT_START | this_PRINT_END_5= RULE_PRINT_END | this_TAG_END_6= RULE_TAG_END )*
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:696:1: (this_CHAR_0= RULE_CHAR | this_COMMENT_OPEN_1= RULE_COMMENT_OPEN | this_TAG_OPEN_START_2= RULE_TAG_OPEN_START | this_TAG_CLOSE_START_3= RULE_TAG_CLOSE_START | this_PRINT_START_4= RULE_PRINT_START | this_PRINT_END_5= RULE_PRINT_END | this_TAG_END_6= RULE_TAG_END )*
            loop8:
            do {
                int alt8=8;
                switch ( input.LA(1) ) {
                case RULE_CHAR:
                    {
                    alt8=1;
                    }
                    break;
                case RULE_COMMENT_OPEN:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_TAG_OPEN_START:
                    {
                    alt8=3;
                    }
                    break;
                case RULE_TAG_CLOSE_START:
                    {
                    alt8=4;
                    }
                    break;
                case RULE_PRINT_START:
                    {
                    alt8=5;
                    }
                    break;
                case RULE_PRINT_END:
                    {
                    alt8=6;
                    }
                    break;
                case RULE_TAG_END:
                    {
                    alt8=7;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:696:6: this_CHAR_0= RULE_CHAR
            	    {
            	    this_CHAR_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleCommentContent1792); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CHAR_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CHAR_0, grammarAccess.getCommentContentAccess().getCHARTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:704:10: this_COMMENT_OPEN_1= RULE_COMMENT_OPEN
            	    {
            	    this_COMMENT_OPEN_1=(Token)match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_ruleCommentContent1818); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMENT_OPEN_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMENT_OPEN_1, grammarAccess.getCommentContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:712:10: this_TAG_OPEN_START_2= RULE_TAG_OPEN_START
            	    {
            	    this_TAG_OPEN_START_2=(Token)match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_ruleCommentContent1844); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_OPEN_START_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_OPEN_START_2, grammarAccess.getCommentContentAccess().getTAG_OPEN_STARTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:720:10: this_TAG_CLOSE_START_3= RULE_TAG_CLOSE_START
            	    {
            	    this_TAG_CLOSE_START_3=(Token)match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_ruleCommentContent1870); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_CLOSE_START_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_CLOSE_START_3, grammarAccess.getCommentContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:728:10: this_PRINT_START_4= RULE_PRINT_START
            	    {
            	    this_PRINT_START_4=(Token)match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_ruleCommentContent1896); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PRINT_START_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PRINT_START_4, grammarAccess.getCommentContentAccess().getPRINT_STARTTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:736:10: this_PRINT_END_5= RULE_PRINT_END
            	    {
            	    this_PRINT_END_5=(Token)match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_ruleCommentContent1922); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PRINT_END_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PRINT_END_5, grammarAccess.getCommentContentAccess().getPRINT_ENDTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:744:10: this_TAG_END_6= RULE_TAG_END
            	    {
            	    this_TAG_END_6=(Token)match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_ruleCommentContent1948); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TAG_END_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TAG_END_6, grammarAccess.getCommentContentAccess().getTAG_ENDTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentContent"

    // $ANTLR start synpred1_InternalFreemarkerEditor
    public final void synpred1_InternalFreemarkerEditor_fragment() throws RecognitionException {   
        // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:588:2: ( ( RULE_CHAR | RULE_COMMENT_CLOSE | RULE_PRINT_END | RULE_TAG_END ) )
        // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:588:3: ( RULE_CHAR | RULE_COMMENT_CLOSE | RULE_PRINT_END | RULE_TAG_END )
        {
        if ( (input.LA(1)>=RULE_PRINT_END && input.LA(1)<=RULE_CHAR)||input.LA(1)==RULE_COMMENT_CLOSE||input.LA(1)==RULE_TAG_END ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalFreemarkerEditor

    // Delegated rules

    public final boolean synpred1_InternalFreemarkerEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFreemarkerEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleFreemarker_in_entryRuleFreemarker75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreemarker85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleFreemarker130 = new BitSet(new long[]{0x0000000000000BF2L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_ruleElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_ruleElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleElement304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_rulePrint385 = new BitSet(new long[]{0x0000000000000FD0L});
    public static final BitSet FOLLOW_rulePrintContent_in_rulePrint405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_rulePrint416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrintContent_in_entryRulePrintContent452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrintContent463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rulePrintContent503 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_rulePrintContent529 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_rulePrintContent555 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_rulePrintContent581 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_rulePrintContent607 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_rulePrintContent633 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rulePrintContent659 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTag_in_ruleTag761 = new BitSet(new long[]{0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleElement_in_ruleTag782 = new BitSet(new long[]{0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleCloseTag_in_ruleTag804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTag_in_entryRuleOpenTag842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenTag852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_ruleOpenTag888 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_ruleTagContent_in_ruleOpenTag908 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_ruleOpenTag919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseTag_in_entryRuleCloseTag954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloseTag964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_ruleCloseTag1000 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_ruleTagContent_in_ruleCloseTag1020 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_ruleCloseTag1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagContent_in_entryRuleTagContent1067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagContent1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleTagContent1118 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_ruleTagContent1144 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_ruleTagContent1170 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_ruleTagContent1196 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_ruleTagContent1222 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_ruleTagContent1248 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_ruleTagContent1274 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextContent_in_ruleText1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent1411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextContent1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleTextContent1494 = new BitSet(new long[]{0x0000000000000962L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_ruleTextContent1520 = new BitSet(new long[]{0x0000000000000962L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_ruleTextContent1546 = new BitSet(new long[]{0x0000000000000962L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_ruleTextContent1572 = new BitSet(new long[]{0x0000000000000962L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_ruleComment1674 = new BitSet(new long[]{0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleCommentContent_in_ruleComment1694 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_ruleComment1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentContent_in_entryRuleCommentContent1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentContent1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleCommentContent1792 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_ruleCommentContent1818 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_ruleCommentContent1844 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_ruleCommentContent1870 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_ruleCommentContent1896 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_ruleCommentContent1922 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_ruleCommentContent1948 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalFreemarkerEditor1457 = new BitSet(new long[]{0x0000000000000002L});

}
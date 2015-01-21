package org.github.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.github.services.FreemarkerEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFreemarkerEditorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CHAR", "RULE_COMMENT_OPEN", "RULE_COMMENT_CLOSE", "RULE_TAG_OPEN_START", "RULE_TAG_CLOSE_START", "RULE_PRINT_START", "RULE_TAG_END", "RULE_PRINT_END"
    };
    public static final int RULE_TAG_OPEN_START=7;
    public static final int RULE_COMMENT_OPEN=5;
    public static final int RULE_TAG_END=10;
    public static final int RULE_PRINT_START=9;
    public static final int RULE_TAG_CLOSE_START=8;
    public static final int RULE_COMMENT_CLOSE=6;
    public static final int RULE_CHAR=4;
    public static final int RULE_PRINT_END=11;
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
    public String getGrammarFileName() { return "../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g"; }


     
     	private FreemarkerEditorGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FreemarkerEditorGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFreemarker"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:61:1: entryRuleFreemarker : ruleFreemarker EOF ;
    public final void entryRuleFreemarker() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:62:1: ( ruleFreemarker EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:63:1: ruleFreemarker EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFreemarkerRule()); 
            }
            pushFollow(FOLLOW_ruleFreemarker_in_entryRuleFreemarker67);
            ruleFreemarker();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFreemarkerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreemarker74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFreemarker"


    // $ANTLR start "ruleFreemarker"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:70:1: ruleFreemarker : ( ( rule__Freemarker__ElementsAssignment )* ) ;
    public final void ruleFreemarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:74:2: ( ( ( rule__Freemarker__ElementsAssignment )* ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:75:1: ( ( rule__Freemarker__ElementsAssignment )* )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:75:1: ( ( rule__Freemarker__ElementsAssignment )* )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:76:1: ( rule__Freemarker__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFreemarkerAccess().getElementsAssignment()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:77:1: ( rule__Freemarker__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_CHAR && LA1_0<=RULE_TAG_OPEN_START)||(LA1_0>=RULE_PRINT_START && LA1_0<=RULE_PRINT_END)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:77:2: rule__Freemarker__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Freemarker__ElementsAssignment_in_ruleFreemarker100);
            	    rule__Freemarker__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFreemarkerAccess().getElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreemarker"


    // $ANTLR start "entryRuleElement"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:89:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:90:1: ( ruleElement EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:91:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement128);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:98:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:102:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:103:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:103:1: ( ( rule__Element__Alternatives ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:104:1: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:105:1: ( rule__Element__Alternatives )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:105:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement161);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePrint"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:117:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:118:1: ( rulePrint EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:119:1: rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint188);
            rulePrint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:126:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:130:2: ( ( ( rule__Print__Group__0 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:131:1: ( ( rule__Print__Group__0 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:131:1: ( ( rule__Print__Group__0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:132:1: ( rule__Print__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getGroup()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:133:1: ( rule__Print__Group__0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:133:2: rule__Print__Group__0
            {
            pushFollow(FOLLOW_rule__Print__Group__0_in_rulePrint221);
            rule__Print__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRulePrintContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:145:1: entryRulePrintContent : rulePrintContent EOF ;
    public final void entryRulePrintContent() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:146:1: ( rulePrintContent EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:147:1: rulePrintContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintContentRule()); 
            }
            pushFollow(FOLLOW_rulePrintContent_in_entryRulePrintContent248);
            rulePrintContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrintContent255); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintContent"


    // $ANTLR start "rulePrintContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:154:1: rulePrintContent : ( ( ( rule__PrintContent__Alternatives ) ) ( ( rule__PrintContent__Alternatives )* ) ) ;
    public final void rulePrintContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:158:2: ( ( ( ( rule__PrintContent__Alternatives ) ) ( ( rule__PrintContent__Alternatives )* ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:159:1: ( ( ( rule__PrintContent__Alternatives ) ) ( ( rule__PrintContent__Alternatives )* ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:159:1: ( ( ( rule__PrintContent__Alternatives ) ) ( ( rule__PrintContent__Alternatives )* ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:160:1: ( ( rule__PrintContent__Alternatives ) ) ( ( rule__PrintContent__Alternatives )* )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:160:1: ( ( rule__PrintContent__Alternatives ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:161:1: ( rule__PrintContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintContentAccess().getAlternatives()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:162:1: ( rule__PrintContent__Alternatives )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:162:2: rule__PrintContent__Alternatives
            {
            pushFollow(FOLLOW_rule__PrintContent__Alternatives_in_rulePrintContent283);
            rule__PrintContent__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintContentAccess().getAlternatives()); 
            }

            }

            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:165:1: ( ( rule__PrintContent__Alternatives )* )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:166:1: ( rule__PrintContent__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintContentAccess().getAlternatives()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:167:1: ( rule__PrintContent__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_CHAR && LA2_0<=RULE_TAG_END)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:167:2: rule__PrintContent__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__PrintContent__Alternatives_in_rulePrintContent295);
            	    rule__PrintContent__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintContentAccess().getAlternatives()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintContent"


    // $ANTLR start "entryRuleTag"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:180:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:181:1: ( ruleTag EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:182:1: ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag325);
            ruleTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag332); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:189:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:193:2: ( ( ( rule__Tag__Group__0 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:194:1: ( ( rule__Tag__Group__0 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:194:1: ( ( rule__Tag__Group__0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:195:1: ( rule__Tag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getGroup()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:196:1: ( rule__Tag__Group__0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:196:2: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_rule__Tag__Group__0_in_ruleTag358);
            rule__Tag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleOpenTag"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:210:1: entryRuleOpenTag : ruleOpenTag EOF ;
    public final void entryRuleOpenTag() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:211:1: ( ruleOpenTag EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:212:1: ruleOpenTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTagRule()); 
            }
            pushFollow(FOLLOW_ruleOpenTag_in_entryRuleOpenTag387);
            ruleOpenTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTagRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenTag394); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpenTag"


    // $ANTLR start "ruleOpenTag"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:219:1: ruleOpenTag : ( ( rule__OpenTag__Group__0 ) ) ;
    public final void ruleOpenTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:223:2: ( ( ( rule__OpenTag__Group__0 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:224:1: ( ( rule__OpenTag__Group__0 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:224:1: ( ( rule__OpenTag__Group__0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:225:1: ( rule__OpenTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTagAccess().getGroup()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:226:1: ( rule__OpenTag__Group__0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:226:2: rule__OpenTag__Group__0
            {
            pushFollow(FOLLOW_rule__OpenTag__Group__0_in_ruleOpenTag420);
            rule__OpenTag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTagAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpenTag"


    // $ANTLR start "entryRuleCloseTag"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:238:1: entryRuleCloseTag : ruleCloseTag EOF ;
    public final void entryRuleCloseTag() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:239:1: ( ruleCloseTag EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:240:1: ruleCloseTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloseTagRule()); 
            }
            pushFollow(FOLLOW_ruleCloseTag_in_entryRuleCloseTag447);
            ruleCloseTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloseTagRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloseTag454); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCloseTag"


    // $ANTLR start "ruleCloseTag"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:247:1: ruleCloseTag : ( ( rule__CloseTag__Group__0 ) ) ;
    public final void ruleCloseTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:251:2: ( ( ( rule__CloseTag__Group__0 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:252:1: ( ( rule__CloseTag__Group__0 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:252:1: ( ( rule__CloseTag__Group__0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:253:1: ( rule__CloseTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloseTagAccess().getGroup()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:254:1: ( rule__CloseTag__Group__0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:254:2: rule__CloseTag__Group__0
            {
            pushFollow(FOLLOW_rule__CloseTag__Group__0_in_ruleCloseTag480);
            rule__CloseTag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloseTagAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCloseTag"


    // $ANTLR start "entryRuleTagContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:266:1: entryRuleTagContent : ruleTagContent EOF ;
    public final void entryRuleTagContent() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:267:1: ( ruleTagContent EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:268:1: ruleTagContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagContentRule()); 
            }
            pushFollow(FOLLOW_ruleTagContent_in_entryRuleTagContent507);
            ruleTagContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagContent514); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTagContent"


    // $ANTLR start "ruleTagContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:275:1: ruleTagContent : ( ( ( rule__TagContent__Alternatives ) ) ( ( rule__TagContent__Alternatives )* ) ) ;
    public final void ruleTagContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:279:2: ( ( ( ( rule__TagContent__Alternatives ) ) ( ( rule__TagContent__Alternatives )* ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:280:1: ( ( ( rule__TagContent__Alternatives ) ) ( ( rule__TagContent__Alternatives )* ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:280:1: ( ( ( rule__TagContent__Alternatives ) ) ( ( rule__TagContent__Alternatives )* ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:281:1: ( ( rule__TagContent__Alternatives ) ) ( ( rule__TagContent__Alternatives )* )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:281:1: ( ( rule__TagContent__Alternatives ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:282:1: ( rule__TagContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagContentAccess().getAlternatives()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:283:1: ( rule__TagContent__Alternatives )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:283:2: rule__TagContent__Alternatives
            {
            pushFollow(FOLLOW_rule__TagContent__Alternatives_in_ruleTagContent542);
            rule__TagContent__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagContentAccess().getAlternatives()); 
            }

            }

            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:286:1: ( ( rule__TagContent__Alternatives )* )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:287:1: ( rule__TagContent__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagContentAccess().getAlternatives()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:288:1: ( rule__TagContent__Alternatives )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_CHAR && LA3_0<=RULE_PRINT_START)||LA3_0==RULE_PRINT_END) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:288:2: rule__TagContent__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__TagContent__Alternatives_in_ruleTagContent554);
            	    rule__TagContent__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagContentAccess().getAlternatives()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagContent"


    // $ANTLR start "entryRuleText"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:301:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:302:1: ( ruleText EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:303:1: ruleText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText584);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText591); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:310:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:314:2: ( ( ( rule__Text__TextAssignment ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:315:1: ( ( rule__Text__TextAssignment ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:315:1: ( ( rule__Text__TextAssignment ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:316:1: ( rule__Text__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getTextAssignment()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:317:1: ( rule__Text__TextAssignment )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:317:2: rule__Text__TextAssignment
            {
            pushFollow(FOLLOW_rule__Text__TextAssignment_in_ruleText617);
            rule__Text__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getTextAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleTextContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:329:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:330:1: ( ruleTextContent EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:331:1: ruleTextContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentRule()); 
            }
            pushFollow(FOLLOW_ruleTextContent_in_entryRuleTextContent644);
            ruleTextContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextContent651); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:338:1: ruleTextContent : ( ( ( rule__TextContent__Group__0 ) ) ( ( rule__TextContent__Group__0 )* ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:342:2: ( ( ( ( rule__TextContent__Group__0 ) ) ( ( rule__TextContent__Group__0 )* ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:343:1: ( ( ( rule__TextContent__Group__0 ) ) ( ( rule__TextContent__Group__0 )* ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:343:1: ( ( ( rule__TextContent__Group__0 ) ) ( ( rule__TextContent__Group__0 )* ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:344:1: ( ( rule__TextContent__Group__0 ) ) ( ( rule__TextContent__Group__0 )* )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:344:1: ( ( rule__TextContent__Group__0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:345:1: ( rule__TextContent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getGroup()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:346:1: ( rule__TextContent__Group__0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:346:2: rule__TextContent__Group__0
            {
            pushFollow(FOLLOW_rule__TextContent__Group__0_in_ruleTextContent679);
            rule__TextContent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getGroup()); 
            }

            }

            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:349:1: ( ( rule__TextContent__Group__0 )* )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:350:1: ( rule__TextContent__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getGroup()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:351:1: ( rule__TextContent__Group__0 )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case RULE_CHAR:
                    {
                    int LA4_2 = input.LA(2);

                    if ( (synpred4_InternalFreemarkerEditor()) ) {
                        alt4=1;
                    }


                    }
                    break;
                case RULE_COMMENT_CLOSE:
                    {
                    int LA4_3 = input.LA(2);

                    if ( (synpred4_InternalFreemarkerEditor()) ) {
                        alt4=1;
                    }


                    }
                    break;
                case RULE_PRINT_END:
                    {
                    int LA4_4 = input.LA(2);

                    if ( (synpred4_InternalFreemarkerEditor()) ) {
                        alt4=1;
                    }


                    }
                    break;
                case RULE_TAG_END:
                    {
                    int LA4_5 = input.LA(2);

                    if ( (synpred4_InternalFreemarkerEditor()) ) {
                        alt4=1;
                    }


                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:351:2: rule__TextContent__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__TextContent__Group__0_in_ruleTextContent691);
            	    rule__TextContent__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getGroup()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleComment"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:364:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:365:1: ( ruleComment EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:366:1: ruleComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentRule()); 
            }
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment721);
            ruleComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment728); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:373:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:377:2: ( ( ( rule__Comment__Group__0 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:378:1: ( ( rule__Comment__Group__0 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:378:1: ( ( rule__Comment__Group__0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:379:1: ( rule__Comment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getGroup()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:380:1: ( rule__Comment__Group__0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:380:2: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_rule__Comment__Group__0_in_ruleComment754);
            rule__Comment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleCommentContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:392:1: entryRuleCommentContent : ruleCommentContent EOF ;
    public final void entryRuleCommentContent() throws RecognitionException {
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:393:1: ( ruleCommentContent EOF )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:394:1: ruleCommentContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentContentRule()); 
            }
            pushFollow(FOLLOW_ruleCommentContent_in_entryRuleCommentContent781);
            ruleCommentContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentContent788); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentContent"


    // $ANTLR start "ruleCommentContent"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:401:1: ruleCommentContent : ( ( rule__CommentContent__Alternatives )* ) ;
    public final void ruleCommentContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:405:2: ( ( ( rule__CommentContent__Alternatives )* ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:406:1: ( ( rule__CommentContent__Alternatives )* )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:406:1: ( ( rule__CommentContent__Alternatives )* )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:407:1: ( rule__CommentContent__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentContentAccess().getAlternatives()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:408:1: ( rule__CommentContent__Alternatives )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_CHAR && LA5_0<=RULE_COMMENT_OPEN)||(LA5_0>=RULE_TAG_OPEN_START && LA5_0<=RULE_PRINT_END)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:408:2: rule__CommentContent__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__CommentContent__Alternatives_in_ruleCommentContent814);
            	    rule__CommentContent__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentContentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentContent"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:420:1: rule__Element__Alternatives : ( ( rulePrint ) | ( ruleComment ) | ( ruleTag ) | ( ruleText ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:424:1: ( ( rulePrint ) | ( ruleComment ) | ( ruleTag ) | ( ruleText ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_PRINT_START:
                {
                alt6=1;
                }
                break;
            case RULE_COMMENT_OPEN:
                {
                alt6=2;
                }
                break;
            case RULE_TAG_OPEN_START:
                {
                alt6=3;
                }
                break;
            case RULE_CHAR:
            case RULE_COMMENT_CLOSE:
            case RULE_TAG_END:
            case RULE_PRINT_END:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:425:1: ( rulePrint )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:425:1: ( rulePrint )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:426:1: rulePrint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getPrintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePrint_in_rule__Element__Alternatives851);
                    rulePrint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getPrintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:431:6: ( ruleComment )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:431:6: ( ruleComment )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:432:1: ruleComment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getCommentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComment_in_rule__Element__Alternatives868);
                    ruleComment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getCommentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:437:6: ( ruleTag )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:437:6: ( ruleTag )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:438:1: ruleTag
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTagParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTag_in_rule__Element__Alternatives885);
                    ruleTag();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTagParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:443:6: ( ruleText )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:443:6: ( ruleText )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:444:1: ruleText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__Element__Alternatives902);
                    ruleText();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTextParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__PrintContent__Alternatives"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:454:1: rule__PrintContent__Alternatives : ( ( RULE_CHAR ) | ( RULE_COMMENT_OPEN ) | ( RULE_COMMENT_CLOSE ) | ( RULE_TAG_OPEN_START ) | ( RULE_TAG_CLOSE_START ) | ( RULE_PRINT_START ) | ( RULE_TAG_END ) );
    public final void rule__PrintContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:458:1: ( ( RULE_CHAR ) | ( RULE_COMMENT_OPEN ) | ( RULE_COMMENT_CLOSE ) | ( RULE_TAG_OPEN_START ) | ( RULE_TAG_CLOSE_START ) | ( RULE_PRINT_START ) | ( RULE_TAG_END ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case RULE_CHAR:
                {
                alt7=1;
                }
                break;
            case RULE_COMMENT_OPEN:
                {
                alt7=2;
                }
                break;
            case RULE_COMMENT_CLOSE:
                {
                alt7=3;
                }
                break;
            case RULE_TAG_OPEN_START:
                {
                alt7=4;
                }
                break;
            case RULE_TAG_CLOSE_START:
                {
                alt7=5;
                }
                break;
            case RULE_PRINT_START:
                {
                alt7=6;
                }
                break;
            case RULE_TAG_END:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:459:1: ( RULE_CHAR )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:459:1: ( RULE_CHAR )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:460:1: RULE_CHAR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintContentAccess().getCHARTerminalRuleCall_0()); 
                    }
                    match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__PrintContent__Alternatives934); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintContentAccess().getCHARTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:465:6: ( RULE_COMMENT_OPEN )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:465:6: ( RULE_COMMENT_OPEN )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:466:1: RULE_COMMENT_OPEN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
                    }
                    match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_rule__PrintContent__Alternatives951); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:471:6: ( RULE_COMMENT_CLOSE )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:471:6: ( RULE_COMMENT_CLOSE )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:472:1: RULE_COMMENT_CLOSE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintContentAccess().getCOMMENT_CLOSETerminalRuleCall_2()); 
                    }
                    match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_rule__PrintContent__Alternatives968); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintContentAccess().getCOMMENT_CLOSETerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:477:6: ( RULE_TAG_OPEN_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:477:6: ( RULE_TAG_OPEN_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:478:1: RULE_TAG_OPEN_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintContentAccess().getTAG_OPEN_STARTTerminalRuleCall_3()); 
                    }
                    match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_rule__PrintContent__Alternatives985); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintContentAccess().getTAG_OPEN_STARTTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:483:6: ( RULE_TAG_CLOSE_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:483:6: ( RULE_TAG_CLOSE_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:484:1: RULE_TAG_CLOSE_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_4()); 
                    }
                    match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_rule__PrintContent__Alternatives1002); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:489:6: ( RULE_PRINT_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:489:6: ( RULE_PRINT_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:490:1: RULE_PRINT_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintContentAccess().getPRINT_STARTTerminalRuleCall_5()); 
                    }
                    match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_rule__PrintContent__Alternatives1019); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintContentAccess().getPRINT_STARTTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:495:6: ( RULE_TAG_END )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:495:6: ( RULE_TAG_END )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:496:1: RULE_TAG_END
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrintContentAccess().getTAG_ENDTerminalRuleCall_6()); 
                    }
                    match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rule__PrintContent__Alternatives1036); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrintContentAccess().getTAG_ENDTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintContent__Alternatives"


    // $ANTLR start "rule__TagContent__Alternatives"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:507:1: rule__TagContent__Alternatives : ( ( RULE_CHAR ) | ( RULE_COMMENT_OPEN ) | ( RULE_COMMENT_CLOSE ) | ( RULE_TAG_OPEN_START ) | ( RULE_TAG_CLOSE_START ) | ( RULE_PRINT_START ) | ( RULE_PRINT_END ) );
    public final void rule__TagContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:511:1: ( ( RULE_CHAR ) | ( RULE_COMMENT_OPEN ) | ( RULE_COMMENT_CLOSE ) | ( RULE_TAG_OPEN_START ) | ( RULE_TAG_CLOSE_START ) | ( RULE_PRINT_START ) | ( RULE_PRINT_END ) )
            int alt8=7;
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
            case RULE_COMMENT_CLOSE:
                {
                alt8=3;
                }
                break;
            case RULE_TAG_OPEN_START:
                {
                alt8=4;
                }
                break;
            case RULE_TAG_CLOSE_START:
                {
                alt8=5;
                }
                break;
            case RULE_PRINT_START:
                {
                alt8=6;
                }
                break;
            case RULE_PRINT_END:
                {
                alt8=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:512:1: ( RULE_CHAR )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:512:1: ( RULE_CHAR )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:513:1: RULE_CHAR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTagContentAccess().getCHARTerminalRuleCall_0()); 
                    }
                    match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__TagContent__Alternatives1069); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTagContentAccess().getCHARTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:518:6: ( RULE_COMMENT_OPEN )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:518:6: ( RULE_COMMENT_OPEN )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:519:1: RULE_COMMENT_OPEN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTagContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
                    }
                    match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_rule__TagContent__Alternatives1086); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTagContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:524:6: ( RULE_COMMENT_CLOSE )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:524:6: ( RULE_COMMENT_CLOSE )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:525:1: RULE_COMMENT_CLOSE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTagContentAccess().getCOMMENT_CLOSETerminalRuleCall_2()); 
                    }
                    match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_rule__TagContent__Alternatives1103); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTagContentAccess().getCOMMENT_CLOSETerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:530:6: ( RULE_TAG_OPEN_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:530:6: ( RULE_TAG_OPEN_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:531:1: RULE_TAG_OPEN_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTagContentAccess().getTAG_OPEN_STARTTerminalRuleCall_3()); 
                    }
                    match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_rule__TagContent__Alternatives1120); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTagContentAccess().getTAG_OPEN_STARTTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:536:6: ( RULE_TAG_CLOSE_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:536:6: ( RULE_TAG_CLOSE_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:537:1: RULE_TAG_CLOSE_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTagContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_4()); 
                    }
                    match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_rule__TagContent__Alternatives1137); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTagContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:542:6: ( RULE_PRINT_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:542:6: ( RULE_PRINT_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:543:1: RULE_PRINT_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTagContentAccess().getPRINT_STARTTerminalRuleCall_5()); 
                    }
                    match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_rule__TagContent__Alternatives1154); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTagContentAccess().getPRINT_STARTTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:548:6: ( RULE_PRINT_END )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:548:6: ( RULE_PRINT_END )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:549:1: RULE_PRINT_END
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTagContentAccess().getPRINT_ENDTerminalRuleCall_6()); 
                    }
                    match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_rule__TagContent__Alternatives1171); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTagContentAccess().getPRINT_ENDTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagContent__Alternatives"


    // $ANTLR start "rule__TextContent__Alternatives_0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:559:1: rule__TextContent__Alternatives_0 : ( ( RULE_CHAR ) | ( RULE_COMMENT_CLOSE ) | ( RULE_PRINT_END ) | ( RULE_TAG_END ) );
    public final void rule__TextContent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:563:1: ( ( RULE_CHAR ) | ( RULE_COMMENT_CLOSE ) | ( RULE_PRINT_END ) | ( RULE_TAG_END ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_CHAR:
                {
                alt9=1;
                }
                break;
            case RULE_COMMENT_CLOSE:
                {
                alt9=2;
                }
                break;
            case RULE_PRINT_END:
                {
                alt9=3;
                }
                break;
            case RULE_TAG_END:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:564:1: ( RULE_CHAR )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:564:1: ( RULE_CHAR )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:565:1: RULE_CHAR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getCHARTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__TextContent__Alternatives_01203); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getCHARTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:570:6: ( RULE_COMMENT_CLOSE )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:570:6: ( RULE_COMMENT_CLOSE )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:571:1: RULE_COMMENT_CLOSE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getCOMMENT_CLOSETerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_rule__TextContent__Alternatives_01220); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getCOMMENT_CLOSETerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:576:6: ( RULE_PRINT_END )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:576:6: ( RULE_PRINT_END )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:577:1: RULE_PRINT_END
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getPRINT_ENDTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_rule__TextContent__Alternatives_01237); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getPRINT_ENDTerminalRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:582:6: ( RULE_TAG_END )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:582:6: ( RULE_TAG_END )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:583:1: RULE_TAG_END
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getTAG_ENDTerminalRuleCall_0_3()); 
                    }
                    match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rule__TextContent__Alternatives_01254); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getTAG_ENDTerminalRuleCall_0_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Alternatives_0"


    // $ANTLR start "rule__CommentContent__Alternatives"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:593:1: rule__CommentContent__Alternatives : ( ( RULE_CHAR ) | ( RULE_COMMENT_OPEN ) | ( RULE_TAG_OPEN_START ) | ( RULE_TAG_CLOSE_START ) | ( RULE_PRINT_START ) | ( RULE_PRINT_END ) | ( RULE_TAG_END ) );
    public final void rule__CommentContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:597:1: ( ( RULE_CHAR ) | ( RULE_COMMENT_OPEN ) | ( RULE_TAG_OPEN_START ) | ( RULE_TAG_CLOSE_START ) | ( RULE_PRINT_START ) | ( RULE_PRINT_END ) | ( RULE_TAG_END ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case RULE_CHAR:
                {
                alt10=1;
                }
                break;
            case RULE_COMMENT_OPEN:
                {
                alt10=2;
                }
                break;
            case RULE_TAG_OPEN_START:
                {
                alt10=3;
                }
                break;
            case RULE_TAG_CLOSE_START:
                {
                alt10=4;
                }
                break;
            case RULE_PRINT_START:
                {
                alt10=5;
                }
                break;
            case RULE_PRINT_END:
                {
                alt10=6;
                }
                break;
            case RULE_TAG_END:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:598:1: ( RULE_CHAR )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:598:1: ( RULE_CHAR )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:599:1: RULE_CHAR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommentContentAccess().getCHARTerminalRuleCall_0()); 
                    }
                    match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__CommentContent__Alternatives1286); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommentContentAccess().getCHARTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:604:6: ( RULE_COMMENT_OPEN )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:604:6: ( RULE_COMMENT_OPEN )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:605:1: RULE_COMMENT_OPEN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommentContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
                    }
                    match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_rule__CommentContent__Alternatives1303); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommentContentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:610:6: ( RULE_TAG_OPEN_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:610:6: ( RULE_TAG_OPEN_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:611:1: RULE_TAG_OPEN_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommentContentAccess().getTAG_OPEN_STARTTerminalRuleCall_2()); 
                    }
                    match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_rule__CommentContent__Alternatives1320); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommentContentAccess().getTAG_OPEN_STARTTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:616:6: ( RULE_TAG_CLOSE_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:616:6: ( RULE_TAG_CLOSE_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:617:1: RULE_TAG_CLOSE_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommentContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_3()); 
                    }
                    match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_rule__CommentContent__Alternatives1337); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommentContentAccess().getTAG_CLOSE_STARTTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:622:6: ( RULE_PRINT_START )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:622:6: ( RULE_PRINT_START )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:623:1: RULE_PRINT_START
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommentContentAccess().getPRINT_STARTTerminalRuleCall_4()); 
                    }
                    match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_rule__CommentContent__Alternatives1354); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommentContentAccess().getPRINT_STARTTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:628:6: ( RULE_PRINT_END )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:628:6: ( RULE_PRINT_END )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:629:1: RULE_PRINT_END
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommentContentAccess().getPRINT_ENDTerminalRuleCall_5()); 
                    }
                    match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_rule__CommentContent__Alternatives1371); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommentContentAccess().getPRINT_ENDTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:634:6: ( RULE_TAG_END )
                    {
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:634:6: ( RULE_TAG_END )
                    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:635:1: RULE_TAG_END
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommentContentAccess().getTAG_ENDTerminalRuleCall_6()); 
                    }
                    match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rule__CommentContent__Alternatives1388); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommentContentAccess().getTAG_ENDTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentContent__Alternatives"


    // $ANTLR start "rule__Print__Group__0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:647:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:651:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:652:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__01418);
            rule__Print__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Print__Group__1_in_rule__Print__Group__01421);
            rule__Print__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:659:1: rule__Print__Group__0__Impl : ( RULE_PRINT_START ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:663:1: ( ( RULE_PRINT_START ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:664:1: ( RULE_PRINT_START )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:664:1: ( RULE_PRINT_START )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:665:1: RULE_PRINT_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPRINT_STARTTerminalRuleCall_0()); 
            }
            match(input,RULE_PRINT_START,FOLLOW_RULE_PRINT_START_in_rule__Print__Group__0__Impl1448); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getPRINT_STARTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:676:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:680:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:681:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__11477);
            rule__Print__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Print__Group__2_in_rule__Print__Group__11480);
            rule__Print__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:688:1: rule__Print__Group__1__Impl : ( ( rule__Print__ExpressionAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:692:1: ( ( ( rule__Print__ExpressionAssignment_1 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:693:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:693:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:694:1: ( rule__Print__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getExpressionAssignment_1()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:695:1: ( rule__Print__ExpressionAssignment_1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:695:2: rule__Print__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__Print__ExpressionAssignment_1_in_rule__Print__Group__1__Impl1507);
            rule__Print__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__2"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:705:1: rule__Print__Group__2 : rule__Print__Group__2__Impl ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:709:1: ( rule__Print__Group__2__Impl )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:710:2: rule__Print__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Print__Group__2__Impl_in_rule__Print__Group__21537);
            rule__Print__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2"


    // $ANTLR start "rule__Print__Group__2__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:716:1: rule__Print__Group__2__Impl : ( RULE_PRINT_END ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:720:1: ( ( RULE_PRINT_END ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:721:1: ( RULE_PRINT_END )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:721:1: ( RULE_PRINT_END )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:722:1: RULE_PRINT_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getPRINT_ENDTerminalRuleCall_2()); 
            }
            match(input,RULE_PRINT_END,FOLLOW_RULE_PRINT_END_in_rule__Print__Group__2__Impl1564); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getPRINT_ENDTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:739:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:743:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:744:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_rule__Tag__Group__0__Impl_in_rule__Tag__Group__01599);
            rule__Tag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tag__Group__1_in_rule__Tag__Group__01602);
            rule__Tag__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:751:1: rule__Tag__Group__0__Impl : ( ( rule__Tag__OpenTagAssignment_0 ) ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:755:1: ( ( ( rule__Tag__OpenTagAssignment_0 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:756:1: ( ( rule__Tag__OpenTagAssignment_0 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:756:1: ( ( rule__Tag__OpenTagAssignment_0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:757:1: ( rule__Tag__OpenTagAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getOpenTagAssignment_0()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:758:1: ( rule__Tag__OpenTagAssignment_0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:758:2: rule__Tag__OpenTagAssignment_0
            {
            pushFollow(FOLLOW_rule__Tag__OpenTagAssignment_0_in_rule__Tag__Group__0__Impl1629);
            rule__Tag__OpenTagAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getOpenTagAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:768:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:772:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:773:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FOLLOW_rule__Tag__Group__1__Impl_in_rule__Tag__Group__11659);
            rule__Tag__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tag__Group__2_in_rule__Tag__Group__11662);
            rule__Tag__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:780:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__ElementsAssignment_1 )* ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:784:1: ( ( ( rule__Tag__ElementsAssignment_1 )* ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:785:1: ( ( rule__Tag__ElementsAssignment_1 )* )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:785:1: ( ( rule__Tag__ElementsAssignment_1 )* )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:786:1: ( rule__Tag__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getElementsAssignment_1()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:787:1: ( rule__Tag__ElementsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_CHAR && LA11_0<=RULE_TAG_OPEN_START)||(LA11_0>=RULE_PRINT_START && LA11_0<=RULE_PRINT_END)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:787:2: rule__Tag__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Tag__ElementsAssignment_1_in_rule__Tag__Group__1__Impl1689);
            	    rule__Tag__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getElementsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__2"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:797:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:801:1: ( rule__Tag__Group__2__Impl )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:802:2: rule__Tag__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Tag__Group__2__Impl_in_rule__Tag__Group__21720);
            rule__Tag__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2"


    // $ANTLR start "rule__Tag__Group__2__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:808:1: rule__Tag__Group__2__Impl : ( ( rule__Tag__CloseTagAssignment_2 ) ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:812:1: ( ( ( rule__Tag__CloseTagAssignment_2 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:813:1: ( ( rule__Tag__CloseTagAssignment_2 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:813:1: ( ( rule__Tag__CloseTagAssignment_2 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:814:1: ( rule__Tag__CloseTagAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getCloseTagAssignment_2()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:815:1: ( rule__Tag__CloseTagAssignment_2 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:815:2: rule__Tag__CloseTagAssignment_2
            {
            pushFollow(FOLLOW_rule__Tag__CloseTagAssignment_2_in_rule__Tag__Group__2__Impl1747);
            rule__Tag__CloseTagAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getCloseTagAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2__Impl"


    // $ANTLR start "rule__OpenTag__Group__0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:831:1: rule__OpenTag__Group__0 : rule__OpenTag__Group__0__Impl rule__OpenTag__Group__1 ;
    public final void rule__OpenTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:835:1: ( rule__OpenTag__Group__0__Impl rule__OpenTag__Group__1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:836:2: rule__OpenTag__Group__0__Impl rule__OpenTag__Group__1
            {
            pushFollow(FOLLOW_rule__OpenTag__Group__0__Impl_in_rule__OpenTag__Group__01783);
            rule__OpenTag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OpenTag__Group__1_in_rule__OpenTag__Group__01786);
            rule__OpenTag__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTag__Group__0"


    // $ANTLR start "rule__OpenTag__Group__0__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:843:1: rule__OpenTag__Group__0__Impl : ( RULE_TAG_OPEN_START ) ;
    public final void rule__OpenTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:847:1: ( ( RULE_TAG_OPEN_START ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:848:1: ( RULE_TAG_OPEN_START )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:848:1: ( RULE_TAG_OPEN_START )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:849:1: RULE_TAG_OPEN_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTagAccess().getTAG_OPEN_STARTTerminalRuleCall_0()); 
            }
            match(input,RULE_TAG_OPEN_START,FOLLOW_RULE_TAG_OPEN_START_in_rule__OpenTag__Group__0__Impl1813); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTagAccess().getTAG_OPEN_STARTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTag__Group__0__Impl"


    // $ANTLR start "rule__OpenTag__Group__1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:860:1: rule__OpenTag__Group__1 : rule__OpenTag__Group__1__Impl rule__OpenTag__Group__2 ;
    public final void rule__OpenTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:864:1: ( rule__OpenTag__Group__1__Impl rule__OpenTag__Group__2 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:865:2: rule__OpenTag__Group__1__Impl rule__OpenTag__Group__2
            {
            pushFollow(FOLLOW_rule__OpenTag__Group__1__Impl_in_rule__OpenTag__Group__11842);
            rule__OpenTag__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OpenTag__Group__2_in_rule__OpenTag__Group__11845);
            rule__OpenTag__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTag__Group__1"


    // $ANTLR start "rule__OpenTag__Group__1__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:872:1: rule__OpenTag__Group__1__Impl : ( ( rule__OpenTag__ContentAssignment_1 ) ) ;
    public final void rule__OpenTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:876:1: ( ( ( rule__OpenTag__ContentAssignment_1 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:877:1: ( ( rule__OpenTag__ContentAssignment_1 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:877:1: ( ( rule__OpenTag__ContentAssignment_1 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:878:1: ( rule__OpenTag__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTagAccess().getContentAssignment_1()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:879:1: ( rule__OpenTag__ContentAssignment_1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:879:2: rule__OpenTag__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__OpenTag__ContentAssignment_1_in_rule__OpenTag__Group__1__Impl1872);
            rule__OpenTag__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTagAccess().getContentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTag__Group__1__Impl"


    // $ANTLR start "rule__OpenTag__Group__2"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:889:1: rule__OpenTag__Group__2 : rule__OpenTag__Group__2__Impl ;
    public final void rule__OpenTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:893:1: ( rule__OpenTag__Group__2__Impl )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:894:2: rule__OpenTag__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OpenTag__Group__2__Impl_in_rule__OpenTag__Group__21902);
            rule__OpenTag__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTag__Group__2"


    // $ANTLR start "rule__OpenTag__Group__2__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:900:1: rule__OpenTag__Group__2__Impl : ( RULE_TAG_END ) ;
    public final void rule__OpenTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:904:1: ( ( RULE_TAG_END ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:905:1: ( RULE_TAG_END )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:905:1: ( RULE_TAG_END )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:906:1: RULE_TAG_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTagAccess().getTAG_ENDTerminalRuleCall_2()); 
            }
            match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rule__OpenTag__Group__2__Impl1929); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTagAccess().getTAG_ENDTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTag__Group__2__Impl"


    // $ANTLR start "rule__CloseTag__Group__0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:923:1: rule__CloseTag__Group__0 : rule__CloseTag__Group__0__Impl rule__CloseTag__Group__1 ;
    public final void rule__CloseTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:927:1: ( rule__CloseTag__Group__0__Impl rule__CloseTag__Group__1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:928:2: rule__CloseTag__Group__0__Impl rule__CloseTag__Group__1
            {
            pushFollow(FOLLOW_rule__CloseTag__Group__0__Impl_in_rule__CloseTag__Group__01964);
            rule__CloseTag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CloseTag__Group__1_in_rule__CloseTag__Group__01967);
            rule__CloseTag__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseTag__Group__0"


    // $ANTLR start "rule__CloseTag__Group__0__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:935:1: rule__CloseTag__Group__0__Impl : ( RULE_TAG_CLOSE_START ) ;
    public final void rule__CloseTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:939:1: ( ( RULE_TAG_CLOSE_START ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:940:1: ( RULE_TAG_CLOSE_START )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:940:1: ( RULE_TAG_CLOSE_START )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:941:1: RULE_TAG_CLOSE_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloseTagAccess().getTAG_CLOSE_STARTTerminalRuleCall_0()); 
            }
            match(input,RULE_TAG_CLOSE_START,FOLLOW_RULE_TAG_CLOSE_START_in_rule__CloseTag__Group__0__Impl1994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloseTagAccess().getTAG_CLOSE_STARTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseTag__Group__0__Impl"


    // $ANTLR start "rule__CloseTag__Group__1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:952:1: rule__CloseTag__Group__1 : rule__CloseTag__Group__1__Impl rule__CloseTag__Group__2 ;
    public final void rule__CloseTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:956:1: ( rule__CloseTag__Group__1__Impl rule__CloseTag__Group__2 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:957:2: rule__CloseTag__Group__1__Impl rule__CloseTag__Group__2
            {
            pushFollow(FOLLOW_rule__CloseTag__Group__1__Impl_in_rule__CloseTag__Group__12023);
            rule__CloseTag__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CloseTag__Group__2_in_rule__CloseTag__Group__12026);
            rule__CloseTag__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseTag__Group__1"


    // $ANTLR start "rule__CloseTag__Group__1__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:964:1: rule__CloseTag__Group__1__Impl : ( ( rule__CloseTag__ContentAssignment_1 ) ) ;
    public final void rule__CloseTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:968:1: ( ( ( rule__CloseTag__ContentAssignment_1 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:969:1: ( ( rule__CloseTag__ContentAssignment_1 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:969:1: ( ( rule__CloseTag__ContentAssignment_1 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:970:1: ( rule__CloseTag__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloseTagAccess().getContentAssignment_1()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:971:1: ( rule__CloseTag__ContentAssignment_1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:971:2: rule__CloseTag__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__CloseTag__ContentAssignment_1_in_rule__CloseTag__Group__1__Impl2053);
            rule__CloseTag__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloseTagAccess().getContentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseTag__Group__1__Impl"


    // $ANTLR start "rule__CloseTag__Group__2"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:981:1: rule__CloseTag__Group__2 : rule__CloseTag__Group__2__Impl ;
    public final void rule__CloseTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:985:1: ( rule__CloseTag__Group__2__Impl )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:986:2: rule__CloseTag__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CloseTag__Group__2__Impl_in_rule__CloseTag__Group__22083);
            rule__CloseTag__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseTag__Group__2"


    // $ANTLR start "rule__CloseTag__Group__2__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:992:1: rule__CloseTag__Group__2__Impl : ( RULE_TAG_END ) ;
    public final void rule__CloseTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:996:1: ( ( RULE_TAG_END ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:997:1: ( RULE_TAG_END )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:997:1: ( RULE_TAG_END )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:998:1: RULE_TAG_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloseTagAccess().getTAG_ENDTerminalRuleCall_2()); 
            }
            match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rule__CloseTag__Group__2__Impl2110); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloseTagAccess().getTAG_ENDTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseTag__Group__2__Impl"


    // $ANTLR start "rule__TextContent__Group__0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1015:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1019:1: ( rule__TextContent__Group__0__Impl )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1020:2: rule__TextContent__Group__0__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__02145);
            rule__TextContent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__0"


    // $ANTLR start "rule__TextContent__Group__0__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1026:1: rule__TextContent__Group__0__Impl : ( ( rule__TextContent__Alternatives_0 ) ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1030:1: ( ( ( rule__TextContent__Alternatives_0 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1031:1: ( ( rule__TextContent__Alternatives_0 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1031:1: ( ( rule__TextContent__Alternatives_0 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1032:1: ( rule__TextContent__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getAlternatives_0()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1033:1: ( rule__TextContent__Alternatives_0 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1033:2: rule__TextContent__Alternatives_0
            {
            pushFollow(FOLLOW_rule__TextContent__Alternatives_0_in_rule__TextContent__Group__0__Impl2172);
            rule__TextContent__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1045:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1049:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1050:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_rule__Comment__Group__0__Impl_in_rule__Comment__Group__02204);
            rule__Comment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comment__Group__1_in_rule__Comment__Group__02207);
            rule__Comment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1057:1: rule__Comment__Group__0__Impl : ( () ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1061:1: ( ( () ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1062:1: ( () )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1062:1: ( () )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1063:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getCommentAction_0()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1064:1: ()
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1066:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getCommentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1076:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl rule__Comment__Group__2 ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1080:1: ( rule__Comment__Group__1__Impl rule__Comment__Group__2 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1081:2: rule__Comment__Group__1__Impl rule__Comment__Group__2
            {
            pushFollow(FOLLOW_rule__Comment__Group__1__Impl_in_rule__Comment__Group__12265);
            rule__Comment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comment__Group__2_in_rule__Comment__Group__12268);
            rule__Comment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1088:1: rule__Comment__Group__1__Impl : ( RULE_COMMENT_OPEN ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1092:1: ( ( RULE_COMMENT_OPEN ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1093:1: ( RULE_COMMENT_OPEN )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1093:1: ( RULE_COMMENT_OPEN )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1094:1: RULE_COMMENT_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
            }
            match(input,RULE_COMMENT_OPEN,FOLLOW_RULE_COMMENT_OPEN_in_rule__Comment__Group__1__Impl2295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getCOMMENT_OPENTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__Comment__Group__2"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1105:1: rule__Comment__Group__2 : rule__Comment__Group__2__Impl rule__Comment__Group__3 ;
    public final void rule__Comment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1109:1: ( rule__Comment__Group__2__Impl rule__Comment__Group__3 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1110:2: rule__Comment__Group__2__Impl rule__Comment__Group__3
            {
            pushFollow(FOLLOW_rule__Comment__Group__2__Impl_in_rule__Comment__Group__22324);
            rule__Comment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comment__Group__3_in_rule__Comment__Group__22327);
            rule__Comment__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__2"


    // $ANTLR start "rule__Comment__Group__2__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1117:1: rule__Comment__Group__2__Impl : ( ( rule__Comment__TextAssignment_2 ) ) ;
    public final void rule__Comment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1121:1: ( ( ( rule__Comment__TextAssignment_2 ) ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1122:1: ( ( rule__Comment__TextAssignment_2 ) )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1122:1: ( ( rule__Comment__TextAssignment_2 ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1123:1: ( rule__Comment__TextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getTextAssignment_2()); 
            }
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1124:1: ( rule__Comment__TextAssignment_2 )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1124:2: rule__Comment__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__Comment__TextAssignment_2_in_rule__Comment__Group__2__Impl2354);
            rule__Comment__TextAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getTextAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__2__Impl"


    // $ANTLR start "rule__Comment__Group__3"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1134:1: rule__Comment__Group__3 : rule__Comment__Group__3__Impl ;
    public final void rule__Comment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1138:1: ( rule__Comment__Group__3__Impl )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1139:2: rule__Comment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Comment__Group__3__Impl_in_rule__Comment__Group__32384);
            rule__Comment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__3"


    // $ANTLR start "rule__Comment__Group__3__Impl"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1145:1: rule__Comment__Group__3__Impl : ( RULE_COMMENT_CLOSE ) ;
    public final void rule__Comment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1149:1: ( ( RULE_COMMENT_CLOSE ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1150:1: ( RULE_COMMENT_CLOSE )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1150:1: ( RULE_COMMENT_CLOSE )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1151:1: RULE_COMMENT_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getCOMMENT_CLOSETerminalRuleCall_3()); 
            }
            match(input,RULE_COMMENT_CLOSE,FOLLOW_RULE_COMMENT_CLOSE_in_rule__Comment__Group__3__Impl2411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getCOMMENT_CLOSETerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__3__Impl"


    // $ANTLR start "rule__Freemarker__ElementsAssignment"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1171:1: rule__Freemarker__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Freemarker__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1175:1: ( ( ruleElement ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1176:1: ( ruleElement )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1176:1: ( ruleElement )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1177:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFreemarkerAccess().getElementsElementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Freemarker__ElementsAssignment2453);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFreemarkerAccess().getElementsElementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Freemarker__ElementsAssignment"


    // $ANTLR start "rule__Print__ExpressionAssignment_1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1186:1: rule__Print__ExpressionAssignment_1 : ( rulePrintContent ) ;
    public final void rule__Print__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1190:1: ( ( rulePrintContent ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1191:1: ( rulePrintContent )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1191:1: ( rulePrintContent )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1192:1: rulePrintContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintAccess().getExpressionPrintContentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePrintContent_in_rule__Print__ExpressionAssignment_12484);
            rulePrintContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintAccess().getExpressionPrintContentParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__ExpressionAssignment_1"


    // $ANTLR start "rule__Tag__OpenTagAssignment_0"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1201:1: rule__Tag__OpenTagAssignment_0 : ( ruleOpenTag ) ;
    public final void rule__Tag__OpenTagAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1205:1: ( ( ruleOpenTag ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1206:1: ( ruleOpenTag )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1206:1: ( ruleOpenTag )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1207:1: ruleOpenTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getOpenTagOpenTagParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOpenTag_in_rule__Tag__OpenTagAssignment_02515);
            ruleOpenTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getOpenTagOpenTagParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__OpenTagAssignment_0"


    // $ANTLR start "rule__Tag__ElementsAssignment_1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1216:1: rule__Tag__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Tag__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1220:1: ( ( ruleElement ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1221:1: ( ruleElement )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1221:1: ( ruleElement )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1222:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getElementsElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Tag__ElementsAssignment_12546);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getElementsElementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__ElementsAssignment_1"


    // $ANTLR start "rule__Tag__CloseTagAssignment_2"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1231:1: rule__Tag__CloseTagAssignment_2 : ( ruleCloseTag ) ;
    public final void rule__Tag__CloseTagAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1235:1: ( ( ruleCloseTag ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1236:1: ( ruleCloseTag )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1236:1: ( ruleCloseTag )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1237:1: ruleCloseTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAccess().getCloseTagCloseTagParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCloseTag_in_rule__Tag__CloseTagAssignment_22577);
            ruleCloseTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAccess().getCloseTagCloseTagParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__CloseTagAssignment_2"


    // $ANTLR start "rule__OpenTag__ContentAssignment_1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1246:1: rule__OpenTag__ContentAssignment_1 : ( ruleTagContent ) ;
    public final void rule__OpenTag__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1250:1: ( ( ruleTagContent ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1251:1: ( ruleTagContent )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1251:1: ( ruleTagContent )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1252:1: ruleTagContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpenTagAccess().getContentTagContentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTagContent_in_rule__OpenTag__ContentAssignment_12608);
            ruleTagContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpenTagAccess().getContentTagContentParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenTag__ContentAssignment_1"


    // $ANTLR start "rule__CloseTag__ContentAssignment_1"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1261:1: rule__CloseTag__ContentAssignment_1 : ( ruleTagContent ) ;
    public final void rule__CloseTag__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1265:1: ( ( ruleTagContent ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1266:1: ( ruleTagContent )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1266:1: ( ruleTagContent )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1267:1: ruleTagContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloseTagAccess().getContentTagContentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTagContent_in_rule__CloseTag__ContentAssignment_12639);
            ruleTagContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloseTagAccess().getContentTagContentParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseTag__ContentAssignment_1"


    // $ANTLR start "rule__Text__TextAssignment"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1276:1: rule__Text__TextAssignment : ( ruleTextContent ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1280:1: ( ( ruleTextContent ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1281:1: ( ruleTextContent )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1281:1: ( ruleTextContent )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1282:1: ruleTextContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getTextTextContentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTextContent_in_rule__Text__TextAssignment2670);
            ruleTextContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getTextTextContentParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment"


    // $ANTLR start "rule__Comment__TextAssignment_2"
    // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1291:1: rule__Comment__TextAssignment_2 : ( ruleCommentContent ) ;
    public final void rule__Comment__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1295:1: ( ( ruleCommentContent ) )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1296:1: ( ruleCommentContent )
            {
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1296:1: ( ruleCommentContent )
            // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:1297:1: ruleCommentContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getTextCommentContentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommentContent_in_rule__Comment__TextAssignment_22701);
            ruleCommentContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getTextCommentContentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__TextAssignment_2"

    // $ANTLR start synpred4_InternalFreemarkerEditor
    public final void synpred4_InternalFreemarkerEditor_fragment() throws RecognitionException {   
        // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:351:2: ( rule__TextContent__Group__0 )
        // ../org.github.freemarker.editor.ui/src-gen/org/github/ui/contentassist/antlr/internal/InternalFreemarkerEditor.g:351:2: rule__TextContent__Group__0
        {
        pushFollow(FOLLOW_rule__TextContent__Group__0_in_synpred4_InternalFreemarkerEditor691);
        rule__TextContent__Group__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalFreemarkerEditor

    // Delegated rules

    public final boolean synpred4_InternalFreemarkerEditor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFreemarkerEditor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleFreemarker_in_entryRuleFreemarker67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreemarker74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Freemarker__ElementsAssignment_in_ruleFreemarker100 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0_in_rulePrint221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrintContent_in_entryRulePrintContent248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrintContent255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrintContent__Alternatives_in_rulePrintContent283 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_rule__PrintContent__Alternatives_in_rulePrintContent295 = new BitSet(new long[]{0x00000000000007F2L});
    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group__0_in_ruleTag358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTag_in_entryRuleOpenTag387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenTag394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTag__Group__0_in_ruleOpenTag420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseTag_in_entryRuleCloseTag447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloseTag454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloseTag__Group__0_in_ruleCloseTag480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagContent_in_entryRuleTagContent507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagContent514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagContent__Alternatives_in_ruleTagContent542 = new BitSet(new long[]{0x0000000000000BF2L});
    public static final BitSet FOLLOW_rule__TagContent__Alternatives_in_ruleTagContent554 = new BitSet(new long[]{0x0000000000000BF2L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__TextAssignment_in_ruleText617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextContent651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0_in_ruleTextContent679 = new BitSet(new long[]{0x0000000000000EF0L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0_in_ruleTextContent691 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__0_in_ruleComment754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentContent_in_entryRuleCommentContent781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentContent788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentContent__Alternatives_in_ruleCommentContent814 = new BitSet(new long[]{0x0000000000000FB2L});
    public static final BitSet FOLLOW_rulePrint_in_rule__Element__Alternatives851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__Element__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_rule__Element__Alternatives885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Element__Alternatives902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__PrintContent__Alternatives934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_rule__PrintContent__Alternatives951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_rule__PrintContent__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_rule__PrintContent__Alternatives985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_rule__PrintContent__Alternatives1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_rule__PrintContent__Alternatives1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rule__PrintContent__Alternatives1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__TagContent__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_rule__TagContent__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_rule__TagContent__Alternatives1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_rule__TagContent__Alternatives1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_rule__TagContent__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_rule__TagContent__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_rule__TagContent__Alternatives1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__TextContent__Alternatives_01203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_rule__TextContent__Alternatives_01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_rule__TextContent__Alternatives_01237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rule__TextContent__Alternatives_01254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__CommentContent__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_rule__CommentContent__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_rule__CommentContent__Alternatives1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_rule__CommentContent__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_rule__CommentContent__Alternatives1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_rule__CommentContent__Alternatives1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rule__CommentContent__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__01418 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_rule__Print__Group__1_in_rule__Print__Group__01421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_START_in_rule__Print__Group__0__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__11477 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Print__Group__2_in_rule__Print__Group__11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__ExpressionAssignment_1_in_rule__Print__Group__1__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__2__Impl_in_rule__Print__Group__21537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRINT_END_in_rule__Print__Group__2__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group__0__Impl_in_rule__Tag__Group__01599 = new BitSet(new long[]{0x0000000000000FF0L});
    public static final BitSet FOLLOW_rule__Tag__Group__1_in_rule__Tag__Group__01602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__OpenTagAssignment_0_in_rule__Tag__Group__0__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group__1__Impl_in_rule__Tag__Group__11659 = new BitSet(new long[]{0x0000000000000FF0L});
    public static final BitSet FOLLOW_rule__Tag__Group__2_in_rule__Tag__Group__11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__ElementsAssignment_1_in_rule__Tag__Group__1__Impl1689 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_rule__Tag__Group__2__Impl_in_rule__Tag__Group__21720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__CloseTagAssignment_2_in_rule__Tag__Group__2__Impl1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTag__Group__0__Impl_in_rule__OpenTag__Group__01783 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_rule__OpenTag__Group__1_in_rule__OpenTag__Group__01786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_OPEN_START_in_rule__OpenTag__Group__0__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTag__Group__1__Impl_in_rule__OpenTag__Group__11842 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__OpenTag__Group__2_in_rule__OpenTag__Group__11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTag__ContentAssignment_1_in_rule__OpenTag__Group__1__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenTag__Group__2__Impl_in_rule__OpenTag__Group__21902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rule__OpenTag__Group__2__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloseTag__Group__0__Impl_in_rule__CloseTag__Group__01964 = new BitSet(new long[]{0x0000000000000BF0L});
    public static final BitSet FOLLOW_rule__CloseTag__Group__1_in_rule__CloseTag__Group__01967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_START_in_rule__CloseTag__Group__0__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloseTag__Group__1__Impl_in_rule__CloseTag__Group__12023 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__CloseTag__Group__2_in_rule__CloseTag__Group__12026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloseTag__ContentAssignment_1_in_rule__CloseTag__Group__1__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CloseTag__Group__2__Impl_in_rule__CloseTag__Group__22083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rule__CloseTag__Group__2__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__02145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Alternatives_0_in_rule__TextContent__Group__0__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__0__Impl_in_rule__Comment__Group__02204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Comment__Group__1_in_rule__Comment__Group__02207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__1__Impl_in_rule__Comment__Group__12265 = new BitSet(new long[]{0x0000000000000FB0L});
    public static final BitSet FOLLOW_rule__Comment__Group__2_in_rule__Comment__Group__12268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_OPEN_in_rule__Comment__Group__1__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__2__Impl_in_rule__Comment__Group__22324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Comment__Group__3_in_rule__Comment__Group__22327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__TextAssignment_2_in_rule__Comment__Group__2__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__Group__3__Impl_in_rule__Comment__Group__32384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_CLOSE_in_rule__Comment__Group__3__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Freemarker__ElementsAssignment2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrintContent_in_rule__Print__ExpressionAssignment_12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenTag_in_rule__Tag__OpenTagAssignment_02515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Tag__ElementsAssignment_12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseTag_in_rule__Tag__CloseTagAssignment_22577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagContent_in_rule__OpenTag__ContentAssignment_12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagContent_in_rule__CloseTag__ContentAssignment_12639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextContent_in_rule__Text__TextAssignment2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentContent_in_rule__Comment__TextAssignment_22701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0_in_synpred4_InternalFreemarkerEditor691 = new BitSet(new long[]{0x0000000000000002L});

}
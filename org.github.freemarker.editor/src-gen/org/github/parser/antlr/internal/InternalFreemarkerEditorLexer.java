package org.github.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFreemarkerEditorLexer extends Lexer {
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

    public InternalFreemarkerEditorLexer() {;} 
    public InternalFreemarkerEditorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFreemarkerEditorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g"; }

    // $ANTLR start "RULE_COMMENT_OPEN"
    public final void mRULE_COMMENT_OPEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:758:19: ( '<#--' )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:758:21: '<#--'
            {
            match("<#--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_OPEN"

    // $ANTLR start "RULE_COMMENT_CLOSE"
    public final void mRULE_COMMENT_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:760:20: ( '-->' )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:760:22: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_CLOSE"

    // $ANTLR start "RULE_TAG_OPEN_START"
    public final void mRULE_TAG_OPEN_START() throws RecognitionException {
        try {
            int _type = RULE_TAG_OPEN_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:762:21: ( '<#' )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:762:23: '<#'
            {
            match("<#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_OPEN_START"

    // $ANTLR start "RULE_TAG_CLOSE_START"
    public final void mRULE_TAG_CLOSE_START() throws RecognitionException {
        try {
            int _type = RULE_TAG_CLOSE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:764:22: ( '</#' )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:764:24: '</#'
            {
            match("</#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_CLOSE_START"

    // $ANTLR start "RULE_TAG_END"
    public final void mRULE_TAG_END() throws RecognitionException {
        try {
            int _type = RULE_TAG_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:766:14: ( '>' )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:766:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_END"

    // $ANTLR start "RULE_PRINT_START"
    public final void mRULE_PRINT_START() throws RecognitionException {
        try {
            int _type = RULE_PRINT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:768:18: ( '${' )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:768:20: '${'
            {
            match("${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRINT_START"

    // $ANTLR start "RULE_PRINT_END"
    public final void mRULE_PRINT_END() throws RecognitionException {
        try {
            int _type = RULE_PRINT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:770:16: ( '}' )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:770:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRINT_END"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:772:11: ( ( '--' | '</' | ~ ( ( RULE_COMMENT_OPEN | RULE_COMMENT_CLOSE | RULE_TAG_OPEN_START | RULE_TAG_CLOSE_START | RULE_PRINT_START | RULE_PRINT_END | RULE_TAG_END ) ) ) )
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:772:13: ( '--' | '</' | ~ ( ( RULE_COMMENT_OPEN | RULE_COMMENT_CLOSE | RULE_TAG_OPEN_START | RULE_TAG_CLOSE_START | RULE_PRINT_START | RULE_PRINT_END | RULE_TAG_END ) ) )
            {
            // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:772:13: ( '--' | '</' | ~ ( ( RULE_COMMENT_OPEN | RULE_COMMENT_CLOSE | RULE_TAG_OPEN_START | RULE_TAG_CLOSE_START | RULE_PRINT_START | RULE_PRINT_END | RULE_TAG_END ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='-') ) {
                    alt1=1;
                }
                else {
                    alt1=3;}
            }
            else if ( (LA1_0=='<') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='/') ) {
                    alt1=2;
                }
                else {
                    alt1=3;}
            }
            else if ( ((LA1_0>='\u0000' && LA1_0<=',')||(LA1_0>='.' && LA1_0<=';')||LA1_0=='='||(LA1_0>='?' && LA1_0<='|')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:772:14: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:772:19: '</'
                    {
                    match("</"); 


                    }
                    break;
                case 3 :
                    // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:772:24: ~ ( ( RULE_COMMENT_OPEN | RULE_COMMENT_CLOSE | RULE_TAG_OPEN_START | RULE_TAG_CLOSE_START | RULE_PRINT_START | RULE_PRINT_END | RULE_TAG_END ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    public void mTokens() throws RecognitionException {
        // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:8: ( RULE_COMMENT_OPEN | RULE_COMMENT_CLOSE | RULE_TAG_OPEN_START | RULE_TAG_CLOSE_START | RULE_TAG_END | RULE_PRINT_START | RULE_PRINT_END | RULE_CHAR )
        int alt2=8;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:10: RULE_COMMENT_OPEN
                {
                mRULE_COMMENT_OPEN(); 

                }
                break;
            case 2 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:28: RULE_COMMENT_CLOSE
                {
                mRULE_COMMENT_CLOSE(); 

                }
                break;
            case 3 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:47: RULE_TAG_OPEN_START
                {
                mRULE_TAG_OPEN_START(); 

                }
                break;
            case 4 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:67: RULE_TAG_CLOSE_START
                {
                mRULE_TAG_CLOSE_START(); 

                }
                break;
            case 5 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:88: RULE_TAG_END
                {
                mRULE_TAG_END(); 

                }
                break;
            case 6 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:101: RULE_PRINT_START
                {
                mRULE_PRINT_START(); 

                }
                break;
            case 7 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:118: RULE_PRINT_END
                {
                mRULE_PRINT_END(); 

                }
                break;
            case 8 :
                // ../org.github.freemarker.editor/src-gen/org/github/parser/antlr/internal/InternalFreemarkerEditor.g:1:133: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\1\uffff\2\6\1\uffff\1\6\2\uffff\1\14\2\6\5\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\0\1\43\1\55\1\uffff\1\173\2\uffff\1\55\1\43\1\76\5\uffff";
    static final String DFA2_maxS =
        "\1\uffff\1\57\1\55\1\uffff\1\173\2\uffff\1\55\1\43\1\76\5\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\5\1\uffff\1\7\1\10\3\uffff\1\6\1\1\1\3\1\4\1\2";
    static final String DFA2_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\44\6\1\4\10\6\1\2\16\6\1\1\1\6\1\3\76\6\1\5\uff82\6",
            "\1\7\13\uffff\1\10",
            "\1\11",
            "",
            "\1\12",
            "",
            "",
            "\1\13",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_COMMENT_OPEN | RULE_COMMENT_CLOSE | RULE_TAG_OPEN_START | RULE_TAG_CLOSE_START | RULE_TAG_END | RULE_PRINT_START | RULE_PRINT_END | RULE_CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='<') ) {s = 1;}

                        else if ( (LA2_0=='-') ) {s = 2;}

                        else if ( (LA2_0=='>') ) {s = 3;}

                        else if ( (LA2_0=='$') ) {s = 4;}

                        else if ( (LA2_0=='}') ) {s = 5;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='#')||(LA2_0>='%' && LA2_0<=',')||(LA2_0>='.' && LA2_0<=';')||LA2_0=='='||(LA2_0>='?' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {s = 6;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
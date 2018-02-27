package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_A=12;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=25;
    public static final int RULE_HP=14;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=27;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_I_CONSTANT=23;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_IS=19;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_O=9;
    public static final int RULE_P=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int RULE_F_CONSTANT=24;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_H=13;
    public static final int T__40=40;
    public static final int RULE_E=15;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_D=10;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_CP=20;
    public static final int T__99=99;
    public static final int RULE_CHAR=8;
    public static final int RULE_SP=21;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=26;
    public static final int RULE_ES=18;
    public static final int RULE_STRING_LITERAL=4;
    public static final int RULE_SL_COMMENT=28;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=22;
    public static final int RULE_IDZ=5;
    public static final int RULE_FS=17;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_NZ=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'inline' )
            // InternalMyDsl.g:11:9: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( '_Noreturn' )
            // InternalMyDsl.g:12:9: '_Noreturn'
            {
            match("_Noreturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'struct' )
            // InternalMyDsl.g:13:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'union' )
            // InternalMyDsl.g:14:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'typedef' )
            // InternalMyDsl.g:15:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'extern' )
            // InternalMyDsl.g:16:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'static' )
            // InternalMyDsl.g:17:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( '_Thread_local' )
            // InternalMyDsl.g:18:9: '_Thread_local'
            {
            match("_Thread_local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'auto' )
            // InternalMyDsl.g:19:9: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'register' )
            // InternalMyDsl.g:20:9: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( '*' )
            // InternalMyDsl.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( '++' )
            // InternalMyDsl.g:22:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( '--' )
            // InternalMyDsl.g:23:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( ';' )
            // InternalMyDsl.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( '=' )
            // InternalMyDsl.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( '*=' )
            // InternalMyDsl.g:26:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '/=' )
            // InternalMyDsl.g:27:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( '%=' )
            // InternalMyDsl.g:28:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( '+=' )
            // InternalMyDsl.g:29:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( '-=' )
            // InternalMyDsl.g:30:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( '<<=' )
            // InternalMyDsl.g:31:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '>>=' )
            // InternalMyDsl.g:32:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( '&=' )
            // InternalMyDsl.g:33:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( '^=' )
            // InternalMyDsl.g:34:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( '|=' )
            // InternalMyDsl.g:35:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( '&' )
            // InternalMyDsl.g:36:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( '+' )
            // InternalMyDsl.g:37:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( '-' )
            // InternalMyDsl.g:38:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( '~' )
            // InternalMyDsl.g:39:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( '!' )
            // InternalMyDsl.g:40:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( '_Alignas' )
            // InternalMyDsl.g:41:9: '_Alignas'
            {
            match("_Alignas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( '(' )
            // InternalMyDsl.g:42:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( ')' )
            // InternalMyDsl.g:43:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'enum' )
            // InternalMyDsl.g:44:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( '{' )
            // InternalMyDsl.g:45:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( '}' )
            // InternalMyDsl.g:46:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( ',' )
            // InternalMyDsl.g:47:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( '_Atomic' )
            // InternalMyDsl.g:48:9: '_Atomic'
            {
            match("_Atomic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( ':' )
            // InternalMyDsl.g:49:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( '[' )
            // InternalMyDsl.g:50:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( ']' )
            // InternalMyDsl.g:51:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( '...' )
            // InternalMyDsl.g:52:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( '.' )
            // InternalMyDsl.g:53:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( '_Static_assert' )
            // InternalMyDsl.g:54:9: '_Static_assert'
            {
            match("_Static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:55:7: ( '->' )
            // InternalMyDsl.g:55:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:56:7: ( 'sizeof' )
            // InternalMyDsl.g:56:9: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:57:7: ( '_Alignof' )
            // InternalMyDsl.g:57:9: '_Alignof'
            {
            match("_Alignof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:58:7: ( 'goto' )
            // InternalMyDsl.g:58:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:59:7: ( 'continue' )
            // InternalMyDsl.g:59:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:60:7: ( 'while' )
            // InternalMyDsl.g:60:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:61:7: ( 'do' )
            // InternalMyDsl.g:61:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:62:7: ( 'for' )
            // InternalMyDsl.g:62:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:63:7: ( 'if' )
            // InternalMyDsl.g:63:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:64:7: ( 'else' )
            // InternalMyDsl.g:64:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:65:7: ( 'switch' )
            // InternalMyDsl.g:65:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:66:7: ( 'case' )
            // InternalMyDsl.g:66:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:67:7: ( 'default' )
            // InternalMyDsl.g:67:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:68:7: ( '^' )
            // InternalMyDsl.g:68:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:69:7: ( '|' )
            // InternalMyDsl.g:69:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:70:7: ( 'and' )
            // InternalMyDsl.g:70:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:71:7: ( 'or' )
            // InternalMyDsl.g:71:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:72:7: ( '?' )
            // InternalMyDsl.g:72:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:73:7: ( 'const' )
            // InternalMyDsl.g:73:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:74:7: ( 'restrict' )
            // InternalMyDsl.g:74:9: 'restrict'
            {
            match("restrict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:75:7: ( 'volatile' )
            // InternalMyDsl.g:75:9: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:76:7: ( 'void' )
            // InternalMyDsl.g:76:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:77:7: ( 'char' )
            // InternalMyDsl.g:77:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:78:7: ( 'short' )
            // InternalMyDsl.g:78:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:79:7: ( 'int' )
            // InternalMyDsl.g:79:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:80:7: ( 'long' )
            // InternalMyDsl.g:80:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:81:8: ( 'float' )
            // InternalMyDsl.g:81:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:82:8: ( 'double' )
            // InternalMyDsl.g:82:10: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:83:8: ( 'signed' )
            // InternalMyDsl.g:83:10: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:84:8: ( 'unsigned' )
            // InternalMyDsl.g:84:10: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:85:8: ( 'bool' )
            // InternalMyDsl.g:85:10: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:86:8: ( '_Complex' )
            // InternalMyDsl.g:86:10: '_Complex'
            {
            match("_Complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:87:8: ( '_Imaginary' )
            // InternalMyDsl.g:87:10: '_Imaginary'
            {
            match("_Imaginary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:88:8: ( '_Generic' )
            // InternalMyDsl.g:88:10: '_Generic'
            {
            match("_Generic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:89:8: ( '/' )
            // InternalMyDsl.g:89:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:90:8: ( '%' )
            // InternalMyDsl.g:90:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:91:8: ( '<<' )
            // InternalMyDsl.g:91:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:92:8: ( '>>' )
            // InternalMyDsl.g:92:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:93:8: ( '==' )
            // InternalMyDsl.g:93:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:94:8: ( '<' )
            // InternalMyDsl.g:94:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:95:8: ( '>' )
            // InternalMyDsl.g:95:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:96:8: ( '<=' )
            // InternalMyDsl.g:96:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:97:8: ( '>=' )
            // InternalMyDsl.g:97:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:98:8: ( '!=' )
            // InternalMyDsl.g:98:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:99:8: ( 'break' )
            // InternalMyDsl.g:99:10: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:100:8: ( 'return' )
            // InternalMyDsl.g:100:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "RULE_IDZ"
    public final void mRULE_IDZ() throws RecognitionException {
        try {
            int _type = RULE_IDZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26463:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '1' .. '9' )* )
            // InternalMyDsl.g:26463:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '1' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:26463:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '1' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='1' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='1' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDZ"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26465:11: ( '\\'' . '\\'' )
            // InternalMyDsl.g:26465:13: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26467:12: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // InternalMyDsl.g:26467:14: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // InternalMyDsl.g:26467:14: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:26467:15: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // InternalMyDsl.g:26467:30: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:26467:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_O"
    public final void mRULE_O() throws RecognitionException {
        try {
            // InternalMyDsl.g:26469:17: ( '0' .. '7' )
            // InternalMyDsl.g:26469:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_O"

    // $ANTLR start "RULE_D"
    public final void mRULE_D() throws RecognitionException {
        try {
            // InternalMyDsl.g:26471:17: ( '0' .. '9' )
            // InternalMyDsl.g:26471:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_D"

    // $ANTLR start "RULE_NZ"
    public final void mRULE_NZ() throws RecognitionException {
        try {
            // InternalMyDsl.g:26473:18: ( '1' .. '9' )
            // InternalMyDsl.g:26473:20: '1' .. '9'
            {
            matchRange('1','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NZ"

    // $ANTLR start "RULE_A"
    public final void mRULE_A() throws RecognitionException {
        try {
            // InternalMyDsl.g:26475:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' ) )
            // InternalMyDsl.g:26475:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            {
            // InternalMyDsl.g:26475:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt4=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt4=2;
                }
                break;
            case '_':
                {
                alt4=3;
                }
                break;
            case '0':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:26475:20: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:26475:29: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:26475:38: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:26475:42: '0' '..' '9'
                    {
                    match('0'); 
                    match(".."); 

                    match('9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_A"

    // $ANTLR start "RULE_H"
    public final void mRULE_H() throws RecognitionException {
        try {
            // InternalMyDsl.g:26477:17: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' ) )
            // InternalMyDsl.g:26477:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            {
            // InternalMyDsl.g:26477:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' '..' '9' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt5=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt5=2;
                }
                break;
            case '0':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:26477:20: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:26477:29: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:26477:38: '0' '..' '9'
                    {
                    match('0'); 
                    match(".."); 

                    match('9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_H"

    // $ANTLR start "RULE_HP"
    public final void mRULE_HP() throws RecognitionException {
        try {
            // InternalMyDsl.g:26479:18: ( '0' ( 'x' | 'X' ) )
            // InternalMyDsl.g:26479:20: '0' ( 'x' | 'X' )
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HP"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            // InternalMyDsl.g:26481:17: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+' )
            // InternalMyDsl.g:26481:19: ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+'
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:26481:29: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_D(); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_P"
    public final void mRULE_P() throws RecognitionException {
        try {
            // InternalMyDsl.g:26483:17: ( ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+' )
            // InternalMyDsl.g:26483:19: ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+'
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:26483:29: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('{'); 
            mRULE_D(); 
            match('}'); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_P"

    // $ANTLR start "RULE_FS"
    public final void mRULE_FS() throws RecognitionException {
        try {
            // InternalMyDsl.g:26485:18: ( ( 'f' | 'F' | 'l' | 'L' ) )
            // InternalMyDsl.g:26485:20: ( 'f' | 'F' | 'l' | 'L' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FS"

    // $ANTLR start "RULE_ES"
    public final void mRULE_ES() throws RecognitionException {
        try {
            // InternalMyDsl.g:26487:18: ( RULE_A )
            // InternalMyDsl.g:26487:20: RULE_A
            {
            mRULE_A(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ES"

    // $ANTLR start "RULE_IS"
    public final void mRULE_IS() throws RecognitionException {
        try {
            // InternalMyDsl.g:26489:18: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? ) )
            // InternalMyDsl.g:26489:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            {
            // InternalMyDsl.g:26489:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='U'||LA11_0=='u') ) {
                alt11=1;
            }
            else if ( (LA11_0=='L'||LA11_0=='l') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:26489:21: ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:26489:31: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    int alt8=5;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='l') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='l') ) {
                            alt8=3;
                        }
                    }
                    else if ( (LA8_0=='L') ) {
                        int LA8_2 = input.LA(2);

                        if ( (LA8_2=='L') ) {
                            alt8=4;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:26489:32: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:26489:36: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:26489:40: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:26489:48: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:26489:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )?
                    {
                    // InternalMyDsl.g:26489:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )
                    int alt9=4;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='l') ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1=='l') ) {
                            alt9=3;
                        }
                        else {
                            alt9=1;}
                    }
                    else if ( (LA9_0=='L') ) {
                        int LA9_2 = input.LA(2);

                        if ( (LA9_2=='L') ) {
                            alt9=4;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:26489:59: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:26489:63: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:26489:67: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:26489:75: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:26489:84: ( 'u' | 'U' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='U'||LA10_0=='u') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IS"

    // $ANTLR start "RULE_CP"
    public final void mRULE_CP() throws RecognitionException {
        try {
            // InternalMyDsl.g:26491:18: ( ( 'u' | 'U' | 'L' ) )
            // InternalMyDsl.g:26491:20: ( 'u' | 'U' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CP"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            // InternalMyDsl.g:26493:18: ( ( 'u' '8' | 'u' | 'U' | 'L' ) )
            // InternalMyDsl.g:26493:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            {
            // InternalMyDsl.g:26493:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='8') ) {
                    alt12=1;
                }
                else {
                    alt12=2;}
                }
                break;
            case 'U':
                {
                alt12=3;
                }
                break;
            case 'L':
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:26493:21: 'u' '8'
                    {
                    match('u'); 
                    match('8'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:26493:29: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:26493:33: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:26493:37: 'L'
                    {
                    match('L'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26495:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // InternalMyDsl.g:26495:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // InternalMyDsl.g:26495:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||(LA13_0>='\f' && LA13_0<='\r')||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_I_CONSTANT"
    public final void mRULE_I_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_I_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26497:17: ( ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' ) )
            // InternalMyDsl.g:26497:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            {
            // InternalMyDsl.g:26497:19: ( RULE_HP RULE_H '+' ( RULE_IS )? | RULE_NZ RULE_D '*' ( RULE_IS )? | '0' RULE_O '*' ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='X'||LA19_1=='x') ) {
                    alt19=1;
                }
                else if ( ((LA19_1>='0' && LA19_1<='7')) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt19=2;
                }
                break;
            case '\'':
            case 'L':
            case 'U':
            case 'u':
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:26497:20: RULE_HP RULE_H '+' ( RULE_IS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    // InternalMyDsl.g:26497:39: ( RULE_IS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='L'||LA14_0=='U'||LA14_0=='l'||LA14_0=='u') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:26497:39: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:26497:48: RULE_NZ RULE_D '*' ( RULE_IS )?
                    {
                    mRULE_NZ(); 
                    mRULE_D(); 
                    match('*'); 
                    // InternalMyDsl.g:26497:67: ( RULE_IS )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='L'||LA15_0=='U'||LA15_0=='l'||LA15_0=='u') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:26497:67: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:26497:76: '0' RULE_O '*' ( RULE_IS )?
                    {
                    match('0'); 
                    mRULE_O(); 
                    match('*'); 
                    // InternalMyDsl.g:26497:91: ( RULE_IS )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='L'||LA16_0=='U'||LA16_0=='l'||LA16_0=='u') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:26497:91: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:26497:100: ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\''
                    {
                    // InternalMyDsl.g:26497:100: ( RULE_CP )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='L'||LA17_0=='U'||LA17_0=='u') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:26497:100: RULE_CP
                            {
                            mRULE_CP(); 

                            }
                            break;

                    }

                    match('\''); 
                    // InternalMyDsl.g:26497:114: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=3;
                        switch ( input.LA(1) ) {
                        case '\'':
                            {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1=='\n'||LA18_1=='\''||LA18_1=='0'||(LA18_1>='A' && LA18_1<='Z')||LA18_1=='\\'||(LA18_1>='^' && LA18_1<='_')||(LA18_1>='a' && LA18_1<='z')) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case '\n':
                        case '\\':
                        case '^':
                            {
                            alt18=1;
                            }
                            break;
                        case '0':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt18=2;
                            }
                            break;

                        }

                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:26497:115: ( '^' | '\\'' | '\\\\' | '\\n' )
                    	    {
                    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:26497:136: RULE_ES
                    	    {
                    	    mRULE_ES(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_I_CONSTANT"

    // $ANTLR start "RULE_F_CONSTANT"
    public final void mRULE_F_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_F_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26499:17: ( ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? ) )
            // InternalMyDsl.g:26499:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            {
            // InternalMyDsl.g:26499:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )
            int alt28=5;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:26499:20: RULE_D '+' RULE_E ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    mRULE_E(); 
                    // InternalMyDsl.g:26499:38: ( RULE_FS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='F'||LA20_0=='L'||LA20_0=='f'||LA20_0=='l') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMyDsl.g:26499:38: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:26499:47: RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('*'); 
                    match('.'); 
                    mRULE_D(); 
                    match('+'); 
                    // InternalMyDsl.g:26499:73: ( RULE_E )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:26499:73: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:26499:81: ( RULE_FS )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='F'||LA22_0=='L'||LA22_0=='f'||LA22_0=='l') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:26499:81: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:26499:90: RULE_D '+' '.' ( RULE_E )? ( RULE_FS )?
                    {
                    mRULE_D(); 
                    match('+'); 
                    match('.'); 
                    // InternalMyDsl.g:26499:105: ( RULE_E )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='E'||LA23_0=='e') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMyDsl.g:26499:105: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:26499:113: ( RULE_FS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='F'||LA24_0=='L'||LA24_0=='f'||LA24_0=='l') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDsl.g:26499:113: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:26499:122: RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    mRULE_P(); 
                    // InternalMyDsl.g:26499:148: ( RULE_FS )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='F'||LA25_0=='L'||LA25_0=='f'||LA25_0=='l') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalMyDsl.g:26499:148: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }

                    mRULE_HP(); 
                    mRULE_H(); 
                    match('*'); 
                    match('.'); 
                    mRULE_H(); 
                    match('+'); 
                    mRULE_P(); 
                    // InternalMyDsl.g:26499:198: ( RULE_FS )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='F'||LA26_0=='L'||LA26_0=='f'||LA26_0=='l') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMyDsl.g:26499:198: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:26499:207: RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    mRULE_H(); 
                    match('+'); 
                    match('.'); 
                    mRULE_P(); 
                    // InternalMyDsl.g:26499:237: ( RULE_FS )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='F'||LA27_0=='L'||LA27_0=='f'||LA27_0=='l') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMyDsl.g:26499:237: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


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
    // $ANTLR end "RULE_F_CONSTANT"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26501:21: ( ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+ )
            // InternalMyDsl.g:26501:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            {
            // InternalMyDsl.g:26501:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='\"'||LA32_0=='L'||LA32_0=='U'||LA32_0=='u') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:26501:24: ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )*
            	    {
            	    // InternalMyDsl.g:26501:24: ( RULE_SP )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0=='L'||LA29_0=='U'||LA29_0=='u') ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalMyDsl.g:26501:24: RULE_SP
            	            {
            	            mRULE_SP(); 

            	            }
            	            break;

            	    }

            	    match('\"'); 
            	    // InternalMyDsl.g:26501:37: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )*
            	    loop30:
            	    do {
            	        int alt30=3;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0=='\n'||LA30_0=='\''||LA30_0=='\\'||LA30_0=='^') ) {
            	            alt30=1;
            	        }
            	        else if ( (LA30_0=='0'||(LA30_0>='A' && LA30_0<='Z')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='z')) ) {
            	            alt30=2;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:26501:38: ( '^' | '\\'' | '\\\\' | '\\n' )
            	    	    {
            	    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalMyDsl.g:26501:59: RULE_ES
            	    	    {
            	    	    mRULE_ES(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    match('\"'); 
            	    // InternalMyDsl.g:26501:73: ( RULE_WS )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( ((LA31_0>='\t' && LA31_0<='\n')||(LA31_0>='\f' && LA31_0<='\r')||LA31_0==' ') ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:26501:73: RULE_WS
            	    	    {
            	    	    mRULE_WS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26503:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:26503:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:26503:11: ( '^' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='^') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:26503:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:26503:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='0' && LA34_0<='9')||(LA34_0>='A' && LA34_0<='Z')||LA34_0=='_'||(LA34_0>='a' && LA34_0<='z')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26505:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:26505:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:26505:12: ( '0' .. '9' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='0' && LA35_0<='9')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:26505:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26507:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:26507:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:26507:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\"') ) {
                alt38=1;
            }
            else if ( (LA38_0=='\'') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:26507:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:26507:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop36:
                    do {
                        int alt36=3;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='\\') ) {
                            alt36=1;
                        }
                        else if ( ((LA36_0>='\u0000' && LA36_0<='!')||(LA36_0>='#' && LA36_0<='[')||(LA36_0>=']' && LA36_0<='\uFFFF')) ) {
                            alt36=2;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMyDsl.g:26507:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:26507:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:26507:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:26507:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop37:
                    do {
                        int alt37=3;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='\\') ) {
                            alt37=1;
                        }
                        else if ( ((LA37_0>='\u0000' && LA37_0<='&')||(LA37_0>='(' && LA37_0<='[')||(LA37_0>=']' && LA37_0<='\uFFFF')) ) {
                            alt37=2;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMyDsl.g:26507:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:26507:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26509:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:26509:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:26509:24: ( options {greedy=false; } : . )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='*') ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1=='/') ) {
                        alt39=2;
                    }
                    else if ( ((LA39_1>='\u0000' && LA39_1<='.')||(LA39_1>='0' && LA39_1<='\uFFFF')) ) {
                        alt39=1;
                    }


                }
                else if ( ((LA39_0>='\u0000' && LA39_0<=')')||(LA39_0>='+' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:26509:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26511:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:26511:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:26511:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>='\u0000' && LA40_0<='\t')||(LA40_0>='\u000B' && LA40_0<='\f')||(LA40_0>='\u000E' && LA40_0<='\uFFFF')) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:26511:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalMyDsl.g:26511:40: ( ( '\\r' )? '\\n' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\n'||LA42_0=='\r') ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:26511:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:26511:41: ( '\\r' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='\r') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:26511:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26513:16: ( . )
            // InternalMyDsl.g:26513:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | RULE_IDZ | RULE_CHAR | RULE_FLOAT | RULE_WS | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt43=103;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // InternalMyDsl.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__41
                {
                mT__41(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__42
                {
                mT__42(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__43
                {
                mT__43(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__44
                {
                mT__44(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__45
                {
                mT__45(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__46
                {
                mT__46(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__47
                {
                mT__47(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__48
                {
                mT__48(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__49
                {
                mT__49(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__50
                {
                mT__50(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__51
                {
                mT__51(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__52
                {
                mT__52(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__53
                {
                mT__53(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__54
                {
                mT__54(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__55
                {
                mT__55(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__56
                {
                mT__56(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__57
                {
                mT__57(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__58
                {
                mT__58(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__59
                {
                mT__59(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__60
                {
                mT__60(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__61
                {
                mT__61(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__62
                {
                mT__62(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__63
                {
                mT__63(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__64
                {
                mT__64(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__65
                {
                mT__65(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__66
                {
                mT__66(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__67
                {
                mT__67(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__68
                {
                mT__68(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__69
                {
                mT__69(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__70
                {
                mT__70(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__71
                {
                mT__71(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__72
                {
                mT__72(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__73
                {
                mT__73(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__74
                {
                mT__74(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__75
                {
                mT__75(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__76
                {
                mT__76(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__77
                {
                mT__77(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__78
                {
                mT__78(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__79
                {
                mT__79(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__80
                {
                mT__80(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:316: T__81
                {
                mT__81(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:322: T__82
                {
                mT__82(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:328: T__83
                {
                mT__83(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:334: T__84
                {
                mT__84(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:340: T__85
                {
                mT__85(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:346: T__86
                {
                mT__86(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:352: T__87
                {
                mT__87(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:358: T__88
                {
                mT__88(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:364: T__89
                {
                mT__89(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:370: T__90
                {
                mT__90(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:376: T__91
                {
                mT__91(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:382: T__92
                {
                mT__92(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:388: T__93
                {
                mT__93(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:394: T__94
                {
                mT__94(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:400: T__95
                {
                mT__95(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:406: T__96
                {
                mT__96(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:412: T__97
                {
                mT__97(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:418: T__98
                {
                mT__98(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:424: T__99
                {
                mT__99(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:430: T__100
                {
                mT__100(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:437: T__101
                {
                mT__101(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:444: T__102
                {
                mT__102(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:451: T__103
                {
                mT__103(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:458: T__104
                {
                mT__104(); 

                }
                break;
            case 76 :
                // InternalMyDsl.g:1:465: T__105
                {
                mT__105(); 

                }
                break;
            case 77 :
                // InternalMyDsl.g:1:472: T__106
                {
                mT__106(); 

                }
                break;
            case 78 :
                // InternalMyDsl.g:1:479: T__107
                {
                mT__107(); 

                }
                break;
            case 79 :
                // InternalMyDsl.g:1:486: T__108
                {
                mT__108(); 

                }
                break;
            case 80 :
                // InternalMyDsl.g:1:493: T__109
                {
                mT__109(); 

                }
                break;
            case 81 :
                // InternalMyDsl.g:1:500: T__110
                {
                mT__110(); 

                }
                break;
            case 82 :
                // InternalMyDsl.g:1:507: T__111
                {
                mT__111(); 

                }
                break;
            case 83 :
                // InternalMyDsl.g:1:514: T__112
                {
                mT__112(); 

                }
                break;
            case 84 :
                // InternalMyDsl.g:1:521: T__113
                {
                mT__113(); 

                }
                break;
            case 85 :
                // InternalMyDsl.g:1:528: T__114
                {
                mT__114(); 

                }
                break;
            case 86 :
                // InternalMyDsl.g:1:535: T__115
                {
                mT__115(); 

                }
                break;
            case 87 :
                // InternalMyDsl.g:1:542: T__116
                {
                mT__116(); 

                }
                break;
            case 88 :
                // InternalMyDsl.g:1:549: T__117
                {
                mT__117(); 

                }
                break;
            case 89 :
                // InternalMyDsl.g:1:556: T__118
                {
                mT__118(); 

                }
                break;
            case 90 :
                // InternalMyDsl.g:1:563: T__119
                {
                mT__119(); 

                }
                break;
            case 91 :
                // InternalMyDsl.g:1:570: RULE_IDZ
                {
                mRULE_IDZ(); 

                }
                break;
            case 92 :
                // InternalMyDsl.g:1:579: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 93 :
                // InternalMyDsl.g:1:589: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 94 :
                // InternalMyDsl.g:1:600: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 95 :
                // InternalMyDsl.g:1:608: RULE_I_CONSTANT
                {
                mRULE_I_CONSTANT(); 

                }
                break;
            case 96 :
                // InternalMyDsl.g:1:624: RULE_F_CONSTANT
                {
                mRULE_F_CONSTANT(); 

                }
                break;
            case 97 :
                // InternalMyDsl.g:1:640: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 98 :
                // InternalMyDsl.g:1:660: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 99 :
                // InternalMyDsl.g:1:668: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 100 :
                // InternalMyDsl.g:1:677: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 101 :
                // InternalMyDsl.g:1:689: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 102 :
                // InternalMyDsl.g:1:705: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 103 :
                // InternalMyDsl.g:1:721: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA28_eotS =
        "\21\uffff";
    static final String DFA28_eofS =
        "\21\uffff";
    static final String DFA28_minS =
        "\1\60\2\52\1\60\1\uffff\1\56\2\53\1\56\2\uffff\2\56\2\uffff\1\71\1\53";
    static final String DFA28_maxS =
        "\1\71\1\170\1\53\1\146\1\uffff\1\145\2\53\1\56\2\uffff\1\160\1\56\2\uffff\1\71\1\53";
    static final String DFA28_acceptS =
        "\4\uffff\1\2\4\uffff\1\3\1\1\2\uffff\1\5\1\4\2\uffff";
    static final String DFA28_specialS =
        "\21\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\11\2",
            "\1\4\1\5\54\uffff\1\3\37\uffff\1\3",
            "\1\4\1\5",
            "\1\10\20\uffff\6\7\32\uffff\6\6",
            "",
            "\1\11\26\uffff\1\12\37\uffff\1\12",
            "\1\13",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\15\41\uffff\1\16\37\uffff\1\16",
            "\1\17",
            "",
            "",
            "\1\20",
            "\1\13"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "26499:19: ( RULE_D '+' RULE_E ( RULE_FS )? | RULE_D '*' '.' RULE_D '+' ( RULE_E )? ( RULE_FS )? | RULE_D '+' '.' ( RULE_E )? ( RULE_FS )? | RULE_HP RULE_H '+' RULE_P ( RULE_FS )? RULE_HP RULE_H '*' '.' RULE_H '+' RULE_P ( RULE_FS )? | RULE_HP RULE_H '+' '.' RULE_P ( RULE_FS )? )";
        }
    }
    static final String DFA43_eotS =
        "\1\uffff\10\66\1\117\1\122\1\126\1\uffff\1\131\1\135\1\137\1\142\1\145\1\147\1\151\1\153\1\uffff\1\156\10\uffff\1\170\6\66\1\uffff\4\66\1\62\1\u0091\1\uffff\1\u0091\2\66\1\62\1\uffff\1\66\1\u00a2\1\66\2\uffff\15\66\2\uffff\7\66\22\uffff\1\u00bd\2\uffff\1\u00bf\25\uffff\5\66\1\u00c6\3\66\1\u00ca\1\uffff\4\66\2\uffff\1\u009f\11\uffff\2\u0091\1\uffff\1\u0091\10\uffff\1\66\1\u00eb\1\uffff\25\66\1\u0101\3\66\4\uffff\6\66\1\uffff\1\66\1\u010d\1\66\1\uffff\5\66\1\u0114\5\uffff\1\u0114\6\uffff\1\u0114\5\uffff\1\105\6\uffff\1\66\1\uffff\22\66\1\u0133\1\u0134\1\u0135\1\uffff\3\66\1\u0139\2\66\1\u013c\1\u013d\3\66\1\uffff\2\66\1\u0143\1\u0144\1\u0145\1\66\2\uffff\1\106\1\uffff\1\106\1\uffff\1\u009f\1\105\4\uffff\16\66\1\u0159\1\u015a\3\66\3\uffff\3\66\1\uffff\1\66\1\u0162\2\uffff\1\u0163\2\66\1\u0166\1\66\3\uffff\1\u0168\4\uffff\1\u016a\10\66\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\2\uffff\2\66\1\u017b\2\66\1\u017e\1\66\2\uffff\1\u0180\1\66\1\uffff\1\66\3\uffff\4\66\1\u0187\4\66\5\uffff\1\66\1\u018d\1\uffff\2\66\1\uffff\1\66\1\uffff\1\u0191\3\66\1\u0195\1\u0196\1\uffff\1\66\1\u0198\1\66\1\u019a\1\u019b\1\uffff\1\u019c\1\u019d\1\u019e\1\uffff\1\u019f\1\u01a0\1\66\2\uffff\1\66\1\uffff\1\66\7\uffff\2\66\1\u01a6\2\66\1\uffff\2\66\1\u01ab\1\66\1\uffff\1\u01ad\1\uffff";
    static final String DFA43_eofS =
        "\u01ae\uffff";
    static final String DFA43_minS =
        "\1\0\3\60\1\42\4\60\1\75\1\53\1\55\1\uffff\1\75\1\52\1\75\1\74\4\75\1\uffff\1\75\10\uffff\1\56\6\60\1\uffff\3\60\1\42\1\0\1\52\1\uffff\1\52\1\60\1\42\1\0\1\uffff\3\60\2\uffff\14\60\1\42\2\uffff\7\60\22\uffff\1\75\2\uffff\1\75\25\uffff\12\60\1\uffff\4\60\2\0\1\12\5\0\1\60\3\uffff\1\52\1\56\1\uffff\1\52\2\0\1\uffff\4\0\1\uffff\2\60\1\uffff\31\60\4\uffff\6\60\1\uffff\3\60\1\uffff\5\60\6\0\1\12\6\0\1\12\1\uffff\1\0\2\53\1\56\7\0\1\60\1\uffff\25\60\1\uffff\13\60\1\uffff\6\60\2\uffff\2\0\2\56\1\12\5\0\23\60\3\uffff\3\60\1\uffff\2\60\2\uffff\5\60\3\uffff\1\60\1\0\1\71\2\0\16\60\2\uffff\7\60\2\uffff\2\60\1\uffff\1\60\1\uffff\1\53\1\uffff\11\60\5\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\6\60\1\uffff\5\60\1\uffff\3\60\1\uffff\3\60\2\uffff\1\60\1\uffff\1\60\7\uffff\5\60\1\uffff\4\60\1\uffff\1\60\1\uffff";
    static final String DFA43_maxS =
        "\1\uffff\10\172\2\75\1\76\1\uffff\4\75\1\76\1\75\1\172\1\75\1\uffff\1\75\10\uffff\1\56\6\172\1\uffff\4\172\1\uffff\1\170\1\uffff\1\71\2\172\1\uffff\1\uffff\3\172\2\uffff\15\172\2\uffff\7\172\22\uffff\1\75\2\uffff\1\75\25\uffff\12\172\1\uffff\4\172\2\uffff\1\172\5\uffff\1\146\3\uffff\2\71\1\uffff\1\71\2\uffff\1\uffff\4\uffff\1\uffff\2\172\1\uffff\31\172\4\uffff\6\172\1\uffff\3\172\1\uffff\5\172\6\uffff\1\172\6\uffff\1\172\1\uffff\1\uffff\2\53\1\56\7\uffff\1\172\1\uffff\25\172\1\uffff\13\172\1\uffff\6\172\2\uffff\2\uffff\1\160\1\56\1\172\5\uffff\23\172\3\uffff\3\172\1\uffff\2\172\2\uffff\5\172\3\uffff\1\172\1\uffff\1\71\2\uffff\16\172\2\uffff\7\172\2\uffff\2\172\1\uffff\1\172\1\uffff\1\53\1\uffff\11\172\5\uffff\2\172\1\uffff\2\172\1\uffff\1\172\1\uffff\6\172\1\uffff\5\172\1\uffff\3\172\1\uffff\3\172\2\uffff\1\172\1\uffff\1\172\7\uffff\5\172\1\uffff\4\172\1\uffff\1\172\1\uffff";
    static final String DFA43_acceptS =
        "\14\uffff\1\16\10\uffff\1\35\1\uffff\1\40\1\41\1\43\1\44\1\45\1\47\1\50\1\51\7\uffff\1\76\6\uffff\1\136\4\uffff\1\147\3\uffff\1\133\1\142\15\uffff\1\141\1\137\7\uffff\1\20\1\13\1\14\1\23\1\33\1\15\1\24\1\55\1\34\1\16\1\123\1\17\1\21\1\145\1\146\1\117\1\22\1\120\1\uffff\1\126\1\124\1\uffff\1\127\1\125\1\27\1\32\1\30\1\72\1\31\1\73\1\35\1\130\1\36\1\40\1\41\1\43\1\44\1\45\1\47\1\50\1\51\1\52\1\53\12\uffff\1\76\15\uffff\1\143\1\140\1\135\2\uffff\1\136\3\uffff\1\141\4\uffff\1\144\2\uffff\1\65\31\uffff\1\25\1\121\1\26\1\122\6\uffff\1\63\3\uffff\1\75\23\uffff\1\134\14\uffff\1\105\25\uffff\1\74\13\uffff\1\64\6\uffff\1\134\1\137\35\uffff\1\42\1\66\1\11\3\uffff\1\60\2\uffff\1\70\1\103\5\uffff\1\102\1\106\1\113\23\uffff\1\104\1\4\7\uffff\1\77\1\62\2\uffff\1\107\1\uffff\1\131\1\uffff\1\1\11\uffff\1\3\1\7\1\56\1\111\1\67\2\uffff\1\6\2\uffff\1\132\1\uffff\1\110\6\uffff\1\46\5\uffff\1\5\3\uffff\1\71\3\uffff\1\37\1\57\1\uffff\1\114\1\uffff\1\116\1\112\1\12\1\100\1\61\1\101\1\2\5\uffff\1\115\4\uffff\1\10\1\uffff\1\54";
    static final String DFA43_specialS =
        "\1\31\52\uffff\1\12\5\uffff\1\37\126\uffff\1\53\1\11\1\uffff\1\33\1\34\1\35\1\13\1\36\10\uffff\1\54\1\4\1\uffff\1\25\1\26\1\27\1\17\61\uffff\1\32\1\14\1\44\1\45\1\46\1\40\1\uffff\1\55\1\15\1\47\1\50\1\51\1\41\2\uffff\1\42\3\uffff\1\2\1\3\1\22\1\23\1\24\1\16\1\20\54\uffff\1\1\1\43\3\uffff\1\0\1\5\1\7\1\10\1\21\47\uffff\1\52\1\uffff\1\6\1\30\143\uffff}>";
    static final String[] DFA43_transitionS = {
            "\11\62\2\55\1\62\2\55\22\62\1\55\1\26\1\61\2\62\1\17\1\22\1\53\1\27\1\30\1\11\1\12\1\33\1\13\1\37\1\16\1\54\11\56\1\34\1\14\1\20\1\15\1\21\1\46\1\62\13\57\1\60\10\57\1\52\5\57\1\35\1\62\1\36\1\23\1\2\1\62\1\7\1\51\1\41\1\43\1\6\1\44\1\40\1\57\1\1\2\57\1\50\2\57\1\45\2\57\1\10\1\3\1\5\1\4\1\47\1\42\3\57\1\31\1\24\1\32\1\25\uff81\62",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\64\7\65\1\63\14\65",
            "\1\67\11\65\7\uffff\1\72\1\65\1\74\3\65\1\76\1\65\1\75\4\65\1\70\4\65\1\73\1\71\6\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\102\1\100\12\65\1\77\2\65\1\101\3\65",
            "\1\105\4\uffff\1\106\10\uffff\1\67\7\65\1\104\1\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\103\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\30\65\1\107\1\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\112\1\65\1\111\11\65\1\110\2\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\114\6\65\1\113\5\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\115\25\65",
            "\1\116",
            "\1\120\21\uffff\1\121",
            "\1\123\17\uffff\1\124\1\125",
            "",
            "\1\130",
            "\1\133\4\uffff\1\134\15\uffff\1\132",
            "\1\136",
            "\1\140\1\141",
            "\1\144\1\143",
            "\1\146",
            "\1\150\3\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\152",
            "",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\171\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\173\6\65\1\174\6\65\1\172\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\175\22\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\177\11\65\1\176\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0081\2\65\1\u0080\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0082\10\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0084\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0085\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0086\2\65\1\u0087\10\65",
            "\1\105\4\uffff\1\106\10\uffff\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\u008f\1\u0089\34\u008f\1\u008a\10\u008f\1\u008e\20\u008f\32\u008c\1\u008f\1\u0088\1\u008f\1\u0089\1\u008d\1\u008f\32\u008b\uff85\u008f",
            "\2\u0092\2\uffff\1\u0093\1\uffff\10\u0094\2\u0095\36\uffff\1\u0090\37\uffff\1\u0090",
            "",
            "\2\u0092\2\uffff\1\u0093\1\uffff\12\u0097",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\105\4\uffff\1\106\10\uffff\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00a0\7\65\1\u00a1\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00a3\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u00a4\22\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00a5\7\65\1\u00a6\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00a7\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00a8\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\u00a9\15\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00aa\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00ac\20\65\1\u00ab\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00ae\22\65\1\u00ad",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00af\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00b0\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00b1\11\65\1\u00b2\7\65",
            "\1\105\15\uffff\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00b3\12\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00b4\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00b5\5\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00b6\7\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00b7\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u00b8\26\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00b9\13\65\1\u00ba\1\u00bb\6\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "",
            "",
            "\1\u00be",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00c0\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00c1\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00c2\7\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00c3\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00c4\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00c5\5\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u00c7\24\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00c8\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00c9\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00cc\2\65\1\u00cb\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00cd\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00ce\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00cf\25\65",
            "\12\u009f\1\u00d1\34\u009f\1\u00d0\10\u009f\1\u00d5\20\u009f\32\u00d3\1\u009f\1\u00d1\1\u009f\1\u00d1\1\u00d4\1\u009f\32\u00d2\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u00d6\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\1\106\34\uffff\1\u00dd\10\uffff\1\106\20\uffff\32\106\1\uffff\1\106\1\uffff\2\106\1\uffff\32\106",
            "\12\u009f\1\u00d8\34\u009f\1\u00d6\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u00d6\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u00d6\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\47\u009f\1\u00de\6\u009f\1\u00df\uffd1\u009f",
            "\47\u009f\1\u00de\uffd8\u009f",
            "\1\u00e2\20\uffff\6\u00e1\32\uffff\6\u00e0",
            "",
            "",
            "",
            "\1\106\3\uffff\1\u0093\1\uffff\12\u0095",
            "\1\u0093\1\uffff\12\u0095",
            "",
            "\1\106\3\uffff\1\u0093\1\uffff\12\u0095",
            "\12\u009f\1\u00e4\27\u009f\1\u00e3\4\u009f\1\u00e4\10\u009f\1\u00e8\20\u009f\32\u00e6\1\u009f\1\u00e4\1\u009f\1\u00e4\1\u00e7\1\u009f\32\u00e5\uff85\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\56\u009f\1\u00e9\uffd1\u009f",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00ea\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00ec\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00ed\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00ee\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00ef\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00f0\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\u00f1\15\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00f2\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00f3\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00f4\5\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00f5\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00f6\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00f7\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00f8\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00f9\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00fa\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00fb\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00fc\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00fd\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\u00fe\15\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00ff\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0100\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0102\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0103\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u0104\5\65",
            "",
            "",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0105\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0107\1\u0106\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0108\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0109\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u010a\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\65\1\u010b\30\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u010c\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u010e\31\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u010f\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u0110\26\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u0111\23\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0112\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u0113\31\65",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\56\u009f\1\u00df\uffd1\u009f",
            "\1\106\34\uffff\1\106\10\uffff\1\106\20\uffff\32\106\1\uffff\1\106\1\uffff\2\106\1\uffff\32\106",
            "\12\u009f\1\u00d1\34\u009f\1\u0116\10\u009f\1\u00d5\20\u009f\32\u00d3\1\u009f\1\u00d1\1\u009f\1\u00d1\1\u00d4\1\u009f\32\u00d2\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\56\u009f\1\u00df\uffd1\u009f",
            "\1\106\34\uffff\1\106\10\uffff\1\106\20\uffff\32\106\1\uffff\1\106\1\uffff\2\106\1\uffff\32\106",
            "",
            "\56\u009f\1\u0117\uffd1\u009f",
            "\1\u0118",
            "\1\u0118",
            "\1\u0119",
            "\11\u009f\2\u011b\1\u009f\2\u011b\22\u009f\1\u011b\1\u009f\1\u011a\51\u009f\1\u011e\10\u009f\1\u011d\37\u009f\1\u011c\uff8a\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\56\u009f\1\u00e9\uffd1\u009f",
            "\56\u009f\1\u011f\uffd1\u009f",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0120\14\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0121\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0122\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u0123\23\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\14\65\1\u0124\15\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0125\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u0126\12\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u0127\23\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0128\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u0129\27\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u012a\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u012b\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u012c\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u012d\27\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u012e\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u012f\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u0130\23\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u0131\26\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0132\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0136\7\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0137\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0138\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u013a\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u013b\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u013e\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u013f\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u0140\5\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0141\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0142\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\12\65\1\u0146\17\65",
            "",
            "",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\71\u009f\1\u0147\uffc6\u009f",
            "\1\u0092\41\uffff\1\u0092\37\uffff\1\u0092",
            "\1\u0148",
            "\1\105\27\uffff\1\105\4\uffff\1\105\10\uffff\1\105\20\uffff\32\105\1\uffff\1\105\1\uffff\2\105\1\uffff\32\105",
            "\11\u009f\2\u011b\1\u009f\2\u011b\22\u009f\1\u011b\1\u009f\1\u011a\51\u009f\1\u011e\10\u009f\1\u011d\37\u009f\1\u011c\uff8a\u009f",
            "\42\u009f\1\u011a\25\u009f\1\u0149\uffc7\u009f",
            "\42\u009f\1\u011a\uffdd\u009f",
            "\42\u009f\1\u011a\uffdd\u009f",
            "\71\u009f\1\u014a\uffc6\u009f",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u014b\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u014c\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u014d\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u014e\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u014f\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0150\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0151\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0152\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0153\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0154\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u0155\27\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u0156\24\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u0157\26\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u0158\22\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u015b\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u015c\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u015d\14\65",
            "",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u015e\6\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u015f\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0160\14\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0161\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0164\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0165\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0167\21\65",
            "",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\u009f\1\u00d8\34\u009f\1\u0115\10\u009f\1\u00dc\20\u009f\32\u00da\1\u009f\1\u00d7\1\u009f\1\u00d8\1\u00db\1\u009f\32\u00d9\uff85\u009f",
            "\1\u0169",
            "\42\u009f\1\u011a\uffdd\u009f",
            "\12\u009f\1\u0099\27\u009f\1\u009a\4\u009f\1\u0099\10\u009f\1\u009e\20\u009f\32\u009c\1\u009f\1\u0098\1\u009f\1\u0099\1\u009d\1\u009f\32\u009b\uff85\u009f",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u016b\5\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u016c\26\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u016d\15\65\1\u016e\13\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u016f\27\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u0170\27\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0171\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0172\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0173\21\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0179\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u017a\24\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u017c\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u017d\27\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u017f\5\65",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0181\6\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0182\16\65",
            "",
            "\1\u0118",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0183\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\u0184\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0185\7\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u0186\24\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\u0188\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\27\65\1\u0189\2\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u018a\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u018b\27\65",
            "",
            "",
            "",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u018c\26\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u018e\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u018f\6\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0190\25\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0192\25\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0193\14\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0194\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u0197\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0199\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u01a1\13\65",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u01a2\7\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\30\65\1\u01a3\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u01a4\27\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u01a5\7\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u01a7\31\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u01a8\25\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u01a9\16\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u01aa\10\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u01ac\6\65",
            "",
            "\1\67\11\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | RULE_IDZ | RULE_CHAR | RULE_FLOAT | RULE_WS | RULE_I_CONSTANT | RULE_F_CONSTANT | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_283 = input.LA(1);

                        s = -1;
                        if ( (LA43_283=='u') ) {s = 284;}

                        else if ( (LA43_283=='U') ) {s = 285;}

                        else if ( (LA43_283=='L') ) {s = 286;}

                        else if ( (LA43_283=='\"') ) {s = 282;}

                        else if ( ((LA43_283>='\t' && LA43_283<='\n')||(LA43_283>='\f' && LA43_283<='\r')||LA43_283==' ') ) {s = 283;}

                        else if ( ((LA43_283>='\u0000' && LA43_283<='\b')||LA43_283=='\u000B'||(LA43_283>='\u000E' && LA43_283<='\u001F')||LA43_283=='!'||(LA43_283>='#' && LA43_283<='K')||(LA43_283>='M' && LA43_283<='T')||(LA43_283>='V' && LA43_283<='t')||(LA43_283>='v' && LA43_283<='\uFFFF')) ) {s = 159;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_278 = input.LA(1);

                        s = -1;
                        if ( (LA43_278=='\'') ) {s = 277;}

                        else if ( (LA43_278=='\\') ) {s = 215;}

                        else if ( (LA43_278=='\n'||LA43_278=='^') ) {s = 216;}

                        else if ( ((LA43_278>='a' && LA43_278<='z')) ) {s = 217;}

                        else if ( ((LA43_278>='A' && LA43_278<='Z')) ) {s = 218;}

                        else if ( (LA43_278=='_') ) {s = 219;}

                        else if ( (LA43_278=='0') ) {s = 220;}

                        else if ( ((LA43_278>='\u0000' && LA43_278<='\t')||(LA43_278>='\u000B' && LA43_278<='&')||(LA43_278>='(' && LA43_278<='/')||(LA43_278>='1' && LA43_278<='@')||LA43_278=='['||LA43_278==']'||LA43_278=='`'||(LA43_278>='{' && LA43_278<='\uFFFF')) ) {s = 159;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_227 = input.LA(1);

                        s = -1;
                        if ( (LA43_227=='\"') ) {s = 282;}

                        else if ( ((LA43_227>='\u0000' && LA43_227<='\b')||LA43_227=='\u000B'||(LA43_227>='\u000E' && LA43_227<='\u001F')||LA43_227=='!'||(LA43_227>='#' && LA43_227<='K')||(LA43_227>='M' && LA43_227<='T')||(LA43_227>='V' && LA43_227<='t')||(LA43_227>='v' && LA43_227<='\uFFFF')) ) {s = 159;}

                        else if ( ((LA43_227>='\t' && LA43_227<='\n')||(LA43_227>='\f' && LA43_227<='\r')||LA43_227==' ') ) {s = 283;}

                        else if ( (LA43_227=='u') ) {s = 284;}

                        else if ( (LA43_227=='U') ) {s = 285;}

                        else if ( (LA43_227=='L') ) {s = 286;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_228 = input.LA(1);

                        s = -1;
                        if ( (LA43_228=='\"') ) {s = 154;}

                        else if ( (LA43_228=='\\') ) {s = 152;}

                        else if ( ((LA43_228>='a' && LA43_228<='z')) ) {s = 155;}

                        else if ( ((LA43_228>='A' && LA43_228<='Z')) ) {s = 156;}

                        else if ( (LA43_228=='_') ) {s = 157;}

                        else if ( (LA43_228=='0') ) {s = 158;}

                        else if ( (LA43_228=='\n'||LA43_228=='\''||LA43_228=='^') ) {s = 153;}

                        else if ( ((LA43_228>='\u0000' && LA43_228<='\t')||(LA43_228>='\u000B' && LA43_228<='!')||(LA43_228>='#' && LA43_228<='&')||(LA43_228>='(' && LA43_228<='/')||(LA43_228>='1' && LA43_228<='@')||LA43_228=='['||LA43_228==']'||LA43_228=='`'||(LA43_228>='{' && LA43_228<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_153 = input.LA(1);

                        s = -1;
                        if ( (LA43_153=='\"') ) {s = 154;}

                        else if ( (LA43_153=='\\') ) {s = 152;}

                        else if ( ((LA43_153>='a' && LA43_153<='z')) ) {s = 155;}

                        else if ( ((LA43_153>='A' && LA43_153<='Z')) ) {s = 156;}

                        else if ( (LA43_153=='_') ) {s = 157;}

                        else if ( (LA43_153=='0') ) {s = 158;}

                        else if ( (LA43_153=='\n'||LA43_153=='\''||LA43_153=='^') ) {s = 153;}

                        else if ( ((LA43_153>='\u0000' && LA43_153<='\t')||(LA43_153>='\u000B' && LA43_153<='!')||(LA43_153>='#' && LA43_153<='&')||(LA43_153>='(' && LA43_153<='/')||(LA43_153>='1' && LA43_153<='@')||LA43_153=='['||LA43_153==']'||LA43_153=='`'||(LA43_153>='{' && LA43_153<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_284 = input.LA(1);

                        s = -1;
                        if ( (LA43_284=='8') ) {s = 329;}

                        else if ( (LA43_284=='\"') ) {s = 282;}

                        else if ( ((LA43_284>='\u0000' && LA43_284<='!')||(LA43_284>='#' && LA43_284<='7')||(LA43_284>='9' && LA43_284<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_329 = input.LA(1);

                        s = -1;
                        if ( (LA43_329=='\"') ) {s = 282;}

                        else if ( ((LA43_329>='\u0000' && LA43_329<='!')||(LA43_329>='#' && LA43_329<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_285 = input.LA(1);

                        s = -1;
                        if ( (LA43_285=='\"') ) {s = 282;}

                        else if ( ((LA43_285>='\u0000' && LA43_285<='!')||(LA43_285>='#' && LA43_285<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_286 = input.LA(1);

                        s = -1;
                        if ( (LA43_286=='\"') ) {s = 282;}

                        else if ( ((LA43_286>='\u0000' && LA43_286<='!')||(LA43_286>='#' && LA43_286<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_137 = input.LA(1);

                        s = -1;
                        if ( (LA43_137=='\'') ) {s = 214;}

                        else if ( (LA43_137=='\\') ) {s = 215;}

                        else if ( (LA43_137=='\n'||LA43_137=='^') ) {s = 216;}

                        else if ( ((LA43_137>='a' && LA43_137<='z')) ) {s = 217;}

                        else if ( ((LA43_137>='A' && LA43_137<='Z')) ) {s = 218;}

                        else if ( (LA43_137=='_') ) {s = 219;}

                        else if ( (LA43_137=='0') ) {s = 220;}

                        else if ( ((LA43_137>='\u0000' && LA43_137<='\t')||(LA43_137>='\u000B' && LA43_137<='&')||(LA43_137>='(' && LA43_137<='/')||(LA43_137>='1' && LA43_137<='@')||LA43_137=='['||LA43_137==']'||LA43_137=='`'||(LA43_137>='{' && LA43_137<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA43_43 = input.LA(1);

                        s = -1;
                        if ( (LA43_43=='\\') ) {s = 136;}

                        else if ( (LA43_43=='\n'||LA43_43=='^') ) {s = 137;}

                        else if ( (LA43_43=='\'') ) {s = 138;}

                        else if ( ((LA43_43>='a' && LA43_43<='z')) ) {s = 139;}

                        else if ( ((LA43_43>='A' && LA43_43<='Z')) ) {s = 140;}

                        else if ( (LA43_43=='_') ) {s = 141;}

                        else if ( (LA43_43=='0') ) {s = 142;}

                        else if ( ((LA43_43>='\u0000' && LA43_43<='\t')||(LA43_43>='\u000B' && LA43_43<='&')||(LA43_43>='(' && LA43_43<='/')||(LA43_43>='1' && LA43_43<='@')||LA43_43=='['||LA43_43==']'||LA43_43=='`'||(LA43_43>='{' && LA43_43<='\uFFFF')) ) {s = 143;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA43_142 = input.LA(1);

                        s = -1;
                        if ( (LA43_142=='\'') ) {s = 222;}

                        else if ( (LA43_142=='.') ) {s = 223;}

                        else if ( ((LA43_142>='\u0000' && LA43_142<='&')||(LA43_142>='(' && LA43_142<='-')||(LA43_142>='/' && LA43_142<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA43_209 = input.LA(1);

                        s = -1;
                        if ( (LA43_209=='\'') ) {s = 277;}

                        else if ( (LA43_209=='\\') ) {s = 215;}

                        else if ( (LA43_209=='\n'||LA43_209=='^') ) {s = 216;}

                        else if ( ((LA43_209>='a' && LA43_209<='z')) ) {s = 217;}

                        else if ( ((LA43_209>='A' && LA43_209<='Z')) ) {s = 218;}

                        else if ( (LA43_209=='_') ) {s = 219;}

                        else if ( (LA43_209=='0') ) {s = 220;}

                        else if ( ((LA43_209>='\u0000' && LA43_209<='\t')||(LA43_209>='\u000B' && LA43_209<='&')||(LA43_209>='(' && LA43_209<='/')||(LA43_209>='1' && LA43_209<='@')||LA43_209=='['||LA43_209==']'||LA43_209=='`'||(LA43_209>='{' && LA43_209<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA43_216 = input.LA(1);

                        s = -1;
                        if ( (LA43_216=='\'') ) {s = 277;}

                        else if ( (LA43_216=='\\') ) {s = 215;}

                        else if ( (LA43_216=='\n'||LA43_216=='^') ) {s = 216;}

                        else if ( ((LA43_216>='a' && LA43_216<='z')) ) {s = 217;}

                        else if ( ((LA43_216>='A' && LA43_216<='Z')) ) {s = 218;}

                        else if ( (LA43_216=='_') ) {s = 219;}

                        else if ( (LA43_216=='0') ) {s = 220;}

                        else if ( ((LA43_216>='\u0000' && LA43_216<='\t')||(LA43_216>='\u000B' && LA43_216<='&')||(LA43_216>='(' && LA43_216<='/')||(LA43_216>='1' && LA43_216<='@')||LA43_216=='['||LA43_216==']'||LA43_216=='`'||(LA43_216>='{' && LA43_216<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA43_232 = input.LA(1);

                        s = -1;
                        if ( (LA43_232=='.') ) {s = 233;}

                        else if ( ((LA43_232>='\u0000' && LA43_232<='-')||(LA43_232>='/' && LA43_232<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA43_158 = input.LA(1);

                        s = -1;
                        if ( (LA43_158=='.') ) {s = 233;}

                        else if ( ((LA43_158>='\u0000' && LA43_158<='-')||(LA43_158>='/' && LA43_158<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA43_233 = input.LA(1);

                        s = -1;
                        if ( (LA43_233=='.') ) {s = 287;}

                        else if ( ((LA43_233>='\u0000' && LA43_233<='-')||(LA43_233>='/' && LA43_233<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA43_287 = input.LA(1);

                        s = -1;
                        if ( (LA43_287=='9') ) {s = 330;}

                        else if ( ((LA43_287>='\u0000' && LA43_287<='8')||(LA43_287>=':' && LA43_287<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA43_229 = input.LA(1);

                        s = -1;
                        if ( (LA43_229=='\"') ) {s = 154;}

                        else if ( (LA43_229=='\\') ) {s = 152;}

                        else if ( (LA43_229=='\n'||LA43_229=='\''||LA43_229=='^') ) {s = 153;}

                        else if ( ((LA43_229>='a' && LA43_229<='z')) ) {s = 155;}

                        else if ( ((LA43_229>='A' && LA43_229<='Z')) ) {s = 156;}

                        else if ( (LA43_229=='_') ) {s = 157;}

                        else if ( (LA43_229=='0') ) {s = 158;}

                        else if ( ((LA43_229>='\u0000' && LA43_229<='\t')||(LA43_229>='\u000B' && LA43_229<='!')||(LA43_229>='#' && LA43_229<='&')||(LA43_229>='(' && LA43_229<='/')||(LA43_229>='1' && LA43_229<='@')||LA43_229=='['||LA43_229==']'||LA43_229=='`'||(LA43_229>='{' && LA43_229<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA43_230 = input.LA(1);

                        s = -1;
                        if ( (LA43_230=='\"') ) {s = 154;}

                        else if ( (LA43_230=='\\') ) {s = 152;}

                        else if ( ((LA43_230>='a' && LA43_230<='z')) ) {s = 155;}

                        else if ( ((LA43_230>='A' && LA43_230<='Z')) ) {s = 156;}

                        else if ( (LA43_230=='_') ) {s = 157;}

                        else if ( (LA43_230=='0') ) {s = 158;}

                        else if ( (LA43_230=='\n'||LA43_230=='\''||LA43_230=='^') ) {s = 153;}

                        else if ( ((LA43_230>='\u0000' && LA43_230<='\t')||(LA43_230>='\u000B' && LA43_230<='!')||(LA43_230>='#' && LA43_230<='&')||(LA43_230>='(' && LA43_230<='/')||(LA43_230>='1' && LA43_230<='@')||LA43_230=='['||LA43_230==']'||LA43_230=='`'||(LA43_230>='{' && LA43_230<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA43_231 = input.LA(1);

                        s = -1;
                        if ( (LA43_231=='\"') ) {s = 154;}

                        else if ( (LA43_231=='\\') ) {s = 152;}

                        else if ( ((LA43_231>='a' && LA43_231<='z')) ) {s = 155;}

                        else if ( ((LA43_231>='A' && LA43_231<='Z')) ) {s = 156;}

                        else if ( (LA43_231=='_') ) {s = 157;}

                        else if ( (LA43_231=='0') ) {s = 158;}

                        else if ( (LA43_231=='\n'||LA43_231=='\''||LA43_231=='^') ) {s = 153;}

                        else if ( ((LA43_231>='\u0000' && LA43_231<='\t')||(LA43_231>='\u000B' && LA43_231<='!')||(LA43_231>='#' && LA43_231<='&')||(LA43_231>='(' && LA43_231<='/')||(LA43_231>='1' && LA43_231<='@')||LA43_231=='['||LA43_231==']'||LA43_231=='`'||(LA43_231>='{' && LA43_231<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA43_155 = input.LA(1);

                        s = -1;
                        if ( (LA43_155=='\"') ) {s = 154;}

                        else if ( (LA43_155=='\\') ) {s = 152;}

                        else if ( ((LA43_155>='a' && LA43_155<='z')) ) {s = 155;}

                        else if ( ((LA43_155>='A' && LA43_155<='Z')) ) {s = 156;}

                        else if ( (LA43_155=='_') ) {s = 157;}

                        else if ( (LA43_155=='0') ) {s = 158;}

                        else if ( (LA43_155=='\n'||LA43_155=='\''||LA43_155=='^') ) {s = 153;}

                        else if ( ((LA43_155>='\u0000' && LA43_155<='\t')||(LA43_155>='\u000B' && LA43_155<='!')||(LA43_155>='#' && LA43_155<='&')||(LA43_155>='(' && LA43_155<='/')||(LA43_155>='1' && LA43_155<='@')||LA43_155=='['||LA43_155==']'||LA43_155=='`'||(LA43_155>='{' && LA43_155<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA43_156 = input.LA(1);

                        s = -1;
                        if ( (LA43_156=='\"') ) {s = 154;}

                        else if ( (LA43_156=='\\') ) {s = 152;}

                        else if ( ((LA43_156>='a' && LA43_156<='z')) ) {s = 155;}

                        else if ( ((LA43_156>='A' && LA43_156<='Z')) ) {s = 156;}

                        else if ( (LA43_156=='_') ) {s = 157;}

                        else if ( (LA43_156=='0') ) {s = 158;}

                        else if ( (LA43_156=='\n'||LA43_156=='\''||LA43_156=='^') ) {s = 153;}

                        else if ( ((LA43_156>='\u0000' && LA43_156<='\t')||(LA43_156>='\u000B' && LA43_156<='!')||(LA43_156>='#' && LA43_156<='&')||(LA43_156>='(' && LA43_156<='/')||(LA43_156>='1' && LA43_156<='@')||LA43_156=='['||LA43_156==']'||LA43_156=='`'||(LA43_156>='{' && LA43_156<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA43_157 = input.LA(1);

                        s = -1;
                        if ( (LA43_157=='\"') ) {s = 154;}

                        else if ( (LA43_157=='\\') ) {s = 152;}

                        else if ( ((LA43_157>='a' && LA43_157<='z')) ) {s = 155;}

                        else if ( ((LA43_157>='A' && LA43_157<='Z')) ) {s = 156;}

                        else if ( (LA43_157=='_') ) {s = 157;}

                        else if ( (LA43_157=='0') ) {s = 158;}

                        else if ( (LA43_157=='\n'||LA43_157=='\''||LA43_157=='^') ) {s = 153;}

                        else if ( ((LA43_157>='\u0000' && LA43_157<='\t')||(LA43_157>='\u000B' && LA43_157<='!')||(LA43_157>='#' && LA43_157<='&')||(LA43_157>='(' && LA43_157<='/')||(LA43_157>='1' && LA43_157<='@')||LA43_157=='['||LA43_157==']'||LA43_157=='`'||(LA43_157>='{' && LA43_157<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA43_330 = input.LA(1);

                        s = -1;
                        if ( (LA43_330=='\"') ) {s = 154;}

                        else if ( (LA43_330=='\\') ) {s = 152;}

                        else if ( ((LA43_330>='a' && LA43_330<='z')) ) {s = 155;}

                        else if ( ((LA43_330>='A' && LA43_330<='Z')) ) {s = 156;}

                        else if ( (LA43_330=='_') ) {s = 157;}

                        else if ( (LA43_330=='0') ) {s = 158;}

                        else if ( (LA43_330=='\n'||LA43_330=='\''||LA43_330=='^') ) {s = 153;}

                        else if ( ((LA43_330>='\u0000' && LA43_330<='\t')||(LA43_330>='\u000B' && LA43_330<='!')||(LA43_330>='#' && LA43_330<='&')||(LA43_330>='(' && LA43_330<='/')||(LA43_330>='1' && LA43_330<='@')||LA43_330=='['||LA43_330==']'||LA43_330=='`'||(LA43_330>='{' && LA43_330<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA43_0 = input.LA(1);

                        s = -1;
                        if ( (LA43_0=='i') ) {s = 1;}

                        else if ( (LA43_0=='_') ) {s = 2;}

                        else if ( (LA43_0=='s') ) {s = 3;}

                        else if ( (LA43_0=='u') ) {s = 4;}

                        else if ( (LA43_0=='t') ) {s = 5;}

                        else if ( (LA43_0=='e') ) {s = 6;}

                        else if ( (LA43_0=='a') ) {s = 7;}

                        else if ( (LA43_0=='r') ) {s = 8;}

                        else if ( (LA43_0=='*') ) {s = 9;}

                        else if ( (LA43_0=='+') ) {s = 10;}

                        else if ( (LA43_0=='-') ) {s = 11;}

                        else if ( (LA43_0==';') ) {s = 12;}

                        else if ( (LA43_0=='=') ) {s = 13;}

                        else if ( (LA43_0=='/') ) {s = 14;}

                        else if ( (LA43_0=='%') ) {s = 15;}

                        else if ( (LA43_0=='<') ) {s = 16;}

                        else if ( (LA43_0=='>') ) {s = 17;}

                        else if ( (LA43_0=='&') ) {s = 18;}

                        else if ( (LA43_0=='^') ) {s = 19;}

                        else if ( (LA43_0=='|') ) {s = 20;}

                        else if ( (LA43_0=='~') ) {s = 21;}

                        else if ( (LA43_0=='!') ) {s = 22;}

                        else if ( (LA43_0=='(') ) {s = 23;}

                        else if ( (LA43_0==')') ) {s = 24;}

                        else if ( (LA43_0=='{') ) {s = 25;}

                        else if ( (LA43_0=='}') ) {s = 26;}

                        else if ( (LA43_0==',') ) {s = 27;}

                        else if ( (LA43_0==':') ) {s = 28;}

                        else if ( (LA43_0=='[') ) {s = 29;}

                        else if ( (LA43_0==']') ) {s = 30;}

                        else if ( (LA43_0=='.') ) {s = 31;}

                        else if ( (LA43_0=='g') ) {s = 32;}

                        else if ( (LA43_0=='c') ) {s = 33;}

                        else if ( (LA43_0=='w') ) {s = 34;}

                        else if ( (LA43_0=='d') ) {s = 35;}

                        else if ( (LA43_0=='f') ) {s = 36;}

                        else if ( (LA43_0=='o') ) {s = 37;}

                        else if ( (LA43_0=='?') ) {s = 38;}

                        else if ( (LA43_0=='v') ) {s = 39;}

                        else if ( (LA43_0=='l') ) {s = 40;}

                        else if ( (LA43_0=='b') ) {s = 41;}

                        else if ( (LA43_0=='U') ) {s = 42;}

                        else if ( (LA43_0=='\'') ) {s = 43;}

                        else if ( (LA43_0=='0') ) {s = 44;}

                        else if ( ((LA43_0>='\t' && LA43_0<='\n')||(LA43_0>='\f' && LA43_0<='\r')||LA43_0==' ') ) {s = 45;}

                        else if ( ((LA43_0>='1' && LA43_0<='9')) ) {s = 46;}

                        else if ( ((LA43_0>='A' && LA43_0<='K')||(LA43_0>='M' && LA43_0<='T')||(LA43_0>='V' && LA43_0<='Z')||LA43_0=='h'||(LA43_0>='j' && LA43_0<='k')||(LA43_0>='m' && LA43_0<='n')||(LA43_0>='p' && LA43_0<='q')||(LA43_0>='x' && LA43_0<='z')) ) {s = 47;}

                        else if ( (LA43_0=='L') ) {s = 48;}

                        else if ( (LA43_0=='\"') ) {s = 49;}

                        else if ( ((LA43_0>='\u0000' && LA43_0<='\b')||LA43_0=='\u000B'||(LA43_0>='\u000E' && LA43_0<='\u001F')||(LA43_0>='#' && LA43_0<='$')||LA43_0=='@'||LA43_0=='\\'||LA43_0=='`'||(LA43_0>='\u007F' && LA43_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA43_208 = input.LA(1);

                        s = -1;
                        if ( (LA43_208=='\'') ) {s = 277;}

                        else if ( (LA43_208=='\\') ) {s = 215;}

                        else if ( (LA43_208=='\n'||LA43_208=='^') ) {s = 216;}

                        else if ( ((LA43_208>='a' && LA43_208<='z')) ) {s = 217;}

                        else if ( ((LA43_208>='A' && LA43_208<='Z')) ) {s = 218;}

                        else if ( (LA43_208=='_') ) {s = 219;}

                        else if ( (LA43_208=='0') ) {s = 220;}

                        else if ( ((LA43_208>='\u0000' && LA43_208<='\t')||(LA43_208>='\u000B' && LA43_208<='&')||(LA43_208>='(' && LA43_208<='/')||(LA43_208>='1' && LA43_208<='@')||LA43_208=='['||LA43_208==']'||LA43_208=='`'||(LA43_208>='{' && LA43_208<='\uFFFF')) ) {s = 159;}

                        else s = 276;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA43_139 = input.LA(1);

                        s = -1;
                        if ( (LA43_139=='\'') ) {s = 214;}

                        else if ( (LA43_139=='\\') ) {s = 215;}

                        else if ( (LA43_139=='\n'||LA43_139=='^') ) {s = 216;}

                        else if ( ((LA43_139>='a' && LA43_139<='z')) ) {s = 217;}

                        else if ( ((LA43_139>='A' && LA43_139<='Z')) ) {s = 218;}

                        else if ( (LA43_139=='_') ) {s = 219;}

                        else if ( (LA43_139=='0') ) {s = 220;}

                        else if ( ((LA43_139>='\u0000' && LA43_139<='\t')||(LA43_139>='\u000B' && LA43_139<='&')||(LA43_139>='(' && LA43_139<='/')||(LA43_139>='1' && LA43_139<='@')||LA43_139=='['||LA43_139==']'||LA43_139=='`'||(LA43_139>='{' && LA43_139<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA43_140 = input.LA(1);

                        s = -1;
                        if ( (LA43_140=='\'') ) {s = 214;}

                        else if ( (LA43_140=='\\') ) {s = 215;}

                        else if ( (LA43_140=='\n'||LA43_140=='^') ) {s = 216;}

                        else if ( ((LA43_140>='a' && LA43_140<='z')) ) {s = 217;}

                        else if ( ((LA43_140>='A' && LA43_140<='Z')) ) {s = 218;}

                        else if ( (LA43_140=='_') ) {s = 219;}

                        else if ( (LA43_140=='0') ) {s = 220;}

                        else if ( ((LA43_140>='\u0000' && LA43_140<='\t')||(LA43_140>='\u000B' && LA43_140<='&')||(LA43_140>='(' && LA43_140<='/')||(LA43_140>='1' && LA43_140<='@')||LA43_140=='['||LA43_140==']'||LA43_140=='`'||(LA43_140>='{' && LA43_140<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA43_141 = input.LA(1);

                        s = -1;
                        if ( (LA43_141=='\'') ) {s = 214;}

                        else if ( (LA43_141=='\\') ) {s = 215;}

                        else if ( (LA43_141=='\n'||LA43_141=='^') ) {s = 216;}

                        else if ( ((LA43_141>='a' && LA43_141<='z')) ) {s = 217;}

                        else if ( ((LA43_141>='A' && LA43_141<='Z')) ) {s = 218;}

                        else if ( (LA43_141=='_') ) {s = 219;}

                        else if ( (LA43_141=='0') ) {s = 220;}

                        else if ( ((LA43_141>='\u0000' && LA43_141<='\t')||(LA43_141>='\u000B' && LA43_141<='&')||(LA43_141>='(' && LA43_141<='/')||(LA43_141>='1' && LA43_141<='@')||LA43_141=='['||LA43_141==']'||LA43_141=='`'||(LA43_141>='{' && LA43_141<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA43_143 = input.LA(1);

                        s = -1;
                        if ( (LA43_143=='\'') ) {s = 222;}

                        else if ( ((LA43_143>='\u0000' && LA43_143<='&')||(LA43_143>='(' && LA43_143<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA43_49 = input.LA(1);

                        s = -1;
                        if ( (LA43_49=='\\') ) {s = 152;}

                        else if ( (LA43_49=='\n'||LA43_49=='\''||LA43_49=='^') ) {s = 153;}

                        else if ( (LA43_49=='\"') ) {s = 154;}

                        else if ( ((LA43_49>='a' && LA43_49<='z')) ) {s = 155;}

                        else if ( ((LA43_49>='A' && LA43_49<='Z')) ) {s = 156;}

                        else if ( (LA43_49=='_') ) {s = 157;}

                        else if ( (LA43_49=='0') ) {s = 158;}

                        else if ( ((LA43_49>='\u0000' && LA43_49<='\t')||(LA43_49>='\u000B' && LA43_49<='!')||(LA43_49>='#' && LA43_49<='&')||(LA43_49>='(' && LA43_49<='/')||(LA43_49>='1' && LA43_49<='@')||LA43_49=='['||LA43_49==']'||LA43_49=='`'||(LA43_49>='{' && LA43_49<='\uFFFF')) ) {s = 159;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA43_213 = input.LA(1);

                        s = -1;
                        if ( (LA43_213=='.') ) {s = 223;}

                        else if ( ((LA43_213>='\u0000' && LA43_213<='-')||(LA43_213>='/' && LA43_213<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA43_220 = input.LA(1);

                        s = -1;
                        if ( (LA43_220=='.') ) {s = 223;}

                        else if ( ((LA43_220>='\u0000' && LA43_220<='-')||(LA43_220>='/' && LA43_220<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA43_223 = input.LA(1);

                        s = -1;
                        if ( (LA43_223=='.') ) {s = 279;}

                        else if ( ((LA43_223>='\u0000' && LA43_223<='-')||(LA43_223>='/' && LA43_223<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA43_279 = input.LA(1);

                        s = -1;
                        if ( (LA43_279=='9') ) {s = 327;}

                        else if ( ((LA43_279>='\u0000' && LA43_279<='8')||(LA43_279>=':' && LA43_279<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA43_210 = input.LA(1);

                        s = -1;
                        if ( (LA43_210=='\'') ) {s = 277;}

                        else if ( (LA43_210=='\\') ) {s = 215;}

                        else if ( ((LA43_210>='a' && LA43_210<='z')) ) {s = 217;}

                        else if ( ((LA43_210>='A' && LA43_210<='Z')) ) {s = 218;}

                        else if ( (LA43_210=='_') ) {s = 219;}

                        else if ( (LA43_210=='0') ) {s = 220;}

                        else if ( (LA43_210=='\n'||LA43_210=='^') ) {s = 216;}

                        else if ( ((LA43_210>='\u0000' && LA43_210<='\t')||(LA43_210>='\u000B' && LA43_210<='&')||(LA43_210>='(' && LA43_210<='/')||(LA43_210>='1' && LA43_210<='@')||LA43_210=='['||LA43_210==']'||LA43_210=='`'||(LA43_210>='{' && LA43_210<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA43_211 = input.LA(1);

                        s = -1;
                        if ( (LA43_211=='\'') ) {s = 277;}

                        else if ( (LA43_211=='\\') ) {s = 215;}

                        else if ( (LA43_211=='\n'||LA43_211=='^') ) {s = 216;}

                        else if ( ((LA43_211>='a' && LA43_211<='z')) ) {s = 217;}

                        else if ( ((LA43_211>='A' && LA43_211<='Z')) ) {s = 218;}

                        else if ( (LA43_211=='_') ) {s = 219;}

                        else if ( (LA43_211=='0') ) {s = 220;}

                        else if ( ((LA43_211>='\u0000' && LA43_211<='\t')||(LA43_211>='\u000B' && LA43_211<='&')||(LA43_211>='(' && LA43_211<='/')||(LA43_211>='1' && LA43_211<='@')||LA43_211=='['||LA43_211==']'||LA43_211=='`'||(LA43_211>='{' && LA43_211<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA43_212 = input.LA(1);

                        s = -1;
                        if ( (LA43_212=='\'') ) {s = 277;}

                        else if ( (LA43_212=='\\') ) {s = 215;}

                        else if ( (LA43_212=='\n'||LA43_212=='^') ) {s = 216;}

                        else if ( ((LA43_212>='a' && LA43_212<='z')) ) {s = 217;}

                        else if ( ((LA43_212>='A' && LA43_212<='Z')) ) {s = 218;}

                        else if ( (LA43_212=='_') ) {s = 219;}

                        else if ( (LA43_212=='0') ) {s = 220;}

                        else if ( ((LA43_212>='\u0000' && LA43_212<='\t')||(LA43_212>='\u000B' && LA43_212<='&')||(LA43_212>='(' && LA43_212<='/')||(LA43_212>='1' && LA43_212<='@')||LA43_212=='['||LA43_212==']'||LA43_212=='`'||(LA43_212>='{' && LA43_212<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA43_217 = input.LA(1);

                        s = -1;
                        if ( (LA43_217=='\'') ) {s = 277;}

                        else if ( (LA43_217=='\\') ) {s = 215;}

                        else if ( (LA43_217=='\n'||LA43_217=='^') ) {s = 216;}

                        else if ( ((LA43_217>='a' && LA43_217<='z')) ) {s = 217;}

                        else if ( ((LA43_217>='A' && LA43_217<='Z')) ) {s = 218;}

                        else if ( (LA43_217=='_') ) {s = 219;}

                        else if ( (LA43_217=='0') ) {s = 220;}

                        else if ( ((LA43_217>='\u0000' && LA43_217<='\t')||(LA43_217>='\u000B' && LA43_217<='&')||(LA43_217>='(' && LA43_217<='/')||(LA43_217>='1' && LA43_217<='@')||LA43_217=='['||LA43_217==']'||LA43_217=='`'||(LA43_217>='{' && LA43_217<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA43_218 = input.LA(1);

                        s = -1;
                        if ( (LA43_218=='\'') ) {s = 277;}

                        else if ( (LA43_218=='\\') ) {s = 215;}

                        else if ( (LA43_218=='\n'||LA43_218=='^') ) {s = 216;}

                        else if ( ((LA43_218>='a' && LA43_218<='z')) ) {s = 217;}

                        else if ( ((LA43_218>='A' && LA43_218<='Z')) ) {s = 218;}

                        else if ( (LA43_218=='_') ) {s = 219;}

                        else if ( (LA43_218=='0') ) {s = 220;}

                        else if ( ((LA43_218>='\u0000' && LA43_218<='\t')||(LA43_218>='\u000B' && LA43_218<='&')||(LA43_218>='(' && LA43_218<='/')||(LA43_218>='1' && LA43_218<='@')||LA43_218=='['||LA43_218==']'||LA43_218=='`'||(LA43_218>='{' && LA43_218<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA43_219 = input.LA(1);

                        s = -1;
                        if ( (LA43_219=='\'') ) {s = 277;}

                        else if ( (LA43_219=='\\') ) {s = 215;}

                        else if ( (LA43_219=='\n'||LA43_219=='^') ) {s = 216;}

                        else if ( ((LA43_219>='a' && LA43_219<='z')) ) {s = 217;}

                        else if ( ((LA43_219>='A' && LA43_219<='Z')) ) {s = 218;}

                        else if ( (LA43_219=='_') ) {s = 219;}

                        else if ( (LA43_219=='0') ) {s = 220;}

                        else if ( ((LA43_219>='\u0000' && LA43_219<='\t')||(LA43_219>='\u000B' && LA43_219<='&')||(LA43_219>='(' && LA43_219<='/')||(LA43_219>='1' && LA43_219<='@')||LA43_219=='['||LA43_219==']'||LA43_219=='`'||(LA43_219>='{' && LA43_219<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA43_327 = input.LA(1);

                        s = -1;
                        if ( (LA43_327=='\'') ) {s = 277;}

                        else if ( (LA43_327=='\\') ) {s = 215;}

                        else if ( (LA43_327=='\n'||LA43_327=='^') ) {s = 216;}

                        else if ( ((LA43_327>='a' && LA43_327<='z')) ) {s = 217;}

                        else if ( ((LA43_327>='A' && LA43_327<='Z')) ) {s = 218;}

                        else if ( (LA43_327=='_') ) {s = 219;}

                        else if ( (LA43_327=='0') ) {s = 220;}

                        else if ( ((LA43_327>='\u0000' && LA43_327<='\t')||(LA43_327>='\u000B' && LA43_327<='&')||(LA43_327>='(' && LA43_327<='/')||(LA43_327>='1' && LA43_327<='@')||LA43_327=='['||LA43_327==']'||LA43_327=='`'||(LA43_327>='{' && LA43_327<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA43_136 = input.LA(1);

                        s = -1;
                        if ( (LA43_136=='\'') ) {s = 208;}

                        else if ( (LA43_136=='\n'||LA43_136=='\\'||LA43_136=='^') ) {s = 209;}

                        else if ( ((LA43_136>='a' && LA43_136<='z')) ) {s = 210;}

                        else if ( ((LA43_136>='A' && LA43_136<='Z')) ) {s = 211;}

                        else if ( (LA43_136=='_') ) {s = 212;}

                        else if ( (LA43_136=='0') ) {s = 213;}

                        else if ( ((LA43_136>='\u0000' && LA43_136<='\t')||(LA43_136>='\u000B' && LA43_136<='&')||(LA43_136>='(' && LA43_136<='/')||(LA43_136>='1' && LA43_136<='@')||LA43_136=='['||LA43_136==']'||LA43_136=='`'||(LA43_136>='{' && LA43_136<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA43_152 = input.LA(1);

                        s = -1;
                        if ( (LA43_152=='\"') ) {s = 227;}

                        else if ( (LA43_152=='\n'||LA43_152=='\''||LA43_152=='\\'||LA43_152=='^') ) {s = 228;}

                        else if ( ((LA43_152>='a' && LA43_152<='z')) ) {s = 229;}

                        else if ( ((LA43_152>='A' && LA43_152<='Z')) ) {s = 230;}

                        else if ( (LA43_152=='_') ) {s = 231;}

                        else if ( (LA43_152=='0') ) {s = 232;}

                        else if ( ((LA43_152>='\u0000' && LA43_152<='\t')||(LA43_152>='\u000B' && LA43_152<='!')||(LA43_152>='#' && LA43_152<='&')||(LA43_152>='(' && LA43_152<='/')||(LA43_152>='1' && LA43_152<='@')||LA43_152=='['||LA43_152==']'||LA43_152=='`'||(LA43_152>='{' && LA43_152<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA43_215 = input.LA(1);

                        s = -1;
                        if ( (LA43_215=='\'') ) {s = 278;}

                        else if ( (LA43_215=='\n'||LA43_215=='\\'||LA43_215=='^') ) {s = 209;}

                        else if ( ((LA43_215>='a' && LA43_215<='z')) ) {s = 210;}

                        else if ( ((LA43_215>='A' && LA43_215<='Z')) ) {s = 211;}

                        else if ( (LA43_215=='_') ) {s = 212;}

                        else if ( (LA43_215=='0') ) {s = 213;}

                        else if ( ((LA43_215>='\u0000' && LA43_215<='\t')||(LA43_215>='\u000B' && LA43_215<='&')||(LA43_215>='(' && LA43_215<='/')||(LA43_215>='1' && LA43_215<='@')||LA43_215=='['||LA43_215==']'||LA43_215=='`'||(LA43_215>='{' && LA43_215<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
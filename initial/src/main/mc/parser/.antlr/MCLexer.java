// Generated from d:\BK\HK191\PPL\Assignment1\Principles-Programming-Language\initial\src\main\mc\parser\MC.g4 by ANTLR 4.7.1

    package mc.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOIDTYPE=1, INTTYPE=2, FLOATTYPE=3, BOOLTYPE=4, STRINGTYPE=5, BREAK=6, 
		CONTINUE=7, ELSE=8, FOR=9, IF=10, RETURN=11, DO=12, WHILE=13, ADDOP=14, 
		SUBOP=15, DIVOP=16, MULOP=17, MODOP=18, ANDOP=19, NOTOP=20, OROP=21, EQOP=22, 
		NOTEQOP=23, LTOP=24, LTOEQOP=25, GTOP=26, GTOEQOP=27, ASSIGN=28, LSB=29, 
		RSB=30, LP=31, RP=32, LB=33, RB=34, SEMI=35, COMMA=36, BOOLLIT=37, LINE_COMMENT=38, 
		TRADITIONAL_COMMENT=39, WS=40, ID=41, INTLIT=42, FLOATLIT=43, STRINGLIT=44, 
		ERROR_CHAR=45, UNCLOSE_STRING=46, ILLEGAL_ESCAPE=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VOIDTYPE", "INTTYPE", "FLOATTYPE", "BOOLTYPE", "STRINGTYPE", "BREAK", 
		"CONTINUE", "ELSE", "FOR", "IF", "RETURN", "DO", "WHILE", "ADDOP", "SUBOP", 
		"DIVOP", "MULOP", "MODOP", "ANDOP", "NOTOP", "OROP", "EQOP", "NOTEQOP", 
		"LTOP", "LTOEQOP", "GTOP", "GTOEQOP", "ASSIGN", "LSB", "RSB", "LP", "RP", 
		"LB", "RB", "SEMI", "COMMA", "BOOLLIT", "LINE_COMMENT", "TRADITIONAL_COMMENT", 
		"WS", "ID", "INTLIT", "FLOATLIT", "WNP", "FP", "EX", "STRINGLIT", "ERROR_CHAR", 
		"UNCLOSE_STRING", "ILLEGAL_ESCAPE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'int'", "'float'", "'boolean'", "'string'", "'break'", 
		"'continue'", "'else'", "'for'", "'if'", "'return'", "'do'", "'while'", 
		"'+'", "'-'", "'/'", "'*'", "'%'", "'&&'", "'!'", "'||'", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'='", "'['", "']'", "'{'", "'}'", "'('", 
		"')'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOIDTYPE", "INTTYPE", "FLOATTYPE", "BOOLTYPE", "STRINGTYPE", "BREAK", 
		"CONTINUE", "ELSE", "FOR", "IF", "RETURN", "DO", "WHILE", "ADDOP", "SUBOP", 
		"DIVOP", "MULOP", "MODOP", "ANDOP", "NOTOP", "OROP", "EQOP", "NOTEQOP", 
		"LTOP", "LTOEQOP", "GTOP", "GTOEQOP", "ASSIGN", "LSB", "RSB", "LP", "RP", 
		"LB", "RB", "SEMI", "COMMA", "BOOLLIT", "LINE_COMMENT", "TRADITIONAL_COMMENT", 
		"WS", "ID", "INTLIT", "FLOATLIT", "STRINGLIT", "ERROR_CHAR", "UNCLOSE_STRING", 
		"ILLEGAL_ESCAPE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	@Override
	public Token emit() {
	    String s;
	    switch (getType()) {
	    case UNCLOSE_STRING:       
	        Token result = super.emit();
	        s = result.getText();
	        int indexOfNewLine = s.indexOf("\n");
	        String unclString;
	        if(indexOfNewLine==-1)
	          unclString = s.substring(1);
	        else
	          unclString = s.substring(1, indexOfNewLine);
	        throw new UncloseString(unclString);
	        
	    case ILLEGAL_ESCAPE:
	        result = super.emit();
	        s = result.getText();
	        String illegaEscape = s.substring(1);
	        throw new IllegalEscape(illegaEscape);
	    case ERROR_CHAR:
	        result = super.emit();
	        s = result.getText();
	        String errChar = s.substring(s.length() - 1);
	        throw new ErrorToken(errChar); 
	    default:
	        return super.emit();
	    }
	}


	public MCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 46:
			STRINGLIT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRINGLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    String str = getText();
			    str = str.substring(1, str.length() - 1);
			    setText(str);

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0178\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u00ee\n&\3\'\3\'\3\'\3\'\7\'\u00f4\n\'\f\'\16\'\u00f7\13\'\3\'"+
		"\3\'\3(\3(\3(\3(\7(\u00ff\n(\f(\16(\u0102\13(\3(\3(\3(\3(\3(\3)\6)\u010a"+
		"\n)\r)\16)\u010b\3)\3)\3*\6*\u0111\n*\r*\16*\u0112\3*\7*\u0116\n*\f*\16"+
		"*\u0119\13*\3+\6+\u011c\n+\r+\16+\u011d\3,\6,\u0121\n,\r,\16,\u0122\3"+
		",\5,\u0126\n,\3,\7,\u0129\n,\f,\16,\u012c\13,\3,\7,\u012f\n,\f,\16,\u0132"+
		"\13,\3,\5,\u0135\n,\3,\6,\u0138\n,\r,\16,\u0139\5,\u013c\n,\3,\5,\u013f"+
		"\n,\3-\3-\3.\3.\3/\3/\3/\5/\u0148\n/\3/\6/\u014b\n/\r/\16/\u014c\3\60"+
		"\3\60\3\60\3\60\7\60\u0153\n\60\f\60\16\60\u0156\13\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\5\61\u015f\n\61\3\62\3\62\3\62\3\62\5\62\u0165\n"+
		"\62\3\62\7\62\u0168\n\62\f\62\16\62\u016b\13\62\3\63\3\63\3\63\3\63\7"+
		"\63\u0171\n\63\f\63\16\63\u0174\13\63\3\63\3\63\3\63\3\u0100\2\64\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_.a/c\60e\61\3\2\n\4\2\f\f\17\17\5"+
		"\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2GGgg\n\2$$))^^"+
		"ddhhppttvv\6\2\n\f\16\17$$^^\2\u018e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2_\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5l\3\2\2\2\7p\3\2\2\2\tv\3\2"+
		"\2\2\13~\3\2\2\2\r\u0085\3\2\2\2\17\u008b\3\2\2\2\21\u0094\3\2\2\2\23"+
		"\u0099\3\2\2\2\25\u009d\3\2\2\2\27\u00a0\3\2\2\2\31\u00a7\3\2\2\2\33\u00aa"+
		"\3\2\2\2\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2"+
		"\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2-\u00c2"+
		"\3\2\2\2/\u00c5\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2\2\65\u00cd\3\2"+
		"\2\2\67\u00cf\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6\3\2\2\2?\u00d8"+
		"\3\2\2\2A\u00da\3\2\2\2C\u00dc\3\2\2\2E\u00de\3\2\2\2G\u00e0\3\2\2\2I"+
		"\u00e2\3\2\2\2K\u00ed\3\2\2\2M\u00ef\3\2\2\2O\u00fa\3\2\2\2Q\u0109\3\2"+
		"\2\2S\u0110\3\2\2\2U\u011b\3\2\2\2W\u013b\3\2\2\2Y\u0140\3\2\2\2[\u0142"+
		"\3\2\2\2]\u0144\3\2\2\2_\u014e\3\2\2\2a\u015e\3\2\2\2c\u0160\3\2\2\2e"+
		"\u016c\3\2\2\2gh\7x\2\2hi\7q\2\2ij\7k\2\2jk\7f\2\2k\4\3\2\2\2lm\7k\2\2"+
		"mn\7p\2\2no\7v\2\2o\6\3\2\2\2pq\7h\2\2qr\7n\2\2rs\7q\2\2st\7c\2\2tu\7"+
		"v\2\2u\b\3\2\2\2vw\7d\2\2wx\7q\2\2xy\7q\2\2yz\7n\2\2z{\7g\2\2{|\7c\2\2"+
		"|}\7p\2\2}\n\3\2\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084\f\3\2\2\2\u0085"+
		"\u0086\7d\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008a\7m\2\2\u008a\16\3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d\7"+
		"q\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7p\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2\u0093\20\3\2\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098"+
		"\22\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f\26\3\2\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7w\2\2"+
		"\u00a4\u00a5\7t\2\2\u00a5\u00a6\7p\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7"+
		"f\2\2\u00a8\u00a9\7q\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac"+
		"\7j\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\34\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3"+
		" \3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7"+
		"$\3\2\2\2\u00b8\u00b9\7\'\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7(\2\2\u00bb"+
		"\u00bc\7(\2\2\u00bc(\3\2\2\2\u00bd\u00be\7#\2\2\u00be*\3\2\2\2\u00bf\u00c0"+
		"\7~\2\2\u00c0\u00c1\7~\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7\7?\2\2\u00c7\60"+
		"\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb"+
		"\u00cc\7?\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce\66\3\2\2\2\u00cf"+
		"\u00d0\7@\2\2\u00d0\u00d1\7?\2\2\u00d18\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3"+
		":\3\2\2\2\u00d4\u00d5\7]\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7_\2\2\u00d7>"+
		"\3\2\2\2\u00d8\u00d9\7}\2\2\u00d9@\3\2\2\2\u00da\u00db\7\177\2\2\u00db"+
		"B\3\2\2\2\u00dc\u00dd\7*\2\2\u00ddD\3\2\2\2\u00de\u00df\7+\2\2\u00dfF"+
		"\3\2\2\2\u00e0\u00e1\7=\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3J\3"+
		"\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7w\2\2\u00e7"+
		"\u00ee\7g\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2"+
		"\u00eb\u00ec\7u\2\2\u00ec\u00ee\7g\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e8"+
		"\3\2\2\2\u00eeL\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7\61\2\2\u00f1"+
		"\u00f5\3\2\2\2\u00f2\u00f4\n\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\b\'\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7\61\2\2"+
		"\u00fb\u00fc\7,\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\13\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\7\61"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b(\2\2\u0107P\3\2\2\2\u0108\u010a"+
		"\t\3\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b)\2\2\u010eR\3\2\2\2\u010f"+
		"\u0111\t\4\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0117\3\2\2\2\u0114\u0116\t\5\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118T\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\t\6\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"V\3\2\2\2\u011f\u0121\5Y-\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0126\7\60"+
		"\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\3\2\2\2\u0127"+
		"\u0129\5[.\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u013c\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f"+
		"\5Y-\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\7\60"+
		"\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0138\5[.\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2"+
		"\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0120\3\2\2\2\u013b\u0130"+
		"\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\5]/\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013fX\3\2\2\2\u0140\u0141\t\6\2\2\u0141Z\3\2\2\2\u0142"+
		"\u0143\t\6\2\2\u0143\\\3\2\2\2\u0144\u0147\t\7\2\2\u0145\u0148\5\37\20"+
		"\2\u0146\u0148\5\35\17\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\t\6\2\2\u014a\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"^\3\2\2\2\u014e\u0154\7$\2\2\u014f\u0150\7^\2\2\u0150\u0153\t\b\2\2\u0151"+
		"\u0153\n\t\2\2\u0152\u014f\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7$\2\2\u0158\u0159\b\60\3\2\u0159`\3\2\2\2"+
		"\u015a\u015f\13\2\2\2\u015b\u015c\5W,\2\u015c\u015d\7\60\2\2\u015d\u015f"+
		"\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015fb\3\2\2\2\u0160"+
		"\u0169\7$\2\2\u0161\u0162\7^\2\2\u0162\u0165\t\b\2\2\u0163\u0165\n\t\2"+
		"\2\u0164\u0161\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0168"+
		"\7\f\2\2\u0167\u0164\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016ad\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016c\u0172\7$\2\2\u016d\u016e\7^\2\2\u016e\u0171\t\b\2\2\u016f\u0171"+
		"\n\t\2\2\u0170\u016d\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0175\u0176\7^\2\2\u0176\u0177\n\b\2\2\u0177f\3\2\2\2\34\2\u00ed"+
		"\u00f5\u0100\u010b\u0112\u0117\u011d\u0122\u0125\u012a\u0130\u0134\u0139"+
		"\u013b\u013e\u0147\u014c\u0152\u0154\u015e\u0164\u0167\u0169\u0170\u0172"+
		"\4\b\2\2\3\60\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
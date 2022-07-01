// Generated from c:\JavaLib\alaeh_v1.1\alaeh.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alaehParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSEIF=2, ELSE=3, ENDIF=4, SWITCH=5, CASE=6, BREAK=7, PRINT=8, FOR=9, 
		LOOP=10, PLUS=11, EQUAL=12, ASSIGN=13, NOTEQUAL=14, MORETHAN=15, MOREQUAL=16, 
		LESSTHAN=17, LESQUAL=18, MINUS=19, INCREMENT=20, DECREMENT=21, SEMICOLON=22, 
		COLON=23, LPAREN=24, RPAREN=25, QUOTE=26, LCURL=27, RCURL=28, INTEGER=29, 
		NAME=30, WSSKIP=31, NEWLINE=32;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignstmt = 2, RULE_ifstmt = 3, 
		RULE_elseifstmt = 4, RULE_elsestmt = 5, RULE_endif = 6, RULE_switchstmt = 7, 
		RULE_casestmt = 8, RULE_conditionstmt = 9, RULE_forloopstmt = 10, RULE_printstmt = 11, 
		RULE_expression = 12, RULE_term = 13, RULE_identifier = 14, RULE_integer = 15, 
		RULE_string = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignstmt", "ifstmt", "elseifstmt", "elsestmt", 
			"endif", "switchstmt", "casestmt", "conditionstmt", "forloopstmt", "printstmt", 
			"expression", "term", "identifier", "integer", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'kapag'", "'o_kapag'", "'pag_hinde'", "'tapuse'", "'lipate'", 
			"'lagay'", "'itigil'", "'pakitahe'", "'para'", "'ulite'", "'+'", "'=='", 
			"'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'-'", "'++'", "'--'", "';'", 
			"':'", "'('", "')'", "'\"'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSEIF", "ELSE", "ENDIF", "SWITCH", "CASE", "BREAK", "PRINT", 
			"FOR", "LOOP", "PLUS", "EQUAL", "ASSIGN", "NOTEQUAL", "MORETHAN", "MOREQUAL", 
			"LESSTHAN", "LESQUAL", "MINUS", "INCREMENT", "DECREMENT", "SEMICOLON", 
			"COLON", "LPAREN", "RPAREN", "QUOTE", "LCURL", "RCURL", "INTEGER", "NAME", 
			"WSSKIP", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "alaeh.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alaehParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << PRINT) | (1L << FOR) | (1L << INTEGER) | (1L << NAME))) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public ForloopstmtContext forloopstmt() {
			return getRuleContext(ForloopstmtContext.class,0);
		}
		public ConditionstmtContext conditionstmt() {
			return getRuleContext(ConditionstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public SwitchstmtContext switchstmt() {
			return getRuleContext(SwitchstmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				assignstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				forloopstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				conditionstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				printstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				ifstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				switchstmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignstmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(alaehParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(alaehParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignstmt);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(NAME);
				setState(49);
				match(ASSIGN);
				setState(50);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(NAME);
				setState(52);
				match(ASSIGN);
				setState(53);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(NAME);
				setState(55);
				match(ASSIGN);
				setState(56);
				integer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(alaehParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(alaehParser.LPAREN, 0); }
		public ConditionstmtContext conditionstmt() {
			return getRuleContext(ConditionstmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(alaehParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(alaehParser.COLON, 0); }
		public ElseifstmtContext elseifstmt() {
			return getRuleContext(ElseifstmtContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IF);
			setState(60);
			match(LPAREN);
			setState(61);
			conditionstmt();
			setState(62);
			match(RPAREN);
			setState(63);
			match(COLON);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << PRINT) | (1L << FOR) | (1L << INTEGER) | (1L << NAME))) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			elseifstmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifstmtContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(alaehParser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(alaehParser.LPAREN, 0); }
		public ConditionstmtContext conditionstmt() {
			return getRuleContext(ConditionstmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(alaehParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(alaehParser.COLON, 0); }
		public ElsestmtContext elsestmt() {
			return getRuleContext(ElsestmtContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseifstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstmt; }
	}

	public final ElseifstmtContext elseifstmt() throws RecognitionException {
		ElseifstmtContext _localctx = new ElseifstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ELSEIF);
			setState(73);
			match(LPAREN);
			setState(74);
			conditionstmt();
			setState(75);
			match(RPAREN);
			setState(76);
			match(COLON);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << PRINT) | (1L << FOR) | (1L << INTEGER) | (1L << NAME))) != 0)) {
				{
				{
				setState(77);
				statement();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			elsestmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsestmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(alaehParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(alaehParser.COLON, 0); }
		public EndifContext endif() {
			return getRuleContext(EndifContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElsestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmt; }
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ELSE);
			setState(86);
			match(COLON);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << PRINT) | (1L << FOR) | (1L << INTEGER) | (1L << NAME))) != 0)) {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			endif();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndifContext extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(alaehParser.ENDIF, 0); }
		public EndifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif; }
	}

	public final EndifContext endif() throws RecognitionException {
		EndifContext _localctx = new EndifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchstmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(alaehParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(alaehParser.LPAREN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(alaehParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(alaehParser.COLON, 0); }
		public List<CasestmtContext> casestmt() {
			return getRuleContexts(CasestmtContext.class);
		}
		public CasestmtContext casestmt(int i) {
			return getRuleContext(CasestmtContext.class,i);
		}
		public SwitchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstmt; }
	}

	public final SwitchstmtContext switchstmt() throws RecognitionException {
		SwitchstmtContext _localctx = new SwitchstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_switchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SWITCH);
			setState(98);
			match(LPAREN);
			setState(99);
			term();
			setState(100);
			match(RPAREN);
			setState(101);
			match(COLON);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				casestmt();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasestmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(alaehParser.CASE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode COLON() { return getToken(alaehParser.COLON, 0); }
		public TerminalNode BREAK() { return getToken(alaehParser.BREAK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CasestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestmt; }
	}

	public final CasestmtContext casestmt() throws RecognitionException {
		CasestmtContext _localctx = new CasestmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_casestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CASE);
			setState(108);
			integer();
			setState(109);
			match(COLON);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << PRINT) | (1L << FOR) | (1L << INTEGER) | (1L << NAME))) != 0)) {
				{
				{
				setState(110);
				statement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionstmtContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(alaehParser.EQUAL, 0); }
		public TerminalNode MORETHAN() { return getToken(alaehParser.MORETHAN, 0); }
		public TerminalNode MOREQUAL() { return getToken(alaehParser.MOREQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(alaehParser.LESSTHAN, 0); }
		public TerminalNode LESQUAL() { return getToken(alaehParser.LESQUAL, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ConditionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionstmt; }
	}

	public final ConditionstmtContext conditionstmt() throws RecognitionException {
		ConditionstmtContext _localctx = new ConditionstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionstmt);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				integer();
				setState(119);
				match(EQUAL);
				setState(120);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				integer();
				setState(123);
				match(MORETHAN);
				setState(124);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				integer();
				setState(127);
				match(MOREQUAL);
				setState(128);
				integer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				integer();
				setState(131);
				match(LESSTHAN);
				setState(132);
				integer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				integer();
				setState(135);
				match(LESQUAL);
				setState(136);
				integer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				integer();
				setState(139);
				match(EQUAL);
				setState(140);
				identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				integer();
				setState(143);
				match(MORETHAN);
				setState(144);
				identifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				integer();
				setState(147);
				match(MOREQUAL);
				setState(148);
				identifier();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				integer();
				setState(151);
				match(LESSTHAN);
				setState(152);
				identifier();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				integer();
				setState(155);
				match(LESQUAL);
				setState(156);
				identifier();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				identifier();
				setState(159);
				match(EQUAL);
				setState(160);
				integer();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(162);
				identifier();
				setState(163);
				match(MORETHAN);
				setState(164);
				integer();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(166);
				identifier();
				setState(167);
				match(MOREQUAL);
				setState(168);
				integer();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(170);
				identifier();
				setState(171);
				match(LESSTHAN);
				setState(172);
				integer();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(174);
				identifier();
				setState(175);
				match(LESQUAL);
				setState(176);
				integer();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(178);
				identifier();
				setState(179);
				match(EQUAL);
				setState(180);
				identifier();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(182);
				identifier();
				setState(183);
				match(MORETHAN);
				setState(184);
				identifier();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(186);
				identifier();
				setState(187);
				match(MOREQUAL);
				setState(188);
				identifier();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(190);
				identifier();
				setState(191);
				match(LESSTHAN);
				setState(192);
				identifier();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(194);
				identifier();
				setState(195);
				match(LESQUAL);
				setState(196);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopstmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(alaehParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(alaehParser.LPAREN, 0); }
		public ConditionstmtContext conditionstmt() {
			return getRuleContext(ConditionstmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(alaehParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(alaehParser.COLON, 0); }
		public TerminalNode LOOP() { return getToken(alaehParser.LOOP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForloopstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloopstmt; }
	}

	public final ForloopstmtContext forloopstmt() throws RecognitionException {
		ForloopstmtContext _localctx = new ForloopstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forloopstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(FOR);
			setState(201);
			match(LPAREN);
			setState(202);
			conditionstmt();
			setState(203);
			match(RPAREN);
			setState(204);
			match(COLON);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << PRINT) | (1L << FOR) | (1L << INTEGER) | (1L << NAME))) != 0)) {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintstmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(alaehParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(alaehParser.LPAREN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(alaehParser.RPAREN, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(PRINT);
			setState(214);
			match(LPAREN);
			setState(215);
			term();
			setState(216);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(alaehParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(alaehParser.MINUS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				term();
				setState(220);
				match(PLUS);
				setState(221);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				term();
				setState(224);
				match(MINUS);
				setState(225);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				identifier();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				integer();
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(alaehParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(alaehParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(alaehParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(alaehParser.QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(alaehParser.NAME, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(QUOTE);
			setState(240);
			match(NAME);
			setState(241);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5D\n"+
		"\5\f\5\16\5G\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13"+
		"\6\3\6\3\6\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\6\tj\n\t\r\t\16\tk\3\n\3\n\3\n\3\n\7\nr\n\n\f\n\16\n"+
		"u\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00c9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d1\n\f\f\f\16\f\u00d4\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00e7\n\16\3\17\3\17\3\17\5\17\u00ec\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\2\2\u010a\2\'\3\2\2\2\4\60\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\n"+
		"J\3\2\2\2\fW\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22m\3\2\2\2\24\u00c8\3\2"+
		"\2\2\26\u00ca\3\2\2\2\30\u00d7\3\2\2\2\32\u00e6\3\2\2\2\34\u00eb\3\2\2"+
		"\2\36\u00ed\3\2\2\2 \u00ef\3\2\2\2\"\u00f1\3\2\2\2$&\5\4\3\2%$\3\2\2\2"+
		"&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)\'\3\2\2\2*\61\5\6\4\2+\61"+
		"\5\26\f\2,\61\5\24\13\2-\61\5\30\r\2.\61\5\b\5\2/\61\5\20\t\2\60*\3\2"+
		"\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5"+
		"\3\2\2\2\62\63\7 \2\2\63\64\7\17\2\2\64<\5\32\16\2\65\66\7 \2\2\66\67"+
		"\7\17\2\2\67<\5\"\22\289\7 \2\29:\7\17\2\2:<\5 \21\2;\62\3\2\2\2;\65\3"+
		"\2\2\2;8\3\2\2\2<\7\3\2\2\2=>\7\3\2\2>?\7\32\2\2?@\5\24\13\2@A\7\33\2"+
		"\2AE\7\31\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2"+
		"\2\2GE\3\2\2\2HI\5\n\6\2I\t\3\2\2\2JK\7\4\2\2KL\7\32\2\2LM\5\24\13\2M"+
		"N\7\33\2\2NR\7\31\2\2OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SU\3\2\2\2TR\3\2\2\2UV\5\f\7\2V\13\3\2\2\2WX\7\5\2\2X\\\7\31\2\2Y[\5"+
		"\4\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2"+
		"_`\5\16\b\2`\r\3\2\2\2ab\7\6\2\2b\17\3\2\2\2cd\7\7\2\2de\7\32\2\2ef\5"+
		"\34\17\2fg\7\33\2\2gi\7\31\2\2hj\5\22\n\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2l\21\3\2\2\2mn\7\b\2\2no\5 \21\2os\7\31\2\2pr\5\4\3\2qp\3"+
		"\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\t\2\2w\23"+
		"\3\2\2\2xy\5 \21\2yz\7\16\2\2z{\5 \21\2{\u00c9\3\2\2\2|}\5 \21\2}~\7\21"+
		"\2\2~\177\5 \21\2\177\u00c9\3\2\2\2\u0080\u0081\5 \21\2\u0081\u0082\7"+
		"\22\2\2\u0082\u0083\5 \21\2\u0083\u00c9\3\2\2\2\u0084\u0085\5 \21\2\u0085"+
		"\u0086\7\23\2\2\u0086\u0087\5 \21\2\u0087\u00c9\3\2\2\2\u0088\u0089\5"+
		" \21\2\u0089\u008a\7\24\2\2\u008a\u008b\5 \21\2\u008b\u00c9\3\2\2\2\u008c"+
		"\u008d\5 \21\2\u008d\u008e\7\16\2\2\u008e\u008f\5\36\20\2\u008f\u00c9"+
		"\3\2\2\2\u0090\u0091\5 \21\2\u0091\u0092\7\21\2\2\u0092\u0093\5\36\20"+
		"\2\u0093\u00c9\3\2\2\2\u0094\u0095\5 \21\2\u0095\u0096\7\22\2\2\u0096"+
		"\u0097\5\36\20\2\u0097\u00c9\3\2\2\2\u0098\u0099\5 \21\2\u0099\u009a\7"+
		"\23\2\2\u009a\u009b\5\36\20\2\u009b\u00c9\3\2\2\2\u009c\u009d\5 \21\2"+
		"\u009d\u009e\7\24\2\2\u009e\u009f\5\36\20\2\u009f\u00c9\3\2\2\2\u00a0"+
		"\u00a1\5\36\20\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\5 \21\2\u00a3\u00c9"+
		"\3\2\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7\5 \21"+
		"\2\u00a7\u00c9\3\2\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\22\2\2\u00aa"+
		"\u00ab\5 \21\2\u00ab\u00c9\3\2\2\2\u00ac\u00ad\5\36\20\2\u00ad\u00ae\7"+
		"\23\2\2\u00ae\u00af\5 \21\2\u00af\u00c9\3\2\2\2\u00b0\u00b1\5\36\20\2"+
		"\u00b1\u00b2\7\24\2\2\u00b2\u00b3\5 \21\2\u00b3\u00c9\3\2\2\2\u00b4\u00b5"+
		"\5\36\20\2\u00b5\u00b6\7\16\2\2\u00b6\u00b7\5\36\20\2\u00b7\u00c9\3\2"+
		"\2\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\5\36\20\2"+
		"\u00bb\u00c9\3\2\2\2\u00bc\u00bd\5\36\20\2\u00bd\u00be\7\22\2\2\u00be"+
		"\u00bf\5\36\20\2\u00bf\u00c9\3\2\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2"+
		"\7\23\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\5\36\20"+
		"\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\5\36\20\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"x\3\2\2\2\u00c8|\3\2\2\2\u00c8\u0080\3\2\2\2\u00c8\u0084\3\2\2\2\u00c8"+
		"\u0088\3\2\2\2\u00c8\u008c\3\2\2\2\u00c8\u0090\3\2\2\2\u00c8\u0094\3\2"+
		"\2\2\u00c8\u0098\3\2\2\2\u00c8\u009c\3\2\2\2\u00c8\u00a0\3\2\2\2\u00c8"+
		"\u00a4\3\2\2\2\u00c8\u00a8\3\2\2\2\u00c8\u00ac\3\2\2\2\u00c8\u00b0\3\2"+
		"\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00bc\3\2\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00cb\7\13\2"+
		"\2\u00cb\u00cc\7\32\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce\7\33\2\2\u00ce"+
		"\u00d2\7\31\2\2\u00cf\u00d1\5\4\3\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\27\3\2\2\2\u00d7\u00d8\7\n\2"+
		"\2\u00d8\u00d9\7\32\2\2\u00d9\u00da\5\34\17\2\u00da\u00db\7\33\2\2\u00db"+
		"\31\3\2\2\2\u00dc\u00e7\5\34\17\2\u00dd\u00de\5\34\17\2\u00de\u00df\7"+
		"\r\2\2\u00df\u00e0\5\34\17\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\5\34\17\2"+
		"\u00e2\u00e3\7\25\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e7\5\"\22\2\u00e6\u00dc\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e1\3"+
		"\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\33\3\2\2\2\u00e8\u00ec\5\36\20\2\u00e9"+
		"\u00ec\5 \21\2\u00ea\u00ec\5\"\22\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\35\3\2\2\2\u00ed\u00ee\7 \2\2\u00ee\37"+
		"\3\2\2\2\u00ef\u00f0\7\37\2\2\u00f0!\3\2\2\2\u00f1\u00f2\7\34\2\2\u00f2"+
		"\u00f3\7 \2\2\u00f3\u00f4\7\34\2\2\u00f4#\3\2\2\2\16\'\60;ER\\ks\u00c8"+
		"\u00d2\u00e6\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
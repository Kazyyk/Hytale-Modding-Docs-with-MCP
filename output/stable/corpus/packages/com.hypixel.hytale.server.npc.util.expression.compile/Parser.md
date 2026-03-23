# Parser

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile

public class Parser

Shunting-yard parser converting token streams into AST operations via operator precedence and bracket matching.

Also in this package: CharacterSequenceMatcher, CompileContext, Lexer, LexerContext, OperatorBinary, OperatorUnary, ParsedToken, ParsedTokenConsumer, Token, TokenFlags

Complete API:
  private Parser.ParsedToken nextToken()
  public void parse(String expression, Parser.ParsedTokenConsumer tokenConsumer)
  public Parser.ParsedToken peekOperator()
  private void validateOperandCount(Parser.ParsedToken bracket)
  private int adjustOperandCount(Parser.ParsedToken parsedToken, int operandCount)
  private boolean hasLowerPrecedence(Token token, Parser.ParsedToken stackToken)
  private int arity(Token operator)

Fields:
public static final String MISMATCHED_CLOSING_BRACKET
public static final String TOO_MANY_OPERANDS
public static final String NOT_ENOUGH_OPERANDS
public static final String EXPECTED_UNARY_OPERATOR
public static final String EXPECTED_BINARY_OPERATOR
public static final String MISSING_CLOSING_BRACKET
public static final String ILLEGAL_USE_OF_ARGUMENT_LIST
private Lexer<Token> lexer
private LexerContext<Token> context
private Deque<Parser.ParsedToken> operatorStack
private Deque<Parser.ParsedToken> bracketStack

# Token

Type: enum | Package: com.hypixel.hytale.server.npc.util.expression.compile

public enum Token

Enumeration of all expression tokens: operators, brackets, literals, and identifiers with precedence and flag metadata.

Also in this package: CharacterSequenceMatcher, CompileContext, Lexer, LexerContext, OperatorBinary, OperatorUnary, ParsedToken, ParsedTokenConsumer, Parser, TokenFlags

Complete API:
  public String get()
  public int getPrecedence()
  public EnumSet<TokenFlags> getFlags()
  public boolean containsAnyFlag(EnumSet<TokenFlags> testFlags)
  public boolean isEndToken()
  public boolean isOperand()
  public boolean isLiteral()
  public boolean isOperator()
  public boolean isRightToLeft()
  public boolean canBeUnary()
  public Token getUnaryVariant()
  public boolean isUnary()
  public boolean isOpenBracket()
  public boolean isOpenTuple()
  public boolean isCloseBracket()
  public Token getMatchingBracket()
  public boolean isList()

Fields:
private final String text
private final int precedence
private final EnumSet<TokenFlags> flags
private final Token matchingBracket
private final Token unaryVariant

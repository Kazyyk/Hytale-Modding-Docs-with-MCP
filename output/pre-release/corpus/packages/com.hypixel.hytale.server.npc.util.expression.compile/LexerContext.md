# LexerContext

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile

public class LexerContext

Mutable state for the lexer: tracks position, current token, and token string/number values during tokenization.

Also in this package: CharacterSequenceMatcher, CompileContext, Lexer, OperatorBinary, OperatorUnary, ParsedToken, ParsedTokenConsumer, Parser, Token, TokenFlags

Complete API:
  public void init(String expression)
  public void resetToken()
  public Token setToken(Token token)
  public String getExpression()
  public Token getToken()
  public int getTokenPosition()
  public String getTokenString()
  public double getTokenNumber()
  protected char nextChar(String error)
  protected boolean haveChar()
  protected char currentChar()
  protected char peekChar(char defaultChar)
  protected char peekChar()
  protected char peekChar(int lookahead, char defaultChar)
  protected char peekChar(int lookahead)
  protected boolean eatWhiteSpace()
  protected char addTokenCharacter(char ch)
  protected int getPosition()
  protected void setPosition(int position)
  protected void adjustPosition(int newPosition)
  protected boolean isNumber(char firstLetter)
  protected void parseNumber(char firstChar)
  private char copyDigits(char ch)
  protected void parseIdent(char firstLetter)
  protected void parseString(char delimiter)

Fields:
private String expression
private int length
private int position
private Token token
private int tokenPosition
private StringBuilder tokenString
private double tokenNumber

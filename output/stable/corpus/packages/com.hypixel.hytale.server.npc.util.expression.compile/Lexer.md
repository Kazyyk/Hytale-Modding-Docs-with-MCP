# Lexer

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile

public class Lexer

Generic tokenizer that splits expression strings into tokens (identifiers, numbers, strings, operators) using a character-sequence matching trie.

Also in this package: CharacterSequenceMatcher, CompileContext, LexerContext, OperatorBinary, OperatorUnary, ParsedToken, ParsedTokenConsumer, Parser, Token, TokenFlags

Complete API:
  public Token nextToken(LexerContext<Token> context)

Fields:
public static final String UNTERMINATED_STRING
public static final String INVALID_NUMBER_FORMAT
public static final String INVALID_CHARACTER_IN_EXPRESSION
private final Token tokenEnd
private final Token tokenIdent
private final Token tokenString
private final Token tokenNumber
private final Lexer.CharacterSequenceMatcher<Token> characterSequenceMatcher

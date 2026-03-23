# OperatorUnary

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile

public class OperatorUnary

Lookup table for unary operators mapping (token, argument type) to result type and code generation function.

Also in this package: CharacterSequenceMatcher, CompileContext, Lexer, LexerContext, OperatorBinary, ParsedToken, ParsedTokenConsumer, Parser, Token, TokenFlags

Complete API:
  public boolean hasCodeGen()
  public ValueType getResultType()
  public Function<Scope,ExecutionContext.Instruction> getCodeGen()
  private static OperatorUnary of(Token token, ValueType argument, ValueType result, Function<Scope,ExecutionContext.Instruction> codeGen)
  public static OperatorUnary findOperator(Token token, ValueType type)

Fields:
private Token token
private ValueType argument
private ValueType result
private Function<Scope,ExecutionContext.Instruction> codeGen
private static OperatorUnary[] operators

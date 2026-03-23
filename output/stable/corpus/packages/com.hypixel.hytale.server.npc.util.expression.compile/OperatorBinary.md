# OperatorBinary

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile

public class OperatorBinary

Lookup table for binary operators mapping (token, lhs type, rhs type) to result type and code generation function.

Also in this package: CharacterSequenceMatcher, CompileContext, Lexer, LexerContext, OperatorUnary, ParsedToken, ParsedTokenConsumer, Parser, Token, TokenFlags

Complete API:
  public ValueType getResultType()
  public Function<Scope,ExecutionContext.Instruction> getCodeGen()
  private static OperatorBinary of(Token token, ValueType lhs, ValueType rhs, ValueType result, Function<Scope,ExecutionContext.Instruction> codeGen)
  public static OperatorBinary findOperator(Token token, ValueType lhs, ValueType rhs)

Fields:
private Token token
private ValueType lhs
private ValueType rhs
private ValueType result
private Function<Scope,ExecutionContext.Instruction> codeGen
private static OperatorBinary[] operators

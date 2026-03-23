# ASTOperand

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: AST

public abstract class ASTOperand extends AST

Abstract base class in the `ast` package.

## Methods

- super(valueType, token, tokenPosition)
- return new ASTOperandString(token, tokenPosition, tokenString)
- return new ASTOperandNumber(token, tokenPosition, operand.tokenNumber)
- throw new IllegalStateException("Unknown parser operand type in AST" + operand.token)

Known subclasses: ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray

Also in this package: AST, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public static ASTOperand createFromParsedToken(Parser.ParsedToken operand, CompileContext compileContext)
  private static ASTOperand createFromScopeConstant(Token param0, int param1, Scope param2, String param3)
  public static ASTOperand createFromOperand(Token param0, int param1, ExecutionContext.Operand param2)

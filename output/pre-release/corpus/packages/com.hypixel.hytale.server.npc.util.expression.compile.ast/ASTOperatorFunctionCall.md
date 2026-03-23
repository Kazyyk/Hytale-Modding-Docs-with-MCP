# ASTOperatorFunctionCall

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperator

public class ASTOperatorFunctionCall extends ASTOperator

Extends `ASTOperator`.

## Methods

- super(returnType, Token.FUNCTION_CALL, tokenPosition)
- @Override public boolean isConstant()
- public static void fromParsedFunction(int argumentCount, @Nonnull CompileContext compileContext)
- throw new IllegalStateException("Failed to evaluate constant function AST")

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public boolean isConstant()
  public static void fromParsedFunction(int argumentCount, CompileContext compileContext)

Fields:
private final String functionName

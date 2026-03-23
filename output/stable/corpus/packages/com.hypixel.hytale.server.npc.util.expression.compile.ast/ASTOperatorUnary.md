# ASTOperatorUnary

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperator

public class ASTOperatorUnary extends ASTOperator

Extends `ASTOperator`.

## Methods

- @Override public boolean isConstant()
- public static void fromUnaryOperator(@Nonnull Parser.ParsedToken operand, @Nonnull CompileContext compileContext)
- throw new ParseException("Type mismatch for operator " + token, tokenPosition)
- throw new IllegalStateException("Failed to evaluate constant unary AST")
- throw new ParseException("Not enough operands for operator '" + operand.tokenString, tokenPosition)

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple

Complete API:
  public boolean isConstant()
  public static void fromUnaryOperator(Parser.ParsedToken operand, CompileContext compileContext)

# ASTOperatorBinary

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperator

public class ASTOperatorBinary extends ASTOperator

Extends `ASTOperator`.

## Methods

- @Override public boolean isConstant()
- public static void fromBinaryOperator(@Nonnull Parser.ParsedToken operator, @Nonnull CompileContext compileContext)
- throw new ParseException("Type mismatch for operator " + operator.token, operator.tokenPosition)
- throw new IllegalStateException("Failed to evaluate constant binary AST")
- throw new ParseException("Not enough operands for operator '" + operator.tokenString, operator.tokenPosition)

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public boolean isConstant()
  public static void fromBinaryOperator(Parser.ParsedToken operator, CompileContext compileContext)

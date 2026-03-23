# ASTOperandNumber

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperand

public class ASTOperandNumber extends ASTOperand

Extends `ASTOperand`.

## Methods

- super(ValueType.NUMBER, token, tokenPosition)
- throw new IllegalArgumentException("Value must be constant: " + identifier)
- @Override public double getNumber()
- @Override public boolean isConstant()
- @Override public ExecutionContext.Operand asOperand()

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public double getNumber()
  public boolean isConstant()
  public ExecutionContext.Operand asOperand()

Fields:
private final double constantNumber

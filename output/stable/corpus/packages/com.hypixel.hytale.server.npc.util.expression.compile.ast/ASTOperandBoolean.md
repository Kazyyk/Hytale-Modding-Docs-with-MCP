# ASTOperandBoolean

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperand

public class ASTOperandBoolean extends ASTOperand

Extends `ASTOperand`.

## Methods

- super(ValueType.BOOLEAN, token, tokenPosition)
- throw new IllegalArgumentException("Value must be constant: " + identifier)
- @Override public boolean getBoolean()
- @Override public boolean isConstant()
- @Override public ExecutionContext.Operand asOperand()

Also in this package: AST, ASTOperand, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public boolean getBoolean()
  public boolean isConstant()
  public ExecutionContext.Operand asOperand()

Fields:
private final boolean constantBool

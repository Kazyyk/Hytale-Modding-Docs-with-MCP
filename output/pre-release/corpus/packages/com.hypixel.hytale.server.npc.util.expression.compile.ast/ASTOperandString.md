# ASTOperandString

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperand

public class ASTOperandString extends ASTOperand

Extends `ASTOperand`.

## Methods

- super(ValueType.STRING, token, tokenPosition)
- throw new IllegalArgumentException("Value must be constant: " + identifier)
- @Override public String getString()
- @Override public boolean isConstant()
- @Override public ExecutionContext.Operand asOperand()

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public String getString()
  public boolean isConstant()
  public ExecutionContext.Operand asOperand()

Fields:
protected final String constantString

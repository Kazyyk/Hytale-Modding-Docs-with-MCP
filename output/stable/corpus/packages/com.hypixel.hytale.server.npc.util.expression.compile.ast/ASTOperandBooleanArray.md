# ASTOperandBooleanArray

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperand

public class ASTOperandBooleanArray extends ASTOperand

Extends `ASTOperand`.

## Methods

- super(ValueType.BOOLEAN_ARRAY, token, tokenPosition)
- throw new IllegalArgumentException("Value must be constant: " + identifier)
- this(token, tokenPosition, new boolean[argumentCount])
- @Override public boolean isConstant()
- @Override public ExecutionContext.Operand asOperand()

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public boolean isConstant()
  public ExecutionContext.Operand asOperand()

Fields:
private final boolean[] constantBoolArray

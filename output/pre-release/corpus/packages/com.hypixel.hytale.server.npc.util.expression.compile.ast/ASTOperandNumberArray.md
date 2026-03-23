# ASTOperandNumberArray

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperand

public class ASTOperandNumberArray extends ASTOperand

Extends `ASTOperand`.

## Methods

- super(ValueType.NUMBER_ARRAY, token, tokenPosition)
- throw new IllegalArgumentException("Value must be constant: " + identifier)
- this(token, tokenPosition, new double[argumentCount])
- @Override public boolean isConstant()
- @Override public ExecutionContext.Operand asOperand()

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public boolean isConstant()
  public ExecutionContext.Operand asOperand()

Fields:
private final double[] constantNumberArray

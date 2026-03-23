# ASTOperandStringArray

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast | Extends: ASTOperand

public class ASTOperandStringArray extends ASTOperand

Extends `ASTOperand`.

## Methods

- super(ValueType.STRING_ARRAY, token, tokenPosition)
- throw new IllegalArgumentException("Value must be constant: " + identifier)
- this(token, tokenPosition, new String[argumentCount])
- @Override public boolean isConstant()
- @Override public ExecutionContext.Operand asOperand()

Also in this package: AST, ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public boolean isConstant()
  public ExecutionContext.Operand asOperand()

Fields:
private final String[] constantStringArray

# AST

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile.ast

public abstract class AST

Abstract base class in the `ast` package.

## Fields

- private AST parent
- @Nullable protected Function<Scope, ExecutionContext.Instruction> codeGen

## Methods

- public AST getParent()
- public void setParent(AST parent)
- @Nonnull public ValueType getValueType()
- @Nonnull public Token getToken()
- public int getTokenPosition()
- @Nullable public Function<Scope, ExecutionContext.Instruction> getCodeGen()
- public abstract boolean isConstant()
- public ExecutionContext.Operand asOperand()
- throw new IllegalStateException("AST: Cannot be returned as operand")
- public String getString()
- throw new IllegalStateException("AST: Cannot return string")
- public boolean getBoolean()
- throw new IllegalStateException("AST: Cannot return boolean")
- public double getNumber()
- throw new IllegalStateException("AST: Cannot return number")
- @Nonnull public ValueType returnType()
- public ValueType genCode(@Nonnull List<ExecutionContext.Instruction> list, Scope scope)

Known subclasses: ASTOperand, ASTOperator

Also in this package: ASTOperand, ASTOperandBoolean, ASTOperandBooleanArray, ASTOperandEmptyArray, ASTOperandIdentifier, ASTOperandNumber, ASTOperandNumberArray, ASTOperandString, ASTOperandStringArray, ASTOperator, ASTOperatorBinary, ASTOperatorFunctionCall, ASTOperatorTuple, ASTOperatorUnary

Complete API:
  public AST getParent()
  public void setParent(AST parent)
  public ValueType getValueType()
  public Token getToken()
  public int getTokenPosition()
  public Function<Scope,ExecutionContext.Instruction> getCodeGen()
  public abstract boolean isConstant()
  public ExecutionContext.Operand asOperand()
  public String getString()
  public boolean getBoolean()
  public double getNumber()
  public ValueType returnType()
  public ValueType genCode(List<ExecutionContext.Instruction> list, Scope scope)

Fields:
private final ValueType valueType
private final Token token
private final int tokenPosition
private AST parent
protected Function<Scope,ExecutionContext.Instruction> codeGen

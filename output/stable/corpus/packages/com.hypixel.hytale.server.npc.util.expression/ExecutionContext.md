# ExecutionContext

Type: class | Package: com.hypixel.hytale.server.npc.util.expression

public class ExecutionContext

Stack-based virtual machine that executes compiled expression instruction sequences. Maintains an operand stack of `Operand` slots (auto-growing by increments of 8), a current Scope, and optional combat config / interaction variable context. Provides pre-defined static `Instruction` constants for all arithmetic, logical, bitwise, and comparison operators, plus factory methods for generating PUSH, READ, CALL, and PACK instructions.

## Constants (Instruction Singletons)

- UNARY_PLUS | No-op (identity).
- UNARY_MINUS | Negate top number.
- LOGICAL_NOT | Negate top boolean.
- BITWISE_NOT | Bitwise complement of top int.
- EXPONENTIATION | pow(a, b)
- REMAINDER | a % b
- DIVIDE | a / b
- MULTIPLY | a * b
- MINUS | a - b
- PLUS | a + b
- GREATER_EQUAL`, `GREATER`, `LESS_EQUAL`, `LESS | Numeric comparisons.
- NOT_EQUAL`, `EQUAL | Numeric equality.
- NOT_EQUAL_BOOL`, `EQUAL_BOOL | Boolean equality.
- BITWISE_AND`, `BITWISE_XOR`, `BITWISE_OR | Bitwise integer ops.
- LOGICAL_AND`, `LOGICAL_OR | Short-circuit boolean ops.

## Fields

- public static final int STACK_GROW_INCREMENT
- protected Scope scope
- protected Operand[] operandStack
- protected int stackTop
- protected ValueType lastPushedType
- protected String combatConfig
- protected Map<String, String> interactionVars

## Constructors

- public ExecutionContext(Scope scope)
- public ExecutionContext()

## Execution Methods

- public ValueType execute(@Nonnull List<Instruction> instructions, Scope scope)
- public ValueType execute(@Nonnull List<Instruction> instructions)
- public ValueType execute(@Nonnull Instruction[] instructions, Scope scope)
- public ValueType execute(@Nonnull Instruction[] instructions)

## Stack Operations

- public void push(String value)
- public void push(double value)
- public void push(int value)
- public void push(boolean value)
- public void push(String[] value)
- public void push(double[] value)
- public void push(boolean[] value)
- public void pushEmptyArray()
- public double popNumber()
- public int popInt()
- public String popString()
- public boolean popBoolean()
- public double[] popNumberArray()
- @Nullable public String[] popStringArray()
- public boolean[] popBooleanArray()
- public String popAsString()
- public void popPush(String value, int popCount)
- public void popPush(double value, int popCount)
- public void popPush(int value, int popCount)
- public void popPush(boolean value, int popCount)
- public void popPush(String[] value, int popCount)
- public void popPush(double[] value, int popCount)
- public void popPush(boolean[] value, int popCount)
- public void popPushEmptyArray(int popCount)

## Instruction Generation (Static Factories)

- @Nonnull public static Instruction genPUSH(String value)
- @Nonnull public static Instruction genPUSH(double value)
- @Nonnull public static Instruction genPUSH(boolean value)
- @Nonnull public static Instruction genPUSH(String[] value)
- @Nonnull public static Instruction genPUSH(double[] value)
- @Nonnull public static Instruction genPUSH(boolean[] value)
- @Nonnull public static Instruction genPUSHEmptyArray()
- @Nonnull public static Instruction genREAD(String ident, @Nonnull ValueType type, @Nullable Scope scope)
- @Nonnull public static Instruction genCALL(String ident, int numArgs, @Nullable Scope scope)
- @Nonnull public static Instruction genNumberPACK(int size)
- @Nonnull public static Instruction genStringPACK(int size)
- @Nonnull public static Instruction genBooleanPACK(int size)
- @Nonnull public static Instruction genPACK(@Nonnull ValueType arrayType, int size)

## Inner Types

### Instruction (functional interface)


@FunctionalInterface
public interface Instruction {
    void execute(ExecutionContext var1);
}

A single executable step in a compiled expression. All operator constants, PUSH/READ/CALL/PACK generators, and user-defined functions implement this interface.

### Operand (static inner class)


public static class Operand

Mutable value holder on the operand stack. Stores one value of any supported type (`string`, `number`, `bool`, `numberArray`, `stringArray`, `boolArray`) plus a ValueType discriminant. Reused across evaluations to minimize allocation.

## Related Types

- Expression -- high-level compile/execute entry point
- Scope -- variable/function provider
- ValueType -- type discriminant

Also in this package: Expression, Function, Instruction, Operand, Scope, StdLib, StdScope, Symbol, SymbolBoolean, SymbolBooleanArray, SymbolFunction, SymbolNumber, SymbolNumberArray, SymbolString, SymbolStringArray, ValueType

Complete API:
  public ValueType execute(List<ExecutionContext.Instruction> instructions, Scope scope)
  public ValueType execute(List<ExecutionContext.Instruction> instructions)
  public ValueType execute(ExecutionContext.Instruction[] instructions, Scope scope)
  public ValueType execute(ExecutionContext.Instruction[] instructions)
  public ValueType getType()
  public ExecutionContext.Operand top()
  public Scope setScope(Scope scope)
  public Scope getScope()
  public String getCombatConfig()
  public void setCombatConfig(String combatConfig)
  public Map<String,String> getInteractionVars()
  public void setInteractionVars(Map<String,String> interactionVars)
  protected ExecutionContext.Operand push()
  public void push(String value)
  public void push(double value)
  public void push(int value)
  public void push(boolean value)
  public void push(String[] value)
  public void push(double[] value)
  public void push(boolean[] value)
  public void pushEmptyArray()
  protected ExecutionContext.Operand popPush(int popCount)
  public void popPush(String value, int popCount)
  public void popPush(double value, int popCount)
  public void popPush(int value, int popCount)
  public void popPush(boolean value, int popCount)
  public void popPush(String[] value, int popCount)
  public void popPush(double[] value, int popCount)
  public void popPush(boolean[] value, int popCount)
  public void popPushEmptyArray(int popCount)
  protected ExecutionContext.Operand pop()
  public double popNumber()
  public int popInt()
  public String popString()
  public boolean popBoolean()
  public double[] popNumberArray()
  public String[] popStringArray()
  public boolean[] popBooleanArray()
  public String popAsString()
  protected ExecutionContext.Operand get(int index)
  public double getNumber(int index)
  public int getInt(int index)
  public String getString(int index)
  public boolean getBoolean(int index)
  public double[] getNumberArray(int index)
  public String[] getStringArray(int index)
  public boolean[] getBooleanArray(int index)
  public static ExecutionContext.Instruction genPUSH(String value)
  public static ExecutionContext.Instruction genPUSH(double value)
  public static ExecutionContext.Instruction genPUSH(boolean value)
  public static ExecutionContext.Instruction genPUSH(String[] value)
  public static ExecutionContext.Instruction genPUSH(double[] value)
  public static ExecutionContext.Instruction genPUSH(boolean[] value)
  public static ExecutionContext.Instruction genPUSHEmptyArray()
  public static ExecutionContext.Instruction genREAD(String ident, ValueType type, Scope scope)
  public static ExecutionContext.Instruction genCALL(String ident, int numArgs, Scope scope)
  public static ExecutionContext.Instruction genNumberPACK(int size)
  public static ExecutionContext.Instruction genStringPACK(int size)
  public static ExecutionContext.Instruction genBooleanPACK(int size)
  public static ExecutionContext.Instruction genPACK(ValueType arrayType, int size)
  public String toString()

Fields:
public static final int STACK_GROW_INCREMENT
protected Scope scope
protected ExecutionContext.Operand[] operandStack
protected int stackTop
protected ValueType lastPushedType
protected String combatConfig
protected Map<String,String> interactionVars
public static final ExecutionContext.Instruction UNARY_PLUS
public static final ExecutionContext.Instruction UNARY_MINUS
public static final ExecutionContext.Instruction LOGICAL_NOT
public static final ExecutionContext.Instruction BITWISE_NOT
public static final ExecutionContext.Instruction EXPONENTIATION
public static final ExecutionContext.Instruction REMAINDER
public static final ExecutionContext.Instruction DIVIDE
public static final ExecutionContext.Instruction MULTIPLY
public static final ExecutionContext.Instruction MINUS
public static final ExecutionContext.Instruction PLUS
public static final ExecutionContext.Instruction GREATER_EQUAL
public static final ExecutionContext.Instruction GREATER
public static final ExecutionContext.Instruction LESS_EQUAL
public static final ExecutionContext.Instruction LESS
public static final ExecutionContext.Instruction NOT_EQUAL
public static final ExecutionContext.Instruction EQUAL
public static final ExecutionContext.Instruction NOT_EQUAL_BOOL
public static final ExecutionContext.Instruction EQUAL_BOOL
public static final ExecutionContext.Instruction BITWISE_AND
public static final ExecutionContext.Instruction BITWISE_XOR
public static final ExecutionContext.Instruction BITWISE_OR
public static final ExecutionContext.Instruction LOGICAL_AND
public static final ExecutionContext.Instruction LOGICAL_OR

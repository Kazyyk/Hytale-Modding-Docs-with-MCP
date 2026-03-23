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

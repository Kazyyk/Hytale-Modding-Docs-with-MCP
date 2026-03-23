# Scope

Type: interface | Package: com.hypixel.hytale.server.npc.util.expression

public interface Scope

Contract for providing named variables and functions to the expression compiler and executor. A scope supplies typed supplier accessors for all six value types (string, number, boolean, and their array variants), a function lookup, a constness check, and a type query. Default methods delegate supplier calls for convenience (e.g. `getString` calls `getStringSupplier(...).get()`).

## Abstract Methods

- Supplier<String> getStringSupplier(String name)
- DoubleSupplier getNumberSupplier(String name)
- BooleanSupplier getBooleanSupplier(String name)
- Supplier<String[]> getStringArraySupplier(String name)
- Supplier<double[]> getNumberArraySupplier(String name)
- Supplier<boolean[]> getBooleanArraySupplier(String name)
- Function getFunction(String name)
- boolean isConstant(String name)
- @Nullable ValueType getType(String name)

## Default Methods

- String getString(String name)
- double getNumber(String name)
- boolean getBoolean(String name)
- String[] getStringArray(String name)
- double[] getNumberArray(String name)
- boolean[] getBooleanArray(String name)

## Static Methods

- @Nonnull static String encodeFunctionName(@Nonnull String name, @Nonnull ValueType[] values)
- static char encodeType(@Nonnull ValueType type)

`encodeFunctionName` produces a mangled key like `max@nn` for overload resolution. Each ValueType maps to a single character (`n`, `s`, `b`, `N`, `S`, `B`).

## Inner Types

### Function (functional interface)


@FunctionalInterface
public interface Function {
    void call(ExecutionContext context, int numArgs);
}

A callable expression function. Receives the ExecutionContext (with arguments on the stack) and the argument count.

## Related Types

- StdScope -- symbol-table implementation of this interface
- StdLib -- singleton standard library scope
- ExecutionContext -- the VM that reads from scopes

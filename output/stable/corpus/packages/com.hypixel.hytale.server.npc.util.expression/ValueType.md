# ValueType

Type: enum | Package: com.hypixel.hytale.server.npc.util.expression

public enum ValueType

Discriminant for the eight value types supported by the expression system. Used throughout the compiler, executor, and scope implementations to track operand types, validate assignments, and select instruction variants.

## Enum Constants

- VOID: No value / uninitialized.
- NUMBER: double` scalar.
- STRING: String` scalar.
- BOOLEAN: boolean` scalar.
- EMPTY_ARRAY: Empty array literal (`[]`), assignable to any typed array.
- NUMBER_ARRAY: double[]` array.
- STRING_ARRAY: String[]` array.
- BOOLEAN_ARRAY: boolean[]` array.

## Static Methods

- public static boolean isAssignableType(@Nullable ValueType from, @Nullable ValueType to)
- public static boolean isTypedArray(ValueType valueType)

`isAssignableType` returns true when `from` can be assigned to `to`. Both must be non-null and non-VOID, and either equal, or `from` is `EMPTY_ARRAY` and `to` is a typed array. `isTypedArray` returns true for `BOOLEAN_ARRAY`, `NUMBER_ARRAY`, and `STRING_ARRAY`.

## Related Types

- ExecutionContext -- uses this to track stack operand types
- Scope -- uses this for type queries
- StdScope -- symbols carry a `ValueType`

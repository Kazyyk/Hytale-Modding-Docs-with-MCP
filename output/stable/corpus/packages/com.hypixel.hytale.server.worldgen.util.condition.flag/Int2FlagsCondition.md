# Int2FlagsCondition

Type: interface | Package: com.hypixel.hytale.server.worldgen.util.condition.flag | Implements: IntUnaryOperator

@FunctionalInterface public interface Int2FlagsCondition extends IntUnaryOperator

## Methods

- int eval(int var1)
- @Override default int applyAsInt(int operand)

Known implementors: CompositeInt2Flags, ConstantInt2Flags

Also in this package: CompositeInt2Flags, ConstantInt2Flags, FlagCondition, FlagOperator

Complete API:
  int eval(int var1)
  default int applyAsInt(int operand)

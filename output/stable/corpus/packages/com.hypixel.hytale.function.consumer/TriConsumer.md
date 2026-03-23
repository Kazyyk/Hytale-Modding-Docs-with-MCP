# TriConsumer

Type: interface | Package: com.hypixel.hytale.function.consumer

@FunctionalInterface
public interface TriConsumer<T, U, R>

Functional interface defining `accept` that returns `void`.

## Abstract Methods

- accept | void | T var1, U var2, R var3

Known implementors: ThrowableTriConsumer

Also in this package: BooleanConsumer, DoubleQuadObjectConsumer, FloatConsumer, IntBiObjectConsumer, IntObjectConsumer, IntTriObjectConsumer, QuadConsumer, ShortObjectConsumer, TriIntConsumer

Complete API:
  void accept(T var1, U var2, R var3)

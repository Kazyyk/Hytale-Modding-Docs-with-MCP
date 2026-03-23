# ThrowableIntSupplier

Type: interface | Package: com.hypixel.hytale.sneakythrow.supplier | Extends: IntSupplier | Implements: IntSupplier

@FunctionalInterface
public interface ThrowableIntSupplier<E extends Throwable> extends IntSupplier

Functional interface defining `getAsIntNow` that returns `int`.

## Abstract Methods

- getAsIntNow | int

Also in this package: ThrowableSupplier

Complete API:
  default int getAsInt()
  int getAsIntNow()

# CachedSupplier

Type: class | Package: com.hypixel.hytale.function.supplier | Implements: Supplier

public class CachedSupplier<T> implements Supplier<T>

Utility for supplying values with caching or special behavior.

## Accessors

- get() | T | Accessor method.
- getValue() | T | Accessor method.

## Methods

- invalidate() | void | Instance method.

Also in this package: SupplierUtil

Complete API:
  public T get()
  public T getValue()
  public void invalidate()

Fields:
private final Supplier<T> delegate
private transient volatile boolean initialized
private transient T value

# IntConditionBuilder

Type: class | Package: com.hypixel.hytale.server.worldgen.util.condition | Implements: IntConsumer

public class IntConditionBuilder implements IntConsumer

Implements `IntConsumer` to provide IntConditionBuilder functionality.

## Fields

- private final Supplier<IntSet> setSupplier
- private final int nullValue
- private int first
- @Nullable private IntSet set

## Methods

- public IntConditionBuilder(Supplier<IntSet> setSupplier, int nullValue)
- public void accept(int value)
- public boolean add(int value)
- public IIntCondition buildOrDefault(IIntCondition defaultCondition)

# ValueStoreValidator

Type: class | Package: com.hypixel.hytale.server.npc.valuestore

public class ValueStoreValidator

Provides ValueStoreValidator functionality within the valuestore subsystem.

## Fields

- private final EnumMap<ValueStore.Type, HashMap<String, List<ValueStoreValidator.ValueUsage>>> usages

## Methods

- public void registerValueUsage(@Nonnull ValueStoreValidator.ValueUsage usage)
- public boolean validate(@Nonnull List<String> errors)
- private boolean validateType(@Nonnull ValueStore.Type type, @Nonnull List<String> errors)

Also in this package: Builder, Type, UseType, ValueStore, ValueUsage

Complete API:
  public void registerValueUsage(ValueStoreValidator.ValueUsage usage)
  public boolean validate(List<String> errors)
  private boolean validateType(ValueStore.Type type, List<String> errors)

Fields:
private final EnumMap<ValueStore.Type,HashMap<String,List<ValueStoreValidator.ValueUsage>>> usages

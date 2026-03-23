# ParameterStore

Type: abstract class | Package: com.hypixel.hytale.server.npc.storage

public abstract class ParameterStore<Type extends PersistentParameter<?>>

Abstract base type in the ParameterStore hierarchy.

## Accessors

- get(Entity owner, String name) | Type | Accessor method.

## Methods

- createParameter() | abstract Type | Instance method.

Known subclasses: AlarmStore

Also in this package: AlarmStore, PersistentParameter

Complete API:
  public Type get(Entity owner, String name)
  protected abstract Type createParameter()

Fields:
protected Map<String,Type> parameters

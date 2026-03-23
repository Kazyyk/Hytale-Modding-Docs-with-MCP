# PersistentParameter

Type: abstract class | Package: com.hypixel.hytale.server.npc.storage

public abstract class PersistentParameter<Type>

Abstract base type in the PersistentParameter hierarchy.

## Accessors

- set(Ref<EntityStore> ownerRef, Type value, ComponentAccessor<EntityStore> componentAccessor) | void | Mutator method.
- set0(Type var1) | abstract void | Mutator method.

Known subclasses: Alarm

Also in this package: AlarmStore, ParameterStore

Complete API:
  public void set(Ref<EntityStore> ownerRef, Type value, ComponentAccessor<EntityStore> componentAccessor)
  protected abstract void set0(Type var1)

# PersistentRefCount

Type: class | Package: com.hypixel.hytale.server.core.entity.reference | Implements: Component

public class PersistentRefCount implements Component

## Fields

- public static final BuilderCodec<PersistentRefCount> CODEC
- private int refCount

## Methods

- public static ComponentType<EntityStore,PersistentRefCount> getComponentType()
- public int get()
- public void increment()
- @Nonnull @Override public Component<EntityStore> clone()

Also in this package: InvalidatablePersistentRef, PersistentRef

Complete API:
  public static ComponentType<EntityStore,PersistentRefCount> getComponentType()
  public int get()
  public void increment()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<PersistentRefCount> CODEC
private int refCount

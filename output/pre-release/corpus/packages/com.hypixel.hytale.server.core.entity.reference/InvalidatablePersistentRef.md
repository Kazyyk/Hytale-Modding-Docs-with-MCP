# InvalidatablePersistentRef

Type: class | Package: com.hypixel.hytale.server.core.entity.reference | Extends: PersistentRef

public class InvalidatablePersistentRef extends PersistentRef

## Fields

- public static final BuilderCodec<InvalidatablePersistentRef> CODEC
- protected int refCount

## Methods

- @Override public void setEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- @Override public void clear()
- public void setRefCount(int refCount)
- public int getRefCount()
- @Override protected boolean validateEntityReference(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

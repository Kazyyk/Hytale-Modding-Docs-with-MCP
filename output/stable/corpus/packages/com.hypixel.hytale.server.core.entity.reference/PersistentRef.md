# PersistentRef

Type: class | Package: com.hypixel.hytale.server.core.entity.reference

public class PersistentRef

## Fields

- public static final BuilderCodec<PersistentRef> CODEC
- protected UUID uuid
- protected Ref<EntityStore> reference

## Methods

- @Nullable public UUID getUuid()
- public void setUuid(UUID uuid)
- public void setEntity(Ref<EntityStore> ref, UUID uuid)
- public void setEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- public void clear()
- public boolean isValid()
- @Nullable public Ref<EntityStore> getEntity(ComponentAccessor<EntityStore> componentAccessor)
- protected boolean validateEntityReference(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

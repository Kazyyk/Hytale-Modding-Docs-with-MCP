# EntityEventSupport

Type: class | Package: com.hypixel.hytale.server.npc.components.messaging | Extends: EventSupport<EntityEventType, EntityEventNotification>

public abstract class EntityEventSupport extends EventSupport<EntityEventType, EntityEventNotification>

## Methods

- public void postMessage(EntityEventType type, @Nonnull EntityEventNotification notification, @Nonnull Ref<EntityStore> parent, @Nonnull Store<EntityStore> store)
- public boolean hasFlockMatchingMessage(int messageIndex, @Nonnull Vector3d parentPosition, double range, boolean flockOnly)

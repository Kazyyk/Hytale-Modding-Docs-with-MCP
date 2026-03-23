# EntityEventSupport

Type: class | Package: com.hypixel.hytale.server.npc.components.messaging | Extends: EventSupport<EntityEventType, EntityEventNotification>

public abstract class EntityEventSupport extends EventSupport<EntityEventType, EntityEventNotification>

## Methods

- public void postMessage(EntityEventType type, @Nonnull EntityEventNotification notification, @Nonnull Ref<EntityStore> parent, @Nonnull Store<EntityStore> store)
- public boolean hasFlockMatchingMessage(int messageIndex, @Nonnull Vector3d parentPosition, double range, boolean flockOnly)

Known subclasses: NPCEntityEventSupport, PlayerEntityEventSupport

Also in this package: BeaconSupport, EventMessage, EventSupport, MessageSupport, NPCBlockEventSupport, NPCEntityEventSupport, NPCMessage, PlayerBlockEventSupport, PlayerEntityEventSupport

Complete API:
  public void postMessage(EntityEventType type, EntityEventNotification notification, Ref<EntityStore> parent, Store<EntityStore> store)
  public boolean hasFlockMatchingMessage(int messageIndex, Vector3d parentPosition, double range, boolean flockOnly)

# EventSupport

Type: class | Package: com.hypixel.hytale.server.npc.components.messaging | Extends: Enum<EventType>, NotificationType extends EventNotification> extends MessageSupport

public abstract class EventSupport<EventType extends Enum<EventType>, NotificationType extends EventNotification> extends MessageSupport

## Fields

- protected static final double EVENT_AGE
- protected EventMessage[] messageSlots
- protected Map<EventType, Int2IntMap> messageIndices

## Methods

- public void postMessage(EventType type, @Nonnull NotificationType notification, @Nonnull Ref<EntityStore> parent, @Nonnull Store<EntityStore> store)
- @Nullable public EventMessage getMessageSlot(EventType type, @Nonnull NotificationType notification)
- public boolean hasMatchingMessage(int messageIndex, @Nonnull Vector3d parentPosition, double range)
- @Nullable public Ref<EntityStore> pollMessage(int messageIndex)
- public void initialise(Map<EventType, Int2IntMap> setIndices, @Nonnull Int2DoubleMap messageRanges, int count)
- public void cloneTo(@Nonnull EventSupport<EventType, NotificationType> other)
- @Override public NPCMessage[] getMessageSlots()

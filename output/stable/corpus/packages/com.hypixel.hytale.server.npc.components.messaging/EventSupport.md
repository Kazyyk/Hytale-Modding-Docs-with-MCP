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

Known subclasses: EntityEventSupport, NPCBlockEventSupport, PlayerBlockEventSupport

Also in this package: BeaconSupport, EntityEventSupport, EventMessage, MessageSupport, NPCBlockEventSupport, NPCEntityEventSupport, NPCMessage, PlayerBlockEventSupport, PlayerEntityEventSupport

Complete API:
  public void postMessage(EventType type, NotificationType notification, Ref<EntityStore> parent, Store<EntityStore> store)
  public EventMessage getMessageSlot(EventType type, NotificationType notification)
  public boolean hasMatchingMessage(int messageIndex, Vector3d parentPosition, double range)
  public Ref<EntityStore> pollMessage(int messageIndex)
  public void initialise(Map<EventType,Int2IntMap> setIndices, Int2DoubleMap messageRanges, int count)
  public void cloneTo(EventSupport<EventType,NotificationType> other)
  public NPCMessage[] getMessageSlots()

Fields:
protected static final double EVENT_AGE
protected EventMessage[] messageSlots
protected Map<EventType,Int2IntMap> messageIndices

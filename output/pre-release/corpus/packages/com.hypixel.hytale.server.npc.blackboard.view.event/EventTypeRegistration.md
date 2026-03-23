# EventTypeRegistration

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.event | Extends: Enum<EventType>, NotificationType extends EventNotification>

public class EventTypeRegistration<EventType extends Enum<EventType>, NotificationType extends EventNotification>

Concrete implementation extending `Enum<EventType>, NotificationType extends EventNotification>`.

## Fields

- type | EventType | final EventType field.
- setTester | BiIntPredicate | final BiIntPredicate field.
- eventCallback | IEventCallback<EventType, NotificationType> | final IEventCallback<EventType, NotificationType> field.

## Constructors

- EventTypeRegistration(EventType type, BiIntPredicate setTester, IEventCallback<EventType, NotificationType> eventCallback) | Creates a new EventTypeRegistration instance.

## Methods

- initialiseEntity(Ref<EntityStore> ref, @Nonnull IntSet changeSets) | void | public method.
- getSetCount() | int | public method.
- forEach(@Nonnull IntObjectConsumer<EventType> setConsumer, @Nonnull Consumer<Ref<EntityStore>> npcConsumer) | void | public method.
- cleanup() | void | public method.

Also in this package: EntityEventNotification, EventNotification, EventView, IEventCallback

Complete API:
  public void initialiseEntity(Ref<EntityStore> ref, IntSet changeSets)
  public void relayEvent(int senderTypeId, NotificationType reusableEventNotification, Ref<EntityStore> skipEntityReference, ComponentAccessor<EntityStore> componentAccessor)
  public int getSetCount()
  public void forEach(IntObjectConsumer<EventType> setConsumer, Consumer<Ref<EntityStore>> npcConsumer)
  public void cleanup()

Fields:
private static final ComponentType<EntityStore,NPCEntity> NPC_COMPONENT_TYPE
private final EventType type
private final BitSet eventSets
private final Int2ObjectMap<List<Ref<EntityStore>>> entitiesBySet
private final BiIntPredicate setTester
private final IEventCallback<EventType,NotificationType> eventCallback

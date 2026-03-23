# EventView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.event | Extends: IBlackboardView<ViewType>, EventType extends Enum<EventType>, NotificationType extends EventNotification> | Implements: IBlackboardView<ViewType>

public abstract class EventView<ViewType extends IBlackboardView<ViewType>, EventType extends Enum<EventType>, NotificationType extends EventNotification> implements IBlackboardView<ViewType>

Class in the event subsystem.

## Fields

- entityMapsByEventType | Map<EventType, EventTypeRegistration<EventType, NotificationType>> | final Map<EventType, EventTypeRegistration<EventType, NotificationType>> field.
- world | World | final World field.
- eventTypes | EventType[] | final EventType[] field.
- eventRegistry | EventRegistry | EventRegistry field.
- entityStoreRegistry | ComponentRegistryProxy<EntityStore> | ComponentRegistryProxy<EntityStore> field.
- shutdown | boolean | boolean field.
- reusableEventNotification | NotificationType | final NotificationType field.

## Constructors

- EventView(Class<EventType> type, EventType[] eventTypes, NotificationType reusableEventNotification, @Nonnull World world) | Creates a new EventView instance.

## Methods

- isOutdated(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store) | boolean | public method.
- onWorldRemoved() | void | public method.
- cleanup() | void | public method.
- getSetCount() | int | public method.
- forEach(@Nonnull IntObjectConsumer<EventType> setConsumer, @Nonnull Consumer<Ref<EntityStore>> npcConsumer) | void | public method.

Known subclasses: BlockEventView, EntityEventView

Also in this package: EntityEventNotification, EventNotification, EventTypeRegistration, IEventCallback

Complete API:
  public boolean isOutdated(Ref<EntityStore> ref, Store<EntityStore> store)
  public void onWorldRemoved()
  public void cleanup()
  public int getSetCount()
  public void forEach(IntObjectConsumer<EventType> setConsumer, Consumer<Ref<EntityStore>> npcConsumer)
  protected void onEvent(int senderTypeId, double x, double y, double z, Ref<EntityStore> initiator, Ref<EntityStore> skip, ComponentAccessor<EntityStore> componentAccessor, EventType type)

Fields:
protected final Map<EventType,EventTypeRegistration<EventType,NotificationType>> entityMapsByEventType
protected final World world
protected final EventType[] eventTypes
protected EventRegistry eventRegistry
protected ComponentRegistryProxy<EntityStore> entityStoreRegistry
protected boolean shutdown
protected final NotificationType reusableEventNotification

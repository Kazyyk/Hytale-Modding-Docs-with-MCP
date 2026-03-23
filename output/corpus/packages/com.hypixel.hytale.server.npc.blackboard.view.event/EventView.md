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

# EventRegistration

Type: class | Package: com.hypixel.hytale.event | Extends: Registration

public class EventRegistration extends Registration

Handle returned when registering an event listener. Provides `unregister()` and `isEnabled()` lifecycle. Supports combining multiple registrations into a single handle via `combine()`.

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  public Class<EventType> getEventClass()
  public String toString()
  public static EventRegistration<KeyType,EventType> combine(EventRegistration<KeyType,EventType> thisRegistration, EventRegistration<KeyType,EventType> containerRegistrations)

Fields:
protected final Class<EventType> eventClass

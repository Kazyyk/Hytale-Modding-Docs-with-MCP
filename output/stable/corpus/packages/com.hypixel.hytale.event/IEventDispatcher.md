# IEventDispatcher

Type: interface | Package: com.hypixel.hytale.event

public interface IEventDispatcher

Dispatches events to registered listeners. Provides `hasListener()` to check if any listeners are registered, and `dispatch(EventType)` to fire events.

Known implementors: EventConsumerMap

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  default boolean hasListener()
  ReturnType dispatch(EventType var1)

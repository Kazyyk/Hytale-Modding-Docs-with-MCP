# IEventBus

Type: interface | Package: com.hypixel.hytale.event | Implements: IEventRegistry

public interface IEventBus implements IEventRegistry

Combined event bus interface providing both registration (`IEventRegistry`) and dispatch (`dispatchFor`, `dispatchForAsync`) capabilities.

Known implementors: EventBus

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  default EventType dispatch(Class<EventType> eventClass)
  default CompletableFuture<EventType> dispatchAsync(Class<EventType> eventClass)
  default IEventDispatcher<EventType,EventType> dispatchFor(Class<? super EventType> eventClass)
  IEventDispatcher<EventType,EventType> dispatchFor(Class<? super EventType> var1, KeyType var2)
  default IEventDispatcher<EventType,CompletableFuture<EventType>> dispatchForAsync(Class<? super EventType> eventClass)
  IEventDispatcher<EventType,CompletableFuture<EventType>> dispatchForAsync(Class<? super EventType> var1, KeyType var2)

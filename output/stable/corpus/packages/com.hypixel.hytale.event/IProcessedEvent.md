# IProcessedEvent

Type: interface | Package: com.hypixel.hytale.event

public interface IProcessedEvent

Interface for events that track which listeners have processed them via `processEvent(String consumerString)`.

Known implementors: ChunkPreLoadProcessEvent, GenerateAssetsEvent

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IEventRegistry, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  void processEvent(String var1)

# ICancellable

Type: interface | Package: com.hypixel.hytale.event

public interface ICancellable

Interface for events that can be cancelled. Provides `isCancelled()` and `setCancelled(boolean)`.

Known implementors: AddWorldEvent, PlayerChatEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerSetupConnectEvent, RemoveWorldEvent

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, IEvent, IEventBus, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  boolean isCancelled()
  void setCancelled(boolean var1)

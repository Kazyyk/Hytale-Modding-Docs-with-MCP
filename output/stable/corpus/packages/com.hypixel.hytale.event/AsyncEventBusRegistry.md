# AsyncEventBusRegistry

Type: class | Package: com.hypixel.hytale.event | Extends: EventBusRegistry<KeyType, EventType, AsyncEventBusRegistry.AsyncEventConsumerMap<EventType>>

public class AsyncEventBusRegistry extends EventBusRegistry<KeyType, EventType, AsyncEventBusRegistry.AsyncEventConsumerMap<EventType>>

Registry for async events that dispatches via `CompletableFuture` chains. Supports keyed, global, and unhandled async listener registration with priority ordering and timing instrumentation.

Also in this package: AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  public EventRegistration<KeyType,EventType> registerAsync(short priority, KeyType key, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  private EventRegistration<KeyType,EventType> registerAsync0(short priority, KeyType key, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function, String consumerString)
  private void unregister(KeyType key, AsyncEventBusRegistry.AsyncEventConsumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerAsyncGlobal(short priority, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  private EventRegistration<KeyType,EventType> registerAsyncGlobal0(short priority, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function, String consumerString)
  private void unregisterGlobal(AsyncEventBusRegistry.AsyncEventConsumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerAsyncUnhandled(short priority, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  private EventRegistration<KeyType,EventType> registerAsyncUnhandled0(short priority, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function, String consumerString)
  private void unregisterUnhandled(AsyncEventBusRegistry.AsyncEventConsumer<EventType> consumer)
  private CompletableFuture<EventType> dispatchGlobal(CompletableFuture<EventType> future)
  private CompletableFuture<EventType> dispatchUnhandled(CompletableFuture<EventType> future)
  private CompletableFuture<EventType> dispatchEventMap(CompletableFuture<EventType> future, AsyncEventBusRegistry.AsyncEventConsumerMap<EventType> eventMap, String s)
  public EventRegistration<KeyType,EventType> register(short priority, KeyType key, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerGlobal(short priority, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerUnhandled(short priority, Consumer<EventType> consumer)
  public IEventDispatcher<EventType,CompletableFuture<EventType>> dispatchFor(KeyType key)

Fields:
public static final IEventDispatcher NO_OP
private final IEventDispatcher<EventType,CompletableFuture<EventType>> globalDispatcher

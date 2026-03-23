# EventRegistry

Type: class | Package: com.hypixel.hytale.event | Extends: Registry<EventRegistration<?, ?>> | Implements: IEventRegistry

public class EventRegistry extends Registry<EventRegistration<?, ?>> implements IEventRegistry

Scoped event registration wrapper that delegates to a parent `IEventRegistry` while managing its own registration lifecycle and precondition checks.

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  private IEventRegistry getParent()
  public EventRegistration<KeyType,EventType> register(EventRegistration<KeyType,EventType> evt)
  public EventRegistration<Void,EventType> register(Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<Void,EventType> register(EventPriority priority, Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<Void,EventType> register(short priority, Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> register(Class<? super EventType> eventClass, KeyType key, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> register(EventPriority priority, Class<? super EventType> eventClass, KeyType key, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> register(short priority, Class<? super EventType> eventClass, KeyType key, Consumer<EventType> consumer)
  public EventRegistration<Void,EventType> registerAsync(Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<Void,EventType> registerAsync(EventPriority priority, Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<Void,EventType> registerAsync(short priority, Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerAsync(Class<? super EventType> eventClass, KeyType key, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerAsync(EventPriority priority, Class<? super EventType> eventClass, KeyType key, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerAsync(short priority, Class<? super EventType> eventClass, KeyType key, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerGlobal(Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerGlobal(EventPriority priority, Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerGlobal(short priority, Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerAsyncGlobal(Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerAsyncGlobal(EventPriority priority, Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerAsyncGlobal(short priority, Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerUnhandled(Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerUnhandled(EventPriority priority, Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerUnhandled(short priority, Class<? super EventType> eventClass, Consumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerAsyncUnhandled(Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerAsyncUnhandled(EventPriority priority, Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)
  public EventRegistration<KeyType,EventType> registerAsyncUnhandled(short priority, Class<? super EventType> eventClass, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> function)

Fields:
private final IEventRegistry parent

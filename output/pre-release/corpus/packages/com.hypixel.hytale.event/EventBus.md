# EventBus

Type: class | Package: com.hypixel.hytale.event | Implements: IEventBus

public class EventBus implements IEventBus

Central event bus that manages sync and async event registries. Routes registrations and dispatches to the appropriate `SyncEventBusRegistry` or `AsyncEventBusRegistry` based on event type. Supports keyed, global, and unhandled listeners with priority.

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  public void shutdown()
  public Set<Class<? extends IBaseEvent<?>>> getRegisteredEventClasses()
  public Set<String> getRegisteredEventClassNames()
  public EventBusRegistry<?,?,?> getRegistry(String eventName)
  public EventBusRegistry<KeyType,EventType,?> getRegistry(Class<? super EventType> eventClass)
  public EventBusRegistry<KeyType,EventType,?> getSyncRegistry(Class<? super EventType> eventClass)
  private AsyncEventBusRegistry<KeyType,EventType> getAsyncRegistry(Class<? super EventType> eventClass)
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
  public IEventDispatcher<EventType,EventType> dispatchFor(Class<? super EventType> eventClass, KeyType key)
  public IEventDispatcher<EventType,CompletableFuture<EventType>> dispatchForAsync(Class<? super EventType> eventClass, KeyType key)

Fields:
private static final HytaleLogger LOGGER
private final Map<Class<? extends IBaseEvent<?>>,EventBusRegistry<?,?,?>> registryMap
private final boolean timeEvents

# IEventRegistry

Type: interface | Package: com.hypixel.hytale.event

public interface IEventRegistry

Interface defining all event registration methods: sync/async, keyed/global/unhandled, with priority overloads.

Known implementors: EventRegistry, IEventBus

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  EventRegistration<Void,EventType> register(Class<? super EventType> var1, Consumer<EventType> var2)
  EventRegistration<Void,EventType> register(EventPriority var1, Class<? super EventType> var2, Consumer<EventType> var3)
  EventRegistration<Void,EventType> register(short var1, Class<? super EventType> var2, Consumer<EventType> var3)
  EventRegistration<KeyType,EventType> register(Class<? super EventType> var1, KeyType var2, Consumer<EventType> var3)
  EventRegistration<KeyType,EventType> register(EventPriority var1, Class<? super EventType> var2, KeyType var3, Consumer<EventType> var4)
  EventRegistration<KeyType,EventType> register(short var1, Class<? super EventType> var2, KeyType var3, Consumer<EventType> var4)
  EventRegistration<Void,EventType> registerAsync(Class<? super EventType> var1, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var2)
  EventRegistration<Void,EventType> registerAsync(EventPriority var1, Class<? super EventType> var2, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var3)
  EventRegistration<Void,EventType> registerAsync(short var1, Class<? super EventType> var2, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var3)
  EventRegistration<KeyType,EventType> registerAsync(Class<? super EventType> var1, KeyType var2, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var3)
  EventRegistration<KeyType,EventType> registerAsync(EventPriority var1, Class<? super EventType> var2, KeyType var3, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var4)
  EventRegistration<KeyType,EventType> registerAsync(short var1, Class<? super EventType> var2, KeyType var3, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var4)
  EventRegistration<KeyType,EventType> registerGlobal(Class<? super EventType> var1, Consumer<EventType> var2)
  EventRegistration<KeyType,EventType> registerGlobal(EventPriority var1, Class<? super EventType> var2, Consumer<EventType> var3)
  EventRegistration<KeyType,EventType> registerGlobal(short var1, Class<? super EventType> var2, Consumer<EventType> var3)
  EventRegistration<KeyType,EventType> registerAsyncGlobal(Class<? super EventType> var1, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var2)
  EventRegistration<KeyType,EventType> registerAsyncGlobal(EventPriority var1, Class<? super EventType> var2, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var3)
  EventRegistration<KeyType,EventType> registerAsyncGlobal(short var1, Class<? super EventType> var2, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var3)
  EventRegistration<KeyType,EventType> registerUnhandled(Class<? super EventType> var1, Consumer<EventType> var2)
  EventRegistration<KeyType,EventType> registerUnhandled(EventPriority var1, Class<? super EventType> var2, Consumer<EventType> var3)
  EventRegistration<KeyType,EventType> registerUnhandled(short var1, Class<? super EventType> var2, Consumer<EventType> var3)
  EventRegistration<KeyType,EventType> registerAsyncUnhandled(Class<? super EventType> var1, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var2)
  EventRegistration<KeyType,EventType> registerAsyncUnhandled(EventPriority var1, Class<? super EventType> var2, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var3)
  EventRegistration<KeyType,EventType> registerAsyncUnhandled(short var1, Class<? super EventType> var2, Function<CompletableFuture<EventType>,CompletableFuture<EventType>> var3)

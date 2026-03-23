# SyncEventBusRegistry

Type: class | Package: com.hypixel.hytale.event | Extends: EventBusRegistry<KeyType, EventType, SyncEventBusRegistry.SyncEventConsumerMap<EventType>>

public class SyncEventBusRegistry extends EventBusRegistry<KeyType, EventType, SyncEventBusRegistry.SyncEventConsumerMap<EventType>>

Registry for synchronous events that dispatches directly to consumers. Supports keyed, global, and unhandled listener registration with priority ordering and timing instrumentation.

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventBusRegistry, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  public EventRegistration<KeyType,EventType> register(short priority, KeyType key, Consumer<EventType> consumer)
  private void unregister(KeyType key, SyncEventBusRegistry.SyncEventConsumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerGlobal(short priority, Consumer<EventType> consumer)
  private void unregisterGlobal(SyncEventBusRegistry.SyncEventConsumer<EventType> consumer)
  public EventRegistration<KeyType,EventType> registerUnhandled(short priority, Consumer<EventType> consumer)
  private void unregisterUnhandled(SyncEventBusRegistry.SyncEventConsumer<EventType> consumer)
  public IEventDispatcher<EventType,EventType> dispatchFor(KeyType key)
  private boolean dispatchGlobal(EventType event)
  private boolean dispatchUnhandled(EventType event)
  private boolean dispatchEventMap(EventType event, SyncEventBusRegistry.SyncEventConsumerMap<EventType> eventMap, String s)

Fields:
public static final IEventDispatcher NO_OP
private final IEventDispatcher<EventType,EventType> globalDispatcher

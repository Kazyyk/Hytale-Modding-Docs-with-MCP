# EventBusRegistry

Type: class | Package: com.hypixel.hytale.event

public class EventBusRegistry

Abstract base for keyed event bus registries. Manages priority-sorted consumer maps, global and unhandled listener channels, and lifecycle (shutdown). Contains inner abstract classes `EventConsumer` (priority + timer) and `EventConsumerMap` (concurrent priority-keyed consumer storage implementing `IEventDispatcher`).

Known subclasses: AsyncEventBusRegistry, SyncEventBusRegistry

Also in this package: AsyncEventBusRegistry, AsyncEventConsumer, AsyncEventConsumerMap, EventBus, EventConsumer, EventConsumerMap, EventPriority, EventRegistration, EventRegistry, IAsyncEvent, IBaseEvent, ICancellable, IEvent, IEventBus, IEventDispatcher, IEventRegistry, IProcessedEvent, SyncEventBusRegistry, SyncEventConsumer, SyncEventConsumerMap

Complete API:
  public Class<EventType> getEventClass()
  public boolean isTimeEvents()
  public void setTimeEvents(boolean timeEvents)
  public void shutdown()
  public boolean isAlive()
  public abstract EventRegistration<KeyType,EventType> register(short var1, KeyType var2, Consumer<EventType> var3)
  public abstract EventRegistration<KeyType,EventType> registerGlobal(short var1, Consumer<EventType> var2)
  public abstract EventRegistration<KeyType,EventType> registerUnhandled(short var1, Consumer<EventType> var2)
  public abstract IEventDispatcher<EventType,?> dispatchFor(KeyType var1)

Fields:
protected static final Object NULL
protected final HytaleLogger logger
protected final Class<EventType> eventClass
protected final Map<KeyType,ConsumerMapType> map
protected final ConsumerMapType global
protected final ConsumerMapType unhandled
protected boolean timeEvents
protected boolean shutdown

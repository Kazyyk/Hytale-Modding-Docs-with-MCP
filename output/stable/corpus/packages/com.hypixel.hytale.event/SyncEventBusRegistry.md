# SyncEventBusRegistry

Type: class | Package: com.hypixel.hytale.event | Extends: EventBusRegistry<KeyType, EventType, SyncEventBusRegistry.SyncEventConsumerMap<EventType>>

public class SyncEventBusRegistry extends EventBusRegistry<KeyType, EventType, SyncEventBusRegistry.SyncEventConsumerMap<EventType>>

Registry for synchronous events that dispatches directly to consumers. Supports keyed, global, and unhandled listener registration with priority ordering and timing instrumentation.

# AsyncEventBusRegistry

Type: class | Package: com.hypixel.hytale.event | Extends: EventBusRegistry<KeyType, EventType, AsyncEventBusRegistry.AsyncEventConsumerMap<EventType>>

public class AsyncEventBusRegistry extends EventBusRegistry<KeyType, EventType, AsyncEventBusRegistry.AsyncEventConsumerMap<EventType>>

Registry for async events that dispatches via `CompletableFuture` chains. Supports keyed, global, and unhandled async listener registration with priority ordering and timing instrumentation.

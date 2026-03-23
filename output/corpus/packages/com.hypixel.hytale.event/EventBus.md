# EventBus

Type: class | Package: com.hypixel.hytale.event | Implements: IEventBus

public class EventBus implements IEventBus

Central event bus that manages sync and async event registries. Routes registrations and dispatches to the appropriate `SyncEventBusRegistry` or `AsyncEventBusRegistry` based on event type. Supports keyed, global, and unhandled listeners with priority.

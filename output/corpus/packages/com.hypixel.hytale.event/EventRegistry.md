# EventRegistry

Type: class | Package: com.hypixel.hytale.event | Extends: Registry<EventRegistration<?, ?>> | Implements: IEventRegistry

public class EventRegistry extends Registry<EventRegistration<?, ?>> implements IEventRegistry

Scoped event registration wrapper that delegates to a parent `IEventRegistry` while managing its own registration lifecycle and precondition checks.

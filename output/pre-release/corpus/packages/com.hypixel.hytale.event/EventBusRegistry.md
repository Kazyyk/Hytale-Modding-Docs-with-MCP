# EventBusRegistry

Type: class | Package: com.hypixel.hytale.event

public class EventBusRegistry

Abstract base for keyed event bus registries. Manages priority-sorted consumer maps, global and unhandled listener channels, and lifecycle (shutdown). Contains inner abstract classes `EventConsumer` (priority + timer) and `EventConsumerMap` (concurrent priority-keyed consumer storage implementing `IEventDispatcher`).

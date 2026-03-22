---
title: "com.hypixel.hytale.event"
kind: "package"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

Core event system providing synchronous and asynchronous event dispatch with priority-based listener ordering, keyed routing, and lifecycle management.

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [AsyncEventBusRegistry](AsyncEventBusRegistry.md) | class | public | Registry for async events that dispatches via `CompletableFuture` chains. Suppor... |
| [EventBus](EventBus.md) | class | public | Central event bus that manages sync and async event registries. Routes registrat... |
| [EventBusRegistry](EventBusRegistry.md) | class | public | Abstract base for keyed event bus registries. Manages priority-sorted consumer m... |
| [EventPriority](EventPriority.md) | enum | public | Event listener priority levels: `FIRST` (-21844), `EARLY` (-10922), `NORMAL` (0)... |
| [EventRegistration](EventRegistration.md) | class | public | Handle returned when registering an event listener. Provides `unregister()` and ... |
| [EventRegistry](EventRegistry.md) | class | public | Scoped event registration wrapper that delegates to a parent `IEventRegistry` wh... |
| [IAsyncEvent](IAsyncEvent.md) | interface | public | Marker interface for asynchronous events dispatched via `CompletableFuture`. |
| [IBaseEvent](IBaseEvent.md) | interface | public | Root marker interface for all events, parameterized by key type. |
| [ICancellable](ICancellable.md) | interface | public | Interface for events that can be cancelled. Provides `isCancelled()` and `setCan... |
| [IEvent](IEvent.md) | interface | public | Marker interface for synchronous events. |
| [IEventBus](IEventBus.md) | interface | public | Combined event bus interface providing both registration (`IEventRegistry`) and ... |
| [IEventDispatcher](IEventDispatcher.md) | interface | public | Dispatches events to registered listeners. Provides `hasListener()` to check if ... |
| [IEventRegistry](IEventRegistry.md) | interface | public | Interface defining all event registration methods: sync/async, keyed/global/unha... |
| [IProcessedEvent](IProcessedEvent.md) | interface | public | Interface for events that track which listeners have processed them via `process... |
| [SyncEventBusRegistry](SyncEventBusRegistry.md) | class | public | Registry for synchronous events that dispatches directly to consumers. Supports ... |

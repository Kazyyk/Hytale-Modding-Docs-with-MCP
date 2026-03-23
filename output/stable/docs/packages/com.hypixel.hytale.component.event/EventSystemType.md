---
title: "EventSystemType"
kind: "abstract class"
package: "com.hypixel.hytale.component.event"
fqcn: "com.hypixel.hytale.component.event.EventSystemType"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "component"
  - "event"
---

**Package:** `com.hypixel.hytale.component.event`

```java
public abstract class EventSystemType<ECS_TYPE, Event extends EcsEvent, SYSTEM_TYPE extends EventSystem<Event> & ISystem<ECS_TYPE>>
```

ECS event dispatched through the entity component system.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getEventClass()` | `Class<Event>` | Accessor method. |
| `isType(ISystem<ECS_TYPE> system)` | `boolean` | Boolean accessor. |

---
title: "EventSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.EventSystem"
api_surface: false
extends: "EcsEvent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class EventSystem<EventType extends EcsEvent>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Class<EventType>` | `eventType` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `EventSystem(@Nonnull Class<EventType> eventType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `boolean` | `shouldProcessEvent(@Nonnull EventType event)` |
| `@Nonnull public` | `Class<EventType>` | `getEventType()` |

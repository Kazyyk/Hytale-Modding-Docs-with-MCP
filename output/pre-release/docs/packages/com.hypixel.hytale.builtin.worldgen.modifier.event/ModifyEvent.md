---
title: "ModifyEvent"
kind: "interface"
package: "com.hypixel.hytale.builtin.worldgen.modifier.event"
fqcn: "com.hypixel.hytale.builtin.worldgen.modifier.event.ModifyEvent"
api_surface: false
implements:
  - "IEvent<EventType>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "modifier"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.worldgen.modifier.event`

```java
public interface ModifyEvent<T> extends IEvent<EventType>
```

Interface for world-gen modification events. Carries the event type, file context, mutable entry list, and content loader.

## Methods

```java
@Nonnull
    EventType type()
```

```java
@Nonnull
    List<T> entries()
```

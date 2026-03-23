---
title: "EntityEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.EntityEvent"
api_surface: true
extends: null
implements: ["IEvent"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "event"
  - "events"
  - "entity"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.event.events.entity`

```java
public abstract class EntityEvent<EntityType, KeyType> implements IEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `EntityType` | `entity` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `EntityType` | `getEntity()` |
| `@Nonnull @Override public` | `String` | `toString()` |

---
title: "LivingEntityInventoryChangeEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.LivingEntityInventoryChangeEvent"
api_surface: true
extends: "EntityEvent"
implements: []
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
public class LivingEntityInventoryChangeEvent extends EntityEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `ItemContainer` | `itemContainer` |
| `private` | `Transaction` | `transaction` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ItemContainer` | `getItemContainer()` |
| `public` | `Transaction` | `getTransaction()` |
| `@Nonnull @Override public` | `String` | `toString()` |

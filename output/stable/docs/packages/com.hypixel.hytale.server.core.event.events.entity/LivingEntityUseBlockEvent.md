---
title: "LivingEntityUseBlockEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.LivingEntityUseBlockEvent"
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
@Deprecated public class LivingEntityUseBlockEvent implements IEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Ref<EntityStore>` | `ref` |
| `private` | `String` | `blockType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getBlockType()` |
| `public` | `Ref<EntityStore>` | `getRef()` |
| `@Nonnull @Override public` | `String` | `toString()` |

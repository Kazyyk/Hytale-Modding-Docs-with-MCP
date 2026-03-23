---
title: "UseBlockEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.UseBlockEvent"
api_surface: true
extends: "EcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "event"
  - "events"
---

**Package:** `com.hypixel.hytale.server.core.event.events.ecs`

```java
public abstract class UseBlockEvent extends EcsEvent
```

Abstract base class extending `EcsEvent` that provides shared logic for UseBlockEvent subclasses.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `InteractionType` | `interactionType` |
| `@Nonnull private final` | `InteractionContext` | `context` |
| `@Nonnull private final` | `Vector3i` | `targetBlock` |
| `@Nonnull private final` | `BlockType` | `blockType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `UseBlockEvent(@Nonnull InteractionType interactionType, @Nonnull InteractionContext context, @Nonnull Vector3i targetBlock, @Nonnull BlockType blockType)` |
| `@Nonnull public` | `InteractionType` | `getInteractionType()` |
| `@Nonnull public` | `InteractionContext` | `getContext()` |
| `@Nonnull public` | `Vector3i` | `getTargetBlock()` |
| `@Nonnull public` | `BlockType` | `getBlockType()` |

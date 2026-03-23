---
title: "ExitInstanceInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.interactions"
fqcn: "com.hypixel.hytale.builtin.instances.interactions.ExitInstanceInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "instances"
  - "interactions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances.interactions`

```java
public class ExitInstanceInteraction extends SimpleInstantInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ExitInstanceInteraction>` | `CODEC` |
| `` | `CommandBuffer<EntityStore>` | `commandBuffer` |
| `` | `Ref<EntityStore>` | `ref` |
| `` | `Player` | `playerComponent` |
| `` | `Archetype<EntityStore>` | `archetype` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `WaitForDataFrom` | `getWaitForDataFrom()` |
| `protected` | `void` | `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |

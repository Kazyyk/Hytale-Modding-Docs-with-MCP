---
title: "TargetMovementStateCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.TargetMovementStateCondition"
api_surface: false
extends: "SimpleCondition"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "decisionmaker"
  - "core"
  - "conditions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.decisionmaker.core.conditions`

```java
public class TargetMovementStateCondition extends SimpleCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `MovementState` | `movementState` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `boolean` | `evaluate( int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |

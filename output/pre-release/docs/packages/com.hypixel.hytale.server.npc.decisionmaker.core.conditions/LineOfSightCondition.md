---
title: "LineOfSightCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.LineOfSightCondition"
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
public class LineOfSightCondition extends SimpleCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final ComponentType<EntityStore,` | `NPCEntity>` | `NPC_COMPONENT_TYPE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getSimplicity()` |
| `@Override protected` | `boolean` | `evaluate( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> targetRef, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |

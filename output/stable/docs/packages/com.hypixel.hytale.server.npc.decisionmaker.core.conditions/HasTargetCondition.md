---
title: "HasTargetCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.HasTargetCondition"
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
public class HasTargetCondition extends SimpleCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `targetSlot` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getTargetSlot()` |
| `@Override protected` | `boolean` | `evaluate( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |
| `@Override @Nonnull public` | `String` | `toString()` |

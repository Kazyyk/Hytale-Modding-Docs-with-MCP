---
title: "RandomiserCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.RandomiserCondition"
api_surface: false
extends: "Condition"
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
public class RandomiserCondition extends Condition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `double` | `minValue` |
| `protected` | `double` | `maxValue` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `calculateUtility( int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |
| `@Override public` | `int` | `getSimplicity()` |

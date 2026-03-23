---
title: "SelfStatPercentageCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.SelfStatPercentageCondition"
api_surface: false
extends: "CurveCondition"
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
public class SelfStatPercentageCondition extends CurveCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `stat` |
| `protected` | `int` | `statIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `double` | `getNormalisedInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |
| `@Override @Nonnull public` | `String` | `toString()` |

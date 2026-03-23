---
title: "SelfStatAbsoluteCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.SelfStatAbsoluteCondition"
api_surface: false
extends: "ScaledCurveCondition"
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
public class SelfStatAbsoluteCondition extends ScaledCurveCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `stat` |
| `protected` | `int` | `statIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `double` | `getInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |
| `@Override @Nonnull public` | `String` | `toString()` |

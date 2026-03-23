---
title: "ScaledCurveCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base.ScaledCurveCondition"
api_surface: false
extends: "Condition"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "decisionmaker"
  - "core"
---

**Package:** `com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base`

```java
public abstract class ScaledCurveCondition extends Condition
```

Abstract base class extending `Condition` that provides shared logic for ScaledCurveCondition subclasses.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `ScaledResponseCurve` | `responseCurve` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | | `ScaledCurveCondition()` |
| `public` | `ScaledResponseCurve` | `getResponseCurve()` |
| `@Override public` | `double` | `calculateUtility(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)` |
| `@Override public` | `int` | `getSimplicity()` |
| `protected abstract` | `double` | `getInput(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)` |
| `@Nonnull @Override public` | `String` | `toString()` |

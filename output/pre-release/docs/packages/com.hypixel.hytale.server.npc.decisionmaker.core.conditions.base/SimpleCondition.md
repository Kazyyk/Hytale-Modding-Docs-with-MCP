---
title: "SimpleCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base.SimpleCondition"
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
public abstract class SimpleCondition extends Condition
```

Abstract base class extending `Condition` that provides shared logic for SimpleCondition subclasses.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `double` | `falseValue` | `0.0` |
| `protected` | `double` | `trueValue` | `1.0` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | | `SimpleCondition()` |
| `@Override public` | `double` | `calculateUtility(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)` |
| `@Override public` | `int` | `getSimplicity()` |
| `protected abstract` | `boolean` | `evaluate(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)` |
| `@Nonnull @Override public` | `String` | `toString()` |

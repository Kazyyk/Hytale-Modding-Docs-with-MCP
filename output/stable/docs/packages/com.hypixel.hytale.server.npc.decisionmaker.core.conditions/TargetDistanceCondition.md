---
title: "TargetDistanceCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.TargetDistanceCondition"
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
public class TargetDistanceCondition extends ScaledCurveCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final ComponentType<EntityStore,` | `TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `double` | `getInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nullable Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |

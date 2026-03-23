---
title: "FlockSizeCondition"
kind: "class"
package: "com.hypixel.hytale.server.flock.decisionmaker.conditions"
fqcn: "com.hypixel.hytale.server.flock.decisionmaker.conditions.FlockSizeCondition"
api_surface: false
extends: "ScaledCurveCondition"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "npc"
  - "decisionmaker"
---

**Package:** `com.hypixel.hytale.server.flock.decisionmaker.conditions`

```java
public class FlockSizeCondition extends ScaledCurveCondition
```

A decision-maker condition that returns the current flock size for the evaluating NPC. Returns `1.0` if the NPC is not in a flock. Registered with codec ID `"FlockSize"`. Extends `ScaledCurveCondition`, enabling response-curve-based scaling for size-dependent behavior decisions.

## Methods

```java
@Override
protected double getInput(int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, @Nonnull CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
```

Returns the `EntityGroup` size of the NPC's flock, or `1.0` if not in a flock.

## Related Types

- [FlockMembership](FlockMembership.md) -- accessed to find the flock reference
- [FlockPlugin](FlockPlugin.md) -- registers this condition

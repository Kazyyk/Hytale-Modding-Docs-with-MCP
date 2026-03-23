---
title: "NearbyCountCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.NearbyCountCondition"
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
public class NearbyCountCondition extends ScaledCurveCondition
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `double` | `range` |
| `protected` | `String` | `npcGroup` |
| `protected` | `int` | `npcGroupIndex` |
| `protected` | `boolean` | `includePlayers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getRange()` |
| `public` | `String` | `getNpcGroup()` |
| `public` | `int` | `getNpcGroupIndex()` |
| `@Override public` | `void` | `setupNPC(@Nonnull Role role)` |
| `@Override protected` | `double` | `getInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )` |
| `protected static` | `boolean` | `filterNPC( @Nonnull Role role, Ref<EntityStore> ref, @Nonnull NearbyCountCondition _this, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `@Override @Nonnull public` | `String` | `toString()` |

---
title: "TargetHasEffectCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.TargetHasEffectCondition"
api_surface: false
extends: "SimpleCondition"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "npc"
  - "decision-maker"
  - "condition"
  - "effects"
  - "codec"
---

**Package:** `com.hypixel.hytale.server.npc.decisionmaker.core.conditions`

```java
public class TargetHasEffectCondition extends SimpleCondition
```

Decision-maker condition that checks whether the NPC's current target entity has a specific active entity effect. Returns `false` if the target is null or invalid, otherwise checks the target's `EffectControllerComponent`.

Configured via `BuilderCodec` with an `"EffectId"` string field resolved to an asset index after decoding. The codec documentation describes it as "A simple boolean condition that returns whether the target entity has a specific active entity effect."

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<TargetHasEffectCondition>` | Codec with `"EffectId"` field and `EntityEffect` validator. |

## Configuration

| Field | Type | Description |
|---|---|---|
| `entityEffectId` | `String` | The entity effect identifier string. |
| `entityEffectIndex` | `int` | Resolved asset index (set in `afterDecode`). |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `evaluate(int, ArchetypeChunk, Ref, CommandBuffer, EvaluationContext)` | `boolean` | Returns `false` if target is null/invalid; otherwise checks if the target's effect controller has the specified effect. |

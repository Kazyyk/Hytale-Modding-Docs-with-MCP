---
title: "SelfHasEffectCondition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.SelfHasEffectCondition"
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
public class SelfHasEffectCondition extends SimpleCondition
```

Decision-maker condition that checks whether the NPC itself has a specific active entity effect. Returns `true` if the NPC's `EffectControllerComponent` reports the effect is active, `false` otherwise.

Configured via `BuilderCodec` with an `"EffectId"` string field that is resolved to an asset index after decoding. The codec documentation describes it as "A simple boolean condition that returns whether the NPC has a specific active entity effect."

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<SelfHasEffectCondition>` | Codec with `"EffectId"` field and `EntityEffect` validator. |

## Configuration

| Field | Type | Description |
|---|---|---|
| `entityEffectId` | `String` | The entity effect identifier string. |
| `entityEffectIndex` | `int` | Resolved asset index (set in `afterDecode`). |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `evaluate(int, ArchetypeChunk, Ref, CommandBuffer, EvaluationContext)` | `boolean` | Checks if the self entity's effect controller has the specified effect. |

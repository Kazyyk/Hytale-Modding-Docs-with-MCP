# TargetHasEffectCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: SimpleCondition

public class TargetHasEffectCondition extends SimpleCondition

Decision-maker condition that checks whether the NPC's current target entity has a specific active entity effect. Returns `false` if the target is null or invalid, otherwise checks the target's `EffectControllerComponent`.

Configured via `BuilderCodec` with an `"EffectId"` string field resolved to an asset index after decoding. The codec documentation describes it as "A simple boolean condition that returns whether the target entity has a specific active entity effect."

## Static Fields

- CODEC | BuilderCodec<TargetHasEffectCondition> | Codec with `"EffectId"` field and `EntityEffect` validator.

## Configuration

- entityEffectId | String | The entity effect identifier string.
- entityEffectIndex | int | Resolved asset index (set in `afterDecode`).

## Methods

- evaluate(int, ArchetypeChunk, Ref, CommandBuffer, EvaluationContext) | boolean | Returns `false` if target is null/invalid; otherwise checks if the target's effect controller has the specified effect.

# SelfHasEffectCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: SimpleCondition

public class SelfHasEffectCondition extends SimpleCondition

Decision-maker condition that checks whether the NPC itself has a specific active entity effect. Returns `true` if the NPC's `EffectControllerComponent` reports the effect is active, `false` otherwise.

Configured via `BuilderCodec` with an `"EffectId"` string field that is resolved to an asset index after decoding. The codec documentation describes it as "A simple boolean condition that returns whether the NPC has a specific active entity effect."

## Static Fields

- CODEC | BuilderCodec<SelfHasEffectCondition> | Codec with `"EffectId"` field and `EntityEffect` validator.

## Configuration

- entityEffectId | String | The entity effect identifier string.
- entityEffectIndex | int | Resolved asset index (set in `afterDecode`).

## Methods

- evaluate(int, ArchetypeChunk, Ref, CommandBuffer, EvaluationContext) | boolean | Checks if the self entity's effect controller has the specified effect.

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  protected boolean evaluate(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<SelfHasEffectCondition> CODEC
private String entityEffectId
private int entityEffectIndex

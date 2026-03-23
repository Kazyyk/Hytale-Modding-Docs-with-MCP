# HasTargetCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: SimpleCondition

public class HasTargetCondition extends SimpleCondition

## Fields

- protected String targetSlot

## Methods

- public String getTargetSlot()
- @Override protected boolean evaluate( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )
- @Override @Nonnull public String toString()

Also in this package: IsInStateCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfHasEffectCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  public String getTargetSlot()
  protected boolean evaluate(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<HasTargetCondition> CODEC
protected String targetSlot

# IsInStateCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: SimpleCondition

public class IsInStateCondition extends SimpleCondition

## Fields

- protected String state
- protected String subState

## Methods

- public String getState()
- @Override protected boolean evaluate( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )
- @Override @Nonnull public String toString()

Also in this package: HasTargetCondition, LineOfSightCondition, NearbyCountCondition, RandomiserCondition, SelfHasEffectCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  public String getState()
  protected boolean evaluate(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<IsInStateCondition> CODEC
protected String state
protected String subState

# NearbyCountCondition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions | Extends: ScaledCurveCondition

public class NearbyCountCondition extends ScaledCurveCondition

## Fields

- protected double range
- protected String npcGroup
- protected int npcGroupIndex
- protected boolean includePlayers

## Methods

- public double getRange()
- public String getNpcGroup()
- public int getNpcGroupIndex()
- @Override public void setupNPC(@Nonnull Role role)
- @Override protected double getInput( int selfIndex, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context )
- protected static boolean filterNPC( @Nonnull Role role, Ref<EntityStore> ref, @Nonnull NearbyCountCondition _this, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- @Override @Nonnull public String toString()

Also in this package: HasTargetCondition, IsInStateCondition, LineOfSightCondition, RandomiserCondition, SelfHasEffectCondition, SelfStatAbsoluteCondition, SelfStatPercentageCondition, TargetDistanceCondition, TargetHasEffectCondition, TargetMovementStateCondition, TargetStatAbsoluteCondition, TargetStatPercentageCondition, TimeOfDayCondition, TimeSinceLastUsedCondition

Complete API:
  public double getRange()
  public String getNpcGroup()
  public int getNpcGroupIndex()
  public void setupNPC(Role role)
  protected double getInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  protected static boolean filterNPC(Role role, Ref<EntityStore> ref, NearbyCountCondition _this, ComponentAccessor<EntityStore> componentAccessor)
  public String toString()

Fields:
public static final BuilderCodec<NearbyCountCondition> CODEC
protected double range
protected String npcGroup
protected int npcGroupIndex
protected boolean includePlayers

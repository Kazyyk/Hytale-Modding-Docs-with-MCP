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

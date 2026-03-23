# TargetMemoryCountCondition

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.conditions | Extends: ScaledCurveCondition

public class TargetMemoryCountCondition extends ScaledCurveCondition

Concrete implementation extending `ScaledCurveCondition`.

## Fields

- targetType | TargetMemoryCountCondition.TargetType | TargetMemoryCountCondition.TargetType field.

Also in this package: RecentSustainedDamageCondition, TargetType, TotalSustainedDamageCondition

Complete API:
  protected double getInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)

Fields:
public static final EnumCodec<TargetMemoryCountCondition.TargetType> TARGET_TYPE_CODEC
public static final BuilderCodec<TargetMemoryCountCondition> CODEC
protected static final ComponentType<EntityStore,TargetMemory> TARGET_MEMORY_COMPONENT_TYPE
protected TargetMemoryCountCondition.TargetType targetType

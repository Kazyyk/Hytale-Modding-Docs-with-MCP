# TotalSustainedDamageCondition

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.conditions | Extends: ScaledCurveCondition

public class TotalSustainedDamageCondition extends ScaledCurveCondition

Concrete implementation extending `ScaledCurveCondition`.

## Methods

- setupNPC(@Nonnull Holder<EntityStore> holder) | void | public method.

Also in this package: RecentSustainedDamageCondition, TargetMemoryCountCondition, TargetType

Complete API:
  protected double getInput(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public void setupNPC(Holder<EntityStore> holder)

Fields:
public static final BuilderCodec<TotalSustainedDamageCondition> CODEC
protected static final ComponentType<EntityStore,DamageMemory> DAMAGE_MEMORY_COMPONENT_TYPE

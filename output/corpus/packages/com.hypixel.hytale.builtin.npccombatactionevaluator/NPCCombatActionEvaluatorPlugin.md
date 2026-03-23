# NPCCombatActionEvaluatorPlugin

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator | Extends: JavaPlugin

public class NPCCombatActionEvaluatorPlugin extends JavaPlugin

Plugin that registers NPC combat action evaluation components, systems, asset stores, and conditions.

## Constants

- String CAE_MARKED_TARGET_SLOT
- String CAE_MIN_RANGE_PARAMETER
- String CAE_MAX_RANGE_PARAMETER
- String CAE_POSITIONING_ANGLE_PARAMETER

## Key Methods

- public static NPCCombatActionEvaluatorPlugin get()
- protected void setup()
- public ComponentType<EntityStore, TargetMemory> getTargetMemoryComponentType()
- public ComponentType<EntityStore, CombatActionEvaluator> getCombatActionEvaluatorComponentType()
- public ComponentType<EntityStore, CombatActionEvaluatorSystems.CombatConstructionData> getCombatConstructionDataComponentType()
- public ComponentType<EntityStore, DamageMemory> getDamageMemoryComponentType()

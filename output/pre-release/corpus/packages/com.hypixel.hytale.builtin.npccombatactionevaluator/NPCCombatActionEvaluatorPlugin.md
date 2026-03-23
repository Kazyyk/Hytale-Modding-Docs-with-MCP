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

Also in this package: CombatActionEvaluatorSystems, CombatConstructionData, EvaluatorTick, OnAdded, Positioning

Complete API:
  public static NPCCombatActionEvaluatorPlugin get()
  protected void setup()
  public ComponentType<EntityStore,TargetMemory> getTargetMemoryComponentType()
  public ComponentType<EntityStore,CombatActionEvaluator> getCombatActionEvaluatorComponentType()
  public ComponentType<EntityStore,CombatActionEvaluatorSystems.CombatConstructionData> getCombatConstructionDataComponentType()
  public ComponentType<EntityStore,DamageMemory> getDamageMemoryComponentType()

Fields:
public static final String CAE_MARKED_TARGET_SLOT
public static final String CAE_MIN_RANGE_PARAMETER
public static final String CAE_MAX_RANGE_PARAMETER
public static final String CAE_POSITIONING_ANGLE_PARAMETER
private static NPCCombatActionEvaluatorPlugin instance
private ComponentType<EntityStore,TargetMemory> targetMemoryComponentType
private ComponentType<EntityStore,CombatActionEvaluator> combatActionEvaluatorComponentType
private ComponentType<EntityStore,CombatActionEvaluatorSystems.CombatConstructionData> combatConstructionDataComponentType
private ComponentType<EntityStore,DamageMemory> damageMemoryComponentType

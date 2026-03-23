# CombatViewSystems

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.combat

public class CombatViewSystems

Container for ECS systems that manage per-entity combat data interpretation. Provides `getCombatData()` which lazily interprets active interaction chains into `InterpretedCombatData` entries, categorizing attacks as melee, ranged, or block based on interaction tags. Contains inner classes: `CombatData` (component), `CombatDataPool` (resource), `Ensure`, `EntityRemoved`, and `Ticking` (systems).

Also in this package: CombatData, CombatDataPool, Ensure, EntityRemoved, InterpretedCombatData, Ticking

Complete API:
  private static void clearCombatData(CombatViewSystems.CombatData combatData, CombatViewSystems.CombatDataPool dataPool)
  public static List<InterpretedCombatData> getCombatData(Ref<EntityStore> ref, Store<EntityStore> store)

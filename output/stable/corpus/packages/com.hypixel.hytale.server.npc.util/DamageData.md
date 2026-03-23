# DamageData

Type: class | Package: com.hypixel.hytale.server.npc.util

public class DamageData

Tracks NPC damage statistics including kills, damage inflicted per target, damage suffered per attacker, and damage by cause. Identifies the most persistent attacker and most damaged victim.

## Key Methods

- public void reset()
- public void onInflictedDamage(Ref<EntityStore> target, double amount)
- public void onSufferedDamage(CommandBuffer<EntityStore> commandBuffer, Damage damage)
- public void onKill(Ref<EntityStore> victim, Vector3d position)
- public boolean haveKill()
- public boolean haveKilled(Ref<EntityStore> entity)
- public Ref<EntityStore> getAnyKilled()
- public Vector3d getKillPosition(Ref<EntityStore> entity)
- public double getMaxDamageInflicted()
- public double getMaxDamageSuffered()
- public double getDamage(DamageCause cause)
- public boolean hasSufferedDamage(DamageCause cause)
- public Ref<EntityStore> getMostDamagedVictim()
- public Ref<EntityStore> getMostDamagingAttacker()
- public Ref<EntityStore> getAnyAttacker()
- public DamageData clone()
- public String toString()

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 3 more)

Complete API:
  public void reset()
  public void onInflictedDamage(Ref<EntityStore> target, double amount)
  public void onSufferedDamage(CommandBuffer<EntityStore> commandBuffer, Damage damage)
  public void onKill(Ref<EntityStore> victim, Vector3d position)
  public boolean haveKill()
  public boolean haveKilled(Ref<EntityStore> entity)
  public Ref<EntityStore> getAnyKilled()
  public Vector3d getKillPosition(Ref<EntityStore> entity)
  public double getMaxDamageInflicted()
  public double getMaxDamageSuffered()
  public double getDamage(DamageCause cause)
  public boolean hasSufferedDamage(DamageCause cause)
  public Ref<EntityStore> getMostDamagedVictim()
  public Ref<EntityStore> getMostDamagingAttacker()
  public Ref<EntityStore> getAnyAttacker()
  public DamageData clone()
  public String toString()

Fields:
private final Map<Ref<EntityStore>,Vector3d> kills
private final Object2DoubleMap<Ref<EntityStore>> damageInflicted
private final Object2DoubleMap<Ref<EntityStore>> damageSuffered
private final Object2DoubleMap<DamageCause> damageByCause
private double maxDamageSuffered
private double maxDamageInflicted
private Ref<EntityStore> mostPersistentAttacker
private Ref<EntityStore> mostDamagedVictim

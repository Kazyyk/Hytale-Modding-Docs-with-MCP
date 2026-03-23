# DamageSystems.EntityUIEvents

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: DamageEventSystem

public static class DamageSystems.EntityUIEvents extends DamageEventSystem

Sends combat text UI updates to the attacking player when damage is dealt. Part of the inspect damage group. If the damage amount is positive and the source is an `EntitySource` with a valid player reference, queues a `CombatTextUpdate` on the source player's entity viewer, displaying the damage amount and optional hit angle.

## Related Types

- DamageSystems -- parent class
- Damage -- reads `HIT_ANGLE` meta key
- DamageEventSystem -- base class

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public SystemGroup<EntityStore> getGroup()
  public Query<EntityStore> getQuery()
  public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Damage damage)
  private static void queueUpdateFor(Ref<EntityStore> ref, float damageAmount, Float hitAngleDeg, EntityTrackerSystems.EntityViewer viewer)

Fields:
private final ComponentType<EntityStore,EntityTrackerSystems.Visible> visibleComponentType
private final ComponentType<EntityStore,UIComponentList> uiComponentListComponentType
private final Query<EntityStore> query

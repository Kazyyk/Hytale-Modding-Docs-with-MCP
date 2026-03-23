# CancellableEcsEvent

Type: class | Package: com.hypixel.hytale.component.system | Extends: EcsEvent | Implements: ICancellableEcsEvent

public abstract class CancellableEcsEvent extends EcsEvent implements ICancellableEcsEvent

## Fields

- private boolean cancelled

## Methods

- @Override public final boolean isCancelled()
- @Override public final void setCancelled(boolean cancelled)

Known subclasses: BreakBlockEvent, ChangeGameModeEvent, ChunkSaveEvent, ChunkUnloadEvent, CraftRecipeEvent, Damage, DamageBlockEvent, DecedentMessage, Display, DropItemEvent, InteractivelyPickupItemEvent, KillerMessage, PlaceBlockEvent, PrefabPasteEvent, SwitchActiveSlotEvent

Also in this package: ArchetypeChunkSystem, Data, DelayedSystem, EcsEvent, EntityEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  public final boolean isCancelled()
  public final void setCancelled(boolean cancelled)

Fields:
private boolean cancelled

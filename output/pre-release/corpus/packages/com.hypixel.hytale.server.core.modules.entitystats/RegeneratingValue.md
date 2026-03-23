# RegeneratingValue

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats

public class RegeneratingValue

Tracks the regeneration tick state for a single `EntityStatType.Regenerating` entry. Handles interval-based regeneration with conditional activation, additive/percentage-based amounts, and modifier application.

## Constructors


public RegeneratingValue(@Nonnull EntityStatType.Regenerating regenerating)

## Methods

- shouldRegenerate(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant, float, Regenerating) | boolean | Decrements the interval counter and returns `true` when a regen tick fires and all conditions are met.
- regenerate(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant, float, EntityStatValue, float) | float | Computes the regeneration amount (additive or percentage), applies modifiers, clamps the result, and returns the amount to add.
- getRegenerating() | EntityStatType.Regenerating | Returns the regenerating definition.

## Related Types

- EntityStatValue -- the stat value being regenerated
- EntityStatType.Regenerating -- the asset definition for regeneration parameters

Also in this package: Changes, ClearChanges, EntityStatMap, EntityStatValue, EntityStatsModule, EntityStatsSystems, EntityTrackerRemove, EntityTrackerUpdate, PlayerRegenerateStatsSystem, Predictable, Recalculate, Regenerate, Setup, StatModifyingSystem

Complete API:
  public boolean shouldRegenerate(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime, float dt, EntityStatType.Regenerating regenerating)
  public float regenerate(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime, float dt, EntityStatValue value, float currentAmount)
  public EntityStatType.Regenerating getRegenerating()
  public String toString()

Fields:
private final EntityStatType.Regenerating regenerating
private float remainingUntilRegen

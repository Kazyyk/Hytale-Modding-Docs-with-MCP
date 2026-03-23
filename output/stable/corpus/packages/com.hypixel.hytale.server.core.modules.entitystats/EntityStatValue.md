# EntityStatValue

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats

public class EntityStatValue

Represents a single entity stat with a current value clamped between dynamically computed min and max bounds. The min/max can be modified by `Modifier` instances (additive and multiplicative). Supports regeneration through RegeneratingValue entries.

## Static Fields

- EMPTY_ARRAY | EntityStatValue[] | Shared empty array constant.
- CODEC | BuilderCodec<EntityStatValue> | Serialization codec with Id, Value, and Modifiers fields.

## Constructors


public EntityStatValue(int index, @Nonnull EntityStatType asset)

Creates a stat value initialized from the asset's initial value.

## Methods

- getId() | String | Returns the stat type identifier.
- getIndex() | int | Returns the index in the `EntityStatMap` array.
- get() | float | Returns the current value.
- asPercentage() | float | Returns the current value as a percentage of the min-max range.
- getMin() | float | Returns the effective minimum (after modifiers).
- getMax() | float | Returns the effective maximum (after modifiers).
- getIgnoreInvulnerability() | boolean | Whether regeneration damage ignores invulnerability.
- getRegeneratingValues() | RegeneratingValue[] | Returns the regeneration entries, or `null`.
- getModifier(String key) | Modifier | Returns the modifier with the given key.
- getModifiers() | Map<String, Modifier> | Returns all modifiers.
- synchronizeAsset(int index, EntityStatType asset) | boolean | Updates this value from a new/changed asset definition. Returns `true` if min, max, or value changed.

## Related Types

- EntityStatMap -- container that holds stat values
- EntityStatType -- asset definition for a stat type
- RegeneratingValue -- regeneration behavior
- `Modifier` -- modifiers applied to min/max bounds

Also in this package: Changes, ClearChanges, EntityStatMap, EntityStatsModule, EntityStatsSystems, EntityTrackerRemove, EntityTrackerUpdate, PlayerRegenerateStatsSystem, Predictable, Recalculate, Regenerate, RegeneratingValue, Setup, StatModifyingSystem

Complete API:
  public String getId()
  public int getIndex()
  public float get()
  public float asPercentage()
  public float getMin()
  public float getMax()
  protected float set(float newValue)
  public RegeneratingValue[] getRegeneratingValues()
  public Modifier getModifier(String key)
  public boolean getIgnoreInvulnerability()
  public Map<String,Modifier> getModifiers()
  protected Modifier putModifier(String key, Modifier modifier)
  protected Modifier removeModifier(String key)
  public boolean synchronizeAsset(int index, EntityStatType asset)
  private void initializeRegenerating(EntityStatType entityStatType)
  protected void computeModifiers(EntityStatType asset)
  private void applyModifier(Modifier modifier)
  public String toString()

Fields:
public static final EntityStatValue[] EMPTY_ARRAY
public static final BuilderCodec<EntityStatValue> CODEC
private String id
private int index
private float value
private float min
private float max
private boolean ignoreInvulnerability
private RegeneratingValue[] regeneratingValues
private Map<String,Modifier> modifiers

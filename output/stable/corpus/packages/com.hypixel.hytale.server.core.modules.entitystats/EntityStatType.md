# EntityStatType

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EntityStatType>>, NetworkSerializable<EntityStatType>

public class EntityStatType implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EntityStatType>>, NetworkSerializable<EntityStatType>

JSON asset defining a single entity stat type. Loaded from `Entity/Stats` path. Configures initial value, min/max bounds, regeneration, min/max value effects (sound, particles, interactions), reset behavior, and visibility flags.

## Static Fields

- CODEC | AssetBuilderCodec<String, EntityStatType> | Asset codec with inheritance support.
- UNKNOWN | EntityStatType | Sentinel instance for unknown stat types (index 0).
- UNKNOWN_ID | int | Always `0`.

## Asset Fields

- initialValue | float | InitialValue | Value assigned on component creation.
- min | float | Min | Base minimum bound.
- max | float | Max | Base maximum bound.
- shared | boolean | Shared | Whether this stat is replicated to other viewers.
- regenerating | Regenerating[] | Regenerating | Array of regeneration configurations.
- ignoreInvulnerability | boolean | IgnoreInvulnerability | Whether regeneration bypasses invulnerability.
- hideFromTooltip | boolean | HideFromTooltip | Whether to hide from UI tooltips.
- resetBehavior | EntityStatResetBehavior | ResetType | How stat resets: `InitialValue` or `MaxValue`.
- minValueEffects | EntityStatEffects | MinValueEffects | Effects triggered when stat reaches minimum.
- maxValueEffects | EntityStatEffects | MaxValueEffects | Effects triggered when stat reaches maximum.

## Static Methods

- getAssetStore() | AssetStore<...> | Returns the asset store.
- getAssetMap() | IndexedLookupTableAssetMap<String, EntityStatType> | Returns the indexed asset map.
- getUnknownFor(String) | EntityStatType | Creates a sentinel unknown instance.

## Instance Methods

- getId() | String | Returns the stat type identifier.
- isUnknown() | boolean | Whether this is an unknown/placeholder stat.
- getInitialValue() | float | Returns the initial value.
- getMin() | float | Returns the base minimum.
- getMax() | float | Returns the base maximum.
- isShared() | boolean | Whether this stat is shared with other viewers.
- getRegenerating() | Regenerating[] | Returns regeneration definitions.
- getResetBehavior() | EntityStatResetBehavior | Returns the reset behavior.
- getIgnoreInvulnerability() | boolean | Whether this stat ignores invulnerability.
- getMinValueEffects() | EntityStatEffects | Effects triggered at minimum value.
- getMaxValueEffects() | EntityStatEffects | Effects triggered at maximum value.
- toPacket() | EntityStatType` (protocol) | Converts to network packet format with soft-reference caching.

## Inner Types

- EntityStatType.EntityStatEffects
- EntityStatType.Regenerating

Also in this package: DefaultEntityStatTypes, EntityStatEffects, EntityStatTypePacketGenerator, RegenType, Regenerating

Complete API:
  public static AssetStore<String,EntityStatType,IndexedLookupTableAssetMap<String,EntityStatType>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,EntityStatType> getAssetMap()
  public String getId()
  public boolean isUnknown()
  public float getInitialValue()
  public float getMin()
  public float getMax()
  public boolean getIgnoreInvulnerability()
  public boolean isShared()
  public EntityStatType.EntityStatEffects getMinValueEffects()
  public EntityStatType.EntityStatEffects getMaxValueEffects()
  public EntityStatType.Regenerating[] getRegenerating()
  public EntityStatResetBehavior getResetBehavior()
  public com.hypixel.hytale.protocol.EntityStatType toPacket()
  public String toString()
  public static EntityStatType getUnknownFor(String unknownId)

Fields:
public static final AssetBuilderCodec<String,EntityStatType> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,EntityStatType,IndexedLookupTableAssetMap<String,EntityStatType>> ASSET_STORE
public static final EntityStatType UNKNOWN
public static final int UNKNOWN_ID
protected String id
protected AssetExtraInfo.Data data
protected boolean unknown
protected float initialValue
protected float min
protected float max
protected boolean shared
protected EntityStatType.Regenerating[] regenerating
protected boolean ignoreInvulnerability
protected boolean hideFromTooltip
protected EntityStatType.EntityStatEffects minValueEffects
protected EntityStatType.EntityStatEffects maxValueEffects
protected EntityStatResetBehavior resetBehavior
private transient SoftReference<com.hypixel.hytale.protocol.EntityStatType> cachedPacket

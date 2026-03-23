# EntityEffect

Type: class | Package: com.hypixel.hytale.server.core.asset.type.entityeffect.config

public class EntityEffect implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EntityEffect>>, NetworkSerializable<com.hypixel.hytale.protocol.EntityEffect>

## Constants

- public static final ValidatorCache<String> VALIDATOR_CACHE

## Fields

- private static AssetStore<String, EntityEffect, IndexedLookupTableAssetMap<String, EntityEffect>> STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected String name
- protected ApplicationEffects applicationEffects
- protected String worldRemovalSoundEventId
- protected transient int worldRemovalSoundEventIndex
- protected String localRemovalSoundEventId
- protected transient int localRemovalSoundEventIndex
- protected DamageCalculator damageCalculator
- protected float damageCalculatorCooldown
- protected DamageEffects damageEffects
- protected DamageEffects statModifierEffects
- protected ModelOverride modelOverride
- protected String modelChange
- protected Object2FloatMap<String> unknownEntityStats
- protected Int2FloatMap entityStats
- protected ValueType valueType
- protected float duration
- protected OverlapBehavior overlapBehavior
- protected RemovalBehavior removalBehavior
- protected boolean infinite
- protected boolean debuff
- protected String statusEffectIcon
- protected String locale
- protected boolean invulnerable
- protected String deathMessageKey
- protected Map<String, StaticModifier[]> rawStatModifiers
- protected Int2ObjectMap<StaticModifier[]> statModifiers
- protected Map<String, StaticModifier[]> damageResistanceValuesRaw
- protected Map<DamageCause, StaticModifier[]> damageResistanceValues
- private SoftReference<com.hypixel.hytale.protocol.EntityEffect> cachedPacket

## Methods

- public static AssetStore<String, EntityEffect, IndexedLookupTableAssetMap<String, EntityEffect>> getAssetStore()
- public static IndexedLookupTableAssetMap<String, EntityEffect> getAssetMap()
- public EntityEffect(@Nonnull String id)
- protected EntityEffect()
- public String getName()
- public Int2ObjectMap<StaticModifier[]> getStatModifiers()
- public String getId()
- public ApplicationEffects getApplicationEffects()
- public DamageCalculator getDamageCalculator()
- public float getDamageCalculatorCooldown()
- public DamageEffects getDamageEffects()
- public DamageEffects getStatModifierEffects()
- public ModelOverride getModelOverride()
- public String getModelChange()
- public Int2FloatMap getEntityStats()
- public float getDuration()
- public OverlapBehavior getOverlapBehavior()
- public boolean isInfinite()
- public boolean isDebuff()
- public String getStatusEffectIcon()
- public String getLocale()
- public RemovalBehavior getRemovalBehavior()
- public ValueType getValueType()
- public boolean isInvulnerable()
- public Map<DamageCause, StaticModifier[]> getDamageResistanceValues()
- public String getDeathMessageKey()
- public com.hypixel.hytale.protocol.EntityEffect toPacket()
- public String toString()

Also in this package: AbilityEffects, ApplicationEffects, ModelOverride, OverlapBehavior, RemovalBehavior

Complete API:
  public static AssetStore<String,EntityEffect,IndexedLookupTableAssetMap<String,EntityEffect>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,EntityEffect> getAssetMap()
  public String getName()
  public Int2ObjectMap<StaticModifier[]> getStatModifiers()
  public String getId()
  public ApplicationEffects getApplicationEffects()
  public DamageCalculator getDamageCalculator()
  public float getDamageCalculatorCooldown()
  public DamageEffects getDamageEffects()
  public DamageEffects getStatModifierEffects()
  public ModelOverride getModelOverride()
  public String getModelChange()
  public Int2FloatMap getEntityStats()
  public float getDuration()
  public OverlapBehavior getOverlapBehavior()
  public boolean isInfinite()
  public boolean isDebuff()
  public String getStatusEffectIcon()
  public String getLocale()
  public RemovalBehavior getRemovalBehavior()
  public ValueType getValueType()
  public boolean isInvulnerable()
  public Map<DamageCause,StaticModifier[]> getDamageResistanceValues()
  public String getDeathMessageKey()
  public Condition[] getApplyConditions()
  public com.hypixel.hytale.protocol.EntityEffect toPacket()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,EntityEffect> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
private static AssetStore<String,EntityEffect,IndexedLookupTableAssetMap<String,EntityEffect>> STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
protected String name
protected ApplicationEffects applicationEffects
protected String worldRemovalSoundEventId
protected transient int worldRemovalSoundEventIndex
protected String localRemovalSoundEventId
protected transient int localRemovalSoundEventIndex
protected DamageCalculator damageCalculator
protected float damageCalculatorCooldown
protected DamageEffects damageEffects
protected DamageEffects statModifierEffects
protected ModelOverride modelOverride
protected String modelChange
protected Object2FloatMap<String> unknownEntityStats
protected Int2FloatMap entityStats
protected ValueType valueType
protected float duration
protected OverlapBehavior overlapBehavior
protected RemovalBehavior removalBehavior
protected boolean infinite
protected boolean debuff
protected String statusEffectIcon
protected String locale
protected boolean invulnerable
protected String deathMessageKey
protected Condition[] applyConditions
protected Map<String,StaticModifier[]> rawStatModifiers
protected Int2ObjectMap<StaticModifier[]> statModifiers
protected Map<String,StaticModifier[]> damageResistanceValuesRaw
protected Map<DamageCause,StaticModifier[]> damageResistanceValues
private SoftReference<com.hypixel.hytale.protocol.EntityEffect> cachedPacket

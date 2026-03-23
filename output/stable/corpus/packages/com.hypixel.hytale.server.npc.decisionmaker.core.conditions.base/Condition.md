# Condition

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Condition>>

public abstract class Condition implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Condition>>

Abstract base class providing shared logic for Condition implementations.

## Constants

- public static final double NO_TARGET
- public static final int ALWAYS_TRUE_SIMPLICITY
- public static final int BOOLEAN_CHECK_SIMPLICITY
- public static final int NORMALISED_CURVE_SIMPLICITY
- public static final int SCALED_CURVE_SIMPLICITY
- public static final int HIGH_COST_SIMPLICITY
- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- @Nonnull public static final ValidatorCache<String> VALIDATOR_CACHE

## Fields

- private static AssetStore<String, Condition, IndexedLookupTableAssetMap<String, Condition>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected WeakReference<Condition> reference

## Methods

- public Condition(String id)
- protected Condition()
- @Nonnull public static AssetStore<String, Condition, IndexedLookupTableAssetMap<String, Condition>> getAssetStore()
- public static IndexedLookupTableAssetMap<String, Condition> getAssetMap()
- public String getId()
- public void setupNPC(Role role)
- public void setupNPC(Holder<EntityStore> holder)
- public WeakReference<Condition> getReference()
- public abstract double calculateUtility(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)
- public abstract int getSimplicity()
- @Nonnull @Override public String toString()
- @Nonnull public static Condition getAlwaysTrueFor(String id)

Known subclasses: AliveCondition, AlwaysTrueCondition, ChargingCondition, CurveCondition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, LogicCondition, NoDamageTakenCondition, OutOfCombatCondition, PlayerCondition, RandomiserCondition, RegenHealthCondition, ScaledCurveCondition, SimpleCondition, SprintingCondition, SuffocatingCondition, WieldingCondition

Known implementors: AlwaysTrueCondition, AndCondition, EqualsCondition, GreaterThanCondition, NotCondition, OrCondition, SmallerThanCondition

Also in this package: AlwaysTrueCondition, CurveCondition, ScaledCurveCondition, SimpleCondition

Complete API:
  public static AssetStore<String,Condition,IndexedLookupTableAssetMap<String,Condition>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,Condition> getAssetMap()
  public String getId()
  public void setupNPC(Role role)
  public void setupNPC(Holder<EntityStore> holder)
  public WeakReference<Condition> getReference()
  public abstract double calculateUtility(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)
  public abstract int getSimplicity()
  public String toString()
  public static Condition getAlwaysTrueFor(String id)

Fields:
public static final double NO_TARGET
public static final int ALWAYS_TRUE_SIMPLICITY
public static final int BOOLEAN_CHECK_SIMPLICITY
public static final int NORMALISED_CURVE_SIMPLICITY
public static final int SCALED_CURVE_SIMPLICITY
public static final int HIGH_COST_SIMPLICITY
public static final AssetCodecMapCodec<String,Condition> CODEC
public static final BuilderCodec<Condition> BASE_CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,Condition,IndexedLookupTableAssetMap<String,Condition>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected WeakReference<Condition> reference

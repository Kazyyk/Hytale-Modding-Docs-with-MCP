# CombatActionOption

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.evaluator.combatactions

public class CombatActionOption

Base class for all combat action options. Extends `JsonAssetWithMap` for asset-store integration and provides the evaluation interface used by `CombatActionEvaluator`.

Known subclasses: AbilityCombatAction, BasicAttackTargetCombatAction, Nothing, StateCombatAction

Also in this package: AbilityCombatAction, AbilityType, BasicAttackTargetCombatAction, Nothing, StateCombatAction, Target

Complete API:
  public static AssetStore<String,CombatActionOption,IndexedLookupTableAssetMap<String,CombatActionOption>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,CombatActionOption> getAssetMap()
  public String getId()
  public CombatActionOption.Target getActionTarget()
  public double[] getPostExecuteDistanceRange()
  public abstract void execute(int var1, ArchetypeChunk<EntityStore> var2, CommandBuffer<EntityStore> var3, Role var4, CombatActionEvaluator var5, ValueStore var6)
  public abstract boolean isBasicAttackAllowed(int var1, ArchetypeChunk<EntityStore> var2, CommandBuffer<EntityStore> var3, CombatActionEvaluator var4)
  public boolean cancelBasicAttackOnSelect()
  public String toString()
  public static CombatActionOption getNothingFor(String id)

Fields:
public static final AssetCodecMapCodec<String,CombatActionOption> CODEC
public static final BuilderCodec<CombatActionOption> BASE_CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,CombatActionOption,IndexedLookupTableAssetMap<String,CombatActionOption>> ASSET_STORE
protected AssetExtraInfo.Data extraData
protected String id
protected CombatActionOption.Target actionTarget
protected double[] postExecuteDistanceRange

# ExplosionConfig

Type: class | Package: com.hypixel.hytale.server.core.entity

public class ExplosionConfig

JSON-configurable explosion parameters. Codec fields include `DamageEntities`, `DamageBlocks`, `BlockDamageRadius`, `BlockDamageFalloff`, `BlockDropChance`, `EntityDamageRadius`, `EntityDamageFalloff`, `EntityDamage`, `Knockback`, and `ItemTool` (for block damage type resolution). Used by `ExplodeInteraction` and `ExplosionUtils`.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Fields:
public static final BuilderCodec<ExplosionConfig> CODEC
protected boolean damageEntities
protected boolean damageBlocks
protected int blockDamageRadius
protected float blockDamageFalloff
protected float entityDamageRadius
protected float entityDamage
protected float entityDamageFalloff
protected float blockDropChance
protected Knockback knockback
protected ItemTool itemTool

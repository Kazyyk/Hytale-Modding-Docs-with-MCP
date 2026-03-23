# ExplosionUtils

Type: class | Package: com.hypixel.hytale.server.core.entity

public class ExplosionUtils

Static utility for performing explosions in the world. The `performExplosion()` method applies block damage in a sphere (using `BlockSphereUtil`), applies entity damage with distance falloff via `DamageSystems`, and applies knockback to affected entities. Handles block gathering/drops based on config and tool type.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public static void performExplosion(Damage.Source damageSource, Vector3d position, ExplosionConfig config, Ref<EntityStore> ignoreRef, CommandBuffer<EntityStore> commandBuffer, ComponentAccessor<ChunkStore> chunkStore)
  private static void processTargetBlocks(Vector3d position, ExplosionConfig config, Ref<EntityStore> ignoreRef, Set<Ref<EntityStore>> targetRefs, CommandBuffer<EntityStore> commandBuffer, ComponentAccessor<ChunkStore> chunkStore)
  private static boolean isValidTargetBlock(int blockTypeId, boolean damageBlocks)
  private static void collectPotentialTargets(Set<Ref<EntityStore>> targetRefs, List<Ref<EntityStore>> potentialTargetRefs, Vector3d startPosition, Vector3d endPosition, CommandBuffer<EntityStore> commandBuffer)
  private static boolean processPotentialEntity(Ref<EntityStore> ref, Vector3d startPosition, Vector3d endPosition, CommandBuffer<EntityStore> commandBuffer)
  private static float calculateBlockDamageScale(float distance, float radius, float fallOff)
  private static void processTargetEntities(ExplosionConfig config, Vector3d position, Damage.Source damageSource, Ref<EntityStore> ignoreRef, Set<Ref<EntityStore>> targetRefs, CommandBuffer<EntityStore> commandBuffer)
  private static void processTargetEntity(ExplosionConfig config, Ref<EntityStore> targetRef, Vector3d position, Damage.Source damageSource, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final boolean DEBUG_SHAPES
private static final Vector3f DEBUG_POTENTIAL_TARGET_COLOR
private static final int DEBUG_POTENTIAL_TARGET_TIME
private static final float DEBUG_BLOCK_HIT_SCALE
private static final float DEBUG_BLOCK_HIT_TIME
private static final float DEBUG_BLOCK_HIT_ALPHA
private static final Vector3f DEBUG_BLOCK_RADIUS_COLOR
private static final Vector3f DEBUG_ENTITY_RADIUS_COLOR
private static final int DEBUG_BLOCK_RADIUS_TIME
private static final int DEBUG_ENTITY_RADIUS_TIME

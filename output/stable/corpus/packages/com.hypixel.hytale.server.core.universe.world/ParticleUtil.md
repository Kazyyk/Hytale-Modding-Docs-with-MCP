# ParticleUtil

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class ParticleUtil

Static utility for spawning particle effects in the world. Provides numerous overloads accepting different combinations of position, rotation, scale, color, source entity, and player recipient lists. Sends `SpawnParticleSystem` packets to nearby players. The default particle visibility distance is 75 blocks.

## Constants

- DEFAULT_PARTICLE_DISTANCE | double | 75.0 | Default distance for spatial player collection.

## Key Methods

- spawnParticleEffect(String, Vector3d, ComponentAccessor) | Spawns a named particle at a position, auto-collecting nearby players within 75 blocks.
- spawnParticleEffect(String, Vector3d, List, ComponentAccessor) | Spawns a named particle for an explicit list of player refs.
- spawnParticleEffect(WorldParticle, Vector3d, List, ComponentAccessor) | Spawns a `WorldParticle` with position/rotation offsets applied.
- spawnParticleEffects(WorldParticle[], Vector3d, Ref, List, ComponentAccessor) | Spawns an array of particle effects at a single position.
- spawnParticleEffect(String, double, double, double, float, float, float, float, Color, Ref, List, ComponentAccessor) | Full overload with rotation, scale, color, and source exclusion.

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public static void spawnParticleEffect(String name, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, Vector3d position, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, Vector3d position, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, Vector3d position, Vector3f rotation, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, Vector3d position, Vector3f rotation, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, Vector3d position, float yaw, float pitch, float roll, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, Vector3d position, float yaw, float pitch, float roll, float scale, Color color, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(WorldParticle particles, Vector3d position, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(WorldParticle particles, Vector3d position, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffects(WorldParticle[] particles, Vector3d position, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(WorldParticle particles, Vector3d position, float yaw, float pitch, float roll, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, double x, double y, double z, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, double x, double y, double z, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, double x, double y, double z, float rotationYaw, float rotationPitch, float rotationRoll, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)
  public static void spawnParticleEffect(String name, double x, double y, double z, float rotationYaw, float rotationPitch, float rotationRoll, float scale, Color color, Ref<EntityStore> sourceRef, List<Ref<EntityStore>> playerRefs, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final double DEFAULT_PARTICLE_DISTANCE

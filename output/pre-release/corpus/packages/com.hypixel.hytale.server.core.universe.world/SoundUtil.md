# SoundUtil

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class SoundUtil

Utility class for playing sound events. Provides static methods for 2D sounds (to all players or a specific player), 3D positional sounds (with spatial filtering based on `SoundEvent.getMaxDistance()`), entity-attached sounds, and local player sounds. Supports volume/pitch modifiers and visibility-based filtering via `Entity.isHiddenFromLivingEntity()`.

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public static void playItemSoundEvent(Ref<EntityStore> ref, Store<EntityStore> store, Item item, ItemSoundEvent itemSoundEvent)
  public static void playSoundEventEntity(int soundEventIndex, int networkId, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEventEntity(int soundEventIndex, int networkId, float volumeModifier, float pitchModifier, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent2dToPlayer(PlayerRef playerRefComponent, int soundEventIndex, SoundCategory soundCategory)
  public static void playSoundEvent2dToPlayer(PlayerRef playerRefComponent, int soundEventIndex, SoundCategory soundCategory, float volumeModifier, float pitchModifier)
  public static void playLocalPlayerSoundEvent(PlayerRef playerRefComponent, int localSoundEventIndex, int worldSoundEventIndex, SoundCategory soundCategory)
  public static void playLocalPlayerSoundEvent(PlayerRef playerRefComponent, int localSoundEventIndex, int worldSoundEventIndex, SoundCategory soundCategory, float volumeModifier, float pitchModifier)
  public static void playSoundEvent2d(int soundEventIndex, SoundCategory soundCategory, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent2d(int soundEventIndex, SoundCategory soundCategory, float volumeModifier, float pitchModifier, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent2d(Ref<EntityStore> ref, int soundEventIndex, SoundCategory soundCategory, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent2d(Ref<EntityStore> ref, int soundEventIndex, SoundCategory soundCategory, float volumeModifier, float pitchModifier, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(int soundEventIndex, SoundCategory soundCategory, double x, double y, double z, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(int soundEventIndex, SoundCategory soundCategory, double x, double y, double z, float volumeModifier, float pitchModifier, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(int soundEventIndex, SoundCategory soundCategory, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(int soundEventIndex, SoundCategory soundCategory, double x, double y, double z, Predicate<Ref<EntityStore>> shouldHear, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(int soundEventIndex, SoundCategory soundCategory, double x, double y, double z, float volumeModifier, float pitchModifier, Predicate<Ref<EntityStore>> shouldHear, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(Ref<EntityStore> sourceRef, int soundEventIndex, Vector3d pos, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(Ref<EntityStore> sourceRef, int soundEventIndex, double x, double y, double z, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(Ref<EntityStore> sourceRef, int soundEventIndex, Vector3d position, boolean ignoreSource, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(Ref<EntityStore> sourceRef, int soundEventIndex, double x, double y, double z, boolean ignoreSource, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3d(int soundEventIndex, double x, double y, double z, Predicate<Ref<EntityStore>> shouldHear, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3dToPlayer(Ref<EntityStore> playerRef, int soundEventIndex, SoundCategory soundCategory, double x, double y, double z, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3dToPlayer(Ref<EntityStore> playerRef, int soundEventIndex, SoundCategory soundCategory, double x, double y, double z, float volumeModifier, float pitchModifier, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent3dToPlayer(Ref<EntityStore> playerRef, int soundEventIndex, SoundCategory soundCategory, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)

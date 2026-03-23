# SoundUtil

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class SoundUtil

Static utilities for playing sound events in the world. Supports 2D (non-positional), 3D (positional with distance attenuation), and entity-attached sound playback. Sound events are looked up by index from the `SoundEvent` asset map. 3D sounds use spatial player collection to send packets only to players within the event's maximum distance.

## Key Methods

- playItemSoundEvent(Ref, Store, Item, ItemSoundEvent) | Plays an item sound event as a 2D UI sound to the player.
- playSoundEventEntity(int, int, float, float, ComponentAccessor) | Broadcasts an entity-attached sound event to all players.
- playSoundEvent2dToPlayer(PlayerRef, int, SoundCategory) | Plays a 2D sound event to a single player.
- playSoundEvent2d(int, SoundCategory, ComponentAccessor) | Broadcasts a 2D sound event to all players.
- playSoundEvent3d(int, SoundCategory, double, double, double, ComponentAccessor) | Plays a 3D positional sound to nearby players.
- playSoundEvent3d(Ref, int, Vector3d, boolean, ComponentAccessor) | Plays a 3D sound with source entity exclusion and visibility checks.
- playSoundEvent3dToPlayer(Ref, int, SoundCategory, double, double, double, ComponentAccessor) | Plays a 3D sound to a single player if within range.

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public static void playItemSoundEvent(Ref<EntityStore> ref, Store<EntityStore> store, Item item, ItemSoundEvent itemSoundEvent)
  public static void playSoundEventEntity(int soundEventIndex, int networkId, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEventEntity(int soundEventIndex, int networkId, float volumeModifier, float pitchModifier, ComponentAccessor<EntityStore> componentAccessor)
  public static void playSoundEvent2dToPlayer(PlayerRef playerRefComponent, int soundEventIndex, SoundCategory soundCategory)
  public static void playSoundEvent2dToPlayer(PlayerRef playerRefComponent, int soundEventIndex, SoundCategory soundCategory, float volumeModifier, float pitchModifier)
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

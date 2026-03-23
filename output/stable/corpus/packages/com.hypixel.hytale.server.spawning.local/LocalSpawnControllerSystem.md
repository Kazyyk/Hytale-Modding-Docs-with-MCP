# LocalSpawnControllerSystem

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: TickingSystem<EntityStore>

public class LocalSpawnControllerSystem extends TickingSystem<EntityStore>

Main ticking system for local NPC spawning. Evaluates each player with an active spawn controller, checks environment conditions (weather, light levels), and places spawn beacons for matching beacon types. Runs every 5 seconds per player.

## Fields

- public static final | double | RUN_FREQUENCY_SECONDS | Run frequency (5.0 seconds)

Also in this package: LocalSpawnBeacon, LocalSpawnBeaconSystem, LocalSpawnController, LocalSpawnForceTriggerSystem, LocalSpawnSetupSystem, LocalSpawnState

Complete API:
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  private static boolean spawnLightLevelMatches(World world, int x, int y, int z, double sunlightFactor, BeaconSpawnWrapper wrapper, Object2ByteMap<LightType> averageValues)
  private static byte getCachedAverageLightValue(LightType lightType, World world, int x, int y, int z, double sunlightFactor, TriIntObjectDoubleToByteFunction<BlockChunk> valueCalculator, Object2ByteMap<LightType> averageValues)

Fields:
public static final double RUN_FREQUENCY_SECONDS
private static final int LIGHT_LEVEL_EVALUATION_RADIUS
private final Archetype<EntityStore> controllerArchetype
private final ComponentType<EntityStore,LocalSpawnController> spawnControllerComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentype
private final ComponentType<EntityStore,WeatherTracker> weatherTrackerComponentType
private final ComponentType<EntityStore,LocalSpawnBeacon> localSpawnBeaconComponentType
private final ComponentType<EntityStore,LegacySpawnBeaconEntity> spawnBeaconComponentType
private final ResourceType<EntityStore,LocalSpawnState> localSpawnStateResourceType
private final ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> beaconSpatialComponent

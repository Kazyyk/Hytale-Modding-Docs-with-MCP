# BeaconSpawnManager

Type: class | Package: com.hypixel.hytale.server.spawning.managers | Extends: SpawnManager

public class BeaconSpawnManager extends SpawnManager

## Fields

- private final Int2ObjectConcurrentHashMap<List<BeaconSpawnWrapper>> wrappersByEnvironment

## Methods

- @Nullable public BeaconSpawnWrapper removeSpawnWrapper(int spawnConfigurationIndex)
- public boolean addSpawnWrapper(BeaconSpawnWrapper spawnWrapper)
- public List<BeaconSpawnWrapper> getBeaconSpawns(int environment)

Also in this package: SpawnManager

Complete API:
  public BeaconSpawnWrapper removeSpawnWrapper(int spawnConfigurationIndex)
  public boolean addSpawnWrapper(BeaconSpawnWrapper spawnWrapper)
  public List<BeaconSpawnWrapper> getBeaconSpawns(int environment)

Fields:
private final Int2ObjectConcurrentHashMap<List<BeaconSpawnWrapper>> wrappersByEnvironment

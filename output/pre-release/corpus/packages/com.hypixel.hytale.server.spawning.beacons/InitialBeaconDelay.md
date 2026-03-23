# InitialBeaconDelay

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Implements: Component<EntityStore>

public class InitialBeaconDelay implements Component<EntityStore>

An `EntityStore` component that imposes a delay before a spawn beacon begins spawning after being loaded. Added to legacy spawn beacons on `AddReason.LOAD` with a default delay of 15 seconds. The SpawnBeaconSystems.LoadTimeDelay system ticks the delay down and removes the component when it expires.

## Methods

- public static ComponentType<EntityStore, InitialBeaconDelay> getComponentType()
- public void setLoadTimeSpawnDelay(double loadTimeSpawnDelay)
- public boolean tickLoadTimeSpawnDelay(float dt)
- public void setupInitialSpawnDelay(@Nonnull double[] initialSpawnDelay)
- @Nonnull public Component<EntityStore> clone()

Also in this package: CheckDespawn, ControllerTick, EntityAdded, LegacyEntityAdded, LegacySpawnBeaconEntity, LoadTimeDelay, PositionSelectorUpdate, SpawnBeacon, SpawnBeaconSystems, SpawnJobTick

Complete API:
  public static ComponentType<EntityStore,InitialBeaconDelay> getComponentType()
  public void setLoadTimeSpawnDelay(double loadTimeSpawnDelay)
  public boolean tickLoadTimeSpawnDelay(float dt)
  public void setupInitialSpawnDelay(double[] initialSpawnDelay)
  public Component<EntityStore> clone()

Fields:
private double loadTimeSpawnDelay

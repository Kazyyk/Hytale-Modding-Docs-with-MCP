# GlobalSpawnProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.spawn | Implements: ISpawnProvider

public class GlobalSpawnProvider implements ISpawnProvider

## Fields

- public static BuilderCodec<GlobalSpawnProvider> CODEC
- private Transform spawnPoint

## Methods

- @Override public Transform getSpawnPoint(World world, UUID uuid)
- @Nonnull @Override public Transform[] getSpawnPoints()
- @Override public boolean isWithinSpawnDistance(Vector3d position, double distance)

Also in this package: FitToHeightMapSpawnProvider, IndividualSpawnProvider

Complete API:
  public Transform getSpawnPoint(World world, UUID uuid)
  public Transform[] getSpawnPoints()
  public boolean isWithinSpawnDistance(Vector3d position, double distance)

Fields:
public static BuilderCodec<GlobalSpawnProvider> CODEC
private Transform spawnPoint

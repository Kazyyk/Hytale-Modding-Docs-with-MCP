# IndividualSpawnProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.spawn | Implements: ISpawnProvider

public class IndividualSpawnProvider implements ISpawnProvider

## Fields

- public static BuilderCodec<IndividualSpawnProvider> CODEC
- private Transform[] spawnPoints

## Methods

- @Override public Transform getSpawnPoint(World world, UUID uuid)
- @Override public Transform[] getSpawnPoints()
- @Nullable public Transform getFirstSpawnPoint()
- @Override public boolean isWithinSpawnDistance(Vector3d position, double distance)

Also in this package: FitToHeightMapSpawnProvider, GlobalSpawnProvider

Complete API:
  public Transform getSpawnPoint(World world, UUID uuid)
  public Transform[] getSpawnPoints()
  public Transform getFirstSpawnPoint()
  public boolean isWithinSpawnDistance(Vector3d position, double distance)

Fields:
public static BuilderCodec<IndividualSpawnProvider> CODEC
private Transform[] spawnPoints

# FitToHeightMapSpawnProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.spawn | Implements: ISpawnProvider

public class FitToHeightMapSpawnProvider implements ISpawnProvider

## Fields

- public static BuilderCodec<FitToHeightMapSpawnProvider> CODEC
- private ISpawnProvider spawnProvider

## Methods

- @Nonnull @Override public Transform getSpawnPoint(World world, UUID uuid)
- @Override public Transform[] getSpawnPoints()
- @Override public boolean isWithinSpawnDistance(Vector3d position, double distance)

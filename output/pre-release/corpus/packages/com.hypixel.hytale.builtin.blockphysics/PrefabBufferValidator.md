# PrefabBufferValidator

Type: class | Package: com.hypixel.hytale.builtin.blockphysics

public class PrefabBufferValidator

Validates prefab buffer contents including block types, filler blocks, entity components, and block states.

## Record Components


int x, int y, int z, int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder, StringBuilder reason

## Key Methods

- public int getBlock(@Nonnull IPrefabBuffer iPrefabBuffer, Void unused, int x, int y, int z)
- public int getFiller(@Nonnull IPrefabBuffer iPrefabBuffer, Void unused, int x, int y, int z)
- public int getRotationIndex(@Nonnull IPrefabBuffer iPrefabBuffer, Void unused, int x, int y, int z)
- public static List<String> validateAllPrefabs(@Nonnull List<ValidationOption> list)
- public static List<String> validatePrefabsInPath(@Nonnull Path dataFolder, @Nonnull Set<ValidationOption> options)
- public static String validate(@Nonnull IPrefabBuffer prefab, @Nonnull Set<ValidationOption> options)
- public record ValidateBlockEvent(int x, int y, int z, int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder, StringBuilder reason)

Also in this package: BlockPhysicsPlugin, BlockPhysicsSystems, BlockPhysicsUtil, CachedAccessor, Result, Ticking, ValidateBlockEvent, WorldValidationUtil

Complete API:
  public static List<String> validateAllPrefabs(List<ValidationOption> list)
  public static List<String> validatePrefabsInPath(Path dataFolder, Set<ValidationOption> options)
  public static String validate(IPrefabBuffer prefab, Set<ValidationOption> options)

Fields:
private static final FillerBlockUtil.FillerFetcher<IPrefabBuffer,Void> FILLER_FETCHER

# RecursivePrefabLoader

Type: class | Package: com.hypixel.hytale.builtin.buildertools.utils | Implements: BiFunction

public abstract class RecursivePrefabLoader<T> implements BiFunction<String, Random, T>

## Fields

- private static final int MAX_RECURSION_DEPTH
- protected final Path rootPrefabsDir
- protected final Function<String, T> prefabsLoader
- private int depthTracker

## Methods

- public RecursivePrefabLoader(Path rootPrefabsDir, Function<String, T> prefabsLoader)
- public T apply(@Nonnull String name, @Nonnull Random random)
- public T load(@Nonnull String name, @Nonnull Random random)
- protected T load(int x, int y, int z, @Nonnull String name, PrefabRotation rotation, @Nonnull PrefabWeights weights, @Nonnull Random random)
- protected T loadSinglePrefab(int x, int y, int z, @Nonnull Path file, PrefabRotation rotation, Random random)
- protected T loadWeightedPrefab( int x, int y, int z, @Nonnull String name, @Nonnull List<Path> files, PrefabRotation rotation, @Nonnull PrefabWeights weights, @Nonnull Random random )
- protected T loadRandomPrefab(int x, int y, int z, @Nonnull List<Path> files, PrefabRotation rotation, @Nonnull Random random)
- protected abstract T loadPrefab(int var1, int var2, int var3, String var4, PrefabRotation var5, Random var6)
- private static String stripSuffix(@Nonnull String path)
- private static String appendSuffix(@Nonnull String path)
- protected BlockSelection loadPrefab(int x, int y, int z, String file, @Nonnull PrefabRotation rotation, @Nonnull Random random)
- private static PrefabRotation getRotation(@Nonnull BlockType blockType)
- public void accept(T t)

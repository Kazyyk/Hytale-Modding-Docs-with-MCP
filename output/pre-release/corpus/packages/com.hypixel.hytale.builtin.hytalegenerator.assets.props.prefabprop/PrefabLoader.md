# PrefabLoader

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop

public class PrefabLoader

Provides PrefabLoader functionality within the prefabprop subsystem.

## Methods

- public static void loadAllPrefabBuffersUnder(@Nonnull Path dirPath, @Nonnull List<PrefabBuffer> pathPrefabs)
- @Nullable public static PrefabBuffer loadPrefabBufferAt(@Nonnull Path filePath)
- public static boolean hasJsonExtension(@Nonnull Path path)

Also in this package: PrefabFileVisitor, PrefabPropAsset, WeightedPathAsset

Complete API:
  public static void traverseAllPrefabBuffersUnder(Path path, BiConsumer<Path,IPrefabBuffer> prefabsOut)
  public static IPrefabBuffer loadPrefabBufferAt(Path filePath)
  public static boolean hasJsonExtension(Path path)

# PrefabFileVisitor

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop | Extends: SimpleFileVisitor<Path>

public class PrefabFileVisitor extends SimpleFileVisitor<Path>

Extends `SimpleFileVisitor` to provide PrefabFileVisitor functionality.

## Fields

- @Nonnull private final List<PrefabBuffer> prefabBuffers

## Methods

- public PrefabFileVisitor(@Nonnull List<PrefabBuffer> prefabBuffers)
- @Nonnull public FileVisitResult visitFile(@Nonnull Path file, @Nonnull BasicFileAttributes attrs)

Also in this package: PrefabLoader, PrefabPropAsset, WeightedPathAsset

Complete API:
  public FileVisitResult visitFile(Path path, BasicFileAttributes attrs)

Fields:
private final BiConsumer<Path,IPrefabBuffer> consumer

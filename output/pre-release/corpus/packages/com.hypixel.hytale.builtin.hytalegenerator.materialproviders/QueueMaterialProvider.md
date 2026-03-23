# QueueMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class QueueMaterialProvider<V> extends MaterialProvider<V>

Provider supplying QueueMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V>[] queue

## Methods

- public QueueMaterialProvider(@Nonnull List<MaterialProvider<V>> queue)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

# FileIOSystem

Type: interface | Package: com.hypixel.hytale.procedurallib.file | Extends: AutoCloseable

public interface FileIOSystem extends AutoCloseable

## Methods

- @Nonnull Path baseRoot()
- @Nonnull FileIOSystem.PathArray roots()
- @Nonnull default AssetPath resolve(@Nonnull Path path)
- @Nonnull default <T> T load(@Nonnull AssetPath path, @Nonnull AssetLoader<T> loader)
- @Override default void close()

## Inner Types

- `FileIOSystem.PathArray`
- `FileIOSystem.Provider`

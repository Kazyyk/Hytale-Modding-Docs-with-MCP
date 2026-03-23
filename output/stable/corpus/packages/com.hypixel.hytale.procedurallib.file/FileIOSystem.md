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

Known implementors: AssetFileSystem, DefaultIOFileSystem

Also in this package: AssetLoader, AssetPath, DefaultIOFileSystem, FileIO, PathArray, Provider

Complete API:
  Path baseRoot()
  FileIOSystem.PathArray roots()
  default AssetPath resolve(Path path)
  default T load(AssetPath path, AssetLoader<T> loader)
  default void close()

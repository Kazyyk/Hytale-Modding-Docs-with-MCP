# FileUtil

Type: class | Package: com.hypixel.hytale.server.core.util.io

public class FileUtil

Class in the io subsystem.

## Fields

- DEFAULT_WALK_TREE_OPTIONS_ARRAY | FileVisitOption[] | Static final FileVisitOption[] field.

## Methods

- copyDirectory(@Nonnull Path origin, @Nonnull Path destination) | void | static public method.
- moveDirectoryContents(@Nonnull Path origin, @Nonnull Path destination, CopyOption... options) | void | static public method.
- deleteDirectory(@Nonnull Path path) | void | static public method.
- extractZip(@Nonnull Path zipFile, @Nonnull Path destDir) | void | static public method.
- extractZip(@Nonnull InputStream inputStream, @Nonnull Path destDir) | void | static public method.
- writeStringAtomic(@Nonnull Path file, @Nonnull String content, boolean backup) | void | static public method.
- atomicMove(@Nonnull Path source, @Nonnull Path target) | void | static public method.
- writeStringAtomic(@Nonnull Path file, @Nonnull String content) | void | static public method.

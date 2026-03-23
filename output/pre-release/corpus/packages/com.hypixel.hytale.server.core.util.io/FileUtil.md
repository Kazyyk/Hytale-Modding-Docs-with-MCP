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

Also in this package: BlockingDiskFile, ByteBufUtil

Complete API:
  public static void unzipFile(Path path, byte[] buffer, ZipInputStream zipStream, ZipEntry zipEntry, String name)
  public static void copyDirectory(Path origin, Path destination)
  public static void moveDirectoryContents(Path origin, Path destination, CopyOption options)
  public static void deleteDirectory(Path path)
  public static void extractZip(Path zipFile, Path destDir)
  public static void extractZip(InputStream inputStream, Path destDir)
  public static void writeStringAtomic(Path file, String content, boolean backup)
  public static void atomicMove(Path source, Path target)
  public static void writeStringAtomic(Path file, String content)

Fields:
public static final Set<OpenOption> DEFAULT_WRITE_OPTIONS
public static final Set<FileVisitOption> DEFAULT_WALK_TREE_OPTIONS_SET
public static final FileVisitOption[] DEFAULT_WALK_TREE_OPTIONS_ARRAY
public static final Pattern INVALID_FILENAME_CHARACTERS

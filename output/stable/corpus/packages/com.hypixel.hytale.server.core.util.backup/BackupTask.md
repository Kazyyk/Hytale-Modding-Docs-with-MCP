# BackupTask

Type: class | Package: com.hypixel.hytale.server.core.util.backup

public class BackupTask

Class in the backup subsystem.

## Constructors

- BackupTask(@Nonnull final Path universeDir, @Nonnull final Path backupDir) | Creates a new BackupTask instance.

## Methods

- start(@Nonnull Path universeDir, @Nonnull Path backupDir) | CompletableFuture<Void> | static public method.
- cleanOrArchiveOldBackups(@Nonnull Path sourceDir, @Nonnull Path archiveDir) | void | static private method.
- cleanOldArchives(@Nonnull Path dir) | void | static private method.
- getMostRecentArchive(@Nonnull Path dir) | FileTime | static private method.

Also in this package: BackupUtil

Complete API:
  public static CompletableFuture<Void> start(Path universeDir, Path backupDir)
  private static void cleanOrArchiveOldBackups(Path sourceDir, Path archiveDir)
  private static void cleanOldArchives(Path dir)
  private static FileTime getMostRecentArchive(Path dir)

Fields:
private static final DateTimeFormatter BACKUP_FILE_DATE_FORMATTER
private static final Duration BACKUP_ARCHIVE_FREQUENCY
private static final HytaleLogger LOGGER
private final CompletableFuture<Void> completion

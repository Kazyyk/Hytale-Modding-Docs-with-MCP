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

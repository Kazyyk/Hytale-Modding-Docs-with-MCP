# BackupUtil

Type: class | Package: com.hypixel.hytale.server.core.util.backup

class BackupUtil

Class in the backup subsystem.

## Methods

- walkFileTreeAndZip(@Nonnull Path sourceDir, @Nonnull Path zipPath) | void | static package-private method.
- broadcastBackupStatus(boolean isWorldSaving) | void | static package-private method.
- broadcastBackupError(Throwable cause) | void | static package-private method.
- findOldBackups(@Nonnull Path backupDirectory, int maxBackupCount) | List<Path> | static package-private method.

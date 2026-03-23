# FileChangeTask

Type: class | Package: com.hypixel.hytale.server.core.asset.monitor | Implements: Runnable

public class FileChangeTask implements Runnable

Implements `Runnable` to provide FileChangeTask functionality.

## Constants

- public static final HytaleLogger LOGGER
- private static final long FILE_SIZE_CHECK_DELAY_MILLIS

## Fields

- private final AssetMonitor assetMonitor
- @Nonnull private final Path path
- @Nonnull private final PathEvent pathEvent
- private final boolean createdOrModified
- @Nonnull private final ScheduledFuture<?> task
- private long lastSize

## Methods

- public FileChangeTask(AssetMonitor assetMonitor, @Nonnull Path path, @Nonnull PathEvent pathEvent)
- public AssetMonitor getAssetMonitor()
- @Nonnull public Path getPath()
- @Nonnull public PathEvent getPathEvent()
- @Override public void run()
- public void cancelSchedule()
- @Nonnull @Override public String toString()

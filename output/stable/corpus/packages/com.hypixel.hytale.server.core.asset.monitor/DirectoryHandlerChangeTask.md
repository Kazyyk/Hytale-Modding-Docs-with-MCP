# DirectoryHandlerChangeTask

Type: class | Package: com.hypixel.hytale.server.core.asset.monitor | Implements: Runnable

public class DirectoryHandlerChangeTask implements Runnable

Implements `Runnable` to provide DirectoryHandlerChangeTask functionality.

## Constants

- public static final HytaleLogger LOGGER
- private static final long ACCUMULATION_DELAY_MILLIS

## Fields

- private final AssetMonitor assetMonitor
- private final Path parent
- private final AssetMonitorHandler handler
- @Nonnull private final ScheduledFuture<?> task
- private final AtomicBoolean changed
- private final Map<Path, PathEvent> paths

## Methods

- public DirectoryHandlerChangeTask(AssetMonitor assetMonitor, Path parent, AssetMonitorHandler handler)
- @Override public void run()
- public AssetMonitor getAssetMonitor()
- public Path getParent()
- public AssetMonitorHandler getHandler()
- public void addPath(Path path, PathEvent pathEvent)
- public void removePath(Path path)
- public void markChanged()
- public void cancelSchedule()
- @Nonnull @Override public String toString()

Also in this package: AssetMonitor, AssetMonitorHandler, EventKind, FileChangeTask, PathEvent, PathWatcherThread

Complete API:
  public void run()
  public AssetMonitor getAssetMonitor()
  public Path getParent()
  public AssetMonitorHandler getHandler()
  public void addPath(Path path, PathEvent pathEvent)
  public void removePath(Path path)
  public void markChanged()
  public void cancelSchedule()
  public String toString()

Fields:
public static final HytaleLogger LOGGER
private static final long ACCUMULATION_DELAY_MILLIS
private final AssetMonitor assetMonitor
private final Path parent
private final AssetMonitorHandler handler
private final ScheduledFuture<?> task
private final AtomicBoolean changed
private final Map<Path,PathEvent> paths

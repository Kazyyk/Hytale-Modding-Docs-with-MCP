# AssetMonitor

Type: class | Package: com.hypixel.hytale.server.core.asset.monitor

public class AssetMonitor

Provides AssetMonitor functionality within the monitor subsystem.

## Constants

- public static final HytaleLogger LOGGER
- private static final ScheduledExecutorService EXECUTOR

## Fields

- private final Map<Path, List<AssetMonitorHandler>> directoryMonitors
- private final Map<Path, FileChangeTask> fileChangeTasks
- private final Map<Path, Map<AssetMonitorHandler, DirectoryHandlerChangeTask>> directoryHandlerChangeTasks
- @Nonnull private final PathWatcherThread pathWatcherThread

## Methods

- public AssetMonitor()
- public void shutdown()
- public void monitorDirectoryFiles(@Nonnull Path path, @Nonnull AssetMonitorHandler handler)
- public void removeMonitorDirectoryFiles(@Nonnull Path path, @Nonnull Object key)
- protected void onChange(@Nonnull Path file, EventKind eventKind)
- public void onDelayedChange(@Nonnull Path path, @Nonnull PathEvent pathEvent)
- public void removeFileChangeTask(@Nonnull FileChangeTask fileChangeTask)
- public void markChanged(@Nonnull Path path)
- public void removeHookChangeTask(@Nonnull DirectoryHandlerChangeTask directoryHandlerChangeTask)
- @Nonnull public static ScheduledFuture<?> runTask(@Nonnull Runnable task, long millisDelay)

Also in this package: AssetMonitorHandler, DirectoryHandlerChangeTask, EventKind, FileChangeTask, PathEvent, PathWatcherThread

Complete API:
  public void shutdown()
  public void monitorDirectoryFiles(Path path, AssetMonitorHandler handler)
  public void removeMonitorDirectoryFiles(Path path, Object key)
  protected void onChange(Path file, EventKind eventKind)
  public void onDelayedChange(Path path, PathEvent pathEvent)
  public void removeFileChangeTask(FileChangeTask fileChangeTask)
  public void markChanged(Path path)
  public void removeHookChangeTask(DirectoryHandlerChangeTask directoryHandlerChangeTask)
  public static ScheduledFuture<?> runTask(Runnable task, long millisDelay)

Fields:
public static final HytaleLogger LOGGER
private static final ScheduledExecutorService EXECUTOR
private final Map<Path,List<AssetMonitorHandler>> directoryMonitors
private final Map<Path,FileChangeTask> fileChangeTasks
private final Map<Path,Map<AssetMonitorHandler,DirectoryHandlerChangeTask>> directoryHandlerChangeTasks
private final PathWatcherThread pathWatcherThread

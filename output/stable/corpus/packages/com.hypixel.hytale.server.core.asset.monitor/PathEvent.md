# PathEvent

Type: class | Package: com.hypixel.hytale.server.core.asset.monitor

public class PathEvent

Provides PathEvent functionality within the monitor subsystem.

## Fields

- private final EventKind eventKind
- private final long timestamp

## Methods

- public PathEvent(EventKind eventKind, long timestamp)
- public EventKind getEventKind()
- public long getTimestamp()
- @Nonnull @Override public String toString()

Also in this package: AssetMonitor, AssetMonitorHandler, DirectoryHandlerChangeTask, EventKind, FileChangeTask, PathWatcherThread

Complete API:
  public EventKind getEventKind()
  public long getTimestamp()
  public String toString()

Fields:
private final EventKind eventKind
private final long timestamp

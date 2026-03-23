# PathWatcherThread

Type: class | Package: com.hypixel.hytale.server.core.asset.monitor | Implements: Runnable

public class PathWatcherThread implements Runnable

Implements `Runnable` to provide PathWatcherThread functionality.

## Constants

- public static final HytaleLogger LOGGER
- public static final boolean HAS_FILE_TREE_SUPPORT

## Fields

- private final BiConsumer<Path, EventKind> consumer
- @Nonnull private final Thread thread
- private final WatchService service
- private final Map<Path, WatchKey> registered

## Methods

- public PathWatcherThread(BiConsumer<Path, EventKind> consumer)
- @Override public final void run()
- public void start()
- public void shutdown()
- public void addPath(Path path)
- private void watchPath(@Nonnull Path path)

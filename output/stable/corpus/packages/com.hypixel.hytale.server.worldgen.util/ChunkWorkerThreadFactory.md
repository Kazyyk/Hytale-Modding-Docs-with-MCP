# ChunkWorkerThreadFactory

Type: class | Package: com.hypixel.hytale.server.worldgen.util | Implements: ThreadFactory

public class ChunkWorkerThreadFactory implements ThreadFactory

Implements `ThreadFactory` to provide ChunkWorkerThreadFactory functionality.

## Constants

- private static final AtomicInteger FACTORY_COUNTER

## Fields

- private final ChunkGenerator chunkGenerator
- private final String threadNameFormat
- @Nonnull private final Integer factoryId
- @Nonnull private final AtomicInteger threadCounter

## Methods

- public ChunkWorkerThreadFactory(ChunkGenerator chunkGenerator, String threadNameFormat)
- @Nonnull @Override public Thread newThread(Runnable r)
- @Nonnull @Override public String toString()

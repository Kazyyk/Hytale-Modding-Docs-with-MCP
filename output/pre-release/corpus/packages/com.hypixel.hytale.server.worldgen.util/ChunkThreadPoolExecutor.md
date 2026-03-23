# ChunkThreadPoolExecutor

Type: class | Package: com.hypixel.hytale.server.worldgen.util | Extends: ThreadPoolExecutor

public final class ChunkThreadPoolExecutor extends ThreadPoolExecutor

Extends `ThreadPoolExecutor` to provide ChunkThreadPoolExecutor functionality.

## Constants

- private static final AtomicInteger GENERATION_COUNTER

## Fields

- private final int generation
- private final Runnable shutdownHook

## Methods

- public ChunkThreadPoolExecutor(int corePoolSize,
        int maximumPoolSize,
        long keepAliveTime,
        TimeUnit unit,
        BlockingQueue<Runnable> workQueue,
        ThreadFactory threadFactory,
        Runnable shutdownHook)` |
| `@Override protected` | `void` | `terminated()` |

Also in this package: ArrayUtli, BlockArray, BlockFluidEntry, ChunkWorker, ChunkWorkerThreadFactory, ConstantNoiseProperty, Entry, ListPool, LogUtil, NoiseBlockArray, ObjectPool, ResolvedBlockArray, Resource

Complete API:
  protected void terminated()

Fields:
private static final AtomicInteger GENERATION_COUNTER
private final int generation
private final Runnable shutdownHook

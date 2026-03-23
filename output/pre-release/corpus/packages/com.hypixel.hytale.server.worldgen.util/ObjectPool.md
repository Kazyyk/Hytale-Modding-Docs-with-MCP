# ObjectPool

Type: class | Package: com.hypixel.hytale.server.worldgen.util | Implements: Function<T, T>

public class ObjectPool<T extends Function<T, T>> implements Function<T, T>

Implements `Function` to provide ObjectPool functionality.

## Fields

- @Nonnull private final BlockingQueue<T> items
- private final Supplier<T> supplier

## Methods

- public ObjectPool(int size, Supplier<T> supplier)
- public T acquire()
- public <K extends T> void recycle(@Nonnull K v)
- public int size()
- public T apply(T cachedKey)

Also in this package: ArrayUtli, BlockArray, BlockFluidEntry, ChunkThreadPoolExecutor, ChunkWorker, ChunkWorkerThreadFactory, ConstantNoiseProperty, Entry, ListPool, LogUtil, NoiseBlockArray, ResolvedBlockArray, Resource

Complete API:
  public T acquire()
  public void recycle(K v)
  public int size()
  public T apply(T cachedKey)

Fields:
private final BlockingQueue<T> items
private final Supplier<T> supplier

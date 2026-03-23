# ListPool

Type: class | Package: com.hypixel.hytale.server.worldgen.util

public class ListPool<T>

Thread-safe object pool for reusable `ObjectArrayList` instances. Pre-allocates a configurable number of `Resource` objects backed by a `ConcurrentLinkedQueue`. Acquire returns a pooled list or creates a new one; release returns it to the pool if below capacity.

Also in this package: ArrayUtli, BlockArray, BlockFluidEntry, ChunkThreadPoolExecutor, ChunkWorker, ChunkWorkerThreadFactory, ConstantNoiseProperty, Entry, LogUtil, NoiseBlockArray, ObjectPool, ResolvedBlockArray, Resource

Complete API:
  public T[] emptyArray()
  public ListPool.Resource<T> acquire()
  public ListPool.Resource<T> acquire(int capacity)
  public void release(ListPool.Resource<T> resource)

Fields:
private final int capacity
private final T[] empty
private final ConcurrentLinkedQueue<ListPool.Resource<T>> pool

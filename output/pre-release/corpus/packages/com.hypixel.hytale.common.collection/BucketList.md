# BucketList

Type: class | Package: com.hypixel.hytale.common.collection

public class BucketList<E>

## Fields

- public static final int INITIAL_BUCKET_ITEM_ARRAY_SIZE
- public static final Comparator<BucketItem<?>> CLOSER_TO_SELF
- protected static final byte[] EMPTY_INDICES
- protected BucketItemPool<E> bucketItemPool
- protected BucketList.Bucket<E>[] buckets
- protected byte[] bucketIndices
- protected int bucketCount
- protected int squaredMaxDistance
- protected BucketItem<E>[] bucketItems
- protected int size
- protected boolean isUnsorted
- protected boolean isEmpty
- protected BucketItem[] buffer

## Methods

- public void setBucketItemPool(@Nonnull BucketItemPool<E> bucketItemPool)
- public void clear()
- public void reset()
- public void configure(@Nonnull int[] bucketRanges)
- public void configure(@Nonnull int[] bucketRanges, int initialBucketItemArraySize)
- public void configureWithPreSortedArray(@Nonnull int[] bucketRanges)
- public void configureWithPreSortedArray(@Nonnull int[] bucketRanges, int initialBucketItemArraySize)
- public void configureWithPresortedArray(@Nonnull IntArrayList bucketRanges, int initialBucketItemArraySize)
- public boolean add(@Nonnull E item, double squaredDistance)
- public int getBucketCount()
- @Nullable public BucketList.Bucket<E> getBucket(int index)
- public int getFirstBucketIndex(int distanceSquared)
- public int getLastBucketIndex(int distanceSquared)
- @Nullable public E getClosestInRange(int minRange, int maxRange, @Nonnull Predicate<E> filter, @Nonnull BucketList.SortBufferProvider sortBufferProvider)
- public static void addBucketDistance(@Nonnull IntArrayList bucketRanges, int maxBucketCount, int distance)
- public static void addBucketDistance(@Nonnull IntArrayList bucketRanges, int maxBucketCount, int distance, int keepDistance)
- protected static int area(int inner, int outer)
- public BucketItem<E>[] getItems()
- public int size()
- public boolean isUnsorted()
- public boolean isEmpty()
- public void clear(@Nonnull BucketItemPool<E> pool)
- public void add(@Nonnull BucketItem<E> item)
- public void sort(@Nonnull BucketList.SortBufferProvider sortBufferProvider)
- public BucketItem[] apply(int size)

## Inner Types

- `BucketList.Bucket`
- `BucketList.SortBufferProvider`

Known subclasses: EntityList

Also in this package: Bucket, BucketItem, BucketItemPool, Flag, Flags, SortBufferProvider

Complete API:
  public void setBucketItemPool(BucketItemPool<E> bucketItemPool)
  public void clear()
  public void reset()
  public void configure(int[] bucketRanges)
  public void configure(int[] bucketRanges, int initialBucketItemArraySize)
  public void configureWithPreSortedArray(int[] bucketRanges)
  public void configureWithPreSortedArray(int[] bucketRanges, int initialBucketItemArraySize)
  public void configureWithPresortedArray(IntArrayList bucketRanges, int initialBucketItemArraySize)
  public boolean add(E item, double squaredDistance)
  public int getBucketCount()
  public BucketList.Bucket<E> getBucket(int index)
  public int getFirstBucketIndex(int distanceSquared)
  public int getLastBucketIndex(int distanceSquared)
  public E getClosestInRange(int minRange, int maxRange, Predicate<E> filter, BucketList.SortBufferProvider sortBufferProvider)
  public static void addBucketDistance(IntArrayList bucketRanges, int maxBucketCount, int distance)
  public static void addBucketDistance(IntArrayList bucketRanges, int maxBucketCount, int distance, int keepDistance)
  protected static int area(int inner, int outer)

Fields:
public static final int INITIAL_BUCKET_ITEM_ARRAY_SIZE
public static final Comparator<BucketItem<?>> CLOSER_TO_SELF
protected static final byte[] EMPTY_INDICES
protected BucketItemPool<E> bucketItemPool
protected BucketList.Bucket<E>[] buckets
protected byte[] bucketIndices
protected int bucketCount
protected int squaredMaxDistance

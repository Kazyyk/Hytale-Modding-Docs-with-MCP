# BucketItemPool

Type: class | Package: com.hypixel.hytale.common.collection

public class BucketItemPool<E>

## Fields

- protected final List<BucketItem<E>> pool

## Methods

- public void deallocate(BucketItem<E>[] entityHolders, int count)
- public BucketItem<E> allocate(E reference, double squaredDistance)

Also in this package: Bucket, BucketItem, BucketList, Flag, Flags, SortBufferProvider

Complete API:
  public void deallocate(BucketItem<E>[] entityHolders, int count)
  public BucketItem<E> allocate(E reference, double squaredDistance)

Fields:
protected final List<BucketItem<E>> pool

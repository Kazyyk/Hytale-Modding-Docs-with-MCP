# RangeSizeFlockAsset

Type: class | Package: com.hypixel.hytale.server.flock.config | Extends: FlockAsset

public class RangeSizeFlockAsset extends FlockAsset

Concrete implementation extending `FlockAsset`.

## Fields

- DEFAULT_SIZE | int[] | Static final int[] field.
- size | int[] | int[] field.

## Constructors

- RangeSizeFlockAsset(String id) | Creates a new RangeSizeFlockAsset instance.
- RangeSizeFlockAsset() | Creates a new RangeSizeFlockAsset instance.

## Methods

- getSize() | int[] | public method.
- getMinFlockSize() | int | public method.
- pickFlockSize() | int | public method.
- getUnknownFor(String id) | RangeSizeFlockAsset | static public method.
- toString() | String | public method.

Also in this package: FlockAsset, WeightedSizeFlockAsset

Complete API:
  public int[] getSize()
  public int getMinFlockSize()
  public int pickFlockSize()
  public static RangeSizeFlockAsset getUnknownFor(String id)
  public String toString()

Fields:
public static final BuilderCodec<RangeSizeFlockAsset> CODEC
private static final int[] DEFAULT_SIZE
protected int[] size

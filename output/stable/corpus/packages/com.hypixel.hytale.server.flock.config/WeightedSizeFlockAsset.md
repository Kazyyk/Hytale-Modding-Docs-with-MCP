# WeightedSizeFlockAsset

Type: class | Package: com.hypixel.hytale.server.flock.config | Extends: FlockAsset

public class WeightedSizeFlockAsset extends FlockAsset

Concrete implementation extending `FlockAsset`.

## Fields

- minSize | int | int field.
- sizeWeights | double[] | double[] field.

## Constructors

- WeightedSizeFlockAsset() | Creates a new WeightedSizeFlockAsset instance.

## Methods

- getMinSize() | int | public method.
- getSizeWeights() | double[] | public method.
- getMinFlockSize() | int | public method.
- pickFlockSize() | int | public method.
- toString() | String | public method.

Also in this package: FlockAsset, RangeSizeFlockAsset

Complete API:
  public int getMinSize()
  public double[] getSizeWeights()
  public int getMinFlockSize()
  public int pickFlockSize()
  public String toString()

Fields:
public static final BuilderCodec<WeightedSizeFlockAsset> CODEC
protected int minSize
protected double[] sizeWeights

# RangeSizeFlockAsset

Type: class | Package: com.hypixel.hytale.server.flock.config | Extends: FlockAsset

public class RangeSizeFlockAsset extends FlockAsset

Default flock asset type (codec ID `"Default"`). The initial flock size is picked uniformly from a `[min, max]` range.

## Fields

- Size | int[2] | [1, 1] | Random range for initial flock size (min, max inclusive).

## Methods


public int[] getSize()


@Override
public int getMinFlockSize()

Returns `size[0]`.


@Override
public int pickFlockSize()

Returns a random value in `[max(1, size[0]), size[1]]`.


@Nonnull
public static RangeSizeFlockAsset getUnknownFor(String id)

Creates a fallback instance for unknown asset IDs. Used as the replace-on-remove handler.

## Related Types

- FlockAsset -- abstract base class
- WeightedSizeFlockAsset -- alternative implementation

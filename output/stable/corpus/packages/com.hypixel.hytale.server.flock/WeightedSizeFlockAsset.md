# WeightedSizeFlockAsset

Type: class | Package: com.hypixel.hytale.server.flock.config | Extends: FlockAsset

public class WeightedSizeFlockAsset extends FlockAsset

Flock asset type where the initial size is picked from a weighted distribution (codec ID `"Weighted"`). Each index in the `SizeWeights` array corresponds to `MinSize + index`, and the weight determines relative probability.

## Fields

- MinSize | int | Absolute minimum flock size.
- SizeWeights | double[] | Weight array -- index 0 = MinSize weight, index 1 = MinSize+1 weight, etc.

## Methods


public int getMinSize()


public double[] getSizeWeights()


@Override
public int getMinFlockSize()

Returns `minSize`.


@Override
public int pickFlockSize()

Picks a weighted random index from `sizeWeights` and returns `max(minSize, 1) + index`.

## Related Types

- FlockAsset -- abstract base class
- RangeSizeFlockAsset -- alternative implementation

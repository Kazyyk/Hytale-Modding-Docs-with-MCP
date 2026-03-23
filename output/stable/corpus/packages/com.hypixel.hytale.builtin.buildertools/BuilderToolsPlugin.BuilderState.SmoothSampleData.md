# BuilderToolsPlugin.BuilderState.SmoothSampleData

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public static class SmoothSampleData

Inner class of BuilderState that accumulates weighted sampling data for the smooth operation. Used with the 3x3x3 smoothing kernel to determine whether a position should become solid or air, and which block type to use.

## Fields

- solidStrength | float | 0.0F | Weighted sum of solid block contributions from the smoothing kernel.
- solidBlock | int | 0 | Block ID of the most common solid block in the kernel neighborhood.
- solidBlockCount | int | 0 | Count of the most common solid block.
- fillerBlock | int | 0 | Block ID of the most common filler block in the kernel neighborhood.
- fillerBlockCount | int | 0 | Count of the most common filler block.

## Usage

During a smooth operation, the kernel iterates over a 3x3x3 neighborhood around each position, accumulating weights from `SMOOTHING_KERNEL` (total weight: 27). If `solidStrength` exceeds half the total weight, the position is set to the majority solid block; otherwise it is cleared.

## Related Types

- BuilderToolsPlugin.BuilderState -- enclosing class
- BuilderToolsPlugin.BuilderState.BlocksSampleData -- companion class for general block sampling

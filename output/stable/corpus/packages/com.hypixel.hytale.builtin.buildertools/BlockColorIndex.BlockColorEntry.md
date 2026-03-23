# BlockColorIndex.BlockColorEntry

Type: record | Package: com.hypixel.hytale.builtin.buildertools

private record BlockColorEntry(int blockId, String key, int r, int g, int b, double labL, double labA, double labB)

Private inner record of BlockColorIndex that stores color data for a single solid cube block type. Each entry holds both the original RGB values and the pre-computed CIE Lab color space coordinates used for perceptual color distance calculations.

## Record Components

- blockId | int | Numeric block ID from the block type asset map index.
- key | String | String key identifying the block type in the asset map.
- r | int | Red channel of the particle color (0-255).
- g | int | Green channel of the particle color (0-255).
- b | int | Blue channel of the particle color (0-255).
- labL | double | CIE Lab L* (lightness) component.
- labA | double | CIE Lab a* (green-red) component.
- labB | double | CIE Lab b* (blue-yellow) component.

## Visibility

This record has `private` visibility and is only accessible within BlockColorIndex.

## Related Types

- BlockColorIndex -- enclosing class that creates and queries these entries

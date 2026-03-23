# MaskProviderJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: JsonLoader

Loads a `MaskProvider` from an image file with zoom and offset configuration. Converts a `BufferedImage` zone mask into a `FuzzyZoom` pixel provider with coordinate randomization. Contains a static `IMAGE_LOADER` for `BufferedImage` loading via `ImageIO`.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | MaskProvider | Loads the mask image, creates a `FuzzyZoom` with coordinate randomizer, and returns the `MaskProvider`.
- loadImage(Path) | BufferedImage | Static method. Loads a `BufferedImage` from a path via the asset file system.
- loadFuzzyZoom(BufferedImage) | FuzzyZoom | Creates a `FuzzyZoom` from the image with coordinate randomization and zoom scaling.

# ImageImportPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.imageimport

public class ImageImportPage

Interactive custom UI page for importing images as block selections. Supports file browsing within asset pack directories, configurable max dimension (1-512), orientation (wall XY/XZ, floor), and origin point (bottom-left, bottom-center, center, top-center). Converts image pixels to closest block types via `BlockColorIndex` and places the result into the player's clipboard as a `BlockSelection`.

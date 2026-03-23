# TextureSampler

Type: class | Package: com.hypixel.hytale.builtin.buildertools.objimport

public final class TextureSampler

Utility for loading and sampling textures during OBJ import. Maintains an in-memory cache of loaded `BufferedImage` instances. Supports UV coordinate sampling with wrap-around and V-flip (OpenGL convention), alpha sampling, and computing the average color of a texture (ignoring fully transparent pixels). The constructor is private; all access is through static methods.

## Methods

- loadTexture(Path) | BufferedImage | Loads an image from disk with caching. Returns null if not found or on error.
- sampleAt(BufferedImage, float, float) | int[] | Samples RGB [0-255] at the given UV coordinates (wrapping, V-flipped).
- sampleAlphaAt(BufferedImage, float, float) | int | Samples the alpha channel [0-255] at the given UV. Returns 255 if no alpha channel.
- clearCache() | void | Clears the texture cache.
- getAverageColor(Path) | int[] | Computes the average RGB of a texture, ignoring transparent pixels. Returns null on error.

## See Also

- MeshVoxelizer
- ObjImportPage

Also in this package: MeshRotation, MeshVoxelizer, MtlMaterial, MtlParser, ObjImportCommand, ObjImportPage, ObjMesh, ObjParseException, ObjParser, Origin, PageData, VoxelResult, WeightedBlock

Complete API:
  public static BufferedImage loadTexture(Path path)
  public static int[] sampleAt(BufferedImage texture, float u, float v)
  public static int sampleAlphaAt(BufferedImage texture, float u, float v)
  public static void clearCache()
  public static int[] getAverageColor(Path path)

Fields:
private static final Map<Path,BufferedImage> textureCache

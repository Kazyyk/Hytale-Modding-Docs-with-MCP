# MaskProviderJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Extends: JsonLoader<SeedStringResource, MaskProvider>

public class MaskProviderJsonLoader extends JsonLoader<SeedStringResource, MaskProvider>

## Fields

- public static final AssetLoader<BufferedImage> IMAGE_LOADER
- protected final Path file
- protected final Vector2i zoomSize
- protected final Vector2i worldOffset
- BufferedImage mask

## Constructors

- public MaskProviderJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, Path file, Vector2i zoomSize, Vector2i worldOffset)

## Methods

- public Class<BufferedImage> type()
- public BufferedImage load(@Nonnull InputStream in)
- public MaskProvider load()
- return new MaskProvider(this.loadFuzzyZoom(mask)
- throw new Error("Error while loading MaskProvider in " + this.file.toAbsolutePath()
- public static BufferedImage loadImage(@Nonnull Path file)
- throw new IOException("Failed to load image " + file, var2)
- protected FuzzyZoom loadFuzzyZoom(@Nonnull BufferedImage mask)
- return new FuzzyZoom(new CoordinateRandomizerJsonLoader<>(this.seed, this.dataFolder, this.json)
- new PixelProvider(mask)

Also in this package: AssetFileSystem, ChunkGeneratorJsonLoader, Constants, Constants, PrefabPathCollector, Resource, WorldGenPrefabLoader, WorldGenPrefabSupplier, ZonesJsonLoader

Complete API:
  public MaskProvider load()
  public static BufferedImage loadImage(Path file)
  protected FuzzyZoom loadFuzzyZoom(BufferedImage mask)

Fields:
public static final AssetLoader<BufferedImage> IMAGE_LOADER
protected final Path file
protected final Vector2i zoomSize
protected final Vector2i worldOffset

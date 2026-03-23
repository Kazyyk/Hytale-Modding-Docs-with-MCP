# ImageBuilder

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk

class ImageBuilder

## Fields

- @Nullable private WorldChunk worldChunk
- private FluidSection[] fluidSections
- public int r
- public int g
- public int b
- public int a

## Methods

- public long getIndex()
- @Nonnull public MapImage getImage()
- @Nonnull private CompletableFuture<ImageBuilder> fetchChunk()
- @Nonnull private CompletableFuture<ImageBuilder> sampleNeighborsSync()
- getBlockColor(blockId, tint, this.outColor)
- getFluidColor(fluidId, environmentId, fluidDepth, this.outColor)
- private void packImageData(int ix, int iz)
- private static float shadeFromHeights(int blockPixelX,
        int blockPixelZ,
        int blockPixelWidth,
        int blockPixelHeight,
        short height,
        short north,
        short south,
        short west,
        short east,
        short northWest,
        short northEast,
        short southWest,
        short southEast)` |
| `` | `private static void` | `getBlockColor(int blockId, int biomeTintColor, @Nonnull ImageBuilder.Color outColor)` |
| `` | `private static void` | `getFluidColor(int fluidId, int environmentId, int fluidDepth, @Nonnull ImageBuilder.Color outColor)` |
| `@Nonnull public static` | `CompletableFuture<ImageBuilder>` | `build(long index, int imageWidth, int imageHeight, World world)` |
| `` | `public int` | `pack()` |
| `` | `public void` | `multiply(float value)` |

Also in this package: ChunkWorldMap, Color, WorldGenWorldMapProvider

Complete API:
  public long getIndex()
  public MapImage getImage()
  private CompletableFuture<ImageBuilder> fetchChunk()
  private CompletableFuture<ImageBuilder> sampleNeighborsSync()
  private ImageBuilder generateImageAsync()
  private void packImageData(int ix, int iz)
  private static float shadeFromHeights(int blockPixelX, int blockPixelZ, int blockPixelWidth, int blockPixelHeight, short height, short north, short south, short west, short east, short northWest, short northEast, short southWest, short southEast)
  private static void getBlockColor(int blockId, int biomeTintColor, ImageBuilder.Color outColor)
  private static void getFluidColor(int fluidId, int environmentId, int fluidDepth, ImageBuilder.Color outColor)
  public static CompletableFuture<ImageBuilder> build(long index, int imageWidth, int imageHeight, World world)

Fields:
private final long index
private final World world
private final MapImage image
private final int sampleWidth
private final int sampleHeight
private final int blockStepX
private final int blockStepZ
private final short[] heightSamples
private final int[] tintSamples
private final int[] blockSamples
private final short[] neighborHeightSamples
private final short[] fluidDepthSamples
private final int[] environmentSamples
private final int[] fluidSamples
private final ImageBuilder.Color outColor
private WorldChunk worldChunk
private FluidSection[] fluidSections

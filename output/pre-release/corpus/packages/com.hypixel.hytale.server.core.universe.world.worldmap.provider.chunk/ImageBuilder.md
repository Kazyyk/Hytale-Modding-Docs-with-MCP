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
  public static boolean isQuantizationEnabled()
  public static boolean toggleQuantization()
  public long getIndex()
  public MapImage getImage()
  private CompletableFuture<ImageBuilder> fetchChunk()
  private CompletableFuture<ImageBuilder> sampleNeighborsSync()
  private ImageBuilder generateImageAsync()
  private static int quantizeChannel(int value)
  private static boolean isNearBoundary(int value)
  private static int quantizeChannelWithDither(int value, int ditherOffset)
  private static int quantizeColor(int argb)
  private static boolean colorNearBoundary(int argb)
  private static int quantizeColorWithDither(int argb, int x, int y)
  private boolean isInTransitionZone(int index)
  private MapImage encodeToPalette()
  private static int calculateBitsRequired(int colorCount)
  private void packImageData(int ix, int iz)
  private static float shadeFromHeights(int blockPixelX, int blockPixelZ, int blockPixelWidth, int blockPixelHeight, short height, short north, short south, short west, short east, short northWest, short northEast, short southWest, short southEast)
  private static void getBlockColor(int blockId, int biomeTintColor, ImageBuilder.Color outColor)
  private static void getFluidColor(int fluidId, int environmentId, int fluidDepth, ImageBuilder.Color outColor)
  public static CompletableFuture<ImageBuilder> build(long index, int imageWidth, int imageHeight, World world)

Fields:
private static volatile boolean quantizationEnabled
private final long index
private final World world
private final int imageWidth
private final int imageHeight
private final int[] rawPixels
private MapImage image
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
private static final int QUANTIZE_STEP
private static final int QUANTIZE_HALF
private static final int[][] BAYER_MATRIX
private static final int GRADIENT_THRESHOLD

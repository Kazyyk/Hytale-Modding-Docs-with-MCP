# ChunkTintCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.chunk | Extends: AbstractPlayerCommand

public class ChunkTintCommand extends AbstractPlayerCommand

Applies a color tint to a chunk with optional Gaussian blur across neighboring chunks. Includes a UI page variant.

Also in this package: ChunkCommand, ChunkFixHeightMapCommand, ChunkForceTickCommand, ChunkInfoCommand, ChunkLightingCommand, ChunkLoadCommand, ChunkLoadedCommand, ChunkMarkSaveCommand, ChunkMaxSendRateCommand, ChunkRegenerateCommand, ChunkResendCommand, ChunkTrackerCommand, ChunkUnloadCommand, TintChunkPage, TintChunkPageAction, TintChunkPageCommand, TintChunkPageEventData

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static int blur(ChunkAccessor<WorldChunk> chunkAccessor, int radius, double[] matrix, int x, int z)
  private static double gaussian2d(double sigma, double x, double y)
  private static double[] gaussianMatrix(double sigma, int radius)
  private static int gaussianIndex(int radius, int x, int y)

Fields:
private static final int BLUR_RADIUS
private static final double BLUR_SIGMA
private final RequiredArg<Integer> colorArg
private final DefaultArg<Integer> radiusArg
private final DefaultArg<Double> sigmaArg
private final FlagArg blurArg

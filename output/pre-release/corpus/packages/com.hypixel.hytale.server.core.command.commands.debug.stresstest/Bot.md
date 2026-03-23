# Bot

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug.stresstest | Extends: SimpleChannelInboundHandler<Packet>

public class Bot extends SimpleChannelInboundHandler<Packet>

Simulated client bot that connects to the server for stress testing. Handles the network protocol handshake and basic packet processing.

Also in this package: BotConfig, DumpType, StressTestCommand, StressTestStartCommand, StressTestState, StressTestStopCommand

Complete API:
  public void shutdown()
  public void tick(float dt)
  public void channelActive(ChannelHandlerContext ctx)
  public void channelInactive(ChannelHandlerContext ctx)
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
  public void channelRead0(ChannelHandlerContext ctx, Packet packet)
  public void updateModelTransform(ModelTransform modelTransform)
  public void updateRotation(Direction lookOrientation)
  public ClientMovement createMovementPacket()
  public String toString()
  public static EntityUpdate findEntityUpdate(EntityUpdates bulkList, int id)

Fields:
private static final ScheduledExecutorService EXECUTOR
private static final EventLoopGroup WORKER_GROUP
public static final Asset[] EMPTY_ASSET_ARRAY
private final HytaleLogger logger
private final String name
private final BotConfig config
private final ScheduledFuture<?> tickFuture
private final ObjectArrayFIFOQueue<Ping> pingPackets
private final MovementStates movementStates
private SocketChannel channel
private int id
private Vector3d pos
private final Vector3f rotation
private final Vector3d destination
private final Vector3d temp
private final Vector3f targetRotation

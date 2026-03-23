# PortalDevice

Type: class | Package: com.hypixel.hytale.builtin.portals.components | Implements: Component

public class PortalDevice implements Component

## Fields

- public static final BuilderCodec<PortalDevice> CODEC
- private PortalDeviceConfig config
- private String baseBlockTypeKey
- private UUID destinationWorldUuid

## Methods

- public static ComponentType<ChunkStore,PortalDevice> getComponentType()
- public PortalDeviceConfig getConfig()
- public String getBaseBlockTypeKey()
- @Nullable public BlockType getBaseBlockType()
- @Nullable public UUID getDestinationWorldUuid()
- @Nullable public World getDestinationWorld()
- public void setDestinationWorld(World world)
- @Override public Component<ChunkStore> clone()

Also in this package: PortalDeviceConfig

Complete API:
  public static ComponentType<ChunkStore,PortalDevice> getComponentType()
  public PortalDeviceConfig getConfig()
  public String getBaseBlockTypeKey()
  public BlockType getBaseBlockType()
  public UUID getDestinationWorldUuid()
  public World getDestinationWorld()
  public void setDestinationWorld(World world)
  public boolean isLoadingWorld()
  public void setPendingWorld(CompletableFuture<Void> pendingWorld)
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<PortalDevice> CODEC
private PortalDeviceConfig config
private String baseBlockTypeKey
private UUID destinationWorldUuid
private CompletableFuture<Void> pendingWorld

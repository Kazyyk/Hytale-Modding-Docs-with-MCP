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

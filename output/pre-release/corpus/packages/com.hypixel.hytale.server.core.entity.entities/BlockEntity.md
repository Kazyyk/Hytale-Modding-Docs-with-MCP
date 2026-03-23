# BlockEntity

Type: class | Package: com.hypixel.hytale.server.core.entity.entities

public class BlockEntity

ECS component for block entities (blocks with entity behavior). Stores the block type key and provides factory methods for assembling default block entity holders.

Also in this package: Player, ProjectileComponent

Complete API:
  public static ComponentType<EntityStore,BlockEntity> getComponentType()
  public static Holder<EntityStore> assembleDefaultBlockEntity(TimeResource time, String blockTypeKey, Vector3d position)
  public SimplePhysicsProvider initPhysics(BoundingBox boundingBox)
  public BoundingBox updateHitbox(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer)
  public BoundingBox createBoundingBoxComponent()
  public void setBlockTypeKey(String blockTypeKey, Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer)
  public SimplePhysicsProvider getSimplePhysicsProvider()
  public String getBlockTypeKey()
  public void addForce(float x, float y, float z)
  public void addForce(Vector3d force)
  public boolean consumeBlockIdNetworkOutdated()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<BlockEntity> CODEC
public static final int DEFAULT_DESPAWN_SECONDS
private transient SimplePhysicsProvider simplePhysicsProvider
protected String blockTypeKey
private boolean isBlockIdNetworkOutdated

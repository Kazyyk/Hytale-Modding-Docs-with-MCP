# Repulsion

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.repulsion | Implements: Component<EntityStore>

public class Repulsion implements Component<EntityStore>

ECS component storing a repulsion config index for an entity. Tracks network dirty state.

Also in this package: EntityTrackerRemove, EntityTrackerUpdate, PlayerSetup, RepulsionConfig, RepulsionConfigPacketGenerator, RepulsionSystems, RepulsionTicker

Complete API:
  public static ComponentType<EntityStore,Repulsion> getComponentType()
  public int getRepulsionConfigIndex()
  public void setRepulsionConfigIndex(int repulsionConfigIndex)
  public boolean consumeNetworkOutdated()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<Repulsion> CODEC
protected AssetExtraInfo.Data data
private int repulsionConfigIndex
private boolean isNetworkOutdated

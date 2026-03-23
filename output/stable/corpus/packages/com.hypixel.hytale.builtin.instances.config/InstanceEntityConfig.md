# InstanceEntityConfig

Type: class | Package: com.hypixel.hytale.builtin.instances.config | Implements: Component<EntityStore>

public class InstanceEntityConfig implements Component<EntityStore>

## Fields

- @Nonnull public static final String ID
- @Nonnull public static final BuilderCodec<InstanceEntityConfig> CODEC
- private WorldReturnPoint returnPoint
- private transient WorldReturnPoint returnPointOverride

## Methods

- @Nonnull public static ComponentType<EntityStore, InstanceEntityConfig> getComponentType()
- @Nonnull public static InstanceEntityConfig ensureAndGet(@Nonnull Holder<EntityStore> holder)
- @Nullable public static InstanceEntityConfig removeAndGet(@Nonnull Holder<EntityStore> holder)
- public WorldReturnPoint getReturnPoint()
- public void setReturnPoint(WorldReturnPoint returnPoint)
- public WorldReturnPoint getReturnPointOverride()
- public void setReturnPointOverride(WorldReturnPoint returnPointOverride)
- @Nonnull public InstanceEntityConfig clone()

Also in this package: ExitInstance, InstanceDiscoveryConfig, InstanceWorldConfig, WorldReturnPoint

Complete API:
  public static ComponentType<EntityStore,InstanceEntityConfig> getComponentType()
  public static InstanceEntityConfig ensureAndGet(Holder<EntityStore> holder)
  public static InstanceEntityConfig removeAndGet(Holder<EntityStore> holder)
  public WorldReturnPoint getReturnPoint()
  public void setReturnPoint(WorldReturnPoint returnPoint)
  public WorldReturnPoint getReturnPointOverride()
  public void setReturnPointOverride(WorldReturnPoint returnPointOverride)
  public InstanceEntityConfig clone()

Fields:
public static final String ID
public static final BuilderCodec<InstanceEntityConfig> CODEC
private WorldReturnPoint returnPoint
private transient WorldReturnPoint returnPointOverride
